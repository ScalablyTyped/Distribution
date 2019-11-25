package typings.atMaterialDrawer.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atMaterialBase.foundationMod.MDCStrings
import typings.atMaterialDrawer.atMaterialDrawerStrings.`DOTmdc-drawer-app-content`
import typings.atMaterialDrawer.atMaterialDrawerStrings.`DOTmdc-drawer-scrim`
import typings.atMaterialDrawer.atMaterialDrawerStrings.`MDCDrawer:closed`
import typings.atMaterialDrawer.atMaterialDrawerStrings.`MDCDrawer:opened`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings extends MDCStrings {
  var APP_CONTENT_SELECTOR: `DOTmdc-drawer-app-content`
  var CLOSE_EVENT: `MDCDrawer:closed`
  var OPEN_EVENT: `MDCDrawer:opened`
  var SCRIM_SELECTOR: `DOTmdc-drawer-scrim`
}

object strings {
  @scala.inline
  def apply(
    APP_CONTENT_SELECTOR: `DOTmdc-drawer-app-content`,
    CLOSE_EVENT: `MDCDrawer:closed`,
    OPEN_EVENT: `MDCDrawer:opened`,
    SCRIM_SELECTOR: `DOTmdc-drawer-scrim`,
    StringDictionary: StringDictionary[String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(APP_CONTENT_SELECTOR = APP_CONTENT_SELECTOR.asInstanceOf[js.Any], CLOSE_EVENT = CLOSE_EVENT.asInstanceOf[js.Any], OPEN_EVENT = OPEN_EVENT.asInstanceOf[js.Any], SCRIM_SELECTOR = SCRIM_SELECTOR.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

