package typings
package atMaterialLinearDashProgressLib.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings
  extends atMaterialBaseLib.foundationMod.MDCStrings {
  var BUFFER_SELECTOR: atMaterialLinearDashProgressLib.atMaterialLinearDashProgressLibStrings.`DOTmdc-linear-progress__buffer`
  var PRIMARY_BAR_SELECTOR: atMaterialLinearDashProgressLib.atMaterialLinearDashProgressLibStrings.`DOTmdc-linear-progress__primary-bar`
}

object strings {
  @scala.inline
  def apply(
    BUFFER_SELECTOR: atMaterialLinearDashProgressLib.atMaterialLinearDashProgressLibStrings.`DOTmdc-linear-progress__buffer`,
    PRIMARY_BAR_SELECTOR: atMaterialLinearDashProgressLib.atMaterialLinearDashProgressLibStrings.`DOTmdc-linear-progress__primary-bar`,
    StringDictionary: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(BUFFER_SELECTOR = BUFFER_SELECTOR, PRIMARY_BAR_SELECTOR = PRIMARY_BAR_SELECTOR)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

