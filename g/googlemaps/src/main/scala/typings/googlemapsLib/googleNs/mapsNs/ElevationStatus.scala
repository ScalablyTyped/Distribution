package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ElevationStatus extends js.Object

@JSGlobal("google.maps.ElevationStatus")
@js.native
object ElevationStatus extends js.Object {
  @js.native
  sealed trait INVALID_REQUEST
    extends googlemapsLib.googleNs.mapsNs.ElevationStatus
  
  @js.native
  sealed trait OK
    extends googlemapsLib.googleNs.mapsNs.ElevationStatus
  
  @js.native
  sealed trait OVER_QUERY_LIMIT
    extends googlemapsLib.googleNs.mapsNs.ElevationStatus
  
  @js.native
  sealed trait REQUEST_DENIED
    extends googlemapsLib.googleNs.mapsNs.ElevationStatus
  
  @js.native
  sealed trait UNKNOWN_ERROR
    extends googlemapsLib.googleNs.mapsNs.ElevationStatus
  
  val INVALID_REQUEST: INVALID_REQUEST with java.lang.String = js.native
  val OK: OK with java.lang.String = js.native
  val OVER_QUERY_LIMIT: OVER_QUERY_LIMIT with java.lang.String = js.native
  val REQUEST_DENIED: REQUEST_DENIED with java.lang.String = js.native
  val UNKNOWN_ERROR: UNKNOWN_ERROR with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[googlemapsLib.googleNs.mapsNs.ElevationStatus with java.lang.String] = js.native
}

