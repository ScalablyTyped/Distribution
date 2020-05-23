package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Animation extends js.Object

/**
  * Animations that can be played on a marker. Use the
  * {@link Marker#setAnimation setAnimation} method on Marker or the
  * {@link MarkerOptions#animation animation} option to play an animation.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Animation Maps JavaScript API}
  */
@JSGlobal("google.maps.Animation")
@js.native
object Animation extends js.Object {
  /**
    * Marker bounces until animation is stopped.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Animation.BOUNCE Maps JavaScript API}
    */
  @js.native
  sealed trait BOUNCE extends Animation
  
  /**
    * Marker falls from the top of the map ending with a small bounce.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Animation.DROP Maps JavaScript API}
    */
  @js.native
  sealed trait DROP extends Animation
  
}

