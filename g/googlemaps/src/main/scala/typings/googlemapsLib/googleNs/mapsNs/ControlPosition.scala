package typings
package googlemapsLib.googleNs.mapsNs

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
  sealed trait BOTTOM_CENTER
    extends googlemapsLib.googleNs.mapsNs.ControlPosition
  
  /**
    * Elements are positioned in the bottom left and flow towards the middle.
    * Elements are positioned to the right of the Google logo.
    */
  @js.native
  sealed trait BOTTOM_LEFT
    extends googlemapsLib.googleNs.mapsNs.ControlPosition
  
  /**
    * Elements are positioned in the bottom right and flow towards the middle.
    * Elements are positioned to the left of the copyrights.
    */
  @js.native
  sealed trait BOTTOM_RIGHT
    extends googlemapsLib.googleNs.mapsNs.ControlPosition
  
  /**
    * Elements are positioned on the left, above bottom-left elements, and flow
    * upwards.
    */
  @js.native
  sealed trait LEFT_BOTTOM
    extends googlemapsLib.googleNs.mapsNs.ControlPosition
  
  /** Elements are positioned in the center of the left side. */
  @js.native
  sealed trait LEFT_CENTER
    extends googlemapsLib.googleNs.mapsNs.ControlPosition
  
  /**
    * Elements are positioned on the left, below top-left elements, and flow
    * downwards.
    */
  @js.native
  sealed trait LEFT_TOP
    extends googlemapsLib.googleNs.mapsNs.ControlPosition
  
  /**
    * Elements are positioned on the right, above bottom-right elements, and
    * flow upwards.
    */
  @js.native
  sealed trait RIGHT_BOTTOM
    extends googlemapsLib.googleNs.mapsNs.ControlPosition
  
  /** Elements are positioned in the center of the right side. */
  @js.native
  sealed trait RIGHT_CENTER
    extends googlemapsLib.googleNs.mapsNs.ControlPosition
  
  /**
    Elements are positioned on the right, below top-right elements, and flow
    downwards.
    */
  @js.native
  sealed trait RIGHT_TOP
    extends googlemapsLib.googleNs.mapsNs.ControlPosition
  
  /**    Elements are positioned in the center of the top row. */
  @js.native
  sealed trait TOP_CENTER
    extends googlemapsLib.googleNs.mapsNs.ControlPosition
  
  /** Elements are positioned in the top left and flow towards the middle. */
  @js.native
  sealed trait TOP_LEFT
    extends googlemapsLib.googleNs.mapsNs.ControlPosition
  
  /** Elements are positioned in the top right and flow towards the middle. */
  @js.native
  sealed trait TOP_RIGHT
    extends googlemapsLib.googleNs.mapsNs.ControlPosition
  
  val BOTTOM_CENTER: BOTTOM_CENTER with java.lang.String = js.native
  val BOTTOM_LEFT: BOTTOM_LEFT with java.lang.String = js.native
  val BOTTOM_RIGHT: BOTTOM_RIGHT with java.lang.String = js.native
  val LEFT_BOTTOM: LEFT_BOTTOM with java.lang.String = js.native
  val LEFT_CENTER: LEFT_CENTER with java.lang.String = js.native
  val LEFT_TOP: LEFT_TOP with java.lang.String = js.native
  val RIGHT_BOTTOM: RIGHT_BOTTOM with java.lang.String = js.native
  val RIGHT_CENTER: RIGHT_CENTER with java.lang.String = js.native
  val RIGHT_TOP: RIGHT_TOP with java.lang.String = js.native
  val TOP_CENTER: TOP_CENTER with java.lang.String = js.native
  val TOP_LEFT: TOP_LEFT with java.lang.String = js.native
  val TOP_RIGHT: TOP_RIGHT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[googlemapsLib.googleNs.mapsNs.ControlPosition with java.lang.String] = js.native
}

