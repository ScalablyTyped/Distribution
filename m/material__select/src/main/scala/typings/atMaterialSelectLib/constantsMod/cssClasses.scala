package typings
package atMaterialSelectLib.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses
  extends atMaterialBaseLib.foundationMod.MDCStrings {
  var BOX: atMaterialSelectLib.atMaterialSelectLibStrings.`mdc-select--box`
  var DISABLED: atMaterialSelectLib.atMaterialSelectLibStrings.`mdc-select--disabled`
  var ROOT: atMaterialSelectLib.atMaterialSelectLibStrings.`mdc-select`
}

object cssClasses {
  @scala.inline
  def apply(
    BOX: atMaterialSelectLib.atMaterialSelectLibStrings.`mdc-select--box`,
    DISABLED: atMaterialSelectLib.atMaterialSelectLibStrings.`mdc-select--disabled`,
    ROOT: atMaterialSelectLib.atMaterialSelectLibStrings.`mdc-select`
  ): cssClasses = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BOX")(BOX)
    __obj.updateDynamic("DISABLED")(DISABLED)
    __obj.updateDynamic("ROOT")(ROOT)
    __obj.asInstanceOf[cssClasses]
  }
}

