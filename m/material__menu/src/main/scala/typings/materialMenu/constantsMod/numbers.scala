package typings.materialMenu.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.materialBase.foundationMod.MDCNumbers
import typings.materialMenu.materialMenuNumbers.`0.1`
import typings.materialMenu.materialMenuNumbers.`0.67`
import typings.materialMenu.materialMenuNumbers.`120`
import typings.materialMenu.materialMenuNumbers.`32`
import typings.materialMenu.materialMenuNumbers.`50`
import typings.materialMenu.materialMenuNumbers.`75`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait numbers extends MDCNumbers {
  // Ratio of anchor width to menu width for switching from corner positioning to center positioning.
  var ANCHOR_TO_MENU_WIDTH_RATIO: `0.67`
  // Margin left to the edge of the viewport when menu is at maximum possible height.
  var MARGIN_TO_EDGE: `32`
  // Ratio of vertical offset to menu height for switching from corner to mid-way origin positioning.
  var OFFSET_TO_MENU_HEIGHT_RATIO: `0.1`
  // Amount of time to wait before triggering a selected event on the menu. Note that this time
  // will most likely be bumped up once interactive lists are supported to allow for the ripple to
  // animate before closing the menu
  var SELECTED_TRIGGER_DELAY: `50`
  // Total duration of menu close animation.
  var TRANSITION_CLOSE_DURATION: `75`
  // Total duration of menu open animation.
  var TRANSITION_OPEN_DURATION: `120`
}

object numbers {
  @scala.inline
  def apply(
    ANCHOR_TO_MENU_WIDTH_RATIO: `0.67`,
    MARGIN_TO_EDGE: `32`,
    OFFSET_TO_MENU_HEIGHT_RATIO: `0.1`,
    SELECTED_TRIGGER_DELAY: `50`,
    TRANSITION_CLOSE_DURATION: `75`,
    TRANSITION_OPEN_DURATION: `120`,
    StringDictionary: StringDictionary[Double] = null
  ): numbers = {
    val __obj = js.Dynamic.literal(ANCHOR_TO_MENU_WIDTH_RATIO = ANCHOR_TO_MENU_WIDTH_RATIO.asInstanceOf[js.Any], MARGIN_TO_EDGE = MARGIN_TO_EDGE.asInstanceOf[js.Any], OFFSET_TO_MENU_HEIGHT_RATIO = OFFSET_TO_MENU_HEIGHT_RATIO.asInstanceOf[js.Any], SELECTED_TRIGGER_DELAY = SELECTED_TRIGGER_DELAY.asInstanceOf[js.Any], TRANSITION_CLOSE_DURATION = TRANSITION_CLOSE_DURATION.asInstanceOf[js.Any], TRANSITION_OPEN_DURATION = TRANSITION_OPEN_DURATION.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[numbers]
  }
}

