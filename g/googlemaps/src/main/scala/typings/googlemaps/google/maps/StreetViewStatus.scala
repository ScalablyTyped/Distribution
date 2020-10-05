package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StreetViewStatus extends js.Object

@JSGlobal("google.maps.StreetViewStatus")
@js.native
object StreetViewStatus extends js.Object {
  @js.native
  sealed trait OK extends StreetViewStatus
  
  @js.native
  sealed trait UNKNOWN_ERROR extends StreetViewStatus
  
  @js.native
  sealed trait ZERO_RESULTS extends StreetViewStatus
  
}

