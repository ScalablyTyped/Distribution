package typings.materialSelect

import typings.materialBase.Element
import typings.materialBase.componentMod.MDCComponent
import typings.materialFloatingLabel.componentMod.MDCFloatingLabelFactory
import typings.materialLineRipple.componentMod.MDCLineRippleFactory
import typings.materialMenu.componentMod.MDCMenuFactory
import typings.materialNotchedOutline.componentMod.MDCNotchedOutlineFactory
import typings.materialSelect.foundationMod.MDCSelectFoundation
import typings.materialSelect.helperTextComponentMod.MDCSelectHelperTextFactory
import typings.materialSelect.iconComponentMod.MDCSelectIconFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/select/component", "MDCSelect")
  @js.native
  open class MDCSelect protected () extends MDCComponent[MDCSelectFoundation] {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: MDCSelectFoundation, args: Any*) = this()
    
    /* private */ var createRipple: Any = js.native
    
    def disabled: Boolean = js.native
    def disabled_=(disabled: Boolean): Unit = js.native
    
    /* private */ var getCommonAdapterMethods: Any = js.native
    
    /**
      * Returns a map of all subcomponents to subfoundations.
      */
    /* private */ var getFoundationMap: Any = js.native
    
    /* private */ var getLabelAdapterMethods: Any = js.native
    
    /**
      * Calculates where the line ripple should start based on the x coordinate within the component.
      */
    /* private */ var getNormalizedXCoordinate: Any = js.native
    
    /* private */ var getOutlineAdapterMethods: Any = js.native
    
    /* private */ var getSelectAdapterMethods: Any = js.native
    
    /* private */ var handleBlur: Any = js.native
    
    /* private */ var handleClick: Any = js.native
    
    /* private */ var handleFocus: Any = js.native
    
    /* private */ var handleKeydown: Any = js.native
    
    /* private */ var handleMenuClosed: Any = js.native
    
    /* private */ var handleMenuClosing: Any = js.native
    
    /* private */ var handleMenuItemAction: Any = js.native
    
    /* private */ var handleMenuOpened: Any = js.native
    
    /* private */ var helperText: Any = js.native
    
    /**
      * Sets the text content of the helper text.
      */
    def helperTextContent_=(content: String): Unit = js.native
    
    /* private */ var hiddenInput: Any = js.native
    
    def initialize(
      labelFactory: js.UndefOr[MDCFloatingLabelFactory],
      lineRippleFactory: js.UndefOr[MDCLineRippleFactory],
      outlineFactory: js.UndefOr[MDCNotchedOutlineFactory],
      menuFactory: js.UndefOr[MDCMenuFactory],
      iconFactory: js.UndefOr[MDCSelectIconFactory],
      helperTextFactory: js.UndefOr[MDCSelectHelperTextFactory]
    ): Unit = js.native
    
    /* private */ var isTouchEvent: Any = js.native
    
    /* private */ var label: Any = js.native
    
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
    
    /* private */ var leadingIcon: Any = js.native
    
    def leadingIconAriaLabel_=(label: String): Unit = js.native
    
    /**
      * Sets the text content of the leading icon.
      */
    def leadingIconContent_=(content: String): Unit = js.native
    
    /* private */ var lineRipple: Any = js.native
    
    /* private */ var menu: Any = js.native
    
    /* private */ var menuElement: Any = js.native
    
    /* private */ var menuItemValues: Any = js.native
    
    /**
      * Handles setup for the menu.
      */
    /* private */ var menuSetup: Any = js.native
    
    /* private */ var outline: Any = js.native
    
    /**
      * Returns whether the select is required.
      */
    def required: Boolean = js.native
    /**
      * Sets the control to the required state.
      */
    def required_=(isRequired: Boolean): Unit = js.native
    
    /* private */ var ripple: Any = js.native
    
    /* private */ var selectAnchor: Any = js.native
    
    def selectedIndex: Double = js.native
    def selectedIndex_=(selectedIndex: Double): Unit = js.native
    
    /* private */ var selectedText: Any = js.native
    
    def setSelectedIndex(selectedIndex: Double): Unit = js.native
    def setSelectedIndex(selectedIndex: Double, skipNotify: Boolean): Unit = js.native
    
    def setValue(value: String): Unit = js.native
    def setValue(value: String, skipNotify: Boolean): Unit = js.native
    
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
    
    @JSImport("@material/select/component", "MDCSelect")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): MDCSelect = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCSelect]
  }
}
