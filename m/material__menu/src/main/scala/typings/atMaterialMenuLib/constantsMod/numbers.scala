package typings
package atMaterialMenuLib.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait numbers
  extends atMaterialBaseLib.foundationMod.MDCNumbers {
  // Ratio of anchor width to menu width for switching from corner positioning to center positioning.
  var ANCHOR_TO_MENU_WIDTH_RATIO: atMaterialMenuLib.atMaterialMenuLibNumbers.`0DOT67`
  // Margin left to the edge of the viewport when menu is at maximum possible height.
  var MARGIN_TO_EDGE: atMaterialMenuLib.atMaterialMenuLibNumbers.`32`
  // Ratio of vertical offset to menu height for switching from corner to mid-way origin positioning.
  var OFFSET_TO_MENU_HEIGHT_RATIO: atMaterialMenuLib.atMaterialMenuLibNumbers.`0DOT1`
  // Amount of time to wait before triggering a selected event on the menu. Note that this time
  // will most likely be bumped up once interactive lists are supported to allow for the ripple to
  // animate before closing the menu
  var SELECTED_TRIGGER_DELAY: atMaterialMenuLib.atMaterialMenuLibNumbers.`50`
  // Total duration of menu close animation.
  var TRANSITION_CLOSE_DURATION: atMaterialMenuLib.atMaterialMenuLibNumbers.`75`
  // Total duration of menu open animation.
  var TRANSITION_OPEN_DURATION: atMaterialMenuLib.atMaterialMenuLibNumbers.`120`
}

object numbers {
  @scala.inline
  def apply(
    ANCHOR_TO_MENU_WIDTH_RATIO: atMaterialMenuLib.atMaterialMenuLibNumbers.`0DOT67`,
    MARGIN_TO_EDGE: atMaterialMenuLib.atMaterialMenuLibNumbers.`32`,
    OFFSET_TO_MENU_HEIGHT_RATIO: atMaterialMenuLib.atMaterialMenuLibNumbers.`0DOT1`,
    SELECTED_TRIGGER_DELAY: atMaterialMenuLib.atMaterialMenuLibNumbers.`50`,
    TRANSITION_CLOSE_DURATION: atMaterialMenuLib.atMaterialMenuLibNumbers.`75`,
    TRANSITION_OPEN_DURATION: atMaterialMenuLib.atMaterialMenuLibNumbers.`120`,
    StringDictionary: org.scalablytyped.runtime.StringDictionary[scala.Double] = null
  ): numbers = {
    val __obj = js.Dynamic.literal(ANCHOR_TO_MENU_WIDTH_RATIO = ANCHOR_TO_MENU_WIDTH_RATIO, MARGIN_TO_EDGE = MARGIN_TO_EDGE, OFFSET_TO_MENU_HEIGHT_RATIO = OFFSET_TO_MENU_HEIGHT_RATIO, SELECTED_TRIGGER_DELAY = SELECTED_TRIGGER_DELAY, TRANSITION_CLOSE_DURATION = TRANSITION_CLOSE_DURATION, TRANSITION_OPEN_DURATION = TRANSITION_OPEN_DURATION)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[numbers]
  }
}

