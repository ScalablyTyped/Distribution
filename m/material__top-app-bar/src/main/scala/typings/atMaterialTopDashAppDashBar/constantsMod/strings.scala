package typings.atMaterialTopDashAppDashBar.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atMaterialBase.foundationMod.MDCStrings
import typings.atMaterialTopDashAppDashBar.atMaterialTopDashAppDashBarStrings.`DOTmdc-top-app-bar__action-item`
import typings.atMaterialTopDashAppDashBar.atMaterialTopDashAppDashBarStrings.`DOTmdc-top-app-bar__navigation-icon`
import typings.atMaterialTopDashAppDashBar.atMaterialTopDashAppDashBarStrings.`DOTmdc-top-app-bar__title`
import typings.atMaterialTopDashAppDashBar.atMaterialTopDashAppDashBarStrings.`DOTmdc-top-app-bar`
import typings.atMaterialTopDashAppDashBar.atMaterialTopDashAppDashBarStrings.`MDCTopAppBar:nav`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings extends MDCStrings {
  var ACTION_ITEM_SELECTOR: `DOTmdc-top-app-bar__action-item`
  var NAVIGATION_EVENT: `MDCTopAppBar:nav`
  var NAVIGATION_ICON_SELECTOR: `DOTmdc-top-app-bar__navigation-icon`
  var ROOT_SELECTOR: `DOTmdc-top-app-bar`
  var TITLE_SELECTOR: `DOTmdc-top-app-bar__title`
}

object strings {
  @scala.inline
  def apply(
    ACTION_ITEM_SELECTOR: `DOTmdc-top-app-bar__action-item`,
    NAVIGATION_EVENT: `MDCTopAppBar:nav`,
    NAVIGATION_ICON_SELECTOR: `DOTmdc-top-app-bar__navigation-icon`,
    ROOT_SELECTOR: `DOTmdc-top-app-bar`,
    TITLE_SELECTOR: `DOTmdc-top-app-bar__title`,
    StringDictionary: StringDictionary[String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(ACTION_ITEM_SELECTOR = ACTION_ITEM_SELECTOR, NAVIGATION_EVENT = NAVIGATION_EVENT, NAVIGATION_ICON_SELECTOR = NAVIGATION_ICON_SELECTOR, ROOT_SELECTOR = ROOT_SELECTOR, TITLE_SELECTOR = TITLE_SELECTOR)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

