package typings.heredatalens.H.datalens

import typings.heredatalens.H.datalens.ObjectLayer.StyleState
import typings.heredatalens.H.datalens.QueryTileProvider.Zoom
import typings.heredatalens.H.datalens.Service.Data
import typings.heremaps.H.clustering.DataPoint
import typings.heremaps.H.clustering.Provider.ClusteringOptions
import typings.heremaps.H.geo.Point
import typings.heremaps.H.map.Icon
import typings.heremaps.H.map.Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Presents data as points or spatial map objects with data-driven styles and client-side clustering.
  * Applicable for drawing interactive map objects like markers, polygons, circles and other instances of map.Object. Source of data can be either tiled or not tiled.
  * Styles for objects can be parametrized with data rows and zoom level. Allows to create data-driven icons for markers like donuts or bars.
  * Also enables clustering and data domains for visualizing up to 100k points or more.
  */
@js.native
trait ObjectLayer
  extends typings.heremaps.H.map.layer.ObjectLayer {
  
  /**
    * Force re-rendering of the layer. In the case where the callbacks passed to the layer options are not pure functions, you can call this method to force re-rendering.
    */
  def redraw(): Unit = js.native
  
  /**
    * Recalculates the style and applies it to the map object based on the new StyleState
    * @param object - Map object
    * @param state - New state
    */
  def updateObjectStyle(any: Object, state: StyleState): Unit = js.native
}
object ObjectLayer {
  
  /**
    * Defines client-side clustering in the ObjectLayer.
    * When the clustering option is provided, rows returned from dataToRows go to the clustering.rowToDataPoint callback to be transformed to data points.
    * Then, the data points are clustered according to clustering.options. Clustering produces clusters and noise points (data points that are not clustered).
    * Clusters and noise points must be presented as map objects with the rowToMapObject callback and can be styled with the rowToStyle callback.
    */
  @js.native
  trait Clustering extends StObject {
    
    /** Defines clustering options as a function of the zoom level */
    def options(zoom: Zoom): ClusteringOptions = js.native
    
    /** Defines data points from rows */
    def rowToDataPoint(row: Row): DataPoint = js.native
  }
  object Clustering {
    
    @scala.inline
    def apply(options: Zoom => ClusteringOptions, rowToDataPoint: Row => DataPoint): Clustering = {
      val __obj = js.Dynamic.literal(options = js.Any.fromFunction1(options), rowToDataPoint = js.Any.fromFunction1(rowToDataPoint))
      __obj.asInstanceOf[Clustering]
    }
    
    @scala.inline
    implicit class ClusteringMutableBuilder[Self <: Clustering] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: Zoom => ClusteringOptions): Self = StObject.set(x, "options", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRowToDataPoint(value: Row => DataPoint): Self = StObject.set(x, "rowToDataPoint", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Input data quantization domain, used to optimize styling performance.
    * The option must have properties corresponding to the properties of ObjectLayer.Row. Values must be represented as an Array of Numbers that defines the quantization domain.
    * When provided, the input data will be quantized, and rowToStyle will be called only for quantized values.
    */
  type DataDomains = js.Any
  
  /**
    * Output from the rowToStyle callback.
    * Defines the styles or the icon that is applied to the map object.
    */
  @js.native
  trait ObjectStyleOptions extends StObject {
    
    /** Style of arrows to render along a polyline */
    var arrows: js.UndefOr[typings.heremaps.H.map.ArrowStyle.Options] = js.native
    
    /** Marker icon */
    var icon: Icon = js.native
    
    /** Spatial style */
    var style: js.UndefOr[typings.heremaps.H.map.SpatialStyle.Options] = js.native
    
    /** The z-index value of the map object, default is 0 */
    var zIndex: js.UndefOr[Double] = js.native
  }
  object ObjectStyleOptions {
    
    @scala.inline
    def apply(icon: Icon): ObjectStyleOptions = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObjectStyleOptions]
    }
    
    @scala.inline
    implicit class ObjectStyleOptionsMutableBuilder[Self <: ObjectStyleOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrows(value: typings.heremaps.H.map.ArrowStyle.Options): Self = StObject.set(x, "arrows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowsUndefined: Self = StObject.set(x, "arrows", js.undefined)
      
      @scala.inline
      def setIcon(value: Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: typings.heremaps.H.map.SpatialStyle.Options): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  /**
    * Defines data processing and data-driven styling for ObjectLayer
    * The initial step of rendering is to split the tile data by rows, where each row represents a bucket.
    * By default this step is processed with ObjectLayer.defaultDataToRows. This behavior can be changed by defining the dataToRows callback.
    * In the next step each row must be presented as a map object with the rowToMapObject callback. Data-driven styling can be provided with the rowToStyle callback.
    */
  @js.native
  trait Options extends StObject {
    
    /** When present, client-side clustering is applied */
    var clustering: js.UndefOr[Clustering] = js.native
    
    /** Defines quantization of data for improving data-driven styling performance */
    var dataDomains: js.UndefOr[DataDomains] = js.native
    
    /** Defines how the input data is split by rows. You can specify this callback to define client-side aggregation and filtering. */
    var dataToRows: js.UndefOr[js.Function1[/* data */ Data, js.Array[Row]]] = js.native
    
    /** Defines how each row is presented on the map (eg marker, polygon) */
    def rowToMapObject(row: Row, z: Zoom): Object = js.native
    
    /**
      * Defines map object style and icon according to data row and zoom level.
      * Also it can define different styles depending on the StyleState (eg hovered, selected).
      */
    var rowToStyle: js.UndefOr[
        js.Function3[/* row */ Row, /* z */ Zoom, /* styleState */ StyleState, ObjectStyleOptions]
      ] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(rowToMapObject: (Row, Zoom) => Object): Options = {
      val __obj = js.Dynamic.literal(rowToMapObject = js.Any.fromFunction2(rowToMapObject))
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClustering(value: Clustering): Self = StObject.set(x, "clustering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusteringUndefined: Self = StObject.set(x, "clustering", js.undefined)
      
      @scala.inline
      def setDataDomains(value: DataDomains): Self = StObject.set(x, "dataDomains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataDomainsUndefined: Self = StObject.set(x, "dataDomains", js.undefined)
      
      @scala.inline
      def setDataToRows(value: /* data */ Data => js.Array[Row]): Self = StObject.set(x, "dataToRows", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDataToRowsUndefined: Self = StObject.set(x, "dataToRows", js.undefined)
      
      @scala.inline
      def setRowToMapObject(value: (Row, Zoom) => Object): Self = StObject.set(x, "rowToMapObject", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRowToStyle(value: (/* row */ Row, /* z */ Zoom, /* styleState */ StyleState) => ObjectStyleOptions): Self = StObject.set(x, "rowToStyle", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRowToStyleUndefined: Self = StObject.set(x, "rowToStyle", js.undefined)
    }
  }
  
  /**
    * Slice of data (eg Data Lens query data row) that represents a data point.
    * Each row is translated to map objects with the rowToMapObject callback. By default each row is an Object where property names correspond to data column names.
    * This representation can be changed with the dataToRows callback.
    */
  @js.native
  trait Row extends StObject {
    
    def getPosition(): Point = js.native
    
    def isCluster(): Boolean = js.native
    
    var lat: Double = js.native
    
    var lng: Double = js.native
  }
  object Row {
    
    @scala.inline
    def apply(getPosition: () => Point, isCluster: () => Boolean, lat: Double, lng: Double): Row = {
      val __obj = js.Dynamic.literal(getPosition = js.Any.fromFunction0(getPosition), isCluster = js.Any.fromFunction0(isCluster), lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
      __obj.asInstanceOf[Row]
    }
    
    @scala.inline
    implicit class RowMutableBuilder[Self <: Row] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetPosition(value: () => Point): Self = StObject.set(x, "getPosition", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsCluster(value: () => Boolean): Self = StObject.set(x, "isCluster", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLng(value: Double): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * User defined modification of a data-driven style
    * StyleState appears as a parameter in the rowToStyle callback. By default it is 'DEFAULT_STATE'. To change StyleState, use the ObjectLayer.updateObjectStyle method.
    */
  type StyleState = js.Any
}
