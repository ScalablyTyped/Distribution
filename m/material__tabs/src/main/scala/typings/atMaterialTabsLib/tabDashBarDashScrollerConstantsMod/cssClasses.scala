package typings
package atMaterialTabsLib.tabDashBarDashScrollerConstantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses
  extends atMaterialBaseLib.foundationMod.MDCStrings {
  var INDICATOR_BACK: atMaterialTabsLib.atMaterialTabsLibStrings.`mdc-tab-bar-scroller__indicator--back`
  var INDICATOR_ENABLED: atMaterialTabsLib.atMaterialTabsLibStrings.`mdc-tab-bar-scroller__indicator--enabled`
  var INDICATOR_FORWARD: atMaterialTabsLib.atMaterialTabsLibStrings.`mdc-tab-bar-scroller__indicator--forward`
  var TAB: atMaterialTabsLib.atMaterialTabsLibStrings.`mdc-tab`
}

object cssClasses {
  @scala.inline
  def apply(
    INDICATOR_BACK: atMaterialTabsLib.atMaterialTabsLibStrings.`mdc-tab-bar-scroller__indicator--back`,
    INDICATOR_ENABLED: atMaterialTabsLib.atMaterialTabsLibStrings.`mdc-tab-bar-scroller__indicator--enabled`,
    INDICATOR_FORWARD: atMaterialTabsLib.atMaterialTabsLibStrings.`mdc-tab-bar-scroller__indicator--forward`,
    TAB: atMaterialTabsLib.atMaterialTabsLibStrings.`mdc-tab`,
    StringDictionary: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): cssClasses = {
    val __obj = js.Dynamic.literal(INDICATOR_BACK = INDICATOR_BACK, INDICATOR_ENABLED = INDICATOR_ENABLED, INDICATOR_FORWARD = INDICATOR_FORWARD, TAB = TAB)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[cssClasses]
  }
}

