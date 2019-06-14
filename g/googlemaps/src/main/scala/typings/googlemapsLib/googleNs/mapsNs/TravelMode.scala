package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TravelMode extends js.Object

@JSGlobal("google.maps.TravelMode")
@js.native
object TravelMode extends js.Object {
  @js.native
  sealed trait BICYCLING
    extends googlemapsLib.googleNs.mapsNs.TravelMode
  
  @js.native
  sealed trait DRIVING
    extends googlemapsLib.googleNs.mapsNs.TravelMode
  
  @js.native
  sealed trait TRANSIT
    extends googlemapsLib.googleNs.mapsNs.TravelMode
  
  @js.native
  sealed trait WALKING
    extends googlemapsLib.googleNs.mapsNs.TravelMode
  
  /* 0 */ val BICYCLING: BICYCLING with scala.Double = js.native
  /* 1 */ val DRIVING: DRIVING with scala.Double = js.native
  /* 2 */ val TRANSIT: TRANSIT with scala.Double = js.native
  /* 3 */ val WALKING: WALKING with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[googlemapsLib.googleNs.mapsNs.TravelMode with scala.Double] = js.native
}

