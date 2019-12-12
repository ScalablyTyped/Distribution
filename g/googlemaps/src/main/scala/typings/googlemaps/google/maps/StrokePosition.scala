package typings.googlemaps.google.maps

import org.scalablytyped.runtime.TopLevel
import typings.googlemaps.google.maps.StrokePosition.CENTER
import typings.googlemaps.google.maps.StrokePosition.INSIDE
import typings.googlemaps.google.maps.StrokePosition.OUTSIDE
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StrokePosition with Double] = js.native
  /* 0 */ @js.native
  object CENTER extends TopLevel[CENTER with Double]
  
  /* 1 */ @js.native
  object INSIDE extends TopLevel[INSIDE with Double]
  
  /* 2 */ @js.native
  object OUTSIDE extends TopLevel[OUTSIDE with Double]
  
}

