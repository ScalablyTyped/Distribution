package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Animation extends js.Object

@JSGlobal("google.maps.Animation")
@js.native
object Animation extends js.Object {
  /**
    * Marker bounces until animation is stopped.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Animation.BOUNCE Maps JavaScript API}
    */
  @js.native
  sealed trait BOUNCE
    extends googlemapsLib.googleNs.mapsNs.Animation
  
  /**
    * Marker falls from the top of the map ending with a small bounce.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Animation.DROP Maps JavaScript API}
    */
  @js.native
  sealed trait DROP
    extends googlemapsLib.googleNs.mapsNs.Animation
  
  /* 1 */ val BOUNCE: BOUNCE with scala.Double = js.native
  /* 2 */ val DROP: DROP with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[googlemapsLib.googleNs.mapsNs.Animation with scala.Double] = js.native
}

