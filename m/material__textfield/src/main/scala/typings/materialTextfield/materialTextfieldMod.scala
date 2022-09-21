package typings.materialTextfield

import typings.materialBase.Element
import typings.materialBase.componentMod.MDCComponent
import typings.materialFloatingLabel.componentMod.MDCFloatingLabelFactory
import typings.materialLineRipple.componentMod.MDCLineRippleFactory
import typings.materialNotchedOutline.componentMod.MDCNotchedOutlineFactory
import typings.materialRipple.componentMod.MDCRipple
import typings.materialRipple.componentMod.MDCRippleFactory
import typings.materialTextfield.componentMod.MDCTextFieldCharacterCounterFactory
import typings.materialTextfield.helperTextComponentMod.MDCTextFieldHelperTextFactory
import typings.materialTextfield.iconComponentMod.MDCTextFieldIconFactory
import typings.materialTextfield.materialTextfieldFoundationMod.MDCTextFieldFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialTextfieldMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.materialRipple.typesMod.MDCRippleCapableSurface because var conflicts: root. Inlined disabled, unbounded */ @JSImport("@material/textfield/component", "MDCTextField")
  @js.native
  open class MDCTextField protected () extends MDCComponent[MDCTextFieldFoundation] {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: MDCTextFieldFoundation, args: Any*) = this()
    
    /* private */ var characterCounter: Any = js.native
    
    /* private */ var createRipple: Any = js.native
    
    def disabled: Boolean = js.native
    /**
      * @param disabled Sets the Text Field disabled or enabled.
      */
    def disabled_=(disabled: Boolean): Unit = js.native
    @JSName("disabled")
    var disabled_FMDCTextField: js.UndefOr[Boolean] = js.native
    
    /**
      * Focuses the input element.
      */
    def focus(): Unit = js.native
    
    /**
      * @return A map of all subcomponents to subfoundations.
      */
    /* private */ var getFoundationMap: Any = js.native
    
    /* private */ var getInputAdapterMethods: Any = js.native
    
    /* private */ var getLabelAdapterMethods: Any = js.native
    
    /* private */ var getLineRippleAdapterMethods: Any = js.native
    
    /* private */ var getOutlineAdapterMethods: Any = js.native
    
    /* private */ var getRootAdapterMethods: Any = js.native
    
    /* private */ var helperText: Any = js.native
    
    /**
      * Sets the helper text element content.
      */
    def helperTextContent_=(content: String): Unit = js.native
    
    def initialize(
      rippleFactory: js.UndefOr[MDCRippleFactory],
      lineRippleFactory: js.UndefOr[MDCLineRippleFactory],
      helperTextFactory: js.UndefOr[MDCTextFieldHelperTextFactory],
      characterCounterFactory: js.UndefOr[MDCTextFieldCharacterCounterFactory],
      iconFactory: js.UndefOr[MDCTextFieldIconFactory],
      labelFactory: js.UndefOr[MDCFloatingLabelFactory],
      outlineFactory: js.UndefOr[MDCNotchedOutlineFactory]
    ): Unit = js.native
    
    /* private */ var input: Any = js.native
    
    /* private */ var label: Any = js.native
    
    /**
      * Recomputes the outline SVG path for the outline element.
      */
    def layout(): Unit = js.native
    
    /* private */ var leadingIcon: Any = js.native
    
    /**
      * Sets the aria label of the leading icon.
      */
    def leadingIconAriaLabel_=(label: String): Unit = js.native
    
    /**
      * Sets the text content of the leading icon.
      */
    def leadingIconContent_=(content: String): Unit = js.native
    
    /* private */ var lineRipple: Any = js.native
    
    def max: String = js.native
    
    def maxLength: Double = js.native
    /**
      * @param maxLength Sets the input element's maxLength.
      */
    def maxLength_=(maxLength: Double): Unit = js.native
    
    /**
      * @param max Sets the input element's max.
      */
    def max_=(max: String): Unit = js.native
    
    def min: String = js.native
    
    def minLength: Double = js.native
    /**
      * @param minLength Sets the input element's minLength.
      */
    def minLength_=(minLength: Double): Unit = js.native
    
    /**
      * @param min Sets the input element's min.
      */
    def min_=(min: String): Unit = js.native
    
    /* private */ var outline: Any = js.native
    
    def pattern: String = js.native
    /**
      * @param pattern Sets the input element's validation pattern.
      */
    def pattern_=(pattern: String): Unit = js.native
    
    /* private */ var prefix: Any = js.native
    
    /**
      * Gets the text content of the prefix, or null if it does not exist.
      */
    def prefixText: String | Null = js.native
    /**
      * Sets the text content of the prefix, if it exists.
      */
    def prefixText_=(prefixText: String | Null): Unit = js.native
    
    def required: Boolean = js.native
    /**
      * @param required Sets the Text Field to required.
      */
    def required_=(required: Boolean): Unit = js.native
    
    var ripple: MDCRipple | Null = js.native
    
    def step: String = js.native
    /**
      * @param step Sets the input element's step.
      */
    def step_=(step: String): Unit = js.native
    
    /* private */ var suffix: Any = js.native
    
    /**
      * Gets the text content of the suffix, or null if it does not exist.
      */
    def suffixText: String | Null = js.native
    /**
      * Sets the text content of the suffix, if it exists.
      */
    def suffixText_=(suffixText: String | Null): Unit = js.native
    
    /* private */ var trailingIcon: Any = js.native
    
    /**
      * Sets the aria label of the trailing icon.
      */
    def trailingIconAriaLabel_=(label: String): Unit = js.native
    
    /**
      * Sets the text content of the trailing icon.
      */
    def trailingIconContent_=(content: String): Unit = js.native
    
    var unbounded: js.UndefOr[Boolean] = js.native
    
    /**
      * Enables or disables the use of native validation. Use this for custom validation.
      * @param useNativeValidation Set this to false to ignore native input validation.
      */
    def useNativeValidation_=(useNativeValidation: Boolean): Unit = js.native
    
    def valid: Boolean = js.native
    /**
      * @param valid Sets the Text Field valid or invalid.
      */
    def valid_=(valid: Boolean): Unit = js.native
    
    def value: String = js.native
    /**
      * @param value The value to set on the input.
      */
    def value_=(value: String): Unit = js.native
  }
  /* static members */
  object MDCTextField {
    
    @JSImport("@material/textfield/component", "MDCTextField")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): MDCTextField = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCTextField]
  }
}
