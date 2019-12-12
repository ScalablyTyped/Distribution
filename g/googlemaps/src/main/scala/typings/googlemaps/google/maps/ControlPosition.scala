package typings.googlemaps.google.maps

import org.scalablytyped.runtime.TopLevel
import typings.googlemaps.google.maps.ControlPosition.BOTTOM_CENTER
import typings.googlemaps.google.maps.ControlPosition.BOTTOM_LEFT
import typings.googlemaps.google.maps.ControlPosition.BOTTOM_RIGHT
import typings.googlemaps.google.maps.ControlPosition.LEFT_BOTTOM
import typings.googlemaps.google.maps.ControlPosition.LEFT_CENTER
import typings.googlemaps.google.maps.ControlPosition.LEFT_TOP
import typings.googlemaps.google.maps.ControlPosition.RIGHT_BOTTOM
import typings.googlemaps.google.maps.ControlPosition.RIGHT_CENTER
import typings.googlemaps.google.maps.ControlPosition.RIGHT_TOP
import typings.googlemaps.google.maps.ControlPosition.TOP_CENTER
import typings.googlemaps.google.maps.ControlPosition.TOP_LEFT
import typings.googlemaps.google.maps.ControlPosition.TOP_RIGHT
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ControlPosition with Double] = js.native
  /* 11 */ @js.native
  object BOTTOM_CENTER extends TopLevel[BOTTOM_CENTER with Double]
  
  /* 10 */ @js.native
  object BOTTOM_LEFT extends TopLevel[BOTTOM_LEFT with Double]
  
  /* 12 */ @js.native
  object BOTTOM_RIGHT extends TopLevel[BOTTOM_RIGHT with Double]
  
  /* 6 */ @js.native
  object LEFT_BOTTOM extends TopLevel[LEFT_BOTTOM with Double]
  
  /* 4 */ @js.native
  object LEFT_CENTER extends TopLevel[LEFT_CENTER with Double]
  
  /* 5 */ @js.native
  object LEFT_TOP extends TopLevel[LEFT_TOP with Double]
  
  /* 9 */ @js.native
  object RIGHT_BOTTOM extends TopLevel[RIGHT_BOTTOM with Double]
  
  /* 8 */ @js.native
  object RIGHT_CENTER extends TopLevel[RIGHT_CENTER with Double]
  
  /* 7 */ @js.native
  object RIGHT_TOP extends TopLevel[RIGHT_TOP with Double]
  
  /* 2 */ @js.native
  object TOP_CENTER extends TopLevel[TOP_CENTER with Double]
  
  /* 1 */ @js.native
  object TOP_LEFT extends TopLevel[TOP_LEFT with Double]
  
  /* 3 */ @js.native
  object TOP_RIGHT extends TopLevel[TOP_RIGHT with Double]
  
}

