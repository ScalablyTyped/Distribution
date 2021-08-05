package typings.heremaps.global.H

import typings.heremaps.H.map.provider.ObjectProvider
import typings.heremaps.H.map.provider.RemoteTileProvider
import typings.heremaps.H.service.AbstractRestService.Options
import typings.heremaps.H.service.ServiceParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/***** places *****/
/***** service *****/
object service {
  
  /**
    * Abstract rest service class
    */
  @JSGlobal("H.service.AbstractRestService")
  @js.native
  /**
    * Constructor
    * @param opt_options {H.service.AbstractRestService.Options=}
    */
  class AbstractRestService ()
    extends StObject
       with typings.heremaps.H.service.AbstractRestService {
    def this(opt_options: Options) = this()
  }
  
  /**
    * This class encapsulates Enterprise Routing REST API as a service stub. An instance of this class can be retrieved by calling the factory method on a platform instance.
    * H.service.Platform#getEnterpriseRoutingService.
    */
  @JSGlobal("H.service.EnterpriseRoutingService")
  @js.native
  /**
    * Constructor
    * @param opt_options {H.service.EnterpriseRoutingService.Options=}
    */
  class EnterpriseRoutingService ()
    extends StObject
       with typings.heremaps.H.service.EnterpriseRoutingService {
    def this(opt_options: typings.heremaps.H.service.EnterpriseRoutingService.Options) = this()
  }
  
  /**
    * This class encapsulates the Geocoding REST API in a service stub with calls to its various resources implemented.
    */
  @JSGlobal("H.service.GeocodingService")
  @js.native
  /**
    * Constructor
    * @param opt_options {H.service.GeocodingService.Options=}
    */
  class GeocodingService ()
    extends StObject
       with typings.heremaps.H.service.GeocodingService {
    def this(opt_options: typings.heremaps.H.service.GeocodingService.Options) = this()
  }
  
  /**
    * This class encapsulates a map tile end point of the HERE Map Tile API.
    */
  @JSGlobal("H.service.MapTileService")
  @js.native
  /**
    * Constructor
    * @param opt_options {H.service.MapTileService.Options=}
    */
  class MapTileService ()
    extends StObject
       with typings.heremaps.H.service.MapTileService {
    def this(opt_options: typings.heremaps.H.service.MapTileService.Options) = this()
  }
  
  /**
    * Places service implements a low level places RestApi access. Please refer to Restful API documentation for providing parameters and handling response objects.
    */
  @JSGlobal("H.service.PlacesService")
  @js.native
  /**
    * Constructor
    * @param opt_options {H.service.PlacesService.Options=}
    */
  class PlacesService ()
    extends StObject
       with typings.heremaps.H.service.PlacesService {
    def this(opt_options: typings.heremaps.H.service.PlacesService.Options) = this()
  }
  object PlacesService {
    
    /**
      * List of available entry points
      */
    @JSGlobal("H.service.PlacesService.EntryPoint")
    @js.native
    object EntryPoint extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.heremaps.H.service.PlacesService.EntryPoint & Double] = js.native
      
      /* 3 */ val AROUND: typings.heremaps.H.service.PlacesService.EntryPoint.AROUND & Double = js.native
      
      /* 5 */ val CATEGORIES: typings.heremaps.H.service.PlacesService.EntryPoint.CATEGORIES & Double = js.native
      
      /* 2 */ val EXPLORE: typings.heremaps.H.service.PlacesService.EntryPoint.EXPLORE & Double = js.native
      
      /* 4 */ val HERE: typings.heremaps.H.service.PlacesService.EntryPoint.HERE & Double = js.native
      
      /* 0 */ val SEARCH: typings.heremaps.H.service.PlacesService.EntryPoint.SEARCH & Double = js.native
      
      /* 1 */ val SUGGEST: typings.heremaps.H.service.PlacesService.EntryPoint.SUGGEST & Double = js.native
    }
  }
  
  /**
    * The Platform class represents central class from which all other service stubs are created. It also contains the shared settings to be passed to the individual service stubs, for example
    * the root URL of the platform, application credentials, etc.
    */
  @JSGlobal("H.service.Platform")
  @js.native
  class Platform protected ()
    extends StObject
       with typings.heremaps.H.service.Platform {
    /**
      * Constructor
      * @param options {H.service.Platform.Options}
      */
    def this(options: typings.heremaps.H.service.Platform.Options) = this()
  }
  
  /**
    * This class encapsulates the Routing REST API as a service stub. An instance of this class can be retrieved by calling the factory method on a platform instance.
    * H.service.Platform#getRoutingService.
    */
  @JSGlobal("H.service.RoutingService")
  @js.native
  /**
    * Constructor
    * @param opt_options {H.service.RoutingService.Options=}
    */
  class RoutingService ()
    extends StObject
       with typings.heremaps.H.service.RoutingService {
    def this(opt_options: typings.heremaps.H.service.RoutingService.Options) = this()
  }
  
  /**
    * This class represents a URL giving access to the individual parts that make up a URL,such as the scheme, host/domain, path, etc. Use the static parse method to populate a new URL object
    * from a URL string. Be aware that URLs with user and password like "ftp://user:password@foo.bar/" are not supported!
    */
  @JSGlobal("H.service.Url")
  @js.native
  class Url protected ()
    extends StObject
       with typings.heremaps.H.service.Url {
    /**
      * Constructor
      * @param scheme {string} - the URL scheme (e.g. "http" or "https" or "mailto")
      * @param host {string} - the host (or domain) part of the URL
      * @param opt_path {string=} - the path following the host pointing to a resource
      * @param opt_params {Object=} - the query string parameters of this URL
      * @param opt_port {number=} - The port of the host on which the host listens. If a string is passed it must be convertible to an integer.
      * @param opt_anchor {string=} - an optional anchor part of the URL (usually preceded by '#');
      */
    def this(scheme: String, host: String) = this()
    def this(scheme: String, host: String, opt_path: String) = this()
    def this(scheme: String, host: String, opt_path: String, opt_params: js.Object) = this()
    def this(scheme: String, host: String, opt_path: Unit, opt_params: js.Object) = this()
    def this(scheme: String, host: String, opt_path: String, opt_params: js.Object, opt_port: Double) = this()
    def this(scheme: String, host: String, opt_path: String, opt_params: Unit, opt_port: Double) = this()
    def this(scheme: String, host: String, opt_path: Unit, opt_params: js.Object, opt_port: Double) = this()
    def this(scheme: String, host: String, opt_path: Unit, opt_params: Unit, opt_port: Double) = this()
    def this(
      scheme: String,
      host: String,
      opt_path: String,
      opt_params: js.Object,
      opt_port: Double,
      opt_anchor: String
    ) = this()
    def this(
      scheme: String,
      host: String,
      opt_path: String,
      opt_params: js.Object,
      opt_port: Unit,
      opt_anchor: String
    ) = this()
    def this(
      scheme: String,
      host: String,
      opt_path: String,
      opt_params: Unit,
      opt_port: Double,
      opt_anchor: String
    ) = this()
    def this(
      scheme: String,
      host: String,
      opt_path: String,
      opt_params: Unit,
      opt_port: Unit,
      opt_anchor: String
    ) = this()
    def this(
      scheme: String,
      host: String,
      opt_path: Unit,
      opt_params: js.Object,
      opt_port: Double,
      opt_anchor: String
    ) = this()
    def this(
      scheme: String,
      host: String,
      opt_path: Unit,
      opt_params: js.Object,
      opt_port: Unit,
      opt_anchor: String
    ) = this()
    def this(
      scheme: String,
      host: String,
      opt_path: Unit,
      opt_params: Unit,
      opt_port: Double,
      opt_anchor: String
    ) = this()
    def this(scheme: String, host: String, opt_path: Unit, opt_params: Unit, opt_port: Unit, opt_anchor: String) = this()
  }
  object Url {
    
    @JSGlobal("H.service.Url")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * This function parses a URL string and returns a H.service.Url object. The URL string must contain at least a scheme and a host.
      * @param url {string} - The URL string to parse.
      * @param opt_baseURL {string=} - The base URL to use to resolve relative URLs. If ommited the base URL of the document which loaded the API is taken.
      * @returns {H.service.Url} - the parsed URL object
      */
    /* static member */
    inline def parse(url: String): typings.heremaps.H.service.Url = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(url.asInstanceOf[js.Any]).asInstanceOf[typings.heremaps.H.service.Url]
    inline def parse(url: String, opt_baseURL: String): typings.heremaps.H.service.Url = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(url.asInstanceOf[js.Any], opt_baseURL.asInstanceOf[js.Any])).asInstanceOf[typings.heremaps.H.service.Url]
  }
  
  object metaInfo {
    
    /**
      * This class encapsulates a Metainfo Tile end point of the HERE Map Tile API.
      */
    @JSGlobal("H.service.metaInfo.Service")
    @js.native
    /**
      * Constructor
      * @param opt_options {H.service.metaInfo.Service.Options=} - additional service parameters
      */
    class Service ()
      extends StObject
         with typings.heremaps.H.service.metaInfo.Service {
      def this(opt_options: typings.heremaps.H.service.metaInfo.Service.Options) = this()
    }
    
    /**
      * This class utilizes Metainfo Tiles functionality provided by the Map Tile API to load meta information about map objects (buildings, labels, public transport etc.).
      */
    @JSGlobal("H.service.metaInfo.TileProvider")
    @js.native
    class TileProvider protected ()
      extends StObject
         with RemoteTileProvider {
      def this(service: typings.heremaps.H.service.MapTileService) = this()
      /**
        * Constructor
        * @param service {(H.service.metaInfo.Service | H.service.MapTileService)} - the tile service which holds information from about the source of the tiles
        * @param opt_params {H.service.ServiceParameters=} - an additional set of URL parameters
        * @param opt_options {H.service.metaInfo.TileProvider.Options=} - additional parameters
        */
      def this(service: typings.heremaps.H.service.metaInfo.Service) = this()
      def this(service: typings.heremaps.H.service.MapTileService, opt_params: ServiceParameters) = this()
      def this(service: typings.heremaps.H.service.metaInfo.Service, opt_params: ServiceParameters) = this()
      def this(
        service: typings.heremaps.H.service.MapTileService,
        opt_params: Unit,
        opt_options: typings.heremaps.H.service.metaInfo.TileProvider.Options
      ) = this()
      def this(
        service: typings.heremaps.H.service.MapTileService,
        opt_params: ServiceParameters,
        opt_options: typings.heremaps.H.service.metaInfo.TileProvider.Options
      ) = this()
      def this(
        service: typings.heremaps.H.service.metaInfo.Service,
        opt_params: Unit,
        opt_options: typings.heremaps.H.service.metaInfo.TileProvider.Options
      ) = this()
      def this(
        service: typings.heremaps.H.service.metaInfo.Service,
        opt_params: ServiceParameters,
        opt_options: typings.heremaps.H.service.metaInfo.TileProvider.Options
      ) = this()
    }
  }
  
  object traffic {
    
    /**
      * TrafficIncindentsService provides functionality to the low level traffic incidents api Traffic API documentation where it is possible to retrieve traffic incident information on a
      * tile basis
      */
    @JSGlobal("H.service.traffic.Service")
    @js.native
    /**
      * Constructor
      * @param opt_options {H.service.Service.Options=}
      */
    class Service ()
      extends StObject
         with typings.heremaps.H.service.traffic.Service {
      def this(opt_options: typings.heremaps.H.service.traffic.Service.Options) = this()
    }
  }
  
  object venues {
    
    /**
      * The class represents the building in the venue hiearachy (see H.service.venues.Venue) and holds floors that belong to the building.
      */
    @JSGlobal("H.service.venues.Building")
    @js.native
    class Building protected ()
      extends StObject
         with typings.heremaps.H.service.venues.Building {
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
    @JSGlobal("H.service.venues.Floor")
    @js.native
    class Floor protected ()
      extends StObject
         with typings.heremaps.H.service.venues.Floor {
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
    @JSGlobal("H.service.venues.Service")
    @js.native
    /**
      * Constructor
      * @param opt_options {H.service.venues.Service.Options=} - additional service parameters
      */
    class Service ()
      extends StObject
         with typings.heremaps.H.service.venues.Service {
      def this(opt_options: typings.heremaps.H.service.venues.Service.Options) = this()
    }
    object Service {
      
      /**
        * The state types of the H.service.venues.Service. Possible states are:
        */
      @JSGlobal("H.service.venues.Service.State")
      @js.native
      object State extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typings.heremaps.H.service.venues.Service.State & Double] = js.native
        
        /* 0 */ val ERROR: typings.heremaps.H.service.venues.Service.State.ERROR & Double = js.native
        
        /* 1 */ val INIT: typings.heremaps.H.service.venues.Service.State.INIT & Double = js.native
        
        /* 2 */ val READY: typings.heremaps.H.service.venues.Service.State.READY & Double = js.native
      }
    }
    
    /**
      * Represents a spatial object for this space. Each space object contains data associated with that space and can be retrieved by using H.service.venues.Space#getData method.
      */
    @JSGlobal("H.service.venues.Space")
    @js.native
    class Space protected ()
      extends StObject
         with typings.heremaps.H.service.venues.Space {
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
      def this(provider: ObjectProvider, uid: String, data: Unit, opt_isFloorSpace: Boolean) = this()
    }
    
    /**
      * This class represents a Venue Maps tile provider which requests venues tiles from a platform venue tile service.
      */
    @JSGlobal("H.service.venues.TileProvider")
    @js.native
    class TileProvider protected ()
      extends StObject
         with typings.heremaps.H.service.venues.TileProvider {
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
    @JSGlobal("H.service.venues.Venue")
    @js.native
    class Venue protected ()
      extends StObject
         with typings.heremaps.H.service.venues.Venue {
      /**
        * Constructor
        * @param provider {H.map.provider.ObjectProvider} - The object provider of this venue
        * @param uid {string} - The unique identifier of this venue
        */
      def this(provider: ObjectProvider, uid: String) = this()
    }
  }
}
