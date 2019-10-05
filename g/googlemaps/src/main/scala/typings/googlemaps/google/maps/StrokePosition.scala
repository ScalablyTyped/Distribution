package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StrokePosition extends js.Object

/**
  * The possible positions of the stroke on a polygon.
  */
@JSGlobal("google.maps.StrokePosition")
@js.native
object StrokePosition extends js.Object {
  /**
    * The stroke is centered on the polygon's path, with half the stroke inside
    * the polygon and half the stroke outside the polygon.
    */
  @js.native
  sealed trait CENTER extends StrokePosition
  
  /** The stroke lies inside the polygon. */
  @js.native
  sealed trait INSIDE extends StrokePosition
  
  /** The stroke lies outside the polygon. */
  @js.native
  sealed trait OUTSIDE extends StrokePosition
  
  /* 0 */ val CENTER: typings.googlemaps.google.maps.StrokePosition.CENTER with Double = js.native
  /* 1 */ val INSIDE: typings.googlemaps.google.maps.StrokePosition.INSIDE with Double = js.native
  /* 2 */ val OUTSIDE: typings.googlemaps.google.maps.StrokePosition.OUTSIDE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StrokePosition with Double] = js.native
}

