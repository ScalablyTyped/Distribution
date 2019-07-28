package typings.atMaterialTabs.tabDashBarDashScrollerConstantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atMaterialBase.foundationMod.MDCStrings
import typings.atMaterialTabs.atMaterialTabsStrings.`DOTmdc-tab-bar-scroller__indicator--back`
import typings.atMaterialTabs.atMaterialTabsStrings.`DOTmdc-tab-bar-scroller__indicator--forward`
import typings.atMaterialTabs.atMaterialTabsStrings.`DOTmdc-tab-bar-scroller__scroll-frame__tabs`
import typings.atMaterialTabs.atMaterialTabsStrings.`DOTmdc-tab-bar-scroller__scroll-frame`
import typings.atMaterialTabs.atMaterialTabsStrings.`DOTmdc-tab`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings extends MDCStrings {
  var FRAME_SELECTOR: `DOTmdc-tab-bar-scroller__scroll-frame`
  var INDICATOR_BACK_SELECTOR: `DOTmdc-tab-bar-scroller__indicator--back`
  var INDICATOR_FORWARD_SELECTOR: `DOTmdc-tab-bar-scroller__indicator--forward`
  var TABS_SELECTOR: `DOTmdc-tab-bar-scroller__scroll-frame__tabs`
  var TAB_SELECTOR: `DOTmdc-tab`
}

object strings {
  @scala.inline
  def apply(
    FRAME_SELECTOR: `DOTmdc-tab-bar-scroller__scroll-frame`,
    INDICATOR_BACK_SELECTOR: `DOTmdc-tab-bar-scroller__indicator--back`,
    INDICATOR_FORWARD_SELECTOR: `DOTmdc-tab-bar-scroller__indicator--forward`,
    TABS_SELECTOR: `DOTmdc-tab-bar-scroller__scroll-frame__tabs`,
    TAB_SELECTOR: `DOTmdc-tab`,
    StringDictionary: StringDictionary[String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(FRAME_SELECTOR = FRAME_SELECTOR, INDICATOR_BACK_SELECTOR = INDICATOR_BACK_SELECTOR, INDICATOR_FORWARD_SELECTOR = INDICATOR_FORWARD_SELECTOR, TABS_SELECTOR = TABS_SELECTOR, TAB_SELECTOR = TAB_SELECTOR)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

