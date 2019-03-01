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
    TAB: atMaterialTabsLib.atMaterialTabsLibStrings.`mdc-tab`
  ): cssClasses = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("INDICATOR_BACK")(INDICATOR_BACK)
    __obj.updateDynamic("INDICATOR_ENABLED")(INDICATOR_ENABLED)
    __obj.updateDynamic("INDICATOR_FORWARD")(INDICATOR_FORWARD)
    __obj.updateDynamic("TAB")(TAB)
    __obj.asInstanceOf[cssClasses]
  }
}

