package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ControlPosition extends js.Object

/**
  * Identifiers used to specify the placement of controls on the map. Controls
  * are positioned relative to other controls in the same layout position.
  * Controls that are added first are positioned closer to the edge of the map.
  */
@JSGlobal("google.maps.ControlPosition")
@js.native
object ControlPosition extends js.Object {
  /** Elements are positioned in the center of the bottom row. */
  @js.native
  sealed trait BOTTOM_CENTER extends ControlPosition
  
  /**
    * Elements are positioned in the bottom left and flow towards the middle.
    * Elements are positioned to the right of the Google logo.
    */
  @js.native
  sealed trait BOTTOM_LEFT extends ControlPosition
  
  /**
    * Elements are positioned in the bottom right and flow towards the middle.
    * Elements are positioned to the left of the copyrights.
    */
  @js.native
  sealed trait BOTTOM_RIGHT extends ControlPosition
  
  /**
    * Elements are positioned on the left, above bottom-left elements, and flow
    * upwards.
    */
  @js.native
  sealed trait LEFT_BOTTOM extends ControlPosition
  
  /** Elements are positioned in the center of the left side. */
  @js.native
  sealed trait LEFT_CENTER extends ControlPosition
  
  /**
    * Elements are positioned on the left, below top-left elements, and flow
    * downwards.
    */
  @js.native
  sealed trait LEFT_TOP extends ControlPosition
  
  /**
    * Elements are positioned on the right, above bottom-right elements, and
    * flow upwards.
    */
  @js.native
  sealed trait RIGHT_BOTTOM extends ControlPosition
  
  /** Elements are positioned in the center of the right side. */
  @js.native
  sealed trait RIGHT_CENTER extends ControlPosition
  
  /** Elements are positioned on the right, below top-right elements, and flow downwards. */
  @js.native
  sealed trait RIGHT_TOP extends ControlPosition
  
  /** Elements are positioned in the center of the top row. */
  @js.native
  sealed trait TOP_CENTER extends ControlPosition
  
  /** Elements are positioned in the top right and flow towards the middle. */
  @js.native
  sealed trait TOP_LEFT extends ControlPosition
  
  /** Elements are positioned in the top right and flow towards the middle. */
  @js.native
  sealed trait TOP_RIGHT extends ControlPosition
  
  /* 11 */ val BOTTOM_CENTER: typings.googlemaps.google.maps.ControlPosition.BOTTOM_CENTER with Double = js.native
  /* 10 */ val BOTTOM_LEFT: typings.googlemaps.google.maps.ControlPosition.BOTTOM_LEFT with Double = js.native
  /* 12 */ val BOTTOM_RIGHT: typings.googlemaps.google.maps.ControlPosition.BOTTOM_RIGHT with Double = js.native
  /* 6 */ val LEFT_BOTTOM: typings.googlemaps.google.maps.ControlPosition.LEFT_BOTTOM with Double = js.native
  /* 4 */ val LEFT_CENTER: typings.googlemaps.google.maps.ControlPosition.LEFT_CENTER with Double = js.native
  /* 5 */ val LEFT_TOP: typings.googlemaps.google.maps.ControlPosition.LEFT_TOP with Double = js.native
  /* 9 */ val RIGHT_BOTTOM: typings.googlemaps.google.maps.ControlPosition.RIGHT_BOTTOM with Double = js.native
  /* 8 */ val RIGHT_CENTER: typings.googlemaps.google.maps.ControlPosition.RIGHT_CENTER with Double = js.native
  /* 7 */ val RIGHT_TOP: typings.googlemaps.google.maps.ControlPosition.RIGHT_TOP with Double = js.native
  /* 2 */ val TOP_CENTER: typings.googlemaps.google.maps.ControlPosition.TOP_CENTER with Double = js.native
  /* 1 */ val TOP_LEFT: typings.googlemaps.google.maps.ControlPosition.TOP_LEFT with Double = js.native
  /* 3 */ val TOP_RIGHT: typings.googlemaps.google.maps.ControlPosition.TOP_RIGHT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ControlPosition with Double] = js.native
}

