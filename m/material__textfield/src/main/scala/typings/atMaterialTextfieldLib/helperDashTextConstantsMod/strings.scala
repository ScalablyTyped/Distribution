package typings
package atMaterialTextfieldLib.helperDashTextConstantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings
  extends atMaterialBaseLib.foundationMod.MDCStrings {
  var ARIA_HIDDEN: atMaterialTextfieldLib.atMaterialTextfieldLibStrings.`aria-hidden`
  var ROLE: atMaterialTextfieldLib.atMaterialTextfieldLibStrings.role
}

object strings {
  @scala.inline
  def apply(
    ARIA_HIDDEN: atMaterialTextfieldLib.atMaterialTextfieldLibStrings.`aria-hidden`,
    ROLE: atMaterialTextfieldLib.atMaterialTextfieldLibStrings.role
  ): strings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ARIA_HIDDEN")(ARIA_HIDDEN)
    __obj.updateDynamic("ROLE")(ROLE)
    __obj.asInstanceOf[strings]
  }
}

