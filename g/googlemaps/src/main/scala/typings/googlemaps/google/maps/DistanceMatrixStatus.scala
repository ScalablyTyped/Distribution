package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DistanceMatrixStatus extends js.Object

@JSGlobal("google.maps.DistanceMatrixStatus")
@js.native
object DistanceMatrixStatus extends js.Object {
  @js.native
  sealed trait INVALID_REQUEST extends DistanceMatrixStatus
  
  @js.native
  sealed trait MAX_DIMENSIONS_EXCEEDED extends DistanceMatrixStatus
  
  @js.native
  sealed trait MAX_ELEMENTS_EXCEEDED extends DistanceMatrixStatus
  
  @js.native
  sealed trait OK extends DistanceMatrixStatus
  
  @js.native
  sealed trait OVER_QUERY_LIMIT extends DistanceMatrixStatus
  
  @js.native
  sealed trait REQUEST_DENIED extends DistanceMatrixStatus
  
  @js.native
  sealed trait UNKNOWN_ERROR extends DistanceMatrixStatus
  
}

