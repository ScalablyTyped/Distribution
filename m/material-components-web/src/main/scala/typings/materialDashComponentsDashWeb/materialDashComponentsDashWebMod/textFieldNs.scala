package typings.materialDashComponentsDashWeb.materialDashComponentsDashWebMod

import typings.atMaterialTextfield.adapterMod.FoundationMapType
import typings.atMaterialTextfield.adapterMod.MDCTextFieldAdapter
import typings.atMaterialTextfield.helperDashTextAdapterMod.MDCTextFieldHelperTextAdapter
import typings.atMaterialTextfield.iconAdapterMod.MDCTextFieldIconAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "textField")
@js.native
object textFieldNs extends js.Object {
  @js.native
  class MDCTextField ()
    extends typings.atMaterialTextfield.atMaterialTextfieldMod.MDCTextField
  
  @js.native
  class MDCTextFieldFoundation protected ()
    extends typings.atMaterialTextfield.atMaterialTextfieldMod.MDCTextFieldFoundation {
    def this(adapter: MDCTextFieldAdapter) = this()
    def this(adapter: MDCTextFieldAdapter, foundationMap: FoundationMapType) = this()
  }
  
  @js.native
  class MDCTextFieldHelperText ()
    extends typings.atMaterialTextfield.atMaterialTextfieldMod.MDCTextFieldHelperText
  
  @js.native
  class MDCTextFieldHelperTextFoundation ()
    extends typings.atMaterialTextfield.atMaterialTextfieldMod.MDCTextFieldHelperTextFoundation
  
  @js.native
  class MDCTextFieldIcon ()
    extends typings.atMaterialTextfield.atMaterialTextfieldMod.MDCTextFieldIcon
  
  @js.native
  class MDCTextFieldIconFoundation ()
    extends typings.atMaterialTextfield.atMaterialTextfieldMod.MDCTextFieldIconFoundation
  
  /* static members */
  @js.native
  object MDCTextField extends js.Object {
    def attachTo(root: Element): typings.atMaterialTextfield.atMaterialTextfieldMod.MDCTextField = js.native
  }
  
  /* static members */
  @js.native
  object MDCTextFieldFoundation extends js.Object {
    val cssClasses: typings.atMaterialTextfield.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCTextFieldAdapter = js.native
    val numbers: typings.atMaterialTextfield.constantsMod.numbers = js.native
    val strings: typings.atMaterialTextfield.constantsMod.strings = js.native
  }
  
  /* static members */
  @js.native
  object MDCTextFieldHelperText extends js.Object {
    def attachTo(root: Element): typings.atMaterialTextfield.helperDashTextMod.MDCTextFieldHelperText = js.native
  }
  
  /* static members */
  @js.native
  object MDCTextFieldHelperTextFoundation extends js.Object {
    val cssClasses: typings.atMaterialTextfield.helperDashTextConstantsMod.cssClasses = js.native
    val defaultAdapter: MDCTextFieldHelperTextAdapter = js.native
    val strings: typings.atMaterialTextfield.helperDashTextConstantsMod.strings = js.native
  }
  
  /* static members */
  @js.native
  object MDCTextFieldIcon extends js.Object {
    def attachTo(root: Element): typings.atMaterialTextfield.iconMod.MDCTextFieldIcon = js.native
  }
  
  /* static members */
  @js.native
  object MDCTextFieldIconFoundation extends js.Object {
    val defaultAdapter: MDCTextFieldIconAdapter = js.native
    val strings: typings.atMaterialTextfield.iconConstantsMod.strings = js.native
  }
  
}

