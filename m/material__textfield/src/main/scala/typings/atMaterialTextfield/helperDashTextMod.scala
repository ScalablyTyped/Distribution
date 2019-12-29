package typings.atMaterialTextfield

import typings.atMaterialTextfield.helperDashTextAdapterMod.MDCTextFieldHelperTextAdapter
import typings.atMaterialTextfield.helperDashTextFoundationMod.default
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/textfield/helper-text", JSImport.Namespace)
@js.native
object helperDashTextMod extends js.Object {
  @js.native
  class MDCTextFieldHelperText ()
    extends typings.atMaterialBase.componentMod.default[MDCTextFieldHelperTextAdapter, default] {
    val foundation: default = js.native
  }
  
  @js.native
  class MDCTextFieldHelperTextFoundation () extends default
  
  /* static members */
  @js.native
  object MDCTextFieldHelperText extends js.Object {
    def attachTo(root: Element): MDCTextFieldHelperText = js.native
  }
  
  /* static members */
  @js.native
  object MDCTextFieldHelperTextFoundation extends js.Object {
    val cssClasses: typings.atMaterialTextfield.helperDashTextConstantsMod.cssClasses = js.native
    val defaultAdapter: MDCTextFieldHelperTextAdapter = js.native
    val strings: typings.atMaterialTextfield.helperDashTextConstantsMod.strings = js.native
  }
  
}

