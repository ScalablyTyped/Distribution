package typings
package atMaterialTabsLib.tabDashBarConstantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings
  extends atMaterialBaseLib.foundationMod.MDCStrings {
  var CHANGE_EVENT: atMaterialTabsLib.atMaterialTabsLibStrings.`MDCTabBar:change`
  var INDICATOR_SELECTOR: atMaterialTabsLib.atMaterialTabsLibStrings.`DOTmdc-tab-bar__indicator`
  var TAB_SELECTOR: atMaterialTabsLib.atMaterialTabsLibStrings.`DOTmdc-tab`
}

object strings {
  @scala.inline
  def apply(
    CHANGE_EVENT: atMaterialTabsLib.atMaterialTabsLibStrings.`MDCTabBar:change`,
    INDICATOR_SELECTOR: atMaterialTabsLib.atMaterialTabsLibStrings.`DOTmdc-tab-bar__indicator`,
    TAB_SELECTOR: atMaterialTabsLib.atMaterialTabsLibStrings.`DOTmdc-tab`
  ): strings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CHANGE_EVENT")(CHANGE_EVENT)
    __obj.updateDynamic("INDICATOR_SELECTOR")(INDICATOR_SELECTOR)
    __obj.updateDynamic("TAB_SELECTOR")(TAB_SELECTOR)
    __obj.asInstanceOf[strings]
  }
}

