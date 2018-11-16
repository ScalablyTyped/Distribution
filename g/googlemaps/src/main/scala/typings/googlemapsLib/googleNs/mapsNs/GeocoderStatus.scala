package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GeocoderStatus extends js.Object

@JSGlobal("google.maps.GeocoderStatus")
@js.native
object GeocoderStatus extends js.Object {
  @js.native
  sealed trait ERROR
    extends googlemapsLib.googleNs.mapsNs.GeocoderStatus
  
  @js.native
  sealed trait INVALID_REQUEST
    extends googlemapsLib.googleNs.mapsNs.GeocoderStatus
  
  @js.native
  sealed trait OK
    extends googlemapsLib.googleNs.mapsNs.GeocoderStatus
  
  @js.native
  sealed trait OVER_QUERY_LIMIT
    extends googlemapsLib.googleNs.mapsNs.GeocoderStatus
  
  @js.native
  sealed trait REQUEST_DENIED
    extends googlemapsLib.googleNs.mapsNs.GeocoderStatus
  
  @js.native
  sealed trait UNKNOWN_ERROR
    extends googlemapsLib.googleNs.mapsNs.GeocoderStatus
  
  @js.native
  sealed trait ZERO_RESULTS
    extends googlemapsLib.googleNs.mapsNs.GeocoderStatus
  
  val ERROR: ERROR with java.lang.String = js.native
  val INVALID_REQUEST: INVALID_REQUEST with java.lang.String = js.native
  val OK: OK with java.lang.String = js.native
  val OVER_QUERY_LIMIT: OVER_QUERY_LIMIT with java.lang.String = js.native
  val REQUEST_DENIED: REQUEST_DENIED with java.lang.String = js.native
  val UNKNOWN_ERROR: UNKNOWN_ERROR with java.lang.String = js.native
  val ZERO_RESULTS: ZERO_RESULTS with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[googlemapsLib.googleNs.mapsNs.GeocoderStatus with java.lang.String] = js.native
}

