package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DistanceMatrixElementStatus extends js.Object

@JSGlobal("google.maps.DistanceMatrixElementStatus")
@js.native
object DistanceMatrixElementStatus extends js.Object {
  @js.native
  sealed trait NOT_FOUND extends DistanceMatrixElementStatus
  
  @js.native
  sealed trait OK extends DistanceMatrixElementStatus
  
  @js.native
  sealed trait ZERO_RESULTS extends DistanceMatrixElementStatus
  
  /* 0 */ val NOT_FOUND: typings.googlemaps.google.maps.DistanceMatrixElementStatus.NOT_FOUND with Double = js.native
  /* 1 */ val OK: typings.googlemaps.google.maps.DistanceMatrixElementStatus.OK with Double = js.native
  /* 2 */ val ZERO_RESULTS: typings.googlemaps.google.maps.DistanceMatrixElementStatus.ZERO_RESULTS with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DistanceMatrixElementStatus with Double] = js.native
}

