package typings
package googlemapsLib.googleNs.mapsNs.placesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PlacesServiceStatus extends js.Object

@JSGlobal("google.maps.places.PlacesServiceStatus")
@js.native
object PlacesServiceStatus extends js.Object {
  @js.native
  sealed trait ERROR
    extends googlemapsLib.googleNs.mapsNs.placesNs.PlacesServiceStatus
  
  @js.native
  sealed trait INVALID_REQUEST
    extends googlemapsLib.googleNs.mapsNs.placesNs.PlacesServiceStatus
  
  @js.native
  sealed trait NOT_FOUND
    extends googlemapsLib.googleNs.mapsNs.placesNs.PlacesServiceStatus
  
  @js.native
  sealed trait OK
    extends googlemapsLib.googleNs.mapsNs.placesNs.PlacesServiceStatus
  
  @js.native
  sealed trait OVER_QUERY_LIMIT
    extends googlemapsLib.googleNs.mapsNs.placesNs.PlacesServiceStatus
  
  @js.native
  sealed trait REQUEST_DENIED
    extends googlemapsLib.googleNs.mapsNs.placesNs.PlacesServiceStatus
  
  @js.native
  sealed trait UNKNOWN_ERROR
    extends googlemapsLib.googleNs.mapsNs.placesNs.PlacesServiceStatus
  
  @js.native
  sealed trait ZERO_RESULTS
    extends googlemapsLib.googleNs.mapsNs.placesNs.PlacesServiceStatus
  
  /* 0 */ val ERROR: ERROR with scala.Double = js.native
  /* 1 */ val INVALID_REQUEST: INVALID_REQUEST with scala.Double = js.native
  /* 4 */ val NOT_FOUND: NOT_FOUND with scala.Double = js.native
  /* 2 */ val OK: OK with scala.Double = js.native
  /* 3 */ val OVER_QUERY_LIMIT: OVER_QUERY_LIMIT with scala.Double = js.native
  /* 5 */ val REQUEST_DENIED: REQUEST_DENIED with scala.Double = js.native
  /* 6 */ val UNKNOWN_ERROR: UNKNOWN_ERROR with scala.Double = js.native
  /* 7 */ val ZERO_RESULTS: ZERO_RESULTS with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[googlemapsLib.googleNs.mapsNs.placesNs.PlacesServiceStatus with scala.Double] = js.native
}

