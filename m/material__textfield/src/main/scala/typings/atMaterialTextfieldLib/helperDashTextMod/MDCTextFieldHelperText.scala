package typings
package atMaterialTextfieldLib.helperDashTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/textfield/helper-text", "MDCTextFieldHelperText")
@js.native
class MDCTextFieldHelperText ()
  extends atMaterialBaseLib.componentMod.default[
      atMaterialTextfieldLib.helperDashTextAdapterMod.MDCTextFieldHelperTextAdapter, 
      atMaterialTextfieldLib.helperDashTextFoundationMod.default
    ] {
  val foundation: atMaterialTextfieldLib.helperDashTextFoundationMod.default = js.native
}

@JSImport("@material/textfield/helper-text", "MDCTextFieldHelperText")
@js.native
object MDCTextFieldHelperText extends js.Object {
  def attachTo(root: stdLib.Element): atMaterialTextfieldLib.helperDashTextMod.MDCTextFieldHelperText = js.native
}

