package typings.materialSelect

import typings.materialBase.componentMod.MDCComponent
import typings.materialFloatingLabel.componentMod.MDCFloatingLabelFactory
import typings.materialLineRipple.componentMod.MDCLineRippleFactory
import typings.materialMenu.componentMod.MDCMenuFactory
import typings.materialNotchedOutline.componentMod.MDCNotchedOutlineFactory
import typings.materialSelect.foundationMod.MDCSelectFoundation
import typings.materialSelect.helperTextComponentMod.MDCSelectHelperTextFactory
import typings.materialSelect.iconComponentMod.MDCSelectIconFactory
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/select/component", "MDCSelect")
  @js.native
  class MDCSelect protected () extends MDCComponent[MDCSelectFoundation] {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(root: Element, foundation: MDCSelectFoundation, args: js.Any*) = this()
    
    def disabled: Boolean = js.native
    def disabled_=(disabled: Boolean): Unit = js.native
    
    /**
      * Sets the text content of the helper text.
      */
    def helperTextContent_=(content: String): Unit = js.native
    
    def initialize(
      labelFactory: js.UndefOr[MDCFloatingLabelFactory],
      lineRippleFactory: js.UndefOr[MDCLineRippleFactory],
      outlineFactory: js.UndefOr[MDCNotchedOutlineFactory],
      menuFactory: js.UndefOr[MDCMenuFactory],
      iconFactory: js.UndefOr[MDCSelectIconFactory],
      helperTextFactory: js.UndefOr[MDCSelectHelperTextFactory]
    ): Unit = js.native
    
    /**
      * Re-calculates if the notched outline should be notched and if the label
      * should float.
      */
    def layout(): Unit = js.native
    
    /**
      * Synchronizes the list of options with the state of the foundation. Call
      * this whenever menu options are dynamically updated.
      */
    def layoutOptions(): Unit = js.native
    
    def leadingIconAriaLabel_=(label: String): Unit = js.native
    
    /**
      * Sets the text content of the leading icon.
      */
    def leadingIconContent_=(content: String): Unit = js.native
    
    /**
      * Returns whether the select is required.
      */
    def required: Boolean = js.native
    /**
      * Sets the control to the required state.
      */
    def required_=(isRequired: Boolean): Unit = js.native
    
    def selectedIndex: Double = js.native
    def selectedIndex_=(selectedIndex: Double): Unit = js.native
    
    /**
      * Enables or disables the default validation scheme where a required select
      * must be non-empty. Set to false for custom validation.
      * @param useDefaultValidation Set this to false to ignore default
      *     validation scheme.
      */
    def useDefaultValidation_=(useDefaultValidation: Boolean): Unit = js.native
    
    /**
      * Checks if the select is in a valid state.
      */
    def valid: Boolean = js.native
    /**
      * Sets the current invalid state of the select.
      */
    def valid_=(isValid: Boolean): Unit = js.native
    
    def value: String = js.native
    def value_=(value: String): Unit = js.native
  }
  /* static members */
  object MDCSelect {
    
    @JSImport("@material/select/component", "MDCSelect.attachTo")
    @js.native
    def attachTo(root: Element): MDCSelect = js.native
  }
}
