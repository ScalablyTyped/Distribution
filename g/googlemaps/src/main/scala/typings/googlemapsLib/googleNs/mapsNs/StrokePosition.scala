package typings
package googlemapsLib.googleNs.mapsNs

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
  sealed trait CENTER
    extends googlemapsLib.googleNs.mapsNs.StrokePosition
  
  /** The stroke lies inside the polygon. */
  @js.native
  sealed trait INSIDE
    extends googlemapsLib.googleNs.mapsNs.StrokePosition
  
  /** The stroke lies outside the polygon. */
  @js.native
  sealed trait OUTSIDE
    extends googlemapsLib.googleNs.mapsNs.StrokePosition
  
  /* 0 */ val CENTER: CENTER with scala.Double = js.native
  /* 1 */ val INSIDE: INSIDE with scala.Double = js.native
  /* 2 */ val OUTSIDE: OUTSIDE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[googlemapsLib.googleNs.mapsNs.StrokePosition with scala.Double] = js.native
}

