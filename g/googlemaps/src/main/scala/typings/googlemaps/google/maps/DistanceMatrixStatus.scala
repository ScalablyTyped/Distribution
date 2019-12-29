package typings.googlemaps.google.maps

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DistanceMatrixStatus with String] = js.native
  /* "INVALID_REQUEST" */ @js.native
  object INVALID_REQUEST extends TopLevel[INVALID_REQUEST with String]
  
  /* "MAX_DIMENSIONS_EXCEEDED" */ @js.native
  object MAX_DIMENSIONS_EXCEEDED extends TopLevel[MAX_DIMENSIONS_EXCEEDED with String]
  
  /* "MAX_ELEMENTS_EXCEEDED" */ @js.native
  object MAX_ELEMENTS_EXCEEDED extends TopLevel[MAX_ELEMENTS_EXCEEDED with String]
  
  /* "OK" */ @js.native
  object OK extends TopLevel[OK with String]
  
  /* "OVER_QUERY_LIMIT" */ @js.native
  object OVER_QUERY_LIMIT extends TopLevel[OVER_QUERY_LIMIT with String]
  
  /* "REQUEST_DENIED" */ @js.native
  object REQUEST_DENIED extends TopLevel[REQUEST_DENIED with String]
  
  /* "UNKNOWN_ERROR" */ @js.native
  object UNKNOWN_ERROR extends TopLevel[UNKNOWN_ERROR with String]
  
}

