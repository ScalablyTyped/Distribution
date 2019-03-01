package typings
package atMaterialSelectLib.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings
  extends atMaterialBaseLib.foundationMod.MDCStrings {
  var CHANGE_EVENT: atMaterialSelectLib.atMaterialSelectLibStrings.`MDCSelect:change`
  var LABEL_SELECTOR: atMaterialSelectLib.atMaterialSelectLibStrings.`DOTmdc-floating-label`
  var LINE_RIPPLE_SELECTOR: atMaterialSelectLib.atMaterialSelectLibStrings.`DOTmdc-line-ripple`
  var NATIVE_CONTROL_SELECTOR: atMaterialSelectLib.atMaterialSelectLibStrings.`DOTmdc-select__native-control`
}

object strings {
  @scala.inline
  def apply(
    CHANGE_EVENT: atMaterialSelectLib.atMaterialSelectLibStrings.`MDCSelect:change`,
    LABEL_SELECTOR: atMaterialSelectLib.atMaterialSelectLibStrings.`DOTmdc-floating-label`,
    LINE_RIPPLE_SELECTOR: atMaterialSelectLib.atMaterialSelectLibStrings.`DOTmdc-line-ripple`,
    NATIVE_CONTROL_SELECTOR: atMaterialSelectLib.atMaterialSelectLibStrings.`DOTmdc-select__native-control`
  ): strings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CHANGE_EVENT")(CHANGE_EVENT)
    __obj.updateDynamic("LABEL_SELECTOR")(LABEL_SELECTOR)
    __obj.updateDynamic("LINE_RIPPLE_SELECTOR")(LINE_RIPPLE_SELECTOR)
    __obj.updateDynamic("NATIVE_CONTROL_SELECTOR")(NATIVE_CONTROL_SELECTOR)
    __obj.asInstanceOf[strings]
  }
}

