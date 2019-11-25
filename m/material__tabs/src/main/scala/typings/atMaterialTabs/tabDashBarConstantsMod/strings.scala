package typings.atMaterialTabs.tabDashBarConstantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atMaterialBase.foundationMod.MDCStrings
import typings.atMaterialTabs.atMaterialTabsStrings.`DOTmdc-tab-bar__indicator`
import typings.atMaterialTabs.atMaterialTabsStrings.`DOTmdc-tab`
import typings.atMaterialTabs.atMaterialTabsStrings.`MDCTabBar:change`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings extends MDCStrings {
  var CHANGE_EVENT: `MDCTabBar:change`
  var INDICATOR_SELECTOR: `DOTmdc-tab-bar__indicator`
  var TAB_SELECTOR: `DOTmdc-tab`
}

object strings {
  @scala.inline
  def apply(
    CHANGE_EVENT: `MDCTabBar:change`,
    INDICATOR_SELECTOR: `DOTmdc-tab-bar__indicator`,
    TAB_SELECTOR: `DOTmdc-tab`,
    StringDictionary: StringDictionary[String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(CHANGE_EVENT = CHANGE_EVENT.asInstanceOf[js.Any], INDICATOR_SELECTOR = INDICATOR_SELECTOR.asInstanceOf[js.Any], TAB_SELECTOR = TAB_SELECTOR.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

