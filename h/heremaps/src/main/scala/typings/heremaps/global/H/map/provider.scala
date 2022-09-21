package typings.heremaps.global.H.map

import typings.heremaps.H.map.provider.ImageTileProvider.Options
import typings.heremaps.H.map.provider.Invalidations.Mark
import typings.heremaps.H.math.BitMask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object provider {
  
  /**
    * An ImageTileProvider uses network service to provide bitmap images as tiles.
    * @property tileSize {number} - Size of a tile image supported by the provider
    */
  @JSGlobal("H.map.provider.ImageTileProvider")
  @js.native
  open class ImageTileProvider protected ()
    extends StObject
       with typings.heremaps.H.map.provider.ImageTileProvider {
    /**
      * Constructor
      * @param options {H.map.provider.ImageTileProvider.Options} - configuration for tile provider
      */
    def this(options: Options) = this()
  }
  
  /**
    * This class represents invalidation states of a renderable object. A renderer can optimize its rendering strategies based on the information in this object.
    * @property MARK_INITIAL {H.map.provider.Invalidations.Mark} - This constant represents the initial invalidation mark an invalidations object has.
    */
  @JSGlobal("H.map.provider.Invalidations")
  @js.native
  open class Invalidations ()
    extends StObject
       with typings.heremaps.H.map.provider.Invalidations {
    
    /**
      * This method returns the current invalidation mark of this invalidations object.
      * @returns {H.map.provider.Invalidations.Mark} - the current invalidation mark
      */
    /* CompleteClass */
    override def getMark(): Mark = js.native
    
    /**
      * Checks whether an add-operation occurred after the specified since mark
      * @param since {H.map.provider.Invalidations.Mark} - The invalidation mark to check against
      * @returns {boolean}
      */
    /* CompleteClass */
    override def isAdd(since: Mark): Boolean = js.native
    
    /**
      * Checks whether any change occurred after the specified since mark
      * @param since {H.map.provider.Invalidations.Mark} - The invalidation mark to check against
      * @returns {boolean}
      */
    /* CompleteClass */
    override def isAny(since: Mark): Boolean = js.native
    
    /**
      * Checks whether a remove operation occurred after the specified since mark
      * @param since {H.map.provider.Invalidations.Mark} - The invalidation mark to check against
      * @returns {boolean}
      */
    /* CompleteClass */
    override def isRemove(since: Mark): Boolean = js.native
    
    /**
      * Checks whether a spatial change occurred after the specified since mark
      * @param since {H.map.provider.Invalidations.Mark} - The invalidation mark to check against
      * @returns {boolean}
      */
    /* CompleteClass */
    override def isSpatial(since: Mark): Boolean = js.native
    
    /**
      * Checks whether a visual change occurred after the specified since mark
      * @param since {H.map.provider.Invalidations.Mark} - The invalidation mark to check against
      * @returns {boolean}
      */
    /* CompleteClass */
    override def isVisual(since: Mark): Boolean = js.native
    
    /**
      * Checks whether a z-order change occurred after the specified since mark
      * @param since {H.map.provider.Invalidations.Mark} - The invalidation mark to check against
      * @returns {boolean}
      */
    /* CompleteClass */
    override def isZOrder(since: Mark): Boolean = js.native
    
    /**
      * To update invalidation marks accordingly to the given the invalidation types.
      * @param mark {H.map.provider.Invalidations.Mark} - The invalidation mark to set
      * @param types {H.math.BitMask} - The descrete invalidation types to update
      */
    /* CompleteClass */
    override def update(mark: Mark, types: BitMask): Unit = js.native
  }
  object Invalidations {
    
    @JSGlobal("H.map.provider.Invalidations")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * This enumeration encapsulates bit flags for different invalidations of map objects.
      */
    @JSGlobal("H.map.provider.Invalidations.Flag")
    @js.native
    object Flag extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.heremaps.H.map.provider.Invalidations.Flag & Double] = js.native
      
      /* 3 */ val ADD: typings.heremaps.H.map.provider.Invalidations.Flag.ADD & Double = js.native
      
      /* 0 */ val NONE: typings.heremaps.H.map.provider.Invalidations.Flag.NONE & Double = js.native
      
      /* 4 */ val REMOVE: typings.heremaps.H.map.provider.Invalidations.Flag.REMOVE & Double = js.native
      
      /* 2 */ val SPATIAL: typings.heremaps.H.map.provider.Invalidations.Flag.SPATIAL & Double = js.native
      
      /* 1 */ val VISUAL: typings.heremaps.H.map.provider.Invalidations.Flag.VISUAL & Double = js.native
      
      /* 5 */ val Z_ORDER: typings.heremaps.H.map.provider.Invalidations.Flag.Z_ORDER & Double = js.native
    }
    
    /* static member */
    @JSGlobal("H.map.provider.Invalidations.MARK_INITIAL")
    @js.native
    def MARK_INITIAL: Mark = js.native
    inline def MARK_INITIAL_=(x: Mark): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MARK_INITIAL")(x.asInstanceOf[js.Any])
  }
  
  /**
    * A LocalObjectProvider acts as a database for map objects. It provides functionality to fetch visible objects for specific geographical bounding box and zoom levels.
    * All objects are organized in a hierarchical group structure.
    * An object can be added to the provider by adding it to a group within this structure.
    * The root group of the provider can be fetched via the method H.map.provider.LocalObjectProvider#getRootGroup.
    * A H.Map has its own LocalObjectProvider and offer a means to add and remove objects.
    * Only in advanced use cases, is there a need to create an additional LocalObjectProvider.
    */
  @JSGlobal("H.map.provider.LocalObjectProvider")
  @js.native
  open class LocalObjectProvider ()
    extends StObject
       with typings.heremaps.H.map.provider.LocalObjectProvider
  
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
  @JSGlobal("H.map.provider.MarkerTileProvider")
  @js.native
  open class MarkerTileProvider protected ()
    extends StObject
       with typings.heremaps.H.map.provider.MarkerTileProvider {
    /**
      * Constructor
      * @param options {H.map.provider.MarkerTileProvider.Options} - configuration for tile provider
      */
    def this(options: typings.heremaps.H.map.provider.MarkerTileProvider.Options) = this()
  }
  
  /**
    * An abstract class to manage and provide map objects (Marker, Polyline, Polygon)
    */
  @JSGlobal("H.map.provider.ObjectProvider")
  @js.native
  /**
    * Constructor
    * @param opt_options {H.map.provider.Provider.Options=}
    */
  open class ObjectProvider ()
    extends StObject
       with typings.heremaps.H.map.provider.ObjectProvider {
    def this(opt_options: typings.heremaps.H.map.provider.Provider.Options) = this()
  }
  
  /**
    * A Provider defines an object which works as a database for the map. Providers can exists in different forms they can implement client side object storage or they can request data from
    * the remote service.
    * @property uri {string} - This provider's unique resource identifier, if not provided at construction time it defaults to provider's uid
    * @property min {number} - Minimum zoom level at which provider can serve data, set at construction time
    * @property max {number} - Maximum zoom level at which provider can server data, set at construction time
    * @property uid {string} - Provider instance unique identifier, generated at construction time
    */
  @JSGlobal("H.map.provider.Provider")
  @js.native
  /**
    * Constructor
    * @param opt_options {H.map.provider.Provider.Options=}
    */
  open class Provider ()
    extends StObject
       with typings.heremaps.H.map.provider.Provider {
    def this(opt_options: typings.heremaps.H.map.provider.Provider.Options) = this()
  }
  
  /**
    * RemoteTileProvider is an abstract class which should be used by classes implementing data provision on a tile basis. Every child class needs to implement 'requestInternal'
    * (to request remote tile) and 'getCache' (to provide configured cache object were tiled data is being cached)
    */
  @JSGlobal("H.map.provider.RemoteTileProvider")
  @js.native
  open class RemoteTileProvider protected ()
    extends StObject
       with typings.heremaps.H.map.provider.RemoteTileProvider {
    /**
      * Constructor
      * @param options {H.map.provider.TileProvider.Options} - The options to instantiate this TileProvider
      */
    def this(options: typings.heremaps.H.map.provider.TileProvider.Options) = this()
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
  @JSGlobal("H.map.provider.Tile")
  @js.native
  open class Tile protected ()
    extends StObject
       with typings.heremaps.H.map.provider.Tile {
    /**
      * Constructor
      * @param x {number} - x tile coordinate (row)
      * @param y {number} - y tile coordinate (column)
      * @param z {number} - tile zoom level
      * @param data {*} - generic data object which cooresponds to the given coordinates
      */
    def this(x: Double, y: Double, z: Double) = this()
    def this(x: Double, y: Double, z: Double, data: Any) = this()
    
    /* CompleteClass */
    var data: Any = js.native
    
    /* CompleteClass */
    var key: String = js.native
    
    /* CompleteClass */
    var valid: Boolean = js.native
    
    /* CompleteClass */
    var x: Double = js.native
    
    /* CompleteClass */
    var y: Double = js.native
    
    /* CompleteClass */
    var z: Double = js.native
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
  @JSGlobal("H.map.provider.TileProvider")
  @js.native
  open class TileProvider protected ()
    extends StObject
       with typings.heremaps.H.map.provider.TileProvider {
    /**
      * Constructor
      * @param options {H.map.provider.TileProvider.Options} - The options to instantiate this TileProvider
      */
    def this(options: typings.heremaps.H.map.provider.TileProvider.Options) = this()
  }
}
