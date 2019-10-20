package typings.googlemaps.google.maps.places

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PlacesServiceStatus extends js.Object

@JSGlobal("google.maps.places.PlacesServiceStatus")
@js.native
object PlacesServiceStatus extends js.Object {
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
  
  /* "INVALID_REQUEST" */ val INVALID_REQUEST: typings.googlemaps.google.maps.places.PlacesServiceStatus.INVALID_REQUEST with String = js.native
  /* "NOT_FOUND" */ val NOT_FOUND: typings.googlemaps.google.maps.places.PlacesServiceStatus.NOT_FOUND with String = js.native
  /* "OK" */ val OK: typings.googlemaps.google.maps.places.PlacesServiceStatus.OK with String = js.native
  /* "OVER_QUERY_LIMIT" */ val OVER_QUERY_LIMIT: typings.googlemaps.google.maps.places.PlacesServiceStatus.OVER_QUERY_LIMIT with String = js.native
  /* "REQUEST_DENIED" */ val REQUEST_DENIED: typings.googlemaps.google.maps.places.PlacesServiceStatus.REQUEST_DENIED with String = js.native
  /* "UNKNOWN_ERROR" */ val UNKNOWN_ERROR: typings.googlemaps.google.maps.places.PlacesServiceStatus.UNKNOWN_ERROR with String = js.native
  /* "ZERO_RESULTS" */ val ZERO_RESULTS: typings.googlemaps.google.maps.places.PlacesServiceStatus.ZERO_RESULTS with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PlacesServiceStatus with String] = js.native
}

