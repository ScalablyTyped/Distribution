package typings.atMaterialTopDashAppDashBar.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atMaterialBase.foundationMod.MDCStrings
import typings.atMaterialTopDashAppDashBar.atMaterialTopDashAppDashBarStrings.`mdc-top-app-bar--fixed-scrolled`
import typings.atMaterialTopDashAppDashBar.atMaterialTopDashAppDashBarStrings.`mdc-top-app-bar--fixed`
import typings.atMaterialTopDashAppDashBar.atMaterialTopDashAppDashBarStrings.`mdc-top-app-bar--short-collapsed`
import typings.atMaterialTopDashAppDashBar.atMaterialTopDashAppDashBarStrings.`mdc-top-app-bar--short-has-action-item`
import typings.atMaterialTopDashAppDashBar.atMaterialTopDashAppDashBarStrings.`mdc-top-app-bar--short`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses extends MDCStrings {
  var FIXED_CLASS: `mdc-top-app-bar--fixed`
  var FIXED_SCROLLED_CLASS: `mdc-top-app-bar--fixed-scrolled`
  var SHORT_CLASS: `mdc-top-app-bar--short`
  var SHORT_COLLAPSED_CLASS: `mdc-top-app-bar--short-collapsed`
  var SHORT_HAS_ACTION_ITEM_CLASS: `mdc-top-app-bar--short-has-action-item`
}

object cssClasses {
  @scala.inline
  def apply(
    FIXED_CLASS: `mdc-top-app-bar--fixed`,
    FIXED_SCROLLED_CLASS: `mdc-top-app-bar--fixed-scrolled`,
    SHORT_CLASS: `mdc-top-app-bar--short`,
    SHORT_COLLAPSED_CLASS: `mdc-top-app-bar--short-collapsed`,
    SHORT_HAS_ACTION_ITEM_CLASS: `mdc-top-app-bar--short-has-action-item`,
    StringDictionary: StringDictionary[String] = null
  ): cssClasses = {
    val __obj = js.Dynamic.literal(FIXED_CLASS = FIXED_CLASS, FIXED_SCROLLED_CLASS = FIXED_SCROLLED_CLASS, SHORT_CLASS = SHORT_CLASS, SHORT_COLLAPSED_CLASS = SHORT_COLLAPSED_CLASS, SHORT_HAS_ACTION_ITEM_CLASS = SHORT_HAS_ACTION_ITEM_CLASS)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[cssClasses]
  }
}

