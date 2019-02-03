package typings
package materialDashComponentsDashWebLib.materialDashComponentsDashWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "textField")
@js.native
object textFieldNs extends js.Object {
  @js.native
  class MDCTextField ()
    extends atMaterialTextfieldLib.atMaterialTextfieldMod.MDCTextField
  
  @js.native
  class MDCTextFieldFoundation protected ()
    extends atMaterialTextfieldLib.atMaterialTextfieldMod.MDCTextFieldFoundation {
    def this(adapter: atMaterialTextfieldLib.adapterMod.MDCTextFieldAdapter) = this()
    def this(adapter: atMaterialTextfieldLib.adapterMod.MDCTextFieldAdapter, foundationMap: atMaterialTextfieldLib.adapterMod.FoundationMapType) = this()
  }
  
  @js.native
  class MDCTextFieldHelperText ()
    extends atMaterialTextfieldLib.atMaterialTextfieldMod.MDCTextFieldHelperText
  
  @js.native
  class MDCTextFieldHelperTextFoundation ()
    extends atMaterialTextfieldLib.atMaterialTextfieldMod.MDCTextFieldHelperTextFoundation
  
  @js.native
  class MDCTextFieldIcon ()
    extends atMaterialTextfieldLib.atMaterialTextfieldMod.MDCTextFieldIcon
  
  @js.native
  class MDCTextFieldIconFoundation ()
    extends atMaterialTextfieldLib.atMaterialTextfieldMod.MDCTextFieldIconFoundation
  
  /* static members */
  @js.native
  object MDCTextField extends js.Object {
    def attachTo(root: stdLib.Element): atMaterialTextfieldLib.atMaterialTextfieldMod.MDCTextField = js.native
  }
  
  /* static members */
  @js.native
  object MDCTextFieldFoundation extends js.Object {
    val cssClasses: atMaterialTextfieldLib.constantsMod.cssClasses = js.native
    val defaultAdapter: atMaterialTextfieldLib.adapterMod.MDCTextFieldAdapter = js.native
    val numbers: atMaterialTextfieldLib.constantsMod.numbers = js.native
    val strings: atMaterialTextfieldLib.constantsMod.strings = js.native
  }
  
  /* static members */
  @js.native
  object MDCTextFieldHelperText extends js.Object {
    def attachTo(root: stdLib.Element): atMaterialTextfieldLib.helperDashTextMod.MDCTextFieldHelperText = js.native
  }
  
  /* static members */
  @js.native
  object MDCTextFieldHelperTextFoundation extends js.Object {
    val cssClasses: atMaterialTextfieldLib.helperDashTextConstantsMod.cssClasses = js.native
    val defaultAdapter: atMaterialTextfieldLib.helperDashTextAdapterMod.MDCTextFieldHelperTextAdapter = js.native
    val strings: atMaterialTextfieldLib.helperDashTextConstantsMod.strings = js.native
  }
  
  /* static members */
  @js.native
  object MDCTextFieldIcon extends js.Object {
    def attachTo(root: stdLib.Element): atMaterialTextfieldLib.iconMod.MDCTextFieldIcon = js.native
  }
  
  /* static members */
  @js.native
  object MDCTextFieldIconFoundation extends js.Object {
    val defaultAdapter: atMaterialTextfieldLib.iconAdapterMod.MDCTextFieldIconAdapter = js.native
    val strings: atMaterialTextfieldLib.iconConstantsMod.strings = js.native
  }
  
}

