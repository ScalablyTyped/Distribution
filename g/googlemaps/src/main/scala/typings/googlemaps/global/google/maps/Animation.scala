package typings.googlemaps.global.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Animations that can be played on a marker. Use the
  * {@link Marker#setAnimation setAnimation} method on Marker or the
  * {@link MarkerOptions#animation animation} option to play an animation.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Animation Maps JavaScript API}
  */
@JSGlobal("google.maps.Animation")
@js.native
object Animation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.googlemaps.google.maps.Animation & Double] = js.native
  
  /* 1 */ val BOUNCE: typings.googlemaps.google.maps.Animation.BOUNCE & Double = js.native
  
  /* 2 */ val DROP: typings.googlemaps.google.maps.Animation.DROP & Double = js.native
}
