package typings.heremaps.global.H.map

import typings.heremaps.H.map.provider.ImageTileProvider.Options
import typings.heremaps.H.map.provider.Invalidations.Mark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("H.map.provider")
@js.native
object provider extends js.Object {
  
  /**
    * An ImageTileProvider uses network service to provide bitmap images as tiles.
    * @property tileSize {number} - Size of a tile image supported by the provider
    */
  @js.native
  class ImageTileProvider protected ()
    extends typings.heremaps.H.map.provider.ImageTileProvider {
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
  @js.native
  class Invalidations ()
    extends typings.heremaps.H.map.provider.Invalidations
  /* static members */
  @js.native
  object Invalidations extends js.Object {
    
    var MARK_INITIAL: Mark = js.native
    
    /**
      * This enumeration encapsulates bit flags for different invalidations of map objects.
      */
    @js.native
    object Flag extends js.Object {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.heremaps.H.map.provider.Invalidations.Flag with Double] = js.native
      
      /* 3 */ val ADD: typings.heremaps.H.map.provider.Invalidations.Flag.ADD with Double = js.native
      
      /* 0 */ val NONE: typings.heremaps.H.map.provider.Invalidations.Flag.NONE with Double = js.native
      
      /* 4 */ val REMOVE: typings.heremaps.H.map.provider.Invalidations.Flag.REMOVE with Double = js.native
      
      /* 2 */ val SPATIAL: typings.heremaps.H.map.provider.Invalidations.Flag.SPATIAL with Double = js.native
      
      /* 1 */ val VISUAL: typings.heremaps.H.map.provider.Invalidations.Flag.VISUAL with Double = js.native
      
      /* 5 */ val Z_ORDER: typings.heremaps.H.map.provider.Invalidations.Flag.Z_ORDER with Double = js.native
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
  class MarkerTileProvider protected ()
    extends typings.heremaps.H.map.provider.MarkerTileProvider {
    /**
      * Constructor
      * @param options {H.map.provider.MarkerTileProvider.Options} - configuration for tile provider
      */
    def this(options: typings.heremaps.H.map.provider.MarkerTileProvider.Options) = this()
  }
  
  /**
    * An abstract class to manage and provide map objects (Marker, Polyline, Polygon)
    */
  @js.native
  /**
    * Constructor
    * @param opt_options {H.map.provider.Provider.Options=}
    */
  class ObjectProvider ()
    extends typings.heremaps.H.map.provider.ObjectProvider {
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
  @js.native
  /**
    * Constructor
    * @param opt_options {H.map.provider.Provider.Options=}
    */
  class Provider ()
    extends typings.heremaps.H.map.provider.Provider {
    def this(opt_options: typings.heremaps.H.map.provider.Provider.Options) = this()
  }
  
  /**
    * RemoteTileProvider is an abstract class which should be used by classes implementing data provision on a tile basis. Every child class needs to implement 'requestInternal'
    * (to request remote tile) and 'getCache' (to provide configured cache object were tiled data is being cached)
    */
  @js.native
  class RemoteTileProvider protected ()
    extends typings.heremaps.H.map.provider.RemoteTileProvider {
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
  @js.native
  class Tile protected ()
    extends typings.heremaps.H.map.provider.Tile {
    /**
      * Constructor
      * @param x {number} - x tile coordinate (row)
      * @param y {number} - y tile coordinate (column)
      * @param z {number} - tile zoom level
      * @param data {*} - generic data object which cooresponds to the given coordinates
      */
    def this(x: Double, y: Double, z: Double) = this()
    def this(x: Double, y: Double, z: Double, data: js.Any) = this()
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
  class TileProvider protected ()
    extends typings.heremaps.H.map.provider.TileProvider {
    /**
      * Constructor
      * @param options {H.map.provider.TileProvider.Options} - The options to instantiate this TileProvider
      */
    def this(options: typings.heremaps.H.map.provider.TileProvider.Options) = this()
  }
}
