package typings.googlemaps.googleNs.mapsNs

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
  
  /* 0 */ val ERROR: typings.googlemaps.googleNs.mapsNs.GeocoderStatus.ERROR with Double = js.native
  /* 1 */ val INVALID_REQUEST: typings.googlemaps.googleNs.mapsNs.GeocoderStatus.INVALID_REQUEST with Double = js.native
  /* 2 */ val OK: typings.googlemaps.googleNs.mapsNs.GeocoderStatus.OK with Double = js.native
  /* 3 */ val OVER_QUERY_LIMIT: typings.googlemaps.googleNs.mapsNs.GeocoderStatus.OVER_QUERY_LIMIT with Double = js.native
  /* 4 */ val REQUEST_DENIED: typings.googlemaps.googleNs.mapsNs.GeocoderStatus.REQUEST_DENIED with Double = js.native
  /* 5 */ val UNKNOWN_ERROR: typings.googlemaps.googleNs.mapsNs.GeocoderStatus.UNKNOWN_ERROR with Double = js.native
  /* 6 */ val ZERO_RESULTS: typings.googlemaps.googleNs.mapsNs.GeocoderStatus.ZERO_RESULTS with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GeocoderStatus with Double] = js.native
}

