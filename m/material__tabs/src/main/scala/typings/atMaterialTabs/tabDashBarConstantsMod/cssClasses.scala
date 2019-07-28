package typings.atMaterialTabs.tabDashBarConstantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atMaterialBase.foundationMod.MDCStrings
import typings.atMaterialTabs.atMaterialTabsStrings.`mdc-tab-bar-upgraded`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses extends MDCStrings {
  var UPGRADED: `mdc-tab-bar-upgraded`
}

object cssClasses {
  @scala.inline
  def apply(UPGRADED: `mdc-tab-bar-upgraded`, StringDictionary: StringDictionary[String] = null): cssClasses = {
    val __obj = js.Dynamic.literal(UPGRADED = UPGRADED)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[cssClasses]
  }
}

