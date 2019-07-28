package typings.atMaterialTabs.tabDashBarDashScrollerConstantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atMaterialBase.foundationMod.MDCStrings
import typings.atMaterialTabs.atMaterialTabsStrings.`mdc-tab-bar-scroller__indicator--back`
import typings.atMaterialTabs.atMaterialTabsStrings.`mdc-tab-bar-scroller__indicator--enabled`
import typings.atMaterialTabs.atMaterialTabsStrings.`mdc-tab-bar-scroller__indicator--forward`
import typings.atMaterialTabs.atMaterialTabsStrings.`mdc-tab`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses extends MDCStrings {
  var INDICATOR_BACK: `mdc-tab-bar-scroller__indicator--back`
  var INDICATOR_ENABLED: `mdc-tab-bar-scroller__indicator--enabled`
  var INDICATOR_FORWARD: `mdc-tab-bar-scroller__indicator--forward`
  var TAB: `mdc-tab`
}

object cssClasses {
  @scala.inline
  def apply(
    INDICATOR_BACK: `mdc-tab-bar-scroller__indicator--back`,
    INDICATOR_ENABLED: `mdc-tab-bar-scroller__indicator--enabled`,
    INDICATOR_FORWARD: `mdc-tab-bar-scroller__indicator--forward`,
    TAB: `mdc-tab`,
    StringDictionary: StringDictionary[String] = null
  ): cssClasses = {
    val __obj = js.Dynamic.literal(INDICATOR_BACK = INDICATOR_BACK, INDICATOR_ENABLED = INDICATOR_ENABLED, INDICATOR_FORWARD = INDICATOR_FORWARD, TAB = TAB)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[cssClasses]
  }
}

