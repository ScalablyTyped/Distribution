package typings.googlemaps.googleNs.mapsNs.placesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PlacesServiceStatus extends js.Object

@JSGlobal("google.maps.places.PlacesServiceStatus")
@js.native
object PlacesServiceStatus extends js.Object {
  @js.native
  sealed trait ERROR extends PlacesServiceStatus
  
  @js.native
  sealed trait INVALID_REQUEST extends PlacesServiceStatus
  
  @js.native
  sealed trait NOT_FOUND extends PlacesServiceStatus
  
  @js.native
  sealed trait OK extends PlacesServiceStatus
  
  @js.native
  sealed trait OVER_QUERY_LIMIT extends PlacesServiceStatus
  
  @js.native
  sealed trait REQUEST_DENIED extends PlacesServiceStatus
  
  @js.native
  sealed trait UNKNOWN_ERROR extends PlacesServiceStatus
  
  @js.native
  sealed trait ZERO_RESULTS extends PlacesServiceStatus
  
  /* 0 */ val ERROR: typings.googlemaps.googleNs.mapsNs.placesNs.PlacesServiceStatus.ERROR with Double = js.native
  /* 1 */ val INVALID_REQUEST: typings.googlemaps.googleNs.mapsNs.placesNs.PlacesServiceStatus.INVALID_REQUEST with Double = js.native
  /* 4 */ val NOT_FOUND: typings.googlemaps.googleNs.mapsNs.placesNs.PlacesServiceStatus.NOT_FOUND with Double = js.native
  /* 2 */ val OK: typings.googlemaps.googleNs.mapsNs.placesNs.PlacesServiceStatus.OK with Double = js.native
  /* 3 */ val OVER_QUERY_LIMIT: typings.googlemaps.googleNs.mapsNs.placesNs.PlacesServiceStatus.OVER_QUERY_LIMIT with Double = js.native
  /* 5 */ val REQUEST_DENIED: typings.googlemaps.googleNs.mapsNs.placesNs.PlacesServiceStatus.REQUEST_DENIED with Double = js.native
  /* 6 */ val UNKNOWN_ERROR: typings.googlemaps.googleNs.mapsNs.placesNs.PlacesServiceStatus.UNKNOWN_ERROR with Double = js.native
  /* 7 */ val ZERO_RESULTS: typings.googlemaps.googleNs.mapsNs.placesNs.PlacesServiceStatus.ZERO_RESULTS with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PlacesServiceStatus with Double] = js.native
}

