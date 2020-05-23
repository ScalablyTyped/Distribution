package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ElevationStatus extends js.Object

@JSGlobal("google.maps.ElevationStatus")
@js.native
object ElevationStatus extends js.Object {
  @js.native
  sealed trait INVALID_REQUEST extends ElevationStatus
  
  @js.native
  sealed trait OK extends ElevationStatus
  
  @js.native
  sealed trait OVER_QUERY_LIMIT extends ElevationStatus
  
  @js.native
  sealed trait REQUEST_DENIED extends ElevationStatus
  
  @js.native
  sealed trait UNKNOWN_ERROR extends ElevationStatus
  
}

