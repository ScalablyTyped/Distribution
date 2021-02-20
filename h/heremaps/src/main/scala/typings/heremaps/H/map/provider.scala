package typings.heremaps.H.map

import org.scalablytyped.runtime.StringDictionary
import typings.heremaps.H.map.Object.Type
import typings.heremaps.H.map.provider.Invalidations.Mark
import typings.heremaps.H.math.BitMask
import typings.heremaps.H.util.EventTarget
import typings.heremaps.H.util.ICache
import typings.heremaps.H.util.ICancelable
import typings.heremaps.H.util.Job.Priority
import typings.std.ArrayBuffer
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object provider {
  
  /**
    * This class represents invalidation states of a renderable object. A renderer can optimize its rendering strategies based on the information in this object.
    * @property MARK_INITIAL {H.map.provider.Invalidations.Mark} - This constant represents the initial invalidation mark an invalidations object has.
    */
  @js.native
  trait Invalidations extends StObject {
    
    /**
      * This method returns the current invalidation mark of this invalidations object.
      * @returns {H.map.provider.Invalidations.Mark} - the current invalidation mark
      */
    def getMark(): Mark = js.native
    
    /**
      * Checks whether an add-operation occurred after the specified since mark
      * @param since {H.map.provider.Invalidations.Mark} - The invalidation mark to check against
      * @returns {boolean}
      */
    def isAdd(since: Mark): Boolean = js.native
    
    /**
      * Checks whether any change occurred after the specified since mark
      * @param since {H.map.provider.Invalidations.Mark} - The invalidation mark to check against
      * @returns {boolean}
      */
    def isAny(since: Mark): Boolean = js.native
    
    /**
      * Checks whether a remove operation occurred after the specified since mark
      * @param since {H.map.provider.Invalidations.Mark} - The invalidation mark to check against
      * @returns {boolean}
      */
    def isRemove(since: Mark): Boolean = js.native
    
    /**
      * Checks whether a spatial change occurred after the specified since mark
      * @param since {H.map.provider.Invalidations.Mark} - The invalidation mark to check against
      * @returns {boolean}
      */
    def isSpatial(since: Mark): Boolean = js.native
    
    /**
      * Checks whether a visual change occurred after the specified since mark
      * @param since {H.map.provider.Invalidations.Mark} - The invalidation mark to check against
      * @returns {boolean}
      */
    def isVisual(since: Mark): Boolean = js.native
    
    /**
      * Checks whether a z-order change occurred after the specified since mark
      * @param since {H.map.provider.Invalidations.Mark} - The invalidation mark to check against
      * @returns {boolean}
      */
    def isZOrder(since: Mark): Boolean = js.native
    
    /**
      * To update invalidation marks accordingly to the given the invalidation types.
      * @param mark {H.map.provider.Invalidations.Mark} - The invalidation mark to set
      * @param types {H.math.BitMask} - The descrete invalidation types to update
      */
    def update(mark: Mark, types: BitMask): Unit = js.native
  }
  object Invalidations {
    
    @scala.inline
    def apply(
      getMark: () => Mark,
      isAdd: Mark => Boolean,
      isAny: Mark => Boolean,
      isRemove: Mark => Boolean,
      isSpatial: Mark => Boolean,
      isVisual: Mark => Boolean,
      isZOrder: Mark => Boolean,
      update: (Mark, BitMask) => Unit
    ): Invalidations = {
      val __obj = js.Dynamic.literal(getMark = js.Any.fromFunction0(getMark), isAdd = js.Any.fromFunction1(isAdd), isAny = js.Any.fromFunction1(isAny), isRemove = js.Any.fromFunction1(isRemove), isSpatial = js.Any.fromFunction1(isSpatial), isVisual = js.Any.fromFunction1(isVisual), isZOrder = js.Any.fromFunction1(isZOrder), update = js.Any.fromFunction2(update))
      __obj.asInstanceOf[Invalidations]
    }
    
    @js.native
    sealed trait Flag extends StObject
    /**
      * This enumeration encapsulates bit flags for different invalidations of map objects.
      */
    @JSGlobal("H.map.provider.Invalidations.Flag")
    @js.native
    object Flag extends StObject {
      
      @js.native
      sealed trait ADD extends Flag
      
      @js.native
      sealed trait NONE extends Flag
      
      @js.native
      sealed trait REMOVE extends Flag
      
      @js.native
      sealed trait SPATIAL extends Flag
      
      @js.native
      sealed trait VISUAL extends Flag
      
      @js.native
      sealed trait Z_ORDER extends Flag
    }
    
    @scala.inline
    implicit class InvalidationsMutableBuilder[Self <: Invalidations] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetMark(value: () => Mark): Self = StObject.set(x, "getMark", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsAdd(value: Mark => Boolean): Self = StObject.set(x, "isAdd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsAny(value: Mark => Boolean): Self = StObject.set(x, "isAny", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsRemove(value: Mark => Boolean): Self = StObject.set(x, "isRemove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsSpatial(value: Mark => Boolean): Self = StObject.set(x, "isSpatial", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsVisual(value: Mark => Boolean): Self = StObject.set(x, "isVisual", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsZOrder(value: Mark => Boolean): Self = StObject.set(x, "isZOrder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpdate(value: (Mark, BitMask) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
    }
    
    /**
      * The invalidation mark represents a counter which is increased whenever an invalidation takes place.
      */
    type Mark = js.Any
  }
  
  /**
    * An ImageTileProvider uses network service to provide bitmap images as tiles.
    * @property tileSize {number} - Size of a tile image supported by the provider
    */
  @js.native
  trait ImageTileProvider extends RemoteTileProvider {
    
    var tileSize: Double = js.native
  }
  object ImageTileProvider {
    
    /**
      * Options to initialize an ImageTileProvider instance
      * @property uri {string=} - The provider's unique resource identifier which must not contain an underscore "_". If omitted an auto-generated unique Session ID is used. If a cross
      * sessions consistent IDs is needed (e.g. for storing provider data) this property must be specified.
      * @property min {number=} - The minimal supported zoom level, default is 0
      * @property max {number=} - The maximal supported zoom level, default is 22
      * @property getCopyrights {(function(H.geo.Rect, number): ?Array<H.map.ICopyright>)=} - A function to replace the default implementation of H.map.provider.Provider#getCopyrights
      * @property tileSize {number=} - The size of a tile as edge length in pixels. It must be 2^n where n is in range [0 ... 30], default is 256
      * @property getURL {function(number, number, number)} - The function to create an URL for the specified tile. If it returns a falsy the tile is not requested.
      * @property crossOrigin {(string | boolean=)} - The CORS settings to use for the crossOrigin attribute for the image, if omitted or if the value evaluates to false no CORS settings
      * are used.
      */
    @js.native
    trait Options extends StObject {
      
      var crossOrigin: js.UndefOr[String | Boolean] = js.native
      
      var getCopyrights: js.UndefOr[
            js.Function2[/* rect */ typings.heremaps.H.geo.Rect, /* n */ Double, js.Array[ICopyright]]
          ] = js.native
      
      def getURL(n1: Double, n2: Double, n3: Double): String = js.native
      
      var max: js.UndefOr[Double] = js.native
      
      var min: js.UndefOr[Double] = js.native
      
      var tileSize: js.UndefOr[Double] = js.native
      
      var uri: js.UndefOr[String] = js.native
    }
    object Options {
      
      @scala.inline
      def apply(getURL: (Double, Double, Double) => String): Options = {
        val __obj = js.Dynamic.literal(getURL = js.Any.fromFunction3(getURL))
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCrossOrigin(value: String | Boolean): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
        
        @scala.inline
        def setGetCopyrights(value: (/* rect */ typings.heremaps.H.geo.Rect, /* n */ Double) => js.Array[ICopyright]): Self = StObject.set(x, "getCopyrights", js.Any.fromFunction2(value))
        
        @scala.inline
        def setGetCopyrightsUndefined: Self = StObject.set(x, "getCopyrights", js.undefined)
        
        @scala.inline
        def setGetURL(value: (Double, Double, Double) => String): Self = StObject.set(x, "getURL", js.Any.fromFunction3(value))
        
        @scala.inline
        def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
        
        @scala.inline
        def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
        
        @scala.inline
        def setTileSize(value: Double): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
        
        @scala.inline
        def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
      }
    }
  }
  
  /**
    * A MarkerTileProvider uses network service to provide markers on tile basis.
    * @property requestTile {} - Request data on a tile basis
    * @property cancelTile {} - Cancels tile from being requested using x, y, z coordinates (column, row, zoom)
    * @property cancelTileByKey {} - Cancels tile from being requested using a tile-key
    * @property uri {string} - This provider's unique resource identifier, if not provided at construction time it defaults to provider's uid
    * @property min {number} - Minimum zoom level at which provider can serve data, set at construction time
    * @property max {number} - Maximum zoom level at which provider can server data, set at construction time
    * @property uid {string} - Provider instance unique identifier, generated at construction time
    */
  @js.native
  trait MarkerTileProvider extends RemoteTileProvider {
    
    /**
      * To signal to this provider that a map object has been changed. The method marks tile, that contains that object as invalid and triggers dispatchUpdate()
      * @param marker {!H.map.AbstractMarker} - The map object to be invalidated
      * @param flags {H.math.BitMask} - The flags indicating the types of occurred changes
      */
    def invalidateObject(marker: AbstractMarker, flags: BitMask): Unit = js.native
    
    /**
      * Checks whether this provider is currently providing H.map.DomMarker map objects.
      * @returns {boolean}
      */
    def providesDomMarkers(): Boolean = js.native
  }
  object MarkerTileProvider {
    
    /**
      * Options which are used to initialize the MarkerTileProvider object.
      * @property min {number=} - The minimal supported zoom level, default is 0
      * @property max {number=} - The maximal supported zoom level, default is 22
      * @property requestData {function(number, number, number, function(Array<H.map.AbstractMarker>), Function): H.util.ICancelable} - function that fetches marker data and creates array
      * of H.map.AbstractMarker that is passed success callback, if function fails to fetch data onError callback must be called
      * @property providesDomMarkers {boolean=} - indicates if markers provided are of type H.map.DomMarker or H.map.Marker, default is H.map.Marker
      */
    @js.native
    trait Options extends StObject {
      
      var max: js.UndefOr[Double] = js.native
      
      var min: js.UndefOr[Double] = js.native
      
      var providesDomMarkers: js.UndefOr[Boolean] = js.native
      
      def requestData(
        n1: Double,
        n2: Double,
        n3: Double,
        markerCallback: js.Function1[/* markers */ js.Array[AbstractMarker], Unit],
        f: js.Function0[Unit]
      ): ICancelable = js.native
    }
    object Options {
      
      @scala.inline
      def apply(
        requestData: (Double, Double, Double, js.Function1[/* markers */ js.Array[AbstractMarker], Unit], js.Function0[Unit]) => ICancelable
      ): Options = {
        val __obj = js.Dynamic.literal(requestData = js.Any.fromFunction5(requestData))
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
        
        @scala.inline
        def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
        
        @scala.inline
        def setProvidesDomMarkers(value: Boolean): Self = StObject.set(x, "providesDomMarkers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProvidesDomMarkersUndefined: Self = StObject.set(x, "providesDomMarkers", js.undefined)
        
        @scala.inline
        def setRequestData(
          value: (Double, Double, Double, js.Function1[/* markers */ js.Array[AbstractMarker], Unit], js.Function0[Unit]) => ICancelable
        ): Self = StObject.set(x, "requestData", js.Any.fromFunction5(value))
      }
    }
  }
  
  /**
    * An abstract class to manage and provide map objects (Marker, Polyline, Polygon)
    */
  @js.native
  trait ObjectProvider extends Provider {
    
    /**
      * Returns the accumulate invalidations of this provider's objects that have occurred.
      * @param opt_type {H.map.Object.Type=} - The type of objects to consider for the invalidations. If undefined, all types are taken into account.
      * @returns {H.map.provider.Invalidations}
      */
    def getInvalidations(): Invalidations = js.native
    def getInvalidations(opt_type: Type): Invalidations = js.native
    
    /**
      * To signal to this provider that a map object has been changed. The method updates the Invalidations of this provider and the given map object and triggers dispatchUpdate()
      * @param mapObject {!H.map.Object} - The map object to be invalidated
      * @param changes {H.math.BitMask} - The flags indicating the types of occurred changes
      */
    def invalidateObject(mapObject: Object, changes: BitMask): Unit = js.native
    
    /**
      * Checks whether this provider is currently providing DomMarker map objects. A concrete implementation of ObjectProvider must override it if it currently provides Markers.
      * @returns {boolean}
      */
    def providesDomMarkers(): Boolean = js.native
    
    /**
      * Checks whether this provider is currently providing Marker map objects. A concrete implementation of ObjectProvider must override it if it currently provides Markers.
      * @returns {boolean}
      */
    def providesMarkers(): Boolean = js.native
    
    /**
      * Checks whether this provider is currently providing overlay map objects. A concrete implementation of ObjectProvider must override it if it currently provides overlays.
      * @returns {boolean}
      */
    def providesOverlays(): Boolean = js.native
    
    /**
      * Checks whether this provider is currently providing spatial map objects. A concrete implementation of ObjectProvider must override it if it currently provides Spatials.
      * @returns {boolean}
      */
    def providesSpatials(): Boolean = js.native
    
    /**
      * Returns all DomMarker map objects which intersect with the provided rectangular area.
      * @param geoRect {H.geo.Rect} - A rectangular area in geo space to intersect with
      * @param zoomLevel {number} - The zoom level for which the objects are requested
      * @param visiblesOnly {boolean} - Indicates whether only invisible objects are to be considered
      * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
      * @returns {Array<H.map.DomMarker>} - a list of intersecting objects
      */
    def requestDomMarkers(geoRect: typings.heremaps.H.geo.Rect, zoomLevel: Double, visiblesOnly: Boolean, cacheOnly: Boolean): js.Array[DomMarker] = js.native
    
    /**
      * Returns all Marker map objects which intersect with the provided rectangular area.
      * @param geoRect {H.geo.Rect} - A rectangular area in geo space to intersect with
      * @param zoomLevel {number} - The zoom level for which the objects are requested
      * @param visiblesOnly {boolean} - Indicates whether only invisible objects are to be considered
      * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
      * @returns {Array<H.map.Marker>} - a list of intersecting objects
      */
    def requestMarkers(geoRect: typings.heremaps.H.geo.Rect, zoomLevel: Double, visiblesOnly: Boolean, cacheOnly: Boolean): js.Array[Marker] = js.native
    
    /**
      * Returns all Overlay objects which intersect with the provided area.
      * @param geoRect {H.geo.Rect} - A rectangular area in geo space to intersect with
      * @param zoomLevel {number} - The zoom level for which the objects are requested
      * @param visiblesOnly {boolean} - Indicates whether only invisible objects are to be considered
      * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
      * @returns {Array<H.map.Overlay>} - a list of intersecting objects
      */
    def requestOverlays(geoRect: typings.heremaps.H.geo.Rect, zoomLevel: Double, visiblesOnly: Boolean, cacheOnly: Boolean): js.Array[Overlay] = js.native
    
    /**
      * Returns all polyline, polygon, circle and rect objects which intersect with the provided area.
      * @param geoRect {H.geo.Rect} - A rectangular area in geo space to intersect with
      * @param zoomLevel {number} - The zoom level for which the objects are requested
      * @param visiblesOnly {boolean} - Indicates whether only invisible objects are to be considered
      * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
      * @returns {Array<H.map.Spatial>} - a list of intersecting objects
      */
    def requestSpatials(geoRect: typings.heremaps.H.geo.Rect, zoomLevel: Double, visiblesOnly: Boolean, cacheOnly: Boolean): js.Array[Spatial] = js.native
    
    /**
      * Returns the spatial objects which intersect the given tile
      * @param tile {H.map.provider.SpatialTile} - The tile for which the objects are requested
      * @param visiblesOnly {boolean} - Indicates whether only invisible objects are to be considered
      * @param cacheOnly {boolean} - Indicates whether only cached objects are to be considered
      * @returns {Array<H.map.Spatial>} - a list of intersecting objects
      */
    def requestSpatialsByTile(tile: Tile, visiblesOnly: Boolean, cacheOnly: Boolean): js.Array[Spatial] = js.native
  }
  
  /**
    * A Provider defines an object which works as a database for the map. Providers can exists in different forms they can implement client side object storage or they can request data from
    * the remote service.
    * @property uri {string} - This provider's unique resource identifier, if not provided at construction time it defaults to provider's uid
    * @property min {number} - Minimum zoom level at which provider can serve data, set at construction time
    * @property max {number} - Maximum zoom level at which provider can server data, set at construction time
    * @property uid {string} - Provider instance unique identifier, generated at construction time
    */
  @js.native
  trait Provider extends EventTarget {
    
    def addOnDisposeCallback(callback: js.Function0[Unit], opt_scope: js.Object): Unit = js.native
    
    /**
      * This method returns the copyrights of the provided content for a certain geographical area at a specified zoom level.
      * @param bounds {H.geo.Rect} - The bounding area for which to retrieve the copyright information
      * @param level {number} - The zoom level for which to retrieve the copyright information
      * @returns {?Array<H.map.ICopyright>} - a list of copyright information objects for the provided area and zoom level
      */
    def getCopyrights(bounds: typings.heremaps.H.geo.Rect, level: Double): js.Array[ICopyright] = js.native
    
    var max: Double = js.native
    
    var min: Double = js.native
    
    var uid: String = js.native
    
    var uri: String = js.native
  }
  object Provider {
    
    /**
      * Options to initialize a Provider instance
      * @property uri {string=} - The provider's unique resource identifier which must not contain an underscore "_". If omitted an auto-generated unique Session ID is used. If a cross
      * sessions consistent IDs is needed (e.g. for storing provider data) this property must be specified.
      * @property min {number=} - The minimal supported zoom level, default is 0
      * @property max {number=} - The maximal supported zoom level, default is 22
      * @property getCopyrights {(function(H.geo.Rect, number): ?Array<H.map.ICopyright>)=} - A function to replace the default implementation of H.map.provider.Provider#getCopyrights
      */
    @js.native
    trait Options extends StObject {
      
      var getCopyrights: js.UndefOr[
            js.Function2[/* rect */ typings.heremaps.H.geo.Rect, /* n */ Double, js.Array[ICopyright]]
          ] = js.native
      
      var max: js.UndefOr[Double] = js.native
      
      var min: js.UndefOr[Double] = js.native
      
      var uri: js.UndefOr[String] = js.native
    }
    object Options {
      
      @scala.inline
      def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetCopyrights(value: (/* rect */ typings.heremaps.H.geo.Rect, /* n */ Double) => js.Array[ICopyright]): Self = StObject.set(x, "getCopyrights", js.Any.fromFunction2(value))
        
        @scala.inline
        def setGetCopyrightsUndefined: Self = StObject.set(x, "getCopyrights", js.undefined)
        
        @scala.inline
        def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
        
        @scala.inline
        def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
        
        @scala.inline
        def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
      }
    }
  }
  
  /**
    * RemoteTileProvider is an abstract class which should be used by classes implementing data provision on a tile basis. Every child class needs to implement 'requestInternal'
    * (to request remote tile) and 'getCache' (to provide configured cache object were tiled data is being cached)
    */
  @js.native
  trait RemoteTileProvider extends TileProvider {
    
    /**
      * This method returns cache which should be used to store tiles
      * @returns {H.util.ICache} - cache
      */
    def getCache(): ICache = js.native
    
    /**
      * This method instructs the provider to reload data from it's source.
      * @param hard {boolean} - a boolean flag indicating whether to invalidate in hard mode (true) or in soft mode (false);
      */
    def reload(hard: Boolean): Unit = js.native
    
    /**
      * This method request tile from remote service
      * @param x {number} - The row number of the tile
      * @param y {number} - The column number of the tile
      * @param z {number} - The zoom level for which the tile is requested
      * @param onResponse {function((Array<H.map.Object> | HTMLImageElement | HTMLCanvasElement | ArrayBuffer | null), *=)} - function which is called after response arrives
      * @param onError {function(string=)} - function which is called in case of communication error
      * @param opt_priority {H.net.Request.Priority=} - optional request priority level
      * @returns {H.util.ICancelable}
      */
    def requestInternal(x: Double, y: Double, z: Double): ICancelable = js.native
    def requestInternal(
      x: Double,
      y: Double,
      z: Double,
      onResponse: js.UndefOr[scala.Nothing],
      onError: js.UndefOr[scala.Nothing],
      opt_priority: Priority
    ): ICancelable = js.native
    def requestInternal(
      x: Double,
      y: Double,
      z: Double,
      onResponse: js.UndefOr[scala.Nothing],
      onError: js.Function1[/* s */ String, Unit]
    ): ICancelable = js.native
    def requestInternal(
      x: Double,
      y: Double,
      z: Double,
      onResponse: js.UndefOr[scala.Nothing],
      onError: js.Function1[/* s */ String, Unit],
      opt_priority: Priority
    ): ICancelable = js.native
    def requestInternal(
      x: Double,
      y: Double,
      z: Double,
      onResponse: js.Function2[
          /* object */ js.Array[Object] | HTMLImageElement | HTMLCanvasElement | ArrayBuffer, 
          /* response */ js.Any, 
          Unit
        ]
    ): ICancelable = js.native
    def requestInternal(
      x: Double,
      y: Double,
      z: Double,
      onResponse: js.Function2[
          /* object */ js.Array[Object] | HTMLImageElement | HTMLCanvasElement | ArrayBuffer, 
          /* response */ js.Any, 
          Unit
        ],
      onError: js.UndefOr[scala.Nothing],
      opt_priority: Priority
    ): ICancelable = js.native
    def requestInternal(
      x: Double,
      y: Double,
      z: Double,
      onResponse: js.Function2[
          /* object */ js.Array[Object] | HTMLImageElement | HTMLCanvasElement | ArrayBuffer, 
          /* response */ js.Any, 
          Unit
        ],
      onError: js.Function1[/* s */ String, Unit]
    ): ICancelable = js.native
    def requestInternal(
      x: Double,
      y: Double,
      z: Double,
      onResponse: js.Function2[
          /* object */ js.Array[Object] | HTMLImageElement | HTMLCanvasElement | ArrayBuffer, 
          /* response */ js.Any, 
          Unit
        ],
      onError: js.Function1[/* s */ String, Unit],
      opt_priority: Priority
    ): ICancelable = js.native
  }
  
  /**
    * Generic Tile object which represents a part of the world fiting into the Tile area represented by the Tiel coordinates (x - row, y - column) and the zoom level (z). Number of tiles
    * at particular zoom level (which means number of areas into world is being splitted) is defined as following: numberOfRows &#x3D; numberOfColumns &#x3D; 2^zoomlevel
    * @property key {string} - Unique tile key generated by provider
    * @property data {*} - Tile data (an image for example)
    * @property valid {boolean} - This property holds a boolean flag indicating whether this tile is still valid (true) or whether it should be re-fetched (false)
    * @property x {number} - Tile column
    * @property y {number} - Tile row
    * @property z {number} - Tile zoom level
    */
  @js.native
  trait Tile extends StObject {
    
    var data: js.Any = js.native
    
    var key: String = js.native
    
    var valid: Boolean = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
    
    var z: Double = js.native
  }
  object Tile {
    
    @scala.inline
    def apply(data: js.Any, key: String, valid: Boolean, x: Double, y: Double, z: Double): Tile = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tile]
    }
    
    @scala.inline
    implicit class TileMutableBuilder[Self <: Tile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * TileProvider is an abstract class to provide data on a tile basis
    * @property requestTile {} - Request data on a tile basis
    * @property cancelTile {} - Cancels tile from being requested using x, y, z coordinates (column, row, zoom)
    * @property cancelTileByKey {} - Cancels tile from being requested using a tile-key
    * @property uri {string} - This provider&#x27;s unique resource identifier, if not provided at construction time it defaults to provider&#x27;s uid
    * @property min {number} - Minimum zoom level at which provider can serve data, set at construction time
    * @property max {number} - Maximum zoom level at which provider can server data, set at construction time
    * @property uid {string} - Provider instance unique identifier, generated at construction time
    */
  @js.native
  trait TileProvider extends Provider {
    
    var cancelTile: js.Any = js.native
    
    var cancelTileByKey: js.Any = js.native
    
    def createTileInternal(x: Double, y: Double, z: Double, data: HTMLCanvasElement): Tile = js.native
    def createTileInternal(x: Double, y: Double, z: Double, data: HTMLCanvasElement, opt_options: StringDictionary[js.Any]): Tile = js.native
    /**
      * This method creates a tile object with given parameters
      * @param x {number} - x tile coordinate (row)
      * @param y {number} - y tile coordinate (column)
      * @param z {number} - tile coordinate (zoom)
      * @param data {(HTMLImageElement | HTMLCanvasElement)} - data for the tile
      * @param opt_options {Object<string, *>=} - free form options object. These options are meant to be used in tile specific rendering cases
      * @returns {H.map.provider.Tile}
      */
    def createTileInternal(x: Double, y: Double, z: Double, data: HTMLImageElement): Tile = js.native
    def createTileInternal(x: Double, y: Double, z: Double, data: HTMLImageElement, opt_options: StringDictionary[js.Any]): Tile = js.native
    
    /**
      * This method creates a tile key consisting of the provider&#x27;s uri, and the tile&#x27;s x, y and z coordinates, seperated by underscores e.g.: &quot;4711_7_42_23&quot;
      * @param x {number} - The x tile coordinate (row)
      * @param y {number} - The y tile coordinate (column)
      * @param z {number} - The z tile coordinate (zoom level)
      * @returns {string} - string
      */
    def getTileKey(x: Double, y: Double, z: Double): String = js.native
    
    var requestTile: js.Any = js.native
  }
  object TileProvider {
    
    /**
      * @property uri {string=} - The provider&#x27;s unique resource identifier which must not contain an underscore &quot;_&quot;. If omitted an auto-generated unique Session ID is used.
      * If a cross sessions consistent IDs is needed (e.g. for storing provider data) this property must be specified.
      * @property min {number=} - The minimal supported zoom level, default is 0
      * @property max {number=} - The maximal supported zoom level, default is 22
      * @property getCopyrights {(function(H.geo.Rect, number): Array<H.map.ICopyright>)=} - A function to replace the default implememtation of H.map.provider.Provider#getCopyrights
      * @property tileSize {number=} - The size of a tile as edge length in pixels. It must be 2^n where n is in range [0 ... 30], default is 256
      */
    @js.native
    trait Options extends StObject {
      
      var getCopyrights: js.UndefOr[
            js.Function2[/* rect */ typings.heremaps.H.geo.Rect, /* number */ Double, js.Array[ICopyright]]
          ] = js.native
      
      var max: js.UndefOr[Double] = js.native
      
      var min: js.UndefOr[Double] = js.native
      
      var tileSize: js.UndefOr[Double] = js.native
      
      var uri: js.UndefOr[String] = js.native
    }
    object Options {
      
      @scala.inline
      def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetCopyrights(value: (/* rect */ typings.heremaps.H.geo.Rect, /* number */ Double) => js.Array[ICopyright]): Self = StObject.set(x, "getCopyrights", js.Any.fromFunction2(value))
        
        @scala.inline
        def setGetCopyrightsUndefined: Self = StObject.set(x, "getCopyrights", js.undefined)
        
        @scala.inline
        def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
        
        @scala.inline
        def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
        
        @scala.inline
        def setTileSize(value: Double): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
        
        @scala.inline
        def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
      }
    }
  }
}
