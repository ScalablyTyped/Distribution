package typings
package atMaterialNotchedDashOutlineLib.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings
  extends atMaterialBaseLib.foundationMod.MDCStrings {
  var IDLE_OUTLINE_SELECTOR: atMaterialNotchedDashOutlineLib.atMaterialNotchedDashOutlineLibStrings.`DOTmdc-notched-outline__idle`
  var PATH_SELECTOR: atMaterialNotchedDashOutlineLib.atMaterialNotchedDashOutlineLibStrings.`DOTmdc-notched-outline__path`
}

object strings {
  @scala.inline
  def apply(
    IDLE_OUTLINE_SELECTOR: atMaterialNotchedDashOutlineLib.atMaterialNotchedDashOutlineLibStrings.`DOTmdc-notched-outline__idle`,
    PATH_SELECTOR: atMaterialNotchedDashOutlineLib.atMaterialNotchedDashOutlineLibStrings.`DOTmdc-notched-outline__path`,
    StringDictionary: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(IDLE_OUTLINE_SELECTOR = IDLE_OUTLINE_SELECTOR, PATH_SELECTOR = PATH_SELECTOR)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

