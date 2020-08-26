package typings.materialSelect

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialSelect.adapterMod.MDCSelectAdapter
import typings.materialSelect.anon.ACTIVATED
import typings.materialSelect.anon.ARIACONTROLS
import typings.materialSelect.anon.LABELSCALE
import typings.materialSelect.anon.PartialMDCSelectAdapter
import typings.materialSelect.anon.PartialMDCSelectFoundatio
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/select/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  /**
    * @param adapter
    * @param foundationMap Map from subcomponent names to their subfoundations.
    */
  class MDCSelectFoundation () extends MDCFoundation[MDCSelectAdapter] {
    def this(adapter: PartialMDCSelectAdapter) = this()
    def this(adapter: js.UndefOr[scala.Nothing], foundationMap: PartialMDCSelectFoundatio) = this()
    def this(adapter: PartialMDCSelectAdapter, foundationMap: PartialMDCSelectFoundatio) = this()
    def getDisabled(): Boolean = js.native
    def getRequired(): Boolean = js.native
    /** Returns the index of the currently selected menu item, or -1 if none. */
    def getSelectedIndex(): Double = js.native
    def getValue(): String = js.native
    /**
      * Handles blur events from select element.
      */
    def handleBlur(): Unit = js.native
    /**
      * Handles value changes, via change event or programmatic updates.
      */
    def handleChange(): Unit = js.native
    def handleClick(normalizedX: Double): Unit = js.native
    /**
      * Handles focus events from select element.
      */
    def handleFocus(): Unit = js.native
    /**
      * Handles keydown events on select element. Depending on the type of
      * character typed, does typeahead matching or opens menu.
      */
    def handleKeydown(event: KeyboardEvent): Unit = js.native
    def handleMenuClosed(): Unit = js.native
    def handleMenuItemAction(index: Double): Unit = js.native
    def handleMenuOpened(): Unit = js.native
    def isValid(): Boolean = js.native
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
    /**
      * Opens/closes the notched outline.
      */
    def notchOutline(openNotch: Boolean): Unit = js.native
    /** Opens the menu. */
    def openMenu(): Unit = js.native
    def setDisabled(isDisabled: Boolean): Unit = js.native
    /**
      * @param content Sets the content of the helper text.
      */
    def setHelperTextContent(content: String): Unit = js.native
    /**
      * Sets the aria label of the leading icon.
      */
    def setLeadingIconAriaLabel(label: String): Unit = js.native
    /**
      * Sets the text content of the leading icon.
      */
    def setLeadingIconContent(content: String): Unit = js.native
    def setRequired(isRequired: Boolean): Unit = js.native
    def setSelectedIndex(index: Double): Unit = js.native
    def setSelectedIndex(index: Double, closeMenu: Boolean): Unit = js.native
    def setUseDefaultValidation(useDefaultValidation: Boolean): Unit = js.native
    def setValid(isValid: Boolean): Unit = js.native
    def setValue(value: String): Unit = js.native
  }
  
  @js.native
  /**
    * @param adapter
    * @param foundationMap Map from subcomponent names to their subfoundations.
    */
  class default () extends MDCSelectFoundation {
    def this(adapter: PartialMDCSelectAdapter) = this()
    def this(adapter: js.UndefOr[scala.Nothing], foundationMap: PartialMDCSelectFoundatio) = this()
    def this(adapter: PartialMDCSelectAdapter, foundationMap: PartialMDCSelectFoundatio) = this()
  }
  
  /* static members */
  @js.native
  object MDCSelectFoundation extends js.Object {
    def cssClasses: ACTIVATED = js.native
    /**
      * See {@link MDCSelectAdapter} for typing information on parameters and return types.
      */
    def defaultAdapter: MDCSelectAdapter = js.native
    def numbers: LABELSCALE = js.native
    def strings: ARIACONTROLS = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def cssClasses: ACTIVATED = js.native
    /**
      * See {@link MDCSelectAdapter} for typing information on parameters and return types.
      */
    def defaultAdapter: MDCSelectAdapter = js.native
    def numbers: LABELSCALE = js.native
    def strings: ARIACONTROLS = js.native
  }
  
}

