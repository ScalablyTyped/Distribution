package typings.atMaterialTextfield

import typings.atMaterialFloatingDashLabel.atMaterialFloatingDashLabelMod.MDCFloatingLabel
import typings.atMaterialLineDashRipple.atMaterialLineDashRippleMod.MDCLineRipple
import typings.atMaterialNotchedDashOutline.atMaterialNotchedDashOutlineMod.MDCNotchedOutline
import typings.atMaterialRipple.atMaterialRippleMod.MDCRipple
import typings.atMaterialRipple.atMaterialRippleMod.MDCRippleFoundation
import typings.atMaterialTextfield.adapterMod.FoundationMapType
import typings.atMaterialTextfield.adapterMod.MDCTextFieldAdapter
import typings.atMaterialTextfield.foundationMod.default
import typings.atMaterialTextfield.helperDashTextAdapterMod.MDCTextFieldHelperTextAdapter
import typings.atMaterialTextfield.iconAdapterMod.MDCTextFieldIconAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/textfield", JSImport.Namespace)
@js.native
object atMaterialTextfieldMod extends js.Object {
  @js.native
  class MDCTextField ()
    extends typings.atMaterialBase.componentMod.default[MDCTextFieldAdapter, default] {
    var disabled: Boolean = js.native
    var helperTextContent: String = js.native
    var max: String = js.native
    var maxLength: Double = js.native
    var min: String = js.native
    var minLength: Double = js.native
    var pattern: String = js.native
    var required: Boolean = js.native
    var step: String = js.native
    /**
      * Ideally we would use a 'writeonly' modifier here since this is a setter,
      * but such a thing does not exist.
      * https://github.com/Microsoft/TypeScript/issues/4839
      * https://github.com/Microsoft/TypeScript/issues/21759
      */
    var useNativeValidation: Boolean = js.native
    var valid: Boolean = js.native
    var value: String = js.native
    /**
      * Initiliazes the Text Field's internal state based on the environment's
      * state.
      */
    def initialSyncWithDom(): Unit = js.native
    def initialize(
      rippleFactory: js.UndefOr[js.Function2[/* el */ Element, /* foundation */ MDCRippleFoundation, MDCRipple]],
      lineRippleFactory: js.UndefOr[js.Function1[/* el */ Element, MDCLineRipple]],
      helperTextFactory: js.UndefOr[
          js.Function1[
            /* el */ Element, 
            typings.atMaterialTextfield.helperDashTextMod.MDCTextFieldHelperText
          ]
        ],
      iconFactory: js.UndefOr[
          js.Function1[/* el */ Element, typings.atMaterialTextfield.iconMod.MDCTextFieldIcon]
        ],
      labelFactory: js.UndefOr[js.Function1[/* el */ Element, MDCFloatingLabel]],
      outlineFactory: js.UndefOr[js.Function1[/* el */ Element, MDCNotchedOutline]]
    ): Unit = js.native
    /**
      * Recomputes the outline SVG path for the outline element.
      */
    def layout(): Unit = js.native
  }
  
  @js.native
  class MDCTextFieldFoundation protected () extends default {
    def this(adapter: MDCTextFieldAdapter) = this()
    def this(adapter: MDCTextFieldAdapter, foundationMap: FoundationMapType) = this()
  }
  
  @js.native
  class MDCTextFieldHelperText ()
    extends typings.atMaterialTextfield.helperDashTextMod.MDCTextFieldHelperText
  
  @js.native
  class MDCTextFieldHelperTextFoundation ()
    extends typings.atMaterialTextfield.helperDashTextMod.MDCTextFieldHelperTextFoundation
  
  @js.native
  class MDCTextFieldIcon ()
    extends typings.atMaterialTextfield.iconMod.MDCTextFieldIcon
  
  @js.native
  class MDCTextFieldIconFoundation ()
    extends typings.atMaterialTextfield.iconMod.MDCTextFieldIconFoundation
  
  /* static members */
  @js.native
  object MDCTextField extends js.Object {
    def attachTo(root: Element): MDCTextField = js.native
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

