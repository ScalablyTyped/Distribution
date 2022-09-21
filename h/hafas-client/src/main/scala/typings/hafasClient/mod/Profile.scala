package typings.hafasClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A profile is a specific customisation for each endpoint.
  * It parses data from the API differently, add additional information, or enable non-default methods.
  */
trait Profile extends StObject {
  
  var endpoint: String
  
  var journeysFromTrip: js.UndefOr[Boolean] = js.undefined
  
  var journeysWalkingSpeed: js.UndefOr[Boolean] = js.undefined
  
  var lines: js.UndefOr[Boolean] = js.undefined
  
  var locale: String
  
  var products: js.Array[ProductType]
  
  var radar: js.UndefOr[Boolean] = js.undefined
  
  var reachableFrom: js.UndefOr[Boolean] = js.undefined
  
  var refreshJourney: js.UndefOr[Boolean] = js.undefined
  
  var remarks: js.UndefOr[Boolean] = js.undefined
  
  var remarksGetPolyline: js.UndefOr[Boolean] = js.undefined
  
  var timezone: String
  
  var trip: js.UndefOr[Boolean] = js.undefined
  
  var tripsByName: js.UndefOr[Boolean] = js.undefined
}
object Profile {
  
  inline def apply(endpoint: String, locale: String, products: js.Array[ProductType], timezone: String): Profile = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], products = products.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Profile]
  }
  
  extension [Self <: Profile](x: Self) {
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setJourneysFromTrip(value: Boolean): Self = StObject.set(x, "journeysFromTrip", value.asInstanceOf[js.Any])
    
    inline def setJourneysFromTripUndefined: Self = StObject.set(x, "journeysFromTrip", js.undefined)
    
    inline def setJourneysWalkingSpeed(value: Boolean): Self = StObject.set(x, "journeysWalkingSpeed", value.asInstanceOf[js.Any])
    
    inline def setJourneysWalkingSpeedUndefined: Self = StObject.set(x, "journeysWalkingSpeed", js.undefined)
    
    inline def setLines(value: Boolean): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setProducts(value: js.Array[ProductType]): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    inline def setProductsVarargs(value: ProductType*): Self = StObject.set(x, "products", js.Array(value*))
    
    inline def setRadar(value: Boolean): Self = StObject.set(x, "radar", value.asInstanceOf[js.Any])
    
    inline def setRadarUndefined: Self = StObject.set(x, "radar", js.undefined)
    
    inline def setReachableFrom(value: Boolean): Self = StObject.set(x, "reachableFrom", value.asInstanceOf[js.Any])
    
    inline def setReachableFromUndefined: Self = StObject.set(x, "reachableFrom", js.undefined)
    
    inline def setRefreshJourney(value: Boolean): Self = StObject.set(x, "refreshJourney", value.asInstanceOf[js.Any])
    
    inline def setRefreshJourneyUndefined: Self = StObject.set(x, "refreshJourney", js.undefined)
    
    inline def setRemarks(value: Boolean): Self = StObject.set(x, "remarks", value.asInstanceOf[js.Any])
    
    inline def setRemarksGetPolyline(value: Boolean): Self = StObject.set(x, "remarksGetPolyline", value.asInstanceOf[js.Any])
    
    inline def setRemarksGetPolylineUndefined: Self = StObject.set(x, "remarksGetPolyline", js.undefined)
    
    inline def setRemarksUndefined: Self = StObject.set(x, "remarks", js.undefined)
    
    inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    inline def setTrip(value: Boolean): Self = StObject.set(x, "trip", value.asInstanceOf[js.Any])
    
    inline def setTripUndefined: Self = StObject.set(x, "trip", js.undefined)
    
    inline def setTripsByName(value: Boolean): Self = StObject.set(x, "tripsByName", value.asInstanceOf[js.Any])
    
    inline def setTripsByNameUndefined: Self = StObject.set(x, "tripsByName", js.undefined)
  }
}
