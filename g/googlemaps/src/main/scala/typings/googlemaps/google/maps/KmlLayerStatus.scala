package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait KmlLayerStatus extends StObject
@JSGlobal("google.maps.KmlLayerStatus")
@js.native
object KmlLayerStatus extends StObject {
  
  @js.native
  sealed trait DOCUMENT_NOT_FOUND
    extends StObject
       with KmlLayerStatus
  
  @js.native
  sealed trait DOCUMENT_TOO_LARGE
    extends StObject
       with KmlLayerStatus
  
  @js.native
  sealed trait FETCH_ERROR
    extends StObject
       with KmlLayerStatus
  
  @js.native
  sealed trait INVALID_DOCUMENT
    extends StObject
       with KmlLayerStatus
  
  @js.native
  sealed trait INVALID_REQUEST
    extends StObject
       with KmlLayerStatus
  
  @js.native
  sealed trait LIMITS_EXCEEDED
    extends StObject
       with KmlLayerStatus
  
  @js.native
  sealed trait OK
    extends StObject
       with KmlLayerStatus
  
  @js.native
  sealed trait TIMED_OUT
    extends StObject
       with KmlLayerStatus
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with KmlLayerStatus
}
