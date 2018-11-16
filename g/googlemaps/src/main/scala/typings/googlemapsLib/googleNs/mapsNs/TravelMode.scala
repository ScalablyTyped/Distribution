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
  
  val BICYCLING: BICYCLING with java.lang.String = js.native
  val DRIVING: DRIVING with java.lang.String = js.native
  val TRANSIT: TRANSIT with java.lang.String = js.native
  val WALKING: WALKING with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[googlemapsLib.googleNs.mapsNs.TravelMode with java.lang.String] = js.native
}

