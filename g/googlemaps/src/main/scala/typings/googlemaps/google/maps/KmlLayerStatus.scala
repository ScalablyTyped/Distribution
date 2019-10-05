package typings.googlemaps.google.maps

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
  
  /* 0 */ val DOCUMENT_NOT_FOUND: typings.googlemaps.google.maps.KmlLayerStatus.DOCUMENT_NOT_FOUND with Double = js.native
  /* 1 */ val DOCUMENT_TOO_LARGE: typings.googlemaps.google.maps.KmlLayerStatus.DOCUMENT_TOO_LARGE with Double = js.native
  /* 2 */ val FETCH_ERROR: typings.googlemaps.google.maps.KmlLayerStatus.FETCH_ERROR with Double = js.native
  /* 3 */ val INVALID_DOCUMENT: typings.googlemaps.google.maps.KmlLayerStatus.INVALID_DOCUMENT with Double = js.native
  /* 4 */ val INVALID_REQUEST: typings.googlemaps.google.maps.KmlLayerStatus.INVALID_REQUEST with Double = js.native
  /* 5 */ val LIMITS_EXCEEDED: typings.googlemaps.google.maps.KmlLayerStatus.LIMITS_EXCEEDED with Double = js.native
  /* 6 */ val OK: typings.googlemaps.google.maps.KmlLayerStatus.OK with Double = js.native
  /* 7 */ val TIMED_OUT: typings.googlemaps.google.maps.KmlLayerStatus.TIMED_OUT with Double = js.native
  /* 8 */ val UNKNOWN: typings.googlemaps.google.maps.KmlLayerStatus.UNKNOWN with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KmlLayerStatus with Double] = js.native
}

