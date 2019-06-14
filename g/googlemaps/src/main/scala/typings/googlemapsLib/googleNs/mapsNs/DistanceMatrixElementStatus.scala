package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DistanceMatrixElementStatus extends js.Object

@JSGlobal("google.maps.DistanceMatrixElementStatus")
@js.native
object DistanceMatrixElementStatus extends js.Object {
  @js.native
  sealed trait NOT_FOUND
    extends googlemapsLib.googleNs.mapsNs.DistanceMatrixElementStatus
  
  @js.native
  sealed trait OK
    extends googlemapsLib.googleNs.mapsNs.DistanceMatrixElementStatus
  
  @js.native
  sealed trait ZERO_RESULTS
    extends googlemapsLib.googleNs.mapsNs.DistanceMatrixElementStatus
  
  /* 0 */ val NOT_FOUND: NOT_FOUND with scala.Double = js.native
  /* 1 */ val OK: OK with scala.Double = js.native
  /* 2 */ val ZERO_RESULTS: ZERO_RESULTS with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[googlemapsLib.googleNs.mapsNs.DistanceMatrixElementStatus with scala.Double] = js.native
}

