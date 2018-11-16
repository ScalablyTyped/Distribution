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
  
  val NOT_FOUND: NOT_FOUND with java.lang.String = js.native
  val OK: OK with java.lang.String = js.native
  val ZERO_RESULTS: ZERO_RESULTS with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[googlemapsLib.googleNs.mapsNs.DistanceMatrixElementStatus with java.lang.String] = js.native
}

