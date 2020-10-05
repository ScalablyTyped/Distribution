package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TravelMode extends js.Object

@JSGlobal("google.maps.TravelMode")
@js.native
object TravelMode extends js.Object {
  @js.native
  sealed trait BICYCLING extends TravelMode
  
  @js.native
  sealed trait DRIVING extends TravelMode
  
  @js.native
  sealed trait TRANSIT extends TravelMode
  
  @js.native
  sealed trait TWO_WHEELER extends TravelMode
  
  @js.native
  sealed trait WALKING extends TravelMode
  
}

