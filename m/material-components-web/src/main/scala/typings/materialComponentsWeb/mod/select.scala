package typings.materialComponentsWeb.mod

import typings.materialBase.Element
import typings.materialSelect.anon.PartialMDCSelectAdapter
import typings.materialSelect.anon.PartialMDCSelectFoundatio
import typings.materialSelect.anon.PartialMDCSelectHelperTex
import typings.materialSelect.anon.PartialMDCSelectIconAdapt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object select {
  
  @JSImport("material-components-web", "select.default")
  @js.native
  open class default ()
    extends typings.materialSelect.mod.default {
    def this(adapter: PartialMDCSelectIconAdapt) = this()
  }
  
  @JSImport("material-components-web", "select.MDCSelect")
  @js.native
  open class MDCSelect protected ()
    extends typings.materialSelect.mod.MDCSelect {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: typings.materialSelect.foundationMod.MDCSelectFoundation, args: Any*) = this()
  }
  /* static members */
  object MDCSelect {
    
    @JSImport("material-components-web", "select.MDCSelect")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): typings.materialSelect.componentMod.MDCSelect = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialSelect.componentMod.MDCSelect]
  }
  
  @JSImport("material-components-web", "select.MDCSelectFoundation")
  @js.native
  /**
    * @param adapter
    * @param foundationMap Map from subcomponent names to their subfoundations.
    */
  open class MDCSelectFoundation ()
    extends typings.materialSelect.mod.MDCSelectFoundation {
    def this(adapter: PartialMDCSelectAdapter) = this()
    def this(adapter: Unit, foundationMap: PartialMDCSelectFoundatio) = this()
    def this(adapter: PartialMDCSelectAdapter, foundationMap: PartialMDCSelectFoundatio) = this()
  }
  
  @JSImport("material-components-web", "select.MDCSelectHelperText")
  @js.native
  open class MDCSelectHelperText protected ()
    extends typings.materialSelect.mod.MDCSelectHelperText {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialSelect.helperTextFoundationMod.MDCSelectHelperTextFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCSelectHelperText {
    
    @JSImport("material-components-web", "select.MDCSelectHelperText")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): typings.materialSelect.helperTextComponentMod.MDCSelectHelperText = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialSelect.helperTextComponentMod.MDCSelectHelperText]
  }
  
  @JSImport("material-components-web", "select.MDCSelectHelperTextFoundation")
  @js.native
  open class MDCSelectHelperTextFoundation ()
    extends typings.materialSelect.mod.MDCSelectHelperTextFoundation {
    def this(adapter: PartialMDCSelectHelperTex) = this()
  }
  
  @JSImport("material-components-web", "select.MDCSelectIcon")
  @js.native
  open class MDCSelectIcon protected ()
    extends typings.materialSelect.mod.MDCSelectIcon {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialSelect.iconFoundationMod.MDCSelectIconFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCSelectIcon {
    
    @JSImport("material-components-web", "select.MDCSelectIcon")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): typings.materialSelect.iconComponentMod.MDCSelectIcon = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialSelect.iconComponentMod.MDCSelectIcon]
  }
  
  @JSImport("material-components-web", "select.MDCSelectIconFoundation")
  @js.native
  open class MDCSelectIconFoundation ()
    extends typings.materialSelect.mod.MDCSelectIconFoundation {
    def this(adapter: PartialMDCSelectIconAdapt) = this()
  }
  
  object cssClasses {
    
    @JSImport("material-components-web", "select.cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "select.cssClasses.ACTIVATED")
    @js.native
    def ACTIVATED: String = js.native
    inline def ACTIVATED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACTIVATED")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "select.cssClasses.DISABLED")
    @js.native
    def DISABLED: String = js.native
    inline def DISABLED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DISABLED")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "select.cssClasses.FOCUSED")
    @js.native
    def FOCUSED: String = js.native
    inline def FOCUSED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOCUSED")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "select.cssClasses.INVALID")
    @js.native
    def INVALID: String = js.native
    inline def INVALID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "select.cssClasses.MENU_INVALID")
    @js.native
    def MENU_INVALID: String = js.native
    inline def MENU_INVALID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MENU_INVALID")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "select.cssClasses.OUTLINED")
    @js.native
    def OUTLINED: String = js.native
    inline def OUTLINED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OUTLINED")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "select.cssClasses.REQUIRED")
    @js.native
    def REQUIRED: String = js.native
    inline def REQUIRED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REQUIRED")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "select.cssClasses.ROOT")
    @js.native
    def ROOT: String = js.native
    inline def ROOT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "select.cssClasses.WITH_LEADING_ICON")
    @js.native
    def WITH_LEADING_ICON: String = js.native
    inline def WITH_LEADING_ICON_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WITH_LEADING_ICON")(x.asInstanceOf[js.Any])
  }
  
  object helperTextCssClasses {
    
    @JSImport("material-components-web", "select.helperTextCssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "select.helperTextCssClasses.HELPER_TEXT_VALIDATION_MSG")
    @js.native
    def HELPER_TEXT_VALIDATION_MSG: String = js.native
    inline def HELPER_TEXT_VALIDATION_MSG_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HELPER_TEXT_VALIDATION_MSG")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "select.helperTextCssClasses.HELPER_TEXT_VALIDATION_MSG_PERSISTENT")
    @js.native
    def HELPER_TEXT_VALIDATION_MSG_PERSISTENT: String = js.native
    inline def HELPER_TEXT_VALIDATION_MSG_PERSISTENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HELPER_TEXT_VALIDATION_MSG_PERSISTENT")(x.asInstanceOf[js.Any])
  }
  
  object helperTextStrings {
    
    @JSImport("material-components-web", "select.helperTextStrings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "select.helperTextStrings.ARIA_HIDDEN")
    @js.native
    def ARIA_HIDDEN: String = js.native
    inline def ARIA_HIDDEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_HIDDEN")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "select.helperTextStrings.ROLE")
    @js.native
    def ROLE: String = js.native
    inline def ROLE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROLE")(x.asInstanceOf[js.Any])
  }
  
  object iconStrings {
    
    @JSImport("material-components-web", "select.iconStrings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "select.iconStrings.ICON_EVENT")
    @js.native
    def ICON_EVENT: String = js.native
    inline def ICON_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ICON_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "select.iconStrings.ICON_ROLE")
    @js.native
    def ICON_ROLE: String = js.native
    inline def ICON_ROLE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ICON_ROLE")(x.asInstanceOf[js.Any])
  }
  
  object numbers {
    
    @JSImport("material-components-web", "select.numbers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "select.numbers.CLICK_DEBOUNCE_TIMEOUT_MS")
    @js.native
    def CLICK_DEBOUNCE_TIMEOUT_MS: Double = js.native
    inline def CLICK_DEBOUNCE_TIMEOUT_MS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLICK_DEBOUNCE_TIMEOUT_MS")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "select.numbers.LABEL_SCALE")
    @js.native
    def LABEL_SCALE: Double = js.native
    inline def LABEL_SCALE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LABEL_SCALE")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "select.numbers.UNSET_INDEX")
    @js.native
    def UNSET_INDEX: Double = js.native
    inline def UNSET_INDEX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNSET_INDEX")(x.asInstanceOf[js.Any])
  }
  
  object strings {
    
    @JSImport("material-components-web", "select.strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "select.strings.ARIA_CONTROLS")
    @js.native
    def ARIA_CONTROLS: String = js.native
    inline def ARIA_CONTROLS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_CONTROLS")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "select.strings.ARIA_DESCRIBEDBY")
    @js.native
    def ARIA_DESCRIBEDBY: String = js.native
    inline def ARIA_DESCRIBEDBY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_DESCRIBEDBY")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "select.strings.ARIA_SELECTED_ATTR")
    @js.native
    def ARIA_SELECTED_ATTR: String = js.native
    inline def ARIA_SELECTED_ATTR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_SELECTED_ATTR")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "select.strings.CHANGE_EVENT")
    @js.native
    def CHANGE_EVENT: String = js.native
    inline def CHANGE_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHANGE_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "select.strings.HIDDEN_INPUT_SELECTOR")
    @js.native
    def HIDDEN_INPUT_SELECTOR: String = js.native
    inline def HIDDEN_INPUT_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HIDDEN_INPUT_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "select.strings.LABEL_SELECTOR")
    @js.native
    def LABEL_SELECTOR: String = js.native
    inline def LABEL_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LABEL_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "select.strings.LEADING_ICON_SELECTOR")
    @js.native
    def LEADING_ICON_SELECTOR: String = js.native
    inline def LEADING_ICON_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEADING_ICON_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "select.strings.LINE_RIPPLE_SELECTOR")
    @js.native
    def LINE_RIPPLE_SELECTOR: String = js.native
    inline def LINE_RIPPLE_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINE_RIPPLE_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "select.strings.MENU_SELECTOR")
    @js.native
    def MENU_SELECTOR: String = js.native
    inline def MENU_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MENU_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "select.strings.OUTLINE_SELECTOR")
    @js.native
    def OUTLINE_SELECTOR: String = js.native
    inline def OUTLINE_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OUTLINE_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "select.strings.SELECTED_TEXT_SELECTOR")
    @js.native
    def SELECTED_TEXT_SELECTOR: String = js.native
    inline def SELECTED_TEXT_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SELECTED_TEXT_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "select.strings.SELECT_ANCHOR_SELECTOR")
    @js.native
    def SELECT_ANCHOR_SELECTOR: String = js.native
    inline def SELECT_ANCHOR_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SELECT_ANCHOR_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "select.strings.VALUE_ATTR")
    @js.native
    def VALUE_ATTR: String = js.native
    inline def VALUE_ATTR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VALUE_ATTR")(x.asInstanceOf[js.Any])
  }
}
