package typings.heredatalens.H.datalens

import typings.heredatalens.H.datalens.QueryTileProvider.X
import typings.heredatalens.H.datalens.QueryTileProvider.Y
import typings.heredatalens.H.datalens.QueryTileProvider.Zoom
import typings.heredatalens.H.datalens.Service.Data
import typings.heredatalens.H.datalens.SpatialLayer.StyleState
import typings.heremaps.H.map.Object
import typings.heremaps.H.map.layer.TileLayer
import typings.heremaps.H.map.provider.Tile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Renders vector tiles using data-driven styles
  * This layer binds the spatial data and user data, all provided by the Data Lens REST API. The layer renders geometry features using data-driven styles.
  */
@js.native
trait SpatialLayer
  extends StObject
     with TileLayer {
  
  /**
    * This method cancels a previously requested tile.
    * @param x {number} - tile row position
    * @param y {number} - tile column position
    * @param z {number} - zoom level
    */
  /* InferMemberOverrides */
  override def cancelTile(x: Double, y: Double, z: Double): Unit = js.native
  
  /**
    * Forces re-rendering of the layer. When the callbacks passed to the layer options are not pure functions, you can call this method to force re-rendering.
    */
  def redraw(): Unit = js.native
  
  /**
    * This method requests a single tile according to tile coordinates. It returns either a Tile object if it is already loaded or undefined and starts loading the tile
    * @param x {number} - tile row position
    * @param y {number} - tile column position
    * @param z {number} - The zoom level for which the tile is requested
    * @param cacheOnly {boolean} - indicates whether only cached tiles are to be considered
    * @returns {(H.map.provider.Tile | undefined)} - tile object corresponding to requested coordinates
    */
  /* InferMemberOverrides */
  override def requestTile(x: Double, y: Double, z: Double, cacheOnly: Boolean): Tile | Unit = js.native
  
  /**
    * This method changes the state of a map object; for example, style on mouse event.
    */
  def updateSpatialStyle(spatial: Object, state: StyleState): Unit = js.native
}
object SpatialLayer {
  
  /**
    * Defines a geometry in the vector tile
    * Each geometry is described by various properties, including a unique identifier which must be used to map the geometry to user data.
    */
  type Feature = js.Any
  
  /**
    * Defines data processing and rendering options for SpatialLayer
    * The initial step of rendering is to split the tile data by rows, where each row represents a bucket.
    * By default this step is processed with SpatialLayer.defaultDataToRows. This behavior can be changed by defining the dataToRows callback.
    */
  trait Options extends StObject {
    
    /** Defines how the input tile data is split by rows. You can specify this callback to define client-side aggregation and filtering. This callback is called for each tile. */
    var dataToRows: js.UndefOr[js.Function4[/* data */ Data, /* x */ X, /* y */ Y, /* z */ Zoom, js.Array[Row]]] = js.undefined
    
    /** Defines the default map object style. */
    def defaultStyle(z: Zoom, styleState: StyleState): js.Any
    
    /** Defines how to get the spatial ID from a geometry feature. This callback is called for each geometry feature in the vector tile. */
    def featureToSpatialId(feature: Feature): String
    
    /** Defines how to get the spatial ID from a data row. This callback is called for each row that is returned from dataToRows. */
    def rowToSpatialId(row: Row): String
    
    /** Defines how the row is translated to map object style. This callback is called for each row that is returned from dataToRows. */
    def rowToStyle(row: Row, z: Zoom, styleState: StyleState): js.Any
    
    /** Defines how to transform the features. */
    var transformFeature: typings.heredatalens.H.datalens.SpatialLayer.transformFeature
  }
  object Options {
    
    @scala.inline
    def apply(
      defaultStyle: (Zoom, StyleState) => js.Any,
      featureToSpatialId: Feature => String,
      rowToSpatialId: Row => String,
      rowToStyle: (Row, Zoom, StyleState) => js.Any,
      transformFeature: transformFeature
    ): Options = {
      val __obj = js.Dynamic.literal(defaultStyle = js.Any.fromFunction2(defaultStyle), featureToSpatialId = js.Any.fromFunction1(featureToSpatialId), rowToSpatialId = js.Any.fromFunction1(rowToSpatialId), rowToStyle = js.Any.fromFunction3(rowToStyle), transformFeature = transformFeature.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataToRows(value: (/* data */ Data, /* x */ X, /* y */ Y, /* z */ Zoom) => js.Array[Row]): Self = StObject.set(x, "dataToRows", js.Any.fromFunction4(value))
      
      @scala.inline
      def setDataToRowsUndefined: Self = StObject.set(x, "dataToRows", js.undefined)
      
      @scala.inline
      def setDefaultStyle(value: (Zoom, StyleState) => js.Any): Self = StObject.set(x, "defaultStyle", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFeatureToSpatialId(value: Feature => String): Self = StObject.set(x, "featureToSpatialId", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRowToSpatialId(value: Row => String): Self = StObject.set(x, "rowToSpatialId", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRowToStyle(value: (Row, Zoom, StyleState) => js.Any): Self = StObject.set(x, "rowToStyle", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTransformFeature(value: transformFeature): Self = StObject.set(x, "transformFeature", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Defines a slice of data (eg Data Lens query data row) that represents a data point
    * By default each row is an object where property names correspond to data column names. This representation can be changed with the dataToRows callback.
    */
  type Row = js.Any
  
  /**
    * Defines modification of a data-driven style
    * StyleState appears as a parameter in the rowToStyle callback. By default it is 'DEFAULT_STATE'. To change StyleState, use the SpatialLayer.updateSpatialStyle method.
    */
  type StyleState = js.Any
  
  /**
    * TODO: missing in documentation: https://developer.here.com/visualization/documentation/datalens/h-datalens-spatiallayer-options.html
    */
  type transformFeature = js.Any
}
