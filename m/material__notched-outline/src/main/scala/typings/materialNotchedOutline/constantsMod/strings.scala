package typings.materialNotchedOutline.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typings.materialBase.foundationMod.MDCStrings
import typings.materialNotchedOutline.materialNotchedOutlineStrings.`Dotmdc-notched-outline__idle`
import typings.materialNotchedOutline.materialNotchedOutlineStrings.`Dotmdc-notched-outline__path`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings extends MDCStrings {
  var IDLE_OUTLINE_SELECTOR: `Dotmdc-notched-outline__idle`
  var PATH_SELECTOR: `Dotmdc-notched-outline__path`
}

object strings {
  @scala.inline
  def apply(
    IDLE_OUTLINE_SELECTOR: `Dotmdc-notched-outline__idle`,
    PATH_SELECTOR: `Dotmdc-notched-outline__path`,
    StringDictionary: StringDictionary[String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(IDLE_OUTLINE_SELECTOR = IDLE_OUTLINE_SELECTOR.asInstanceOf[js.Any], PATH_SELECTOR = PATH_SELECTOR.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

