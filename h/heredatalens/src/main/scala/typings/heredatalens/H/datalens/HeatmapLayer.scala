package typings.heredatalens.H.datalens

import typings.heredatalens.H.datalens.HeatmapLayer.Options
import typings.heredatalens.H.datalens.QueryTileProvider.Zoom
import typings.heredatalens.H.datalens.Service.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides functionality of value-based heat map with density alpha mask.
  * Layer support different types of blending, including weighted average. Also it allows to apply alpha mask calculated by density.
  * In most cases, the layer consumes data grouped by 1x1 pixels buckets. For proper averaging it requires aggregated value and count (number of rows in bucket) for each bucket.
  * Blending of buckets is implemented via kernel density estimation (KDE) with a Gaussian kernel.
  */
@js.native
trait HeatmapLayer
  extends StObject
     with RasterLayer {
  
  /**
    * @param zoom - zoom level
    */
  def getOptionsPerZoom(zoom: Double): Options = js.native
}
object HeatmapLayer {
  
  @js.native
  sealed trait Aggregation extends StObject
  /**
    * Set of possible values for the aggregation option.
    * If the heat map input data is buckets, then different types of aggregation can be applied to the rows in a bucket.
    * The aggregation type is required for proper blending mode of the heat map. For the AVERAGE aggregation type, an averaged heat map is rendered.
    */
  @JSGlobal("H.datalens.HeatmapLayer.Aggregation")
  @js.native
  object Aggregation extends StObject {
    
    /** Specifies that the average aggregation was applied to the bucket value */
    @js.native
    sealed trait AVERAGE
      extends StObject
         with Aggregation
    
    /** Specifies that the sum aggregation was applied to the bucket value */
    @js.native
    sealed trait SUM
      extends StObject
         with Aggregation
  }
  
  @js.native
  sealed trait InputScale extends StObject
  /**
    * Set of possible values for the inputScale option.
    * The input scale is required for proper heat map blending. If the input scale is not linear, then the TilePoint.value is converted to linear scale before calculating the sum or average.
    */
  @JSGlobal("H.datalens.HeatmapLayer.InputScale")
  @js.native
  object InputScale extends StObject {
    
    /** Decibel (dB) scale */
    @js.native
    sealed trait DB
      extends StObject
         with InputScale
    
    /** Linear scale */
    @js.native
    sealed trait LINEAR
      extends StObject
         with InputScale
    
    /** Logarithmic scale */
    @js.native
    sealed trait LOG
      extends StObject
         with InputScale
  }
  
  /**
    * Defines a constant for the bandwidth
    * A number that sets a constant for the bandwidth across all zoom levels.
    */
  type Bandwidth = Double
  
  /**
    * TODO: this is missing in the documentation: https://developer.here.com/visualization/documentation/datalens/h-datalens-heatmaplayer-options.html
    */
  type BandwidthCallback = js.Function0[Unit]
  
  /**
    * Sets the bandwidth for a given zoom level and uses this to calculate the increment or decrement of the bandwidth at other zoom levels
    * This object defines the behavior of the bandwidth value across all zoom levels, initialized by a reference zoom level and its value at that level.
    * The default behavior with zoomIncrementFactor = 1 doubles the bandwidth with every increasing zoom level and halves it on every decrease in zoom level.
    * For example, a bandwidth of 10@zoom1 turns to 20@zoom2 and 5@zoom0. A zoomIncrementFactor of 0 effectively equals the bandwidth number, ignoring the provided zoom level.
    * A zoomIncrementFactor of 0.5 mean a bandwidth increase of 50% compared to a factor of 1. So a bandwidth of 10@zoom1 computes to 15@zoom2.
    */
  trait BandwidthStop extends StObject {
    
    var value: Double
    
    var zoom: Double
    
    var zoomIncrementFactor: js.UndefOr[Double] = js.undefined
  }
  object BandwidthStop {
    
    @scala.inline
    def apply(value: Double, zoom: Double): BandwidthStop = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
      __obj.asInstanceOf[BandwidthStop]
    }
    
    @scala.inline
    implicit class BandwidthStopMutableBuilder[Self <: BandwidthStop] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomIncrementFactor(value: Double): Self = StObject.set(x, "zoomIncrementFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomIncrementFactorUndefined: Self = StObject.set(x, "zoomIncrementFactor", js.undefined)
    }
  }
  
  /**
    * Defines data processing and rendering options for HeatmapLayer.
    * The data processing flow of HeatmapLayer is similar to RasterLayer. The initial step of rendering is to split the tile data by rows, where each row represents a bucket.
    * By default this step is processed with HeatmapLayer.defaultDataToRows. This behavior can be changed by defining the dataToRows callback.
    * To collect the rows for a tile including buffer, the rows must be translated to HeatmapLayer.TilePoint. This translation must be specified with the rowToTilePoint callback.
    * Other options define the blending options for the heat map.
    */
  trait Options extends StObject {
    
    /**
      * Specifies which type of aggregation was applied (eg. type of aggregation function for bucket in the Data Lens query).
      * Possible values are SUM or AVERAGE. If the aggregation type is AVERAGE , then an averaged heat map is rendered.
      */
    var aggregation: js.UndefOr[Aggregation] = js.undefined
    
    /**
      * Defines the alpha mask value as a function of the normalized count.
      * You can use D3.js library scale functions with the domain [0, 1] and the range [0, 1].
      */
    var alphaScale: js.UndefOr[js.Function1[/* scale */ Double, Double]] = js.undefined
    
    /**
      * Describes the bandwidth behavior in relation to current zoom level A numeric value sets it static across all levels
      * An Object with zoom, value and optional zoomIncrementFactor (1 equals doubling on every zoom increment) defines a behavior across all zoom levels
      * An Array of one or more zoom, value objects describes the behavior between the two defined levels and extrapolates the implied change outside of the defined range
      * Alternatively defines the level of smoothing as a function of the zoom level. The callback must return a value in pixels.
      * The cut-off of the Gaussian kernel is defined as 3 * bandwidth , a multiple (default 3) of bandwidth.
      */
    var bandwidth: js.UndefOr[Bandwidth | BandwidthStop | js.Array[BandwidthStop] | BandwidthCallback] = js.undefined
    
    /**
      * Defines a color palette as a function of the normalized value.
      * You can use D3.js library scale functions with the domain [0, 1].
      */
    var colorScale: js.UndefOr[js.Function1[/* scale */ Double, String]] = js.undefined
    
    /**
      * Defines the range for the density alpha mask as a function of the zoom level.
      * When defined, the density alpha mask is applied. The returned value must be an array of 2 numbers.
      */
    var countRange: js.UndefOr[js.Function1[/* zoom */ Zoom, js.Array[Double]]] = js.undefined
    
    /** Defines how the input tile data is split by rows. You can specify this callback to define client-side aggregation and filtering. This callback is called for each tile. */
    var dataToRows: js.UndefOr[
        js.Function4[
          /* data */ Data, 
          /* x */ typings.heredatalens.H.datalens.QueryTileProvider.X, 
          /* y */ typings.heredatalens.H.datalens.QueryTileProvider.Y, 
          /* zoom */ Zoom, 
          js.Array[Row]
        ]
      ] = js.undefined
    
    /**
      * Defines the scale (eg logarithmic scale) of the TilePoint value.
      * Note: if the value is not in a linear scale, then the aggregation in the source query must be defined with respect to the scale type.
      * For example, before applying the average aggregation function in a query, the value must be transformed to the linear scale. This guarantees correct linear averaging of values.
      */
    var inputScale: js.UndefOr[InputScale] = js.undefined
    
    /** Defines how the row is translated to the HeatmapLayer.TilePoint. This callback is called for each row that is returned from dataToRows. */
    def rowToTilePoint(row: Row, x: X, y: Y): TilePoint
    
    /**
      * Defines the range for the color scale as a function of the zoom level.
      * The returned value must be an array of 2 numbers.
      */
    var valueRange: js.UndefOr[js.Function1[/* zoom */ Zoom, js.Array[Double]]] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(rowToTilePoint: (Row, X, Y) => TilePoint): Options = {
      val __obj = js.Dynamic.literal(rowToTilePoint = js.Any.fromFunction3(rowToTilePoint))
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAggregation(value: Aggregation): Self = StObject.set(x, "aggregation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAggregationUndefined: Self = StObject.set(x, "aggregation", js.undefined)
      
      @scala.inline
      def setAlphaScale(value: /* scale */ Double => Double): Self = StObject.set(x, "alphaScale", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAlphaScaleUndefined: Self = StObject.set(x, "alphaScale", js.undefined)
      
      @scala.inline
      def setBandwidth(value: Bandwidth | BandwidthStop | js.Array[BandwidthStop] | BandwidthCallback): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBandwidthFunction0(value: () => Unit): Self = StObject.set(x, "bandwidth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBandwidthUndefined: Self = StObject.set(x, "bandwidth", js.undefined)
      
      @scala.inline
      def setBandwidthVarargs(value: BandwidthStop*): Self = StObject.set(x, "bandwidth", js.Array(value :_*))
      
      @scala.inline
      def setColorScale(value: /* scale */ Double => String): Self = StObject.set(x, "colorScale", js.Any.fromFunction1(value))
      
      @scala.inline
      def setColorScaleUndefined: Self = StObject.set(x, "colorScale", js.undefined)
      
      @scala.inline
      def setCountRange(value: /* zoom */ Zoom => js.Array[Double]): Self = StObject.set(x, "countRange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCountRangeUndefined: Self = StObject.set(x, "countRange", js.undefined)
      
      @scala.inline
      def setDataToRows(
        value: (/* data */ Data, /* x */ typings.heredatalens.H.datalens.QueryTileProvider.X, /* y */ typings.heredatalens.H.datalens.QueryTileProvider.Y, /* zoom */ Zoom) => js.Array[Row]
      ): Self = StObject.set(x, "dataToRows", js.Any.fromFunction4(value))
      
      @scala.inline
      def setDataToRowsUndefined: Self = StObject.set(x, "dataToRows", js.undefined)
      
      @scala.inline
      def setInputScale(value: InputScale): Self = StObject.set(x, "inputScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputScaleUndefined: Self = StObject.set(x, "inputScale", js.undefined)
      
      @scala.inline
      def setRowToTilePoint(value: (Row, X, Y) => TilePoint): Self = StObject.set(x, "rowToTilePoint", js.Any.fromFunction3(value))
      
      @scala.inline
      def setValueRange(value: /* zoom */ Zoom => js.Array[Double]): Self = StObject.set(x, "valueRange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValueRangeUndefined: Self = StObject.set(x, "valueRange", js.undefined)
    }
  }
  
  /**
    * Slice of data (eg Data Lens query data row) that represents a data point.
    * Each row is transformed into TilePoint and then rendered on a heat map. By default each row is an Object where property names correspond to data column names.
    * This representation can be changed with the dataToRows callback.
    */
  trait Row extends StObject {
    
    var count: js.UndefOr[Double] = js.undefined
    
    var tx: js.UndefOr[Double] = js.undefined
    
    var ty: js.UndefOr[Double] = js.undefined
  }
  object Row {
    
    @scala.inline
    def apply(): Row = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Row]
    }
    
    @scala.inline
    implicit class RowMutableBuilder[Self <: Row] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setTx(value: Double): Self = StObject.set(x, "tx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTxUndefined: Self = StObject.set(x, "tx", js.undefined)
      
      @scala.inline
      def setTy(value: Double): Self = StObject.set(x, "ty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTyUndefined: Self = StObject.set(x, "ty", js.undefined)
    }
  }
  
  /**
    * Defines the input data format for heat map rendering.
    * For heat map rendering, each row of data must be represented as a point within the map tile.
    */
  trait TilePoint extends StObject {
    
    /** Number of contributors to the value at the point (eg number of rows in a bucket) */
    var count: Double
    
    /** Reference to source data row */
    var data: js.UndefOr[Row] = js.undefined
    
    /** Value at the point (eg aggregated bucket value) */
    var value: Double
    
    /** Row relative to tile */
    var x: Double
    
    /** Column relative to tile */
    var y: Double
  }
  object TilePoint {
    
    @scala.inline
    def apply(count: Double, value: Double, x: Double, y: Double): TilePoint = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[TilePoint]
    }
    
    @scala.inline
    implicit class TilePointMutableBuilder[Self <: TilePoint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: Row): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Tile X coordinate (column)
    * Coordinate in XYZ tile numbering scheme.
    */
  type X = Double
  
  /**
    * Tile Y coordinate (row)
    * Coordinate in XYZ tile numbering scheme.
    */
  type Y = Double
}
