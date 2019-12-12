package typings.googlemaps.google.maps

import org.scalablytyped.runtime.TopLevel
import typings.googlemaps.google.maps.DirectionsStatus.INVALID_REQUEST
import typings.googlemaps.google.maps.DirectionsStatus.MAX_WAYPOINTS_EXCEEDED
import typings.googlemaps.google.maps.DirectionsStatus.NOT_FOUND
import typings.googlemaps.google.maps.DirectionsStatus.OK
import typings.googlemaps.google.maps.DirectionsStatus.OVER_QUERY_LIMIT
import typings.googlemaps.google.maps.DirectionsStatus.REQUEST_DENIED
import typings.googlemaps.google.maps.DirectionsStatus.UNKNOWN_ERROR
import typings.googlemaps.google.maps.DirectionsStatus.ZERO_RESULTS
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DirectionsStatus with String] = js.native
  /* "INVALID_REQUEST" */ @js.native
  object INVALID_REQUEST extends TopLevel[INVALID_REQUEST with String]
  
  /* "MAX_WAYPOINTS_EXCEEDED" */ @js.native
  object MAX_WAYPOINTS_EXCEEDED extends TopLevel[MAX_WAYPOINTS_EXCEEDED with String]
  
  /* "NOT_FOUND" */ @js.native
  object NOT_FOUND extends TopLevel[NOT_FOUND with String]
  
  /* "OK" */ @js.native
  object OK extends TopLevel[OK with String]
  
  /* "OVER_QUERY_LIMIT" */ @js.native
  object OVER_QUERY_LIMIT extends TopLevel[OVER_QUERY_LIMIT with String]
  
  /* "REQUEST_DENIED" */ @js.native
  object REQUEST_DENIED extends TopLevel[REQUEST_DENIED with String]
  
  /* "UNKNOWN_ERROR" */ @js.native
  object UNKNOWN_ERROR extends TopLevel[UNKNOWN_ERROR with String]
  
  /* "ZERO_RESULTS" */ @js.native
  object ZERO_RESULTS extends TopLevel[ZERO_RESULTS with String]
  
}

