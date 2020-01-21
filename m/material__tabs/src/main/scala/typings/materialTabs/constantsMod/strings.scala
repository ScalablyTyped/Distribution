package typings.materialTabs.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.materialBase.foundationMod.MDCStrings
import typings.materialTabs.materialTabsStrings.`Dotmdc-tab-bar-scroller__indicator--back`
import typings.materialTabs.materialTabsStrings.`Dotmdc-tab-bar-scroller__indicator--forward`
import typings.materialTabs.materialTabsStrings.`Dotmdc-tab-bar-scroller__scroll-frame__tabs`
import typings.materialTabs.materialTabsStrings.`Dotmdc-tab-bar-scroller__scroll-frame`
import typings.materialTabs.materialTabsStrings.`Dotmdc-tab`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings extends MDCStrings {
  var FRAME_SELECTOR: `Dotmdc-tab-bar-scroller__scroll-frame`
  var INDICATOR_BACK_SELECTOR: `Dotmdc-tab-bar-scroller__indicator--back`
  var INDICATOR_FORWARD_SELECTOR: `Dotmdc-tab-bar-scroller__indicator--forward`
  var TABS_SELECTOR: `Dotmdc-tab-bar-scroller__scroll-frame__tabs`
  var TAB_SELECTOR: `Dotmdc-tab`
}

object strings {
  @scala.inline
  def apply(
    FRAME_SELECTOR: `Dotmdc-tab-bar-scroller__scroll-frame`,
    INDICATOR_BACK_SELECTOR: `Dotmdc-tab-bar-scroller__indicator--back`,
    INDICATOR_FORWARD_SELECTOR: `Dotmdc-tab-bar-scroller__indicator--forward`,
    TABS_SELECTOR: `Dotmdc-tab-bar-scroller__scroll-frame__tabs`,
    TAB_SELECTOR: `Dotmdc-tab`,
    StringDictionary: StringDictionary[String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(FRAME_SELECTOR = FRAME_SELECTOR.asInstanceOf[js.Any], INDICATOR_BACK_SELECTOR = INDICATOR_BACK_SELECTOR.asInstanceOf[js.Any], INDICATOR_FORWARD_SELECTOR = INDICATOR_FORWARD_SELECTOR.asInstanceOf[js.Any], TABS_SELECTOR = TABS_SELECTOR.asInstanceOf[js.Any], TAB_SELECTOR = TAB_SELECTOR.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

