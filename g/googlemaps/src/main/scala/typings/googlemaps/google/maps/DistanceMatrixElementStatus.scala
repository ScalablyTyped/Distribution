package typings.googlemaps.google.maps

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DistanceMatrixElementStatus with String] = js.native
  /* "NOT_FOUND" */ @js.native
  object NOT_FOUND extends TopLevel[NOT_FOUND with String]
  
  /* "OK" */ @js.native
  object OK extends TopLevel[OK with String]
  
  /* "ZERO_RESULTS" */ @js.native
  object ZERO_RESULTS extends TopLevel[ZERO_RESULTS with String]
  
}

