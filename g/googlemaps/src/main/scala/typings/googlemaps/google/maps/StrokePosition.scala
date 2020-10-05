package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
}

