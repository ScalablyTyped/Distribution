package typings.heremaps.H.service

import typings.heremaps.H.map.Group
import typings.heremaps.H.map.SpatialStyle
import typings.heremaps.H.map.layer.TileLayer
import typings.heremaps.H.map.provider.RemoteTileProvider
import typings.heremaps.H.service.venues.Service.State
import typings.heremaps.H.service.venues.TileProvider.Options
import typings.heremaps.H.util.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object venues {
  
  /**
    * This class encapsulates methods to call Venue Maps API endpoints.
    */
  @js.native
  trait Service
    extends StObject
       with EventTarget
       with IConfigurable {
    
    /**
      * This method creates a tile layer which can be added to the map in order to see the venues. It uses Interaction Tile endpoint of the Venue Maps API, more at
      * http://developer.here.com/rest-apis/documentation/venue-maps/topics/quick-start-get-interaction-tile.html.
      * @param opt_options {H.service.venues.TileProvider.Options=} - Tile provider options
      * @returns {H.map.layer.TileLayer} - the tile layer
      */
    def createTileLayer(): TileLayer = js.native
    def createTileLayer(opt_options: Options): TileLayer = js.native
    
    /**
      * This method sends a discovery request to the Venue Maps API and calls the onResult callback function once the service response was received - providing a H.service.ServiceResult
      * object, or the onError callback if a communication error occured.
      * @param serviceParams {H.service.ServiceParameters} - the service parameters to be sent with the discovery request
      * @param onResult {function(H.service.ServiceResult)} - this function will be called once the Venue Maps API provides a response to the request
      * @param onError {function(string)} - this function will be called if a communication error occurs during request and error type is passed as an argument
      */
    def discover(
      serviceParams: ServiceParameters,
      onResult: js.Function1[/* res */ ServiceResult, Unit],
      onError: js.Function1[/* s */ String, Unit]
    ): Unit = js.native
    
    /**
      * Method returns current state of the service.
      * @returns {H.service.venues.Service.State} - State of the service
      */
    def getState(): State = js.native
  }
  object Service {
    
    @js.native
    sealed trait State extends StObject
    /**
      * The state types of the H.service.venues.Service. Possible states are:
      */
    @JSGlobal("H.service.venues.Service.State")
    @js.native
    object State extends StObject {
      
      @js.native
      sealed trait ERROR
        extends StObject
           with State
      
      @js.native
      sealed trait INIT
        extends StObject
           with State
      
      @js.native
      sealed trait READY
        extends StObject
           with State
    }
    
    /**
      * @property subDomain {string=} - the sub-domain of the Venue Maps service relative to the platform's base URL, default is 'venue.maps'
      * @property path {string=} - the path to append after host name when making requests to the Venue Maps API, default is empty
      */
    trait Options extends StObject {
      
      var path: js.UndefOr[String] = js.undefined
      
      var subDomain: js.UndefOr[String] = js.undefined
    }
    object Options {
      
      @scala.inline
      def apply(): typings.heremaps.H.service.venues.Service.Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.heremaps.H.service.venues.Service.Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: typings.heremaps.H.service.venues.Service.Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        @scala.inline
        def setSubDomain(value: String): Self = StObject.set(x, "subDomain", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSubDomainUndefined: Self = StObject.set(x, "subDomain", js.undefined)
      }
    }
  }
  
  /**
    * The class represents the building in the venue hiearachy (see H.service.venues.Venue) and holds floors that belong to the building.
    */
  @js.native
  trait Building
    extends StObject
       with Group {
    
    /**
      * Method returns the floor (see H.service.venues.Floor) if one was already loaded. This method doesn't make attempt to fetch the floor data.
      * @param level {number} - floor level within minimum and maximum level boundaries for the building
      * @returns {(H.service.venues.Floor | undefined)} - The floor object or undefined if floor was not loaded
      */
    def getFloor(level: Double): Floor | Unit = js.native
    
    /**
      * Method returns the maximum floor level of this building
      * @returns {number}
      */
    def getMaxLevel(): Double = js.native
    
    /**
      * Method returns the minimum floor level of this building.
      * @returns {number}
      */
    def getMinLevel(): Double = js.native
    
    /**
      * Method returns the parent object - venue (see H.service.venues.Venue) to which the building belongs to.
      * @returns {H.service.venues.Venue}
      */
    def getVenue(): Venue = js.native
  }
  
  /**
    * The class represents the floor object in the venue hierarchy (see H.service.venues.Venue). The class holds information about floor geometry and spaces (see H.service.venues.Space)
    * that belong to this floor.
    */
  @js.native
  trait Floor
    extends StObject
       with Group {
    
    /**
      * Method returns parent object - building (see H.service.venues.Building) of the floor.
      * @returns {H.service.venues.Building}
      */
    def getBuilding(): Building = js.native
    
    /**
      * Method returns map geometry that represents floor boundaries.
      * @returns {(H.service.venues.Space | undefined)}
      */
    def getFloorSpace(): Space | Unit = js.native
    
    /**
      * Method returns the level of the floor in the building.
      * @returns {number}
      */
    def getLevel(): Double = js.native
    
    /**
      * Method returns the space object with the given ID, that belongs to the floor.
      * @param id {string} - The ID of the space.
      * @returns {(H.service.venues.Space | undefined)} - The requested space or undefined if space not found.
      */
    def getSpace(id: String): Space | Unit = js.native
    
    /**
      * Method returns the H.map.Group of all spaces that belong to the floor.
      * @returns {H.map.Group}
      */
    def getSpaces(): Group = js.native
  }
  
  /**
    * Represents a spatial object for this space. Each space object contains data associated with that space and can be retrieved by using H.service.venues.Space#getData method.
    */
  @js.native
  trait Space extends StObject {
    
    /**
      * Method returns raw data associated with the space. For more details on data format see
      * http://developer.here.com/rest-apis/documentation/venue-maps/topics/resource-type-venue-interaction-tile-space.html
      * @returns {Object} - raw space data object
      */
    def getData(): js.Object = js.native
    
    /**
      * Method returns parent object - floor (see H.service.venues.Floor) of the space.
      * @returns {H.service.venues.Floor}
      */
    def getFloor(): Floor = js.native
    
    /**
      * This method sets custom style to use for rendering the labels. Should be called before the first render of the space, otherwise has no any effect. Note that due to the design
      * consistency currently it is not allowed to change the font family and the size of the labels.
      * @param labelStyle {(H.map.SpatialStyle | H.map.SpatialStyle.Options)} - Custom label style
      */
    def initLabelStyle(labelStyle: SpatialStyle): Unit = js.native
    def initLabelStyle(labelStyle: typings.heremaps.H.map.SpatialStyle.Options): Unit = js.native
    
    /**
      * The method indicates whether the spatial object represents the whole floor space or a space within a floor boundaries, that belongs to the floor.
      * @returns {boolean} - True if this spatial object represents the floor space.
      */
    def isFloorSpace(): Boolean = js.native
  }
  
  /**
    * This class represents a Venue Maps tile provider which requests venues tiles from a platform venue tile service.
    */
  @js.native
  trait TileProvider
    extends StObject
       with RemoteTileProvider {
    
    /**
      * Method returns the floor level that provider uses for tile fetching.
      * @returns {number} - current provider's floor level
      */
    def getCurrentLevel(): Double = js.native
    
    /**
      * Method specifies which floor level of the venues must be fetched by provider. Floor level is global to all venues and defaults to 0.
      * @param level {number}
      */
    def setCurrentLevel(level: Double): Unit = js.native
  }
  object TileProvider {
    
    /**
      * Configuration object which can be used to initialize the TileProvider.
      * @property tileCacheSize {number=} - The number of fully rendered spatial tiles that are cached for immediate reuse, default is 32
      * @property pixelRatio {number=} - The pixel ratio to use for over-sampling in cases of high-resolution displays
      * @property onSpaceCreated {function(H.service.venues.Space)=} - A callback function that is called on every created space (see H.service.venues.Space) object. The function can be
      * used for space object styling.
      */
    trait Options extends StObject {
      
      var onSpaceCreated: js.UndefOr[js.Function1[/* space */ Space, Unit]] = js.undefined
      
      var pixelRatio: js.UndefOr[Double] = js.undefined
      
      var tileCacheSize: js.UndefOr[Double] = js.undefined
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
        def setOnSpaceCreated(value: /* space */ Space => Unit): Self = StObject.set(x, "onSpaceCreated", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnSpaceCreatedUndefined: Self = StObject.set(x, "onSpaceCreated", js.undefined)
        
        @scala.inline
        def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
        
        @scala.inline
        def setTileCacheSize(value: Double): Self = StObject.set(x, "tileCacheSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTileCacheSizeUndefined: Self = StObject.set(x, "tileCacheSize", js.undefined)
      }
    }
  }
  
  /**
    * The class represents the venue, it is a root for the venue object heirarchy. The venue inherits from H.map.Group and holds building objects (see H.service.venues.Building).
    * Building objects hold floor objects (see H.service.venues.Floor) and inherit from H.map.Group as well. Leaf objects are spaces (see H.service.venues.Space) that are spatial map objects
    * and reside inside floor containers.
    */
  @js.native
  trait Venue
    extends StObject
       with Group {
    
    /**
      * Method returns the building object, that belongs to the venue, with the given ID . The method doesn't attempt to fetch building data.
      * @param id {string} - the ID of the building
      * @returns {(H.service.venues.Building | undefined)} - The requested building or undefined if building wasn't loaded
      */
    def getBuilding(id: String): Building | Unit = js.native
    
    /**
      * Method returns map of all loaded buildings associated with the venue.
      * @returns {Object<*, H.service.venues.Building>}
      */
    def getBuildings(): js.Any = js.native
  }
}
