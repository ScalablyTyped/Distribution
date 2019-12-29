package typings.googlemaps.google.maps

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KmlLayerStatus extends js.Object

@JSGlobal("google.maps.KmlLayerStatus")
@js.native
object KmlLayerStatus extends js.Object {
  @js.native
  sealed trait DOCUMENT_NOT_FOUND extends KmlLayerStatus
  
  @js.native
  sealed trait DOCUMENT_TOO_LARGE extends KmlLayerStatus
  
  @js.native
  sealed trait FETCH_ERROR extends KmlLayerStatus
  
  @js.native
  sealed trait INVALID_DOCUMENT extends KmlLayerStatus
  
  @js.native
  sealed trait INVALID_REQUEST extends KmlLayerStatus
  
  @js.native
  sealed trait LIMITS_EXCEEDED extends KmlLayerStatus
  
  @js.native
  sealed trait OK extends KmlLayerStatus
  
  @js.native
  sealed trait TIMED_OUT extends KmlLayerStatus
  
  @js.native
  sealed trait UNKNOWN extends KmlLayerStatus
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[KmlLayerStatus with String] = js.native
  /* "DOCUMENT_NOT_FOUND" */ @js.native
  object DOCUMENT_NOT_FOUND extends TopLevel[DOCUMENT_NOT_FOUND with String]
  
  /* "DOCUMENT_TOO_LARGE" */ @js.native
  object DOCUMENT_TOO_LARGE extends TopLevel[DOCUMENT_TOO_LARGE with String]
  
  /* "FETCH_ERROR" */ @js.native
  object FETCH_ERROR extends TopLevel[FETCH_ERROR with String]
  
  /* "INVALID_DOCUMENT" */ @js.native
  object INVALID_DOCUMENT extends TopLevel[INVALID_DOCUMENT with String]
  
  /* "INVALID_REQUEST" */ @js.native
  object INVALID_REQUEST extends TopLevel[INVALID_REQUEST with String]
  
  /* "LIMITS_EXCEEDED" */ @js.native
  object LIMITS_EXCEEDED extends TopLevel[LIMITS_EXCEEDED with String]
  
  /* "OK" */ @js.native
  object OK extends TopLevel[OK with String]
  
  /* "TIMED_OUT" */ @js.native
  object TIMED_OUT extends TopLevel[TIMED_OUT with String]
  
  /* "UNKNOWN" */ @js.native
  object UNKNOWN extends TopLevel[UNKNOWN with String]
  
}

