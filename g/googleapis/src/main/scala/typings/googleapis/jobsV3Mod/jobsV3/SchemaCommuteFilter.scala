package typings.googleapis.jobsV3Mod.jobsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCommuteFilter extends StObject {
  
  /**
    * Optional. If true, jobs without "precise" addresses (street level addresses or GPS coordinates) might also be returned. For city and coarser level addresses, text matching is used. If this field is set to false or is not specified, only jobs that include precise addresses are returned by Commute Search. Note: If `allow_imprecise_addresses` is set to true, Commute Search is not able to calculate accurate commute times to jobs with city level and coarser address information. Jobs with imprecise addresses will return a `travel_duration` time of 0 regardless of distance from the job seeker.
    */
  var allowImpreciseAddresses: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. The method of transportation for which to calculate the commute time.
    */
  var commuteMethod: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The departure time used to calculate traffic impact, represented as google.type.TimeOfDay in local time zone. Currently traffic model is restricted to hour level resolution.
    */
  var departureTime: js.UndefOr[SchemaTimeOfDay] = js.undefined
  
  /**
    * Optional. Specifies the traffic density to use when calculating commute time.
    */
  var roadTraffic: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The latitude and longitude of the location from which to calculate the commute time.
    */
  var startCoordinates: js.UndefOr[SchemaLatLng] = js.undefined
  
  /**
    * Required. The maximum travel time in seconds. The maximum allowed value is `3600s` (one hour). Format is `123s`.
    */
  var travelDuration: js.UndefOr[String | Null] = js.undefined
}
object SchemaCommuteFilter {
  
  inline def apply(): SchemaCommuteFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommuteFilter]
  }
  
  extension [Self <: SchemaCommuteFilter](x: Self) {
    
    inline def setAllowImpreciseAddresses(value: Boolean): Self = StObject.set(x, "allowImpreciseAddresses", value.asInstanceOf[js.Any])
    
    inline def setAllowImpreciseAddressesNull: Self = StObject.set(x, "allowImpreciseAddresses", null)
    
    inline def setAllowImpreciseAddressesUndefined: Self = StObject.set(x, "allowImpreciseAddresses", js.undefined)
    
    inline def setCommuteMethod(value: String): Self = StObject.set(x, "commuteMethod", value.asInstanceOf[js.Any])
    
    inline def setCommuteMethodNull: Self = StObject.set(x, "commuteMethod", null)
    
    inline def setCommuteMethodUndefined: Self = StObject.set(x, "commuteMethod", js.undefined)
    
    inline def setDepartureTime(value: SchemaTimeOfDay): Self = StObject.set(x, "departureTime", value.asInstanceOf[js.Any])
    
    inline def setDepartureTimeUndefined: Self = StObject.set(x, "departureTime", js.undefined)
    
    inline def setRoadTraffic(value: String): Self = StObject.set(x, "roadTraffic", value.asInstanceOf[js.Any])
    
    inline def setRoadTrafficNull: Self = StObject.set(x, "roadTraffic", null)
    
    inline def setRoadTrafficUndefined: Self = StObject.set(x, "roadTraffic", js.undefined)
    
    inline def setStartCoordinates(value: SchemaLatLng): Self = StObject.set(x, "startCoordinates", value.asInstanceOf[js.Any])
    
    inline def setStartCoordinatesUndefined: Self = StObject.set(x, "startCoordinates", js.undefined)
    
    inline def setTravelDuration(value: String): Self = StObject.set(x, "travelDuration", value.asInstanceOf[js.Any])
    
    inline def setTravelDurationNull: Self = StObject.set(x, "travelDuration", null)
    
    inline def setTravelDurationUndefined: Self = StObject.set(x, "travelDuration", js.undefined)
  }
}
