package typings.heremaps.H.map

import typings.heremaps.H.geo.IProjection
import typings.heremaps.H.map.layer.IMarkerLayer.TiledResponse
import typings.heremaps.H.map.layer.ITileLayer.Response
import typings.heremaps.H.map.layer.ObjectLayer.OverlaysResponse
import typings.heremaps.H.map.provider.ObjectProvider
import typings.heremaps.H.map.provider.Tile
import typings.heremaps.H.map.provider.TileProvider
import typings.heremaps.H.math.Point
import typings.heremaps.H.util.Event
import typings.heremaps.H.util.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layer {
  
  /**
    * BaseTileLayer encapsulates funcitonailty that is common to all layers that deliver tiles, such as H.map.layer.TileLayer. The functionality includes geo bounding box to grid
    * calculation, tile request management.
    */
  @js.native
  trait BaseTileLayer
    extends StObject
       with Layer {
    
    /**
      * This method cancels a previously requested tile.
      * @param x {number} - tile row position
      * @param y {number} - tile column position
      * @param z {number} - zoom level
      */
    def cancelTile(x: Double, y: Double, z: Double): Unit = js.native
    
    /**
      * This method transforms a geo-rectangle to geometrical projected rectangle at the current projection zoom level or at provided zoom level
      * @param geoRect {H.geo.Rect} - geo bounds to be projected
      * @param opt_zoom {number=} - overrides current projection zoom level
      * @returns {H.math.Rect} - projected 2d space rect cooresponding to provided geo bounds
      */
    def geoRectToRect(geoRect: typings.heremaps.H.geo.Rect): typings.heremaps.H.math.Rect = js.native
    def geoRectToRect(geoRect: typings.heremaps.H.geo.Rect, opt_zoom: Double): typings.heremaps.H.math.Rect = js.native
    
    /**
      * This method returns the provider which feeds this layer with data.
      * @returns {H.map.provider.TileProvider} - this layer's provider
      */
    def getProvider(): TileProvider = js.native
    
    /**
      * This method requests tiles from the data source (provider). It can return a set of tiles which are currently loaded. All tiles which are not yet loaded will be included in response
      * as soon as they will be available during subsequent calls.
      * @param tileBounds {H.math.Rect} - bounds in tile grid
      * @param isCDB {boolean}
      * @param zoomLevel {number} - The zoom level for which the objects are requested
      * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
      * @param prioCenter {H.math.Point} - The priority center as an offset in screen pixel relative to the center
      * @returns {H.map.layer.ITileLayer.Response} - returns an array if tile which are already loaded
      */
    def getProviderTiles(
      tileBounds: typings.heremaps.H.math.Rect,
      isCDB: Boolean,
      zoomLevel: Double,
      cacheOnly: Boolean,
      prioCenter: Point
    ): Response = js.native
    
    /**
      * This method returns tile grid for a bounding rectangle
      * @param rectBounds {H.math.Rect} - projected rect bounds which coorespond to geo bounding box
      * @param zoom {number} - current zoom level
      * @returns {H.math.Rect} - rectangle which represents the tile grid bounds
      */
    def getTileBounds(rectBounds: typings.heremaps.H.math.Rect, zoom: Double): typings.heremaps.H.math.Rect = js.native
    
    /**
      * This method requests a single tile according to tile coordinates. It returns either a Tile object if it is already loaded or undefined and starts loading the tile
      * @param x {number} - tile row position
      * @param y {number} - tile column position
      * @param z {number} - The zoom level for which the tile is requested
      * @param cacheOnly {boolean} - indicates whether only cached tiles are to be considered
      * @returns {(H.map.provider.Tile | undefined)} - tile object corresponding to requested coordinates
      */
    def requestTile(x: Double, y: Double, z: Double, cacheOnly: Boolean): Tile | Unit = js.native
  }
  
  /**
    * This interface describes a layer which provides marker objects to the renderer.
    */
  trait IMarkerLayer extends StObject {
    
    /**
      * This method requests dom marker objects for provided bounding rectangle.
      * @param boundingRect {H.geo.Rect} - the bounding rectangle for which marker are to be returned
      * @param zoomLevel {number} - The zoom level for which the objects are requested
      * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
      * @param prioCenter {H.math.Point} - The priority center as an offset in screen pixel relative to the center
      * @returns {(H.map.layer.IMarkerLayer.Response | H.map.layer.IMarkerLayer.TiledResponse)} - a response object containing the number of markers and the markers themselves
      */
    def requestDomMarkers(
      boundingRect: typings.heremaps.H.geo.Rect,
      zoomLevel: Double,
      cacheOnly: Boolean,
      prioCenter: Point
    ): typings.heremaps.H.map.layer.IMarkerLayer.Response | TiledResponse
    
    /**
      * This method requests marker objects for provided bounding rectangle.
      * @param boundingRect {H.geo.Rect} - the bounding rectangle for which marker are to be returned
      * @param zoomLevel {number} - The zoom level for which the objects are requested
      * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
      * @param prioCenter {H.math.Point} - The priority center as an offset in screen pixel relative to the center
      * @returns {(H.map.layer.IMarkerLayer.Response | H.map.layer.IMarkerLayer.TiledResponse)} - a response object containing the number of markers and the markers themselves
      */
    def requestMarkers(
      boundingRect: typings.heremaps.H.geo.Rect,
      zoomLevel: Double,
      cacheOnly: Boolean,
      prioCenter: Point
    ): typings.heremaps.H.map.layer.IMarkerLayer.Response | TiledResponse
  }
  object IMarkerLayer {
    
    inline def apply(
      requestDomMarkers: (typings.heremaps.H.geo.Rect, Double, Boolean, Point) => typings.heremaps.H.map.layer.IMarkerLayer.Response | TiledResponse,
      requestMarkers: (typings.heremaps.H.geo.Rect, Double, Boolean, Point) => typings.heremaps.H.map.layer.IMarkerLayer.Response | TiledResponse
    ): IMarkerLayer = {
      val __obj = js.Dynamic.literal(requestDomMarkers = js.Any.fromFunction4(requestDomMarkers), requestMarkers = js.Any.fromFunction4(requestMarkers))
      __obj.asInstanceOf[IMarkerLayer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IMarkerLayer] (val x: Self) extends AnyVal {
      
      inline def setRequestDomMarkers(
        value: (typings.heremaps.H.geo.Rect, Double, Boolean, Point) => typings.heremaps.H.map.layer.IMarkerLayer.Response | TiledResponse
      ): Self = StObject.set(x, "requestDomMarkers", js.Any.fromFunction4(value))
      
      inline def setRequestMarkers(
        value: (typings.heremaps.H.geo.Rect, Double, Boolean, Point) => typings.heremaps.H.map.layer.IMarkerLayer.Response | TiledResponse
      ): Self = StObject.set(x, "requestMarkers", js.Any.fromFunction4(value))
    }
    
    /**
      * This type represents a response object returned by the H.map.layer.IMarkerLayer#requestMarkers function.
      * @property total {number} - The total number of markers, inclusive markers with not ready icons
      * @property markers {Array<H.map.AbstractMarker>} - The marker objects for the bounding rectangle (only ready)
      */
    trait Response extends StObject {
      
      var markers: js.Array[AbstractMarker]
      
      var total: Double
    }
    object Response {
      
      inline def apply(markers: js.Array[AbstractMarker], total: Double): typings.heremaps.H.map.layer.IMarkerLayer.Response = {
        val __obj = js.Dynamic.literal(markers = markers.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.heremaps.H.map.layer.IMarkerLayer.Response]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.heremaps.H.map.layer.IMarkerLayer.Response] (val x: Self) extends AnyVal {
        
        inline def setMarkers(value: js.Array[AbstractMarker]): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
        
        inline def setMarkersVarargs(value: AbstractMarker*): Self = StObject.set(x, "markers", js.Array(value*))
        
        inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * This type represents a response object returned by the H.map.layer.IMarkerLayer#requestMarkers function.
      * @property number {number} - of returned tiles
      * @property requested {number} - number of requested tiles
      * @property objects {Array<H.map.AbstractMarker>} - the marker objects within requested tiled area
      */
    trait TiledResponse extends StObject {
      
      var number: Double
      
      var objects: js.Array[AbstractMarker]
      
      var requested: Double
    }
    object TiledResponse {
      
      inline def apply(number: Double, objects: js.Array[AbstractMarker], requested: Double): TiledResponse = {
        val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any], requested = requested.asInstanceOf[js.Any])
        __obj.asInstanceOf[TiledResponse]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: TiledResponse] (val x: Self) extends AnyVal {
        
        inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
        
        inline def setObjects(value: js.Array[AbstractMarker]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
        
        inline def setObjectsVarargs(value: AbstractMarker*): Self = StObject.set(x, "objects", js.Array(value*))
        
        inline def setRequested(value: Double): Self = StObject.set(x, "requested", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /**
    * This interface describes a layer which provides data partitioned in quad-tree tiles in an x, y, z fashion (where z describes the level within the tree and x and y describe the absolute
    * column and row indeces whithin the level).
    */
  trait ITileLayer extends StObject {
    
    /**
      * This method cancels a previously requested tile.
      * @param x {number} - tile row position
      * @param y {number} - tile column position
      * @param z {number} - zoom level
      */
    def cancelTile(x: Double, y: Double, z: Double): Unit
    
    /**
      * This method requests a single tile according to tile coordinates. It returns either a Tile object if it is already loaded or undefined and starts loading the tile
      * @param x {number} - tile row position
      * @param y {number} - tile column position
      * @param z {number} - The zoom level for which the tile is requested
      * @param cacheOnly {boolean} - indicates whether only cached tiles are to be considered
      * @returns {(H.map.provider.Tile | undefined)} - tile object corresponding to requested coordinates
      */
    def requestTile(x: Double, y: Double, z: Double, cacheOnly: Boolean): Tile | Unit
    
    /**
      * This method requests tiles for the current bounding rectangle at the given zoom level (z-value).
      * @param boundingRect {H.geo.Rect} - the bounding rectangle for which tiles are to be returned
      * @param zoomLevel {number} - The zoom level for which the tiles are requested
      * @param cacheOnly {boolean} - Indicates whether only cached tiles are to be considered
      * @param prioCenter {H.math.Point} - The priority center as an offset in screen pixel relative to the center
      * @returns {H.map.layer.ITileLayer.Response} - a response object containing the total number of tiles requested and the tile objects that could be immediately returned
      */
    def requestTiles(
      boundingRect: typings.heremaps.H.geo.Rect,
      zoomLevel: Double,
      cacheOnly: Boolean,
      prioCenter: Point
    ): Response
  }
  object ITileLayer {
    
    inline def apply(
      cancelTile: (Double, Double, Double) => Unit,
      requestTile: (Double, Double, Double, Boolean) => Tile | Unit,
      requestTiles: (typings.heremaps.H.geo.Rect, Double, Boolean, Point) => Response
    ): ITileLayer = {
      val __obj = js.Dynamic.literal(cancelTile = js.Any.fromFunction3(cancelTile), requestTile = js.Any.fromFunction4(requestTile), requestTiles = js.Any.fromFunction4(requestTiles))
      __obj.asInstanceOf[ITileLayer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITileLayer] (val x: Self) extends AnyVal {
      
      inline def setCancelTile(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "cancelTile", js.Any.fromFunction3(value))
      
      inline def setRequestTile(value: (Double, Double, Double, Boolean) => Tile | Unit): Self = StObject.set(x, "requestTile", js.Any.fromFunction4(value))
      
      inline def setRequestTiles(value: (typings.heremaps.H.geo.Rect, Double, Boolean, Point) => Response): Self = StObject.set(x, "requestTiles", js.Any.fromFunction4(value))
    }
    
    /**
      * Options which are used to initialize a TileLayer object.
      * @property projection {H.geo.IProjection=} - an optional projection to be used for this layer, default is H.geo.mercator
      * @property opacity {number=} - tile layer opacity, default is 1
      */
    trait Options extends StObject {
      
      var opacity: js.UndefOr[Double] = js.undefined
      
      var projection: js.UndefOr[IProjection] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
        
        inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
        
        inline def setProjection(value: IProjection): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
        
        inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      }
    }
    
    /**
      * A response object for a tile request. Contains total number of elements requested and an array of currently available Tiles
      * @property total {number} - the total number of requested tiles
      * @property tiles {Array<H.map.provider.Tile>} - the tiles which this provider can currently return synchronously
      */
    trait Response extends StObject {
      
      var tiles: js.Array[Tile]
      
      var total: Double
    }
    object Response {
      
      inline def apply(tiles: js.Array[Tile], total: Double): Response = {
        val __obj = js.Dynamic.literal(tiles = tiles.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
        __obj.asInstanceOf[Response]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
        
        inline def setTiles(value: js.Array[Tile]): Self = StObject.set(x, "tiles", value.asInstanceOf[js.Any])
        
        inline def setTilesVarargs(value: Tile*): Self = StObject.set(x, "tiles", js.Array(value*))
        
        inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /**
    * The Layer class represents an object that is evaluated by the renderer in the order in which it is added to the layers collection. It provides the basic infrastructure for dispatching
    * update events to the renderer in case new data is available.
    */
  @js.native
  trait Layer
    extends StObject
       with EventTarget {
    
    def addOnDisposeCallback(callback: js.Function0[Unit], opt_scope: js.Object): Unit = js.native
    
    /**
      * This method returns the copyright of the current data provider.
      * @param bounds {H.geo.Rect} - the bounding area for which to retrieve the copyright information
      * @param level {number} - the zoom level for which to retrieve the copyright information
      * @returns {Array<H.map.ICopyright>} - a list of copyright information objects for the provided area and zoom level
      */
    def getCopyrights(bounds: typings.heremaps.H.geo.Rect, level: Double): js.Array[ICopyright] = js.native
    
    /**
      * This method checks if a zoom level can be served by this layer.
      * @param zoomLevel {number} - the zoom level to check
      * @returns {boolean} - true if this layer can provide data for the zoom level, otherwise false
      */
    def isValid(zoomLevel: Double): Boolean = js.native
    
    /**
      * This method sets the maximum zoom level for which this layer will provide tiles.
      * @param max {number} - The new maximum zoom level of this layer
      * @returns {H.map.layer.Layer} - Returns this instance of the layer
      */
    def setMax(max: Double): Layer = js.native
    
    /**
      * This method sets the minimum zoom level for which this layer will provide tiles.
      * @param min {number} - The new minimum zoom level of this layer
      * @returns {H.map.layer.Layer} - Returns this instance of the layer
      */
    def setMin(min: Double): Layer = js.native
  }
  object Layer {
    
    /**
      * Options which can be used when creating new layer object.
      * @property min {number=} - The minimum zoom level for which the layer can provide data, default is 0
      * @property max {number=} - The maximum zoom level for which the layer can provide data, default is 22
      * @property dark {boolean=} - Indicates whether the content of this layer is mainly dark, default is false See also H.Map.Options#autoColor
      * @property projection {H.geo.IProjection=} - The projection to be used for this layer, default is H.geo.mercator
      * @property minWorldSize {number=} - The minimal world size at zoom level 0, default is 256
      */
    trait Options extends StObject {
      
      var dark: js.UndefOr[Boolean] = js.undefined
      
      var max: js.UndefOr[Double] = js.undefined
      
      var min: js.UndefOr[Double] = js.undefined
      
      var minWorldSize: js.UndefOr[Double] = js.undefined
      
      var projection: js.UndefOr[IProjection] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        inline def setDark(value: Boolean): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
        
        inline def setDarkUndefined: Self = StObject.set(x, "dark", js.undefined)
        
        inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
        
        inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
        
        inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
        
        inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
        
        inline def setMinWorldSize(value: Double): Self = StObject.set(x, "minWorldSize", value.asInstanceOf[js.Any])
        
        inline def setMinWorldSizeUndefined: Self = StObject.set(x, "minWorldSize", js.undefined)
        
        inline def setProjection(value: IProjection): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
        
        inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      }
    }
  }
  
  /**
    * ObjectTileLayer represents map objects which are requested on a tile basis
    */
  @js.native
  trait MarkerTileLayer
    extends StObject
       with BaseTileLayer
       with IMarkerLayer
  
  /**
    * This class represents a layer which renders map objects. Spatial objects like polygons and polylines a rendered to tiles before being passed to the enigne. Point objects like markers
    * are provided as objects given an rectangular area.
    */
  @js.native
  trait ObjectLayer
    extends StObject
       with Layer
       with ITileLayer {
    
    /**
      * This method returns current ObjectLayer's data provider
      * @returns {H.map.provider.ObjectProvider}
      */
    def getProvider(): ObjectProvider = js.native
    
    /**
      * This method requests dom marker objects for provided bounding rectangle.
      * @param boundingRect {H.geo.Rect} - the bounding rectangle for which marker are to be returned
      * @param zoomLevel {number} - The zoom level for which the objects are requested
      * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
      * @param prioCenter {H.math.Point} - The priority center as an offset in screen pixel relative to the center
      * @returns {(H.map.layer.IMarkerLayer.Response | H.map.layer.IMarkerLayer.TiledResponse)} - a response object containing the number of markers and the markers themselves
      */
    def requestDomMarkers(
      boundingRect: typings.heremaps.H.geo.Rect,
      zoomLevel: Double,
      cacheOnly: Boolean,
      prioCenter: Point
    ): typings.heremaps.H.map.layer.IMarkerLayer.Response | TiledResponse = js.native
    
    /**
      * This method requests marker objects for provided bounding rectangle.
      * @param boundingRect {H.geo.Rect} - the bounding rectangle for which marker are to be returned
      * @param zoomLevel {number} - The zoom level for which the objects are requested
      * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
      * @param prioCenter {H.math.Point} - The priority center as an offset in screen pixel relative to the center
      * @returns {(H.map.layer.IMarkerLayer.Response | H.map.layer.IMarkerLayer.TiledResponse)} - a response object containing the number of markers and the markers themselves
      */
    def requestMarkers(
      boundingRect: typings.heremaps.H.geo.Rect,
      zoomLevel: Double,
      cacheOnly: Boolean,
      prioCenter: Point
    ): typings.heremaps.H.map.layer.IMarkerLayer.Response | TiledResponse = js.native
    
    /**
      * To request overlay objects for the passsed bounding rectangle. It returns all overlay objects which are contained within this bounding rectangle.
      * @param bounds {H.geo.Rect} - The bounding rectangle for which overlays are to be returned
      * @param zoomLevel {number} - The zoom level for which the objects are requested
      * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
      * @param prioCenter {H.math.Point} - The priority center as an offset in screen pixel relative to the center
      * @returns {H.map.layer.ObjectLayer.OverlaysResponse}
      */
    def requestOverlays(bounds: typings.heremaps.H.geo.Rect, zoomLevel: Double, cacheOnly: Boolean, prioCenter: Point): OverlaysResponse = js.native
  }
  object ObjectLayer {
    
    /**
      * Configuration object which can be use to initialize the ObjectLayer.
      * @property tileSize {number=} - the size of the tiles rendered by this layer for polylines and polygons (must be power of 2, default is 256)
      * @property tileCacheSize {number=} - the number of fully rendered spatial tiles that are cached for immediate reuse, default is 32
      * @property dataCacheSize {number=} - the number of tiles to cache which have render data only, default is 512
      * @property pixelRatio {number=} - The pixelRatio to use for over-sampling in cases of high-resolution displays
      */
    trait Options extends StObject {
      
      var dataCacheSize: js.UndefOr[Double] = js.undefined
      
      var pixelRatio: js.UndefOr[Double] = js.undefined
      
      var tileCacheSize: js.UndefOr[Double] = js.undefined
      
      var tileSize: js.UndefOr[Double] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        inline def setDataCacheSize(value: Double): Self = StObject.set(x, "dataCacheSize", value.asInstanceOf[js.Any])
        
        inline def setDataCacheSizeUndefined: Self = StObject.set(x, "dataCacheSize", js.undefined)
        
        inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
        
        inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
        
        inline def setTileCacheSize(value: Double): Self = StObject.set(x, "tileCacheSize", value.asInstanceOf[js.Any])
        
        inline def setTileCacheSizeUndefined: Self = StObject.set(x, "tileCacheSize", js.undefined)
        
        inline def setTileSize(value: Double): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
        
        inline def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
      }
    }
    
    /**
      * A response object returned by the H.map.layer.ObjectLayer#requestOverlays function.
      * @property total {number} - The total number of overlays within the requested bounds, inclusive overlays which are not ready loaded yet
      * @property overlays {Array<H.map.Overlay>} - A list all overlays which are ready to render
      */
    trait OverlaysResponse extends StObject {
      
      var overlays: js.Array[Overlay]
      
      var total: Double
    }
    object OverlaysResponse {
      
      inline def apply(overlays: js.Array[Overlay], total: Double): OverlaysResponse = {
        val __obj = js.Dynamic.literal(overlays = overlays.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
        __obj.asInstanceOf[OverlaysResponse]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: OverlaysResponse] (val x: Self) extends AnyVal {
        
        inline def setOverlays(value: js.Array[Overlay]): Self = StObject.set(x, "overlays", value.asInstanceOf[js.Any])
        
        inline def setOverlaysVarargs(value: Overlay*): Self = StObject.set(x, "overlays", js.Array(value*))
        
        inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /**
    * Tile Layer, represents data shown on map on a tile basis. Can be used to show map tile images or other type of data which is partitioned into tiles.
    * @event update {H.util.Event}
    */
  @js.native
  trait TileLayer
    extends StObject
       with BaseTileLayer
       with ITileLayer {
    
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
    
    var update: Event = js.native
  }
}
