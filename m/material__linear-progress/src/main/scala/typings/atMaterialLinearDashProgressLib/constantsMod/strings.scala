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
    PRIMARY_BAR_SELECTOR: atMaterialLinearDashProgressLib.atMaterialLinearDashProgressLibStrings.`DOTmdc-linear-progress__primary-bar`
  ): strings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BUFFER_SELECTOR")(BUFFER_SELECTOR)
    __obj.updateDynamic("PRIMARY_BAR_SELECTOR")(PRIMARY_BAR_SELECTOR)
    __obj.asInstanceOf[strings]
  }
}

