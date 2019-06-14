package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KmlLayerStatus extends js.Object

@JSGlobal("google.maps.KmlLayerStatus")
@js.native
object KmlLayerStatus extends js.Object {
  @js.native
  sealed trait DOCUMENT_NOT_FOUND
    extends googlemapsLib.googleNs.mapsNs.KmlLayerStatus
  
  @js.native
  sealed trait DOCUMENT_TOO_LARGE
    extends googlemapsLib.googleNs.mapsNs.KmlLayerStatus
  
  @js.native
  sealed trait FETCH_ERROR
    extends googlemapsLib.googleNs.mapsNs.KmlLayerStatus
  
  @js.native
  sealed trait INVALID_DOCUMENT
    extends googlemapsLib.googleNs.mapsNs.KmlLayerStatus
  
  @js.native
  sealed trait INVALID_REQUEST
    extends googlemapsLib.googleNs.mapsNs.KmlLayerStatus
  
  @js.native
  sealed trait LIMITS_EXCEEDED
    extends googlemapsLib.googleNs.mapsNs.KmlLayerStatus
  
  @js.native
  sealed trait OK
    extends googlemapsLib.googleNs.mapsNs.KmlLayerStatus
  
  @js.native
  sealed trait TIMED_OUT
    extends googlemapsLib.googleNs.mapsNs.KmlLayerStatus
  
  @js.native
  sealed trait UNKNOWN
    extends googlemapsLib.googleNs.mapsNs.KmlLayerStatus
  
  /* 0 */ val DOCUMENT_NOT_FOUND: DOCUMENT_NOT_FOUND with scala.Double = js.native
  /* 1 */ val DOCUMENT_TOO_LARGE: DOCUMENT_TOO_LARGE with scala.Double = js.native
  /* 2 */ val FETCH_ERROR: FETCH_ERROR with scala.Double = js.native
  /* 3 */ val INVALID_DOCUMENT: INVALID_DOCUMENT with scala.Double = js.native
  /* 4 */ val INVALID_REQUEST: INVALID_REQUEST with scala.Double = js.native
  /* 5 */ val LIMITS_EXCEEDED: LIMITS_EXCEEDED with scala.Double = js.native
  /* 6 */ val OK: OK with scala.Double = js.native
  /* 7 */ val TIMED_OUT: TIMED_OUT with scala.Double = js.native
  /* 8 */ val UNKNOWN: UNKNOWN with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[googlemapsLib.googleNs.mapsNs.KmlLayerStatus with scala.Double] = js.native
}

