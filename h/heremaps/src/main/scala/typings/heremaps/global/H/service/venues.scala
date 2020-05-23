package typings.heremaps.global.H.service

import typings.heremaps.H.map.provider.ObjectProvider
import typings.heremaps.H.service.venues.Service.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("H.service.venues")
@js.native
object venues extends js.Object {
  /**
    * The class represents the building in the venue hiearachy (see H.service.venues.Venue) and holds floors that belong to the building.
    */
  @js.native
  class Building protected ()
    extends typings.heremaps.H.service.venues.Building {
    /**
      * Constructor
      * @param provider {H.map.provider.ObjectProvider} - The object provider of this venue building
      * @param uid {string} - The unique identifier of this building
      * @param minLevel {number} - The minimum floor level of this building
      * @param maxLevel {number} - The maximum floor level of this building
      */
    def this(provider: ObjectProvider, uid: String, minLevel: Double, maxLevel: Double) = this()
  }
  
  /**
    * The class represents the floor object in the venue hierarchy (see H.service.venues.Venue). The class holds information about floor geometry and spaces (see H.service.venues.Space)
    * that belong to this floor.
    */
  @js.native
  class Floor protected ()
    extends typings.heremaps.H.service.venues.Floor {
    /**
      * Constructor
      * @param provider {H.map.provider.ObjectProvider} - The object provider of this venue floor
      * @param data {*} - The meta data of this floor
      * @param level {number} - The level of this floor
      */
    def this(provider: ObjectProvider, data: js.Any, level: Double) = this()
  }
  
  /**
    * This class encapsulates methods to call Venue Maps API endpoints.
    */
  @js.native
  /**
    * Constructor
    * @param opt_options {H.service.venues.Service.Options=} - additional service parameters
    */
  class Service ()
    extends typings.heremaps.H.service.venues.Service {
    def this(opt_options: Options) = this()
  }
  
  /**
    * Represents a spatial object for this space. Each space object contains data associated with that space and can be retrieved by using H.service.venues.Space#getData method.
    */
  @js.native
  class Space protected ()
    extends typings.heremaps.H.service.venues.Space {
    /**
      * Constructor
      * @param provider {H.map.provider.ObjectProvider} - The provider of this object.
      * @param uid {string} - The unique identifier of this space
      * @param data {*} - The meta data of this space
      * @param opt_isFloorSpace {boolean=} - Indicates whether this space represents a floor itself, defaults to false
      */
    def this(provider: ObjectProvider, uid: String) = this()
    def this(provider: ObjectProvider, uid: String, data: js.Any) = this()
    def this(provider: ObjectProvider, uid: String, data: js.Any, opt_isFloorSpace: Boolean) = this()
  }
  
  /**
    * This class represents a Venue Maps tile provider which requests venues tiles from a platform venue tile service.
    */
  @js.native
  class TileProvider protected ()
    extends typings.heremaps.H.service.venues.TileProvider {
    /**
      * Constructor
      * @param service {H.service.venues.Service}
      * @param opt_options {H.service.venues.TileProvider.Options=}
      */
    def this(service: typings.heremaps.H.service.venues.Service) = this()
    def this(
      service: typings.heremaps.H.service.venues.Service,
      opt_options: typings.heremaps.H.service.venues.TileProvider.Options
    ) = this()
  }
  
  /**
    * The class represents the venue, it is a root for the venue object heirarchy. The venue inherits from H.map.Group and holds building objects (see H.service.venues.Building).
    * Building objects hold floor objects (see H.service.venues.Floor) and inherit from H.map.Group as well. Leaf objects are spaces (see H.service.venues.Space) that are spatial map objects
    * and reside inside floor containers.
    */
  @js.native
  class Venue protected ()
    extends typings.heremaps.H.service.venues.Venue {
    /**
      * Constructor
      * @param provider {H.map.provider.ObjectProvider} - The object provider of this venue
      * @param uid {string} - The unique identifier of this venue
      */
    def this(provider: ObjectProvider, uid: String) = this()
  }
  
  @js.native
  object Service extends js.Object {
    /**
      * The state types of the H.service.venues.Service. Possible states are:
      */
    @js.native
    object State extends js.Object {
      /* 0 */ val ERROR: typings.heremaps.H.service.venues.Service.State.ERROR with Double = js.native
      /* 1 */ val INIT: typings.heremaps.H.service.venues.Service.State.INIT with Double = js.native
      /* 2 */ val READY: typings.heremaps.H.service.venues.Service.State.READY with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.heremaps.H.service.venues.Service.State with Double] = js.native
    }
    
  }
  
}

