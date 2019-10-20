package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GeocoderStatus extends js.Object

@JSGlobal("google.maps.GeocoderStatus")
@js.native
object GeocoderStatus extends js.Object {
  @js.native
  sealed trait ERROR extends GeocoderStatus
  
  @js.native
  sealed trait INVALID_REQUEST extends GeocoderStatus
  
  @js.native
  sealed trait OK extends GeocoderStatus
  
  @js.native
  sealed trait OVER_QUERY_LIMIT extends GeocoderStatus
  
  @js.native
  sealed trait REQUEST_DENIED extends GeocoderStatus
  
  @js.native
  sealed trait UNKNOWN_ERROR extends GeocoderStatus
  
  @js.native
  sealed trait ZERO_RESULTS extends GeocoderStatus
  
  /* "ERROR" */ val ERROR: typings.googlemaps.google.maps.GeocoderStatus.ERROR with String = js.native
  /* "INVALID_REQUEST" */ val INVALID_REQUEST: typings.googlemaps.google.maps.GeocoderStatus.INVALID_REQUEST with String = js.native
  /* "OK" */ val OK: typings.googlemaps.google.maps.GeocoderStatus.OK with String = js.native
  /* "OVER_QUERY_LIMIT" */ val OVER_QUERY_LIMIT: typings.googlemaps.google.maps.GeocoderStatus.OVER_QUERY_LIMIT with String = js.native
  /* "REQUEST_DENIED" */ val REQUEST_DENIED: typings.googlemaps.google.maps.GeocoderStatus.REQUEST_DENIED with String = js.native
  /* "UNKNOWN_ERROR" */ val UNKNOWN_ERROR: typings.googlemaps.google.maps.GeocoderStatus.UNKNOWN_ERROR with String = js.native
  /* "ZERO_RESULTS" */ val ZERO_RESULTS: typings.googlemaps.google.maps.GeocoderStatus.ZERO_RESULTS with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[GeocoderStatus with String] = js.native
}

