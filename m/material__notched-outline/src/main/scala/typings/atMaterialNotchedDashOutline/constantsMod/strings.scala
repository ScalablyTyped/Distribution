package typings.atMaterialNotchedDashOutline.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atMaterialBase.foundationMod.MDCStrings
import typings.atMaterialNotchedDashOutline.atMaterialNotchedDashOutlineStrings.`DOTmdc-notched-outline__idle`
import typings.atMaterialNotchedDashOutline.atMaterialNotchedDashOutlineStrings.`DOTmdc-notched-outline__path`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings extends MDCStrings {
  var IDLE_OUTLINE_SELECTOR: `DOTmdc-notched-outline__idle`
  var PATH_SELECTOR: `DOTmdc-notched-outline__path`
}

object strings {
  @scala.inline
  def apply(
    IDLE_OUTLINE_SELECTOR: `DOTmdc-notched-outline__idle`,
    PATH_SELECTOR: `DOTmdc-notched-outline__path`,
    StringDictionary: StringDictionary[String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(IDLE_OUTLINE_SELECTOR = IDLE_OUTLINE_SELECTOR.asInstanceOf[js.Any], PATH_SELECTOR = PATH_SELECTOR.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

