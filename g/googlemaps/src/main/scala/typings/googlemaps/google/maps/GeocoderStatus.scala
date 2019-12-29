package typings.googlemaps.google.maps

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GeocoderStatus extends js.Object

@JSGlobal("google.maps.GeocoderStatus")
@js.native
object GeocoderStatus extends js.Object {
  @js.native
  sealed trait ERROR extends GeocoderStatus
  
  @js.native
  sealed trait INVALID_REQUEST extends GeocoderStatus
  
  @js.native
  sealed trait OK extends GeocoderStatus
  
  @js.native
  sealed trait OVER_QUERY_LIMIT extends GeocoderStatus
  
  @js.native
  sealed trait REQUEST_DENIED extends GeocoderStatus
  
  @js.native
  sealed trait UNKNOWN_ERROR extends GeocoderStatus
  
  @js.native
  sealed trait ZERO_RESULTS extends GeocoderStatus
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[GeocoderStatus with String] = js.native
  /* "ERROR" */ @js.native
  object ERROR extends TopLevel[ERROR with String]
  
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
  
  /* "ZERO_RESULTS" */ @js.native
  object ZERO_RESULTS extends TopLevel[ZERO_RESULTS with String]
  
}

