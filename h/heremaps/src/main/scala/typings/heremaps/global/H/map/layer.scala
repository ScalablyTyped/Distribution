package typings.heremaps.global.H.map

import typings.heremaps.H.clustering.Provider
import typings.heremaps.H.map.layer.IMarkerLayer.Response
import typings.heremaps.H.map.layer.IMarkerLayer.TiledResponse
import typings.heremaps.H.map.layer.ITileLayer.Options
import typings.heremaps.H.map.provider.MarkerTileProvider
import typings.heremaps.H.map.provider.ObjectProvider
import typings.heremaps.H.map.provider.Tile
import typings.heremaps.H.map.provider.TileProvider
import typings.heremaps.H.math.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layer {
  
  /**
    * BaseTileLayer encapsulates funcitonailty that is common to all layers that deliver tiles, such as H.map.layer.TileLayer. The functionality includes geo bounding box to grid
    * calculation, tile request management.
    */
  @JSGlobal("H.map.layer.BaseTileLayer")
  @js.native
  open class BaseTileLayer protected ()
    extends StObject
       with typings.heremaps.H.map.layer.BaseTileLayer {
    /**
      * Constructor
      * @param provider {H.map.provider.TileProvider} - data source for the TileLayer
      * @param opt_options {H.map.layer.ITileLayer.Options=} - additional options
      */
    def this(provider: TileProvider) = this()
    def this(provider: TileProvider, opt_options: Options) = this()
  }
  
  /**
    * The Layer class represents an object that is evaluated by the renderer in the order in which it is added to the layers collection. It provides the basic infrastructure for dispatching
    * update events to the renderer in case new data is available.
    */
  @JSGlobal("H.map.layer.Layer")
  @js.native
  /**
    * Constructor
    * @param opt_options {H.map.layer.Layer.Options=} - optional configuration object
    */
  open class Layer ()
    extends StObject
       with typings.heremaps.H.map.layer.Layer {
    def this(opt_options: typings.heremaps.H.map.layer.Layer.Options) = this()
  }
  
  /**
    * ObjectTileLayer represents map objects which are requested on a tile basis
    */
  @JSGlobal("H.map.layer.MarkerTileLayer")
  @js.native
  open class MarkerTileLayer protected ()
    extends StObject
       with typings.heremaps.H.map.layer.MarkerTileLayer {
    /**
      * Constructor
      * @param provider {H.map.provider.MarkerTileProvider}
      * @param opt_options {H.map.layer.ITileLayer.Options=}
      */
    def this(provider: MarkerTileProvider) = this()
    def this(provider: MarkerTileProvider, opt_options: Options) = this()
    
    /**
      * This method requests dom marker objects for provided bounding rectangle.
      * @param boundingRect {H.geo.Rect} - the bounding rectangle for which marker are to be returned
      * @param zoomLevel {number} - The zoom level for which the objects are requested
      * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
      * @param prioCenter {H.math.Point} - The priority center as an offset in screen pixel relative to the center
      * @returns {(H.map.layer.IMarkerLayer.Response | H.map.layer.IMarkerLayer.TiledResponse)} - a response object containing the number of markers and the markers themselves
      */
    /* CompleteClass */
    override def requestDomMarkers(
      boundingRect: typings.heremaps.H.geo.Rect,
      zoomLevel: Double,
      cacheOnly: Boolean,
      prioCenter: Point
    ): Response | TiledResponse = js.native
    
    /**
      * This method requests marker objects for provided bounding rectangle.
      * @param boundingRect {H.geo.Rect} - the bounding rectangle for which marker are to be returned
      * @param zoomLevel {number} - The zoom level for which the objects are requested
      * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
      * @param prioCenter {H.math.Point} - The priority center as an offset in screen pixel relative to the center
      * @returns {(H.map.layer.IMarkerLayer.Response | H.map.layer.IMarkerLayer.TiledResponse)} - a response object containing the number of markers and the markers themselves
      */
    /* CompleteClass */
    override def requestMarkers(
      boundingRect: typings.heremaps.H.geo.Rect,
      zoomLevel: Double,
      cacheOnly: Boolean,
      prioCenter: Point
    ): Response | TiledResponse = js.native
  }
  
  /**
    * This class represents a layer which renders map objects. Spatial objects like polygons and polylines a rendered to tiles before being passed to the enigne. Point objects like markers
    * are provided as objects given an rectangular area.
    */
  @JSGlobal("H.map.layer.ObjectLayer")
  @js.native
  open class ObjectLayer protected ()
    extends StObject
       with typings.heremaps.H.map.layer.ObjectLayer {
    def this(provider: Provider) = this()
    /**
      * Constructor
      * @param provider {H.map.provider.ObjectProvider} - the ObjectProvider which provides the map objects to this object layer.
      * @param opt_options {H.map.layer.ObjectLayer.Options=} - The options for this layer
      */
    def this(provider: ObjectProvider) = this()
    def this(provider: Provider, opt_options: typings.heremaps.H.map.layer.ObjectLayer.Options) = this()
    def this(provider: ObjectProvider, opt_options: typings.heremaps.H.map.layer.ObjectLayer.Options) = this()
    
    /**
      * This method cancels a previously requested tile.
      * @param x {number} - tile row position
      * @param y {number} - tile column position
      * @param z {number} - zoom level
      */
    /* CompleteClass */
    override def cancelTile(x: Double, y: Double, z: Double): Unit = js.native
    
    /**
      * This method requests a single tile according to tile coordinates. It returns either a Tile object if it is already loaded or undefined and starts loading the tile
      * @param x {number} - tile row position
      * @param y {number} - tile column position
      * @param z {number} - The zoom level for which the tile is requested
      * @param cacheOnly {boolean} - indicates whether only cached tiles are to be considered
      * @returns {(H.map.provider.Tile | undefined)} - tile object corresponding to requested coordinates
      */
    /* CompleteClass */
    override def requestTile(x: Double, y: Double, z: Double, cacheOnly: Boolean): Tile | Unit = js.native
    
    /**
      * This method requests tiles for the current bounding rectangle at the given zoom level (z-value).
      * @param boundingRect {H.geo.Rect} - the bounding rectangle for which tiles are to be returned
      * @param zoomLevel {number} - The zoom level for which the tiles are requested
      * @param cacheOnly {boolean} - Indicates whether only cached tiles are to be considered
      * @param prioCenter {H.math.Point} - The priority center as an offset in screen pixel relative to the center
      * @returns {H.map.layer.ITileLayer.Response} - a response object containing the total number of tiles requested and the tile objects that could be immediately returned
      */
    /* CompleteClass */
    override def requestTiles(
      boundingRect: typings.heremaps.H.geo.Rect,
      zoomLevel: Double,
      cacheOnly: Boolean,
      prioCenter: Point
    ): typings.heremaps.H.map.layer.ITileLayer.Response = js.native
  }
  
  /**
    * Tile Layer, represents data shown on map on a tile basis. Can be used to show map tile images or other type of data which is partitioned into tiles.
    * @event update {H.util.Event}
    */
  @JSGlobal("H.map.layer.TileLayer")
  @js.native
  open class TileLayer protected ()
    extends StObject
       with typings.heremaps.H.map.layer.TileLayer {
    /**
      * Constructor
      * @param provider {H.map.provider.TileProvider} - data source for the TileLayer
      * @param opt_options {H.map.layer.ITileLayer.Options=} - additional options
      */
    def this(provider: TileProvider) = this()
    def this(provider: TileProvider, opt_options: Options) = this()
    
    /**
      * This method cancels a previously requested tile.
      * @param x {number} - tile row position
      * @param y {number} - tile column position
      * @param z {number} - zoom level
      */
    /* InferMemberOverrides */
    override def cancelTile(x: Double, y: Double, z: Double): Unit = js.native
    
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
      * This method requests tiles for the current bounding rectangle at the given zoom level (z-value).
      * @param boundingRect {H.geo.Rect} - the bounding rectangle for which tiles are to be returned
      * @param zoomLevel {number} - The zoom level for which the tiles are requested
      * @param cacheOnly {boolean} - Indicates whether only cached tiles are to be considered
      * @param prioCenter {H.math.Point} - The priority center as an offset in screen pixel relative to the center
      * @returns {H.map.layer.ITileLayer.Response} - a response object containing the total number of tiles requested and the tile objects that could be immediately returned
      */
    /* CompleteClass */
    override def requestTiles(
      boundingRect: typings.heremaps.H.geo.Rect,
      zoomLevel: Double,
      cacheOnly: Boolean,
      prioCenter: Point
    ): typings.heremaps.H.map.layer.ITileLayer.Response = js.native
  }
}
