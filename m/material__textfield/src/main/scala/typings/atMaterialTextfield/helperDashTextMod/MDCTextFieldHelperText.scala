package typings.atMaterialTextfield.helperDashTextMod

import typings.atMaterialBase.componentMod.default
import typings.atMaterialTextfield.helperDashTextAdapterMod.MDCTextFieldHelperTextAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/textfield/helper-text", "MDCTextFieldHelperText")
@js.native
class MDCTextFieldHelperText ()
  extends default[
      MDCTextFieldHelperTextAdapter, 
      typings.atMaterialTextfield.helperDashTextFoundationMod.default
    ] {
  val foundation: typings.atMaterialTextfield.helperDashTextFoundationMod.default = js.native
}

/* static members */
@JSImport("@material/textfield/helper-text", "MDCTextFieldHelperText")
@js.native
object MDCTextFieldHelperText extends js.Object {
  def attachTo(root: Element): MDCTextFieldHelperText = js.native
}

