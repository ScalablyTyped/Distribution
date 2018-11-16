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
  
  val DOCUMENT_NOT_FOUND: DOCUMENT_NOT_FOUND with java.lang.String = js.native
  val DOCUMENT_TOO_LARGE: DOCUMENT_TOO_LARGE with java.lang.String = js.native
  val FETCH_ERROR: FETCH_ERROR with java.lang.String = js.native
  val INVALID_DOCUMENT: INVALID_DOCUMENT with java.lang.String = js.native
  val INVALID_REQUEST: INVALID_REQUEST with java.lang.String = js.native
  val LIMITS_EXCEEDED: LIMITS_EXCEEDED with java.lang.String = js.native
  val OK: OK with java.lang.String = js.native
  val TIMED_OUT: TIMED_OUT with java.lang.String = js.native
  val UNKNOWN: UNKNOWN with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[googlemapsLib.googleNs.mapsNs.KmlLayerStatus with java.lang.String] = js.native
}

