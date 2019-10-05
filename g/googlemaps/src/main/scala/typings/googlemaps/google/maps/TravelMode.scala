package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  sealed trait WALKING extends TravelMode
  
  /* 0 */ val BICYCLING: typings.googlemaps.google.maps.TravelMode.BICYCLING with Double = js.native
  /* 1 */ val DRIVING: typings.googlemaps.google.maps.TravelMode.DRIVING with Double = js.native
  /* 2 */ val TRANSIT: typings.googlemaps.google.maps.TravelMode.TRANSIT with Double = js.native
  /* 3 */ val WALKING: typings.googlemaps.google.maps.TravelMode.WALKING with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TravelMode with Double] = js.native
}

