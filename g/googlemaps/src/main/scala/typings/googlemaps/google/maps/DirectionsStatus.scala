package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DirectionsStatus extends js.Object

@JSGlobal("google.maps.DirectionsStatus")
@js.native
object DirectionsStatus extends js.Object {
  @js.native
  sealed trait INVALID_REQUEST extends DirectionsStatus
  
  @js.native
  sealed trait MAX_WAYPOINTS_EXCEEDED extends DirectionsStatus
  
  @js.native
  sealed trait NOT_FOUND extends DirectionsStatus
  
  @js.native
  sealed trait OK extends DirectionsStatus
  
  @js.native
  sealed trait OVER_QUERY_LIMIT extends DirectionsStatus
  
  @js.native
  sealed trait REQUEST_DENIED extends DirectionsStatus
  
  @js.native
  sealed trait UNKNOWN_ERROR extends DirectionsStatus
  
  @js.native
  sealed trait ZERO_RESULTS extends DirectionsStatus
  
}

