package typings.materialTopAppBar.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.materialBase.foundationMod.MDCStrings
import typings.materialTopAppBar.materialTopAppBarStrings.MDCTopAppBarColonnav
import typings.materialTopAppBar.materialTopAppBarStrings.`Dotmdc-top-app-bar__action-item`
import typings.materialTopAppBar.materialTopAppBarStrings.`Dotmdc-top-app-bar__navigation-icon`
import typings.materialTopAppBar.materialTopAppBarStrings.`Dotmdc-top-app-bar__title`
import typings.materialTopAppBar.materialTopAppBarStrings.`Dotmdc-top-app-bar`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings extends MDCStrings {
  var ACTION_ITEM_SELECTOR: `Dotmdc-top-app-bar__action-item`
  var NAVIGATION_EVENT: MDCTopAppBarColonnav
  var NAVIGATION_ICON_SELECTOR: `Dotmdc-top-app-bar__navigation-icon`
  var ROOT_SELECTOR: `Dotmdc-top-app-bar`
  var TITLE_SELECTOR: `Dotmdc-top-app-bar__title`
}

object strings {
  @scala.inline
  def apply(
    ACTION_ITEM_SELECTOR: `Dotmdc-top-app-bar__action-item`,
    NAVIGATION_EVENT: MDCTopAppBarColonnav,
    NAVIGATION_ICON_SELECTOR: `Dotmdc-top-app-bar__navigation-icon`,
    ROOT_SELECTOR: `Dotmdc-top-app-bar`,
    TITLE_SELECTOR: `Dotmdc-top-app-bar__title`,
    StringDictionary: StringDictionary[String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(ACTION_ITEM_SELECTOR = ACTION_ITEM_SELECTOR.asInstanceOf[js.Any], NAVIGATION_EVENT = NAVIGATION_EVENT.asInstanceOf[js.Any], NAVIGATION_ICON_SELECTOR = NAVIGATION_ICON_SELECTOR.asInstanceOf[js.Any], ROOT_SELECTOR = ROOT_SELECTOR.asInstanceOf[js.Any], TITLE_SELECTOR = TITLE_SELECTOR.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

