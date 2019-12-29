package typings.googlemaps.google.maps

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ElevationStatus with String] = js.native
  /* "INVALID_REQUEST" */ @js.native
  object INVALID_REQUEST extends TopLevel[INVALID_REQUEST with String]
  
  /* "OK" */ @js.native
  object OK extends TopLevel[OK with String]
  
  /* "OVER_QUERY_LIMIT" */ @js.native
  object OVER_QUERY_LIMIT extends TopLevel[OVER_QUERY_LIMIT with String]
  
  /* "REQUEST_DENIED" */ @js.native
  object REQUEST_DENIED extends TopLevel[REQUEST_DENIED with String]
  
  /* "UNKNOWN_ERROR" */ @js.native
  object UNKNOWN_ERROR extends TopLevel[UNKNOWN_ERROR with String]
  
}

