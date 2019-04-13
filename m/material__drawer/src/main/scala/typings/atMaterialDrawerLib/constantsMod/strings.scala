package typings
package atMaterialDrawerLib.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings
  extends atMaterialBaseLib.foundationMod.MDCStrings {
  var APP_CONTENT_SELECTOR: atMaterialDrawerLib.atMaterialDrawerLibStrings.`DOTmdc-drawer-app-content`
  var CLOSE_EVENT: atMaterialDrawerLib.atMaterialDrawerLibStrings.`MDCDrawer:closed`
  var OPEN_EVENT: atMaterialDrawerLib.atMaterialDrawerLibStrings.`MDCDrawer:opened`
  var SCRIM_SELECTOR: atMaterialDrawerLib.atMaterialDrawerLibStrings.`DOTmdc-drawer-scrim`
}

object strings {
  @scala.inline
  def apply(
    APP_CONTENT_SELECTOR: atMaterialDrawerLib.atMaterialDrawerLibStrings.`DOTmdc-drawer-app-content`,
    CLOSE_EVENT: atMaterialDrawerLib.atMaterialDrawerLibStrings.`MDCDrawer:closed`,
    OPEN_EVENT: atMaterialDrawerLib.atMaterialDrawerLibStrings.`MDCDrawer:opened`,
    SCRIM_SELECTOR: atMaterialDrawerLib.atMaterialDrawerLibStrings.`DOTmdc-drawer-scrim`,
    StringDictionary: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(APP_CONTENT_SELECTOR = APP_CONTENT_SELECTOR, CLOSE_EVENT = CLOSE_EVENT, OPEN_EVENT = OPEN_EVENT, SCRIM_SELECTOR = SCRIM_SELECTOR)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

