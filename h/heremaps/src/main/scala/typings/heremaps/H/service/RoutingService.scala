package typings.heremaps.H.service

import typings.heremaps.H.geo.Latitude
import typings.heremaps.H.geo.Longitude
import typings.heremaps.H.service.RoutingService.RoutingServiceResult
import typings.heremaps.anon.Duration
import typings.heremaps.anon.Id
import typings.heremaps.anon.Mode
import typings.heremaps.anon.Place
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class encapsulates the Routing REST API as a service stub. An instance of this class can be retrieved by calling the factory method on a platform instance.
  * H.service.Platform#getRoutingService.
  */
@js.native
trait RoutingService
  extends StObject
     with AbstractRestService {
  
  /**
    * This method sends a "calculateroute" request to Routing REST API and calls the onResult callback function once the service response was received - providing a
    * H.service.ServiceResult object - or the onError callback if a communication error occured.
    * @param calculateRouteParams {H.service.ServiceParameters} - the service parameters to be sent with the routing request.
    * @param onResult {function(H.service.RoutingServiceResult)} - this function will be called once the Routing REST API provides a response to the request.
    * @param onError {function(Error)} - this function will be called if a communication error occurs during the JSON-P request
    */
  def calculateRoute(
    calculateRouteParams: ServiceParameters,
    onResult: js.Function1[/* result */ RoutingServiceResult, Unit],
    onError: js.Function1[/* error */ js.Error, Unit]
  ): Unit = js.native
}
object RoutingService {
  
  /**
    * subDomain {string=} - the sub-domain of the routing service relative to the platform's base URL, default is 'route'
    * path {string=} - the path of the map tile service, default is 'routing/7.2'
    * baseUrl {H.service.Url=} - an optional base URL if it differs from the platform's default base URL
    */
  trait Options extends StObject {
    
    var baseUrl: js.UndefOr[Url] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var subDomain: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBaseUrl(value: Url): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSubDomain(value: String): Self = StObject.set(x, "subDomain", value.asInstanceOf[js.Any])
      
      inline def setSubDomainUndefined: Self = StObject.set(x, "subDomain", js.undefined)
    }
  }
  
  trait RoutingServiceCoordinates extends StObject {
    
    var lat: Latitude
    
    var lng: Longitude
  }
  object RoutingServiceCoordinates {
    
    inline def apply(lat: Latitude, lng: Longitude): RoutingServiceCoordinates = {
      val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoutingServiceCoordinates]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RoutingServiceCoordinates] (val x: Self) extends AnyVal {
      
      inline def setLat(value: Latitude): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
      
      inline def setLng(value: Longitude): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
    }
  }
  
  trait RoutingServicePlace extends StObject {
    
    var location: RoutingServiceCoordinates
    
    var originalLocation: js.UndefOr[RoutingServiceCoordinates] = js.undefined
    
    var `type`: String
  }
  object RoutingServicePlace {
    
    inline def apply(location: RoutingServiceCoordinates, `type`: String): RoutingServicePlace = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoutingServicePlace]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RoutingServicePlace] (val x: Self) extends AnyVal {
      
      inline def setLocation(value: RoutingServiceCoordinates): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setOriginalLocation(value: RoutingServiceCoordinates): Self = StObject.set(x, "originalLocation", value.asInstanceOf[js.Any])
      
      inline def setOriginalLocationUndefined: Self = StObject.set(x, "originalLocation", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait RoutingServiceResult
    extends StObject
       with ServiceResult {
    
    var routes: js.Array[Id]
  }
  object RoutingServiceResult {
    
    inline def apply(routes: js.Array[Id]): RoutingServiceResult = {
      val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoutingServiceResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RoutingServiceResult] (val x: Self) extends AnyVal {
      
      inline def setRoutes(value: js.Array[Id]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setRoutesVarargs(value: Id*): Self = StObject.set(x, "routes", js.Array(value*))
    }
  }
  
  trait RoutingServiceSection extends StObject {
    
    var arrival: Place
    
    var departure: Place
    
    var id: String
    
    var polyline: String
    
    var summary: Duration
    
    var transport: Mode
    
    var `type`: String
  }
  object RoutingServiceSection {
    
    inline def apply(
      arrival: Place,
      departure: Place,
      id: String,
      polyline: String,
      summary: Duration,
      transport: Mode,
      `type`: String
    ): RoutingServiceSection = {
      val __obj = js.Dynamic.literal(arrival = arrival.asInstanceOf[js.Any], departure = departure.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], polyline = polyline.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoutingServiceSection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RoutingServiceSection] (val x: Self) extends AnyVal {
      
      inline def setArrival(value: Place): Self = StObject.set(x, "arrival", value.asInstanceOf[js.Any])
      
      inline def setDeparture(value: Place): Self = StObject.set(x, "departure", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPolyline(value: String): Self = StObject.set(x, "polyline", value.asInstanceOf[js.Any])
      
      inline def setSummary(value: Duration): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      inline def setTransport(value: Mode): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
