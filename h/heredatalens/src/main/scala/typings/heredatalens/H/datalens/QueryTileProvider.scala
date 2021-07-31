package typings.heredatalens.H.datalens

import typings.heredatalens.H.datalens.QueryTileProvider.TileParamNames
import typings.heremaps.H.map.provider.RemoteTileProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Providers define interfaces for layers to access data.
  * The input data can be stored locally or loaded from the network. Data can be loaded by tiles or in one chunk.
  * This provider loads tiled query data with the Data Lens REST API. Tiled queries are used to load data only for the current viewport.
  * This optimizes memory and network usage and enables progressive rendering.
  */
@js.native
trait QueryTileProvider
  extends StObject
     with RemoteTileProvider {
  
  /**
    * Updates the query ID to be used in the next call of the Data Lens REST API.
    * Note that new data will be fetched only after the reload method is called.
    */
  def setQueryId(queryId: String): Unit = js.native
  
  /**
    * Updates the query's dynamic parameters to be used in the next call of the Data Lens REST API.
    * Note that new data will be fetched only after the reload method is called. This method is normally used when updating your visualization.
    */
  def setQueryParams(): Unit = js.native
  def setQueryParams(queryParams: js.Any): Unit = js.native
  
  /**
    * Updates the names of the dynamic parameters that defines tiles. This method is only needed when the query ID is updated.
    * Note that new data will be fetched only after the reload method is called.
    * @param tileParamNames - Names of the URI parameters that control the x/y/z of a tiled query
    */
  def setTileParamNames(tileParamNames: TileParamNames): Unit = js.native
}
object QueryTileProvider {
  
  /**
    * Configures source query and data accessibility parameters for QueryTileProvider
    * Specifies the query credentials and dynamic parameters required for fetching tiled query data with the Data Lens REST API.
    * Other options from Provider.Options are available.
    */
  trait Options extends StObject {
    
    /** The ID for the Data Lens REST API query */
    var queryId: String
    
    /** The query's dynamic parameters. The dynamic parameters can be used to filter data provided by the query. */
    var queryParams: js.UndefOr[String] = js.undefined
    
    /** Names of the URI parameters that control the x/y/z of a tiled query */
    var tileParamNames: TileParamNames
  }
  object Options {
    
    @scala.inline
    def apply(queryId: String, tileParamNames: TileParamNames): Options = {
      val __obj = js.Dynamic.literal(queryId = queryId.asInstanceOf[js.Any], tileParamNames = tileParamNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQueryId(value: String): Self = StObject.set(x, "queryId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryParams(value: String): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
      
      @scala.inline
      def setTileParamNames(value: TileParamNames): Self = StObject.set(x, "tileParamNames", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Represents the names of the URI parameters that control the x/y/z of tiled query.
    * When defining the Data Lens query, dynamic parameters that control tiling can be arbitrarily named.
    * Names of these parameters must be specified to fetch tiles.
    */
  trait TileParamNames extends StObject {
    
    /** Name of the dynamic parameter that defines tile column */
    var x: String
    
    /** Name of the dynamic parameter that defines tile row */
    var y: String
    
    /** Name of the dynamic parameter that defines zoom level */
    var z: String
  }
  object TileParamNames {
    
    @scala.inline
    def apply(x: String, y: String, z: String): TileParamNames = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[TileParamNames]
    }
    
    @scala.inline
    implicit class TileParamNamesMutableBuilder[Self <: TileParamNames] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZ(value: String): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
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
  
  /**
    * Zoom level
    * Coordinate in XYZ tile numbering scheme. May vary within range 1 to 20.
    */
  type Zoom = Double
}
