package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StreetViewStatus extends StObject
@JSGlobal("google.maps.StreetViewStatus")
@js.native
object StreetViewStatus extends StObject {
  
  @js.native
  sealed trait OK
    extends StObject
       with StreetViewStatus
  
  @js.native
  sealed trait UNKNOWN_ERROR
    extends StObject
       with StreetViewStatus
  
  @js.native
  sealed trait ZERO_RESULTS
    extends StObject
       with StreetViewStatus
}
