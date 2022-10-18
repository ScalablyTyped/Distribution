package typings.materialComponentsWeb.mod

import typings.materialBase.Element
import typings.materialTextfield.anon.PartialMDCTextFieldAdapte
import typings.materialTextfield.anon.PartialMDCTextFieldCharac
import typings.materialTextfield.anon.PartialMDCTextFieldFounda
import typings.materialTextfield.anon.PartialMDCTextFieldHelper
import typings.materialTextfield.anon.PartialMDCTextFieldIconAd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textField {
  
  @JSImport("material-components-web", "textField.default")
  @js.native
  open class default ()
    extends typings.materialTextfield.mod.default {
    def this(adapter: PartialMDCTextFieldIconAd) = this()
  }
  
  /**
    * Label should always float for these types as they show some UI even if value
    * is empty.
    */
  @JSImport("material-components-web", "textField.ALWAYS_FLOAT_TYPES")
  @js.native
  val ALWAYS_FLOAT_TYPES: js.Array[String] = js.native
  
  @JSImport("material-components-web", "textField.MDCTextField")
  @js.native
  open class MDCTextField protected ()
    extends typings.materialTextfield.mod.MDCTextField {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialTextfield.foundationMod.MDCTextFieldFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCTextField {
    
    @JSImport("material-components-web", "textField.MDCTextField")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): typings.materialTextfield.componentMod.MDCTextField = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialTextfield.componentMod.MDCTextField]
  }
  
  @JSImport("material-components-web", "textField.MDCTextFieldCharacterCounter")
  @js.native
  open class MDCTextFieldCharacterCounter protected ()
    extends typings.materialTextfield.mod.MDCTextFieldCharacterCounter {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialTextfield.characterCounterFoundationMod.MDCTextFieldCharacterCounterFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCTextFieldCharacterCounter {
    
    @JSImport("material-components-web", "textField.MDCTextFieldCharacterCounter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): typings.materialTextfield.characterCounterComponentMod.MDCTextFieldCharacterCounter = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialTextfield.characterCounterComponentMod.MDCTextFieldCharacterCounter]
  }
  
  @JSImport("material-components-web", "textField.MDCTextFieldCharacterCounterFoundation")
  @js.native
  open class MDCTextFieldCharacterCounterFoundation ()
    extends typings.materialTextfield.mod.MDCTextFieldCharacterCounterFoundation {
    def this(adapter: PartialMDCTextFieldCharac) = this()
  }
  
  @JSImport("material-components-web", "textField.MDCTextFieldFoundation")
  @js.native
  /**
    * @param adapter
    * @param foundationMap Map from subcomponent names to their subfoundations.
    */
  open class MDCTextFieldFoundation ()
    extends typings.materialTextfield.mod.MDCTextFieldFoundation {
    def this(adapter: PartialMDCTextFieldAdapte) = this()
    def this(adapter: Unit, foundationMap: PartialMDCTextFieldFounda) = this()
    def this(adapter: PartialMDCTextFieldAdapte, foundationMap: PartialMDCTextFieldFounda) = this()
  }
  
  @JSImport("material-components-web", "textField.MDCTextFieldHelperText")
  @js.native
  open class MDCTextFieldHelperText protected ()
    extends typings.materialTextfield.mod.MDCTextFieldHelperText {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialTextfield.helperTextFoundationMod.MDCTextFieldHelperTextFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCTextFieldHelperText {
    
    @JSImport("material-components-web", "textField.MDCTextFieldHelperText")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): typings.materialTextfield.helperTextComponentMod.MDCTextFieldHelperText = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialTextfield.helperTextComponentMod.MDCTextFieldHelperText]
  }
  
  @JSImport("material-components-web", "textField.MDCTextFieldHelperTextFoundation")
  @js.native
  open class MDCTextFieldHelperTextFoundation ()
    extends typings.materialTextfield.mod.MDCTextFieldHelperTextFoundation {
    def this(adapter: PartialMDCTextFieldHelper) = this()
  }
  
  @JSImport("material-components-web", "textField.MDCTextFieldIcon")
  @js.native
  open class MDCTextFieldIcon protected ()
    extends typings.materialTextfield.mod.MDCTextFieldIcon {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialTextfield.iconFoundationMod.MDCTextFieldIconFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCTextFieldIcon {
    
    @JSImport("material-components-web", "textField.MDCTextFieldIcon")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): typings.materialTextfield.iconComponentMod.MDCTextFieldIcon = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialTextfield.iconComponentMod.MDCTextFieldIcon]
  }
  
  @JSImport("material-components-web", "textField.MDCTextFieldIconFoundation")
  @js.native
  open class MDCTextFieldIconFoundation ()
    extends typings.materialTextfield.mod.MDCTextFieldIconFoundation {
    def this(adapter: PartialMDCTextFieldIconAd) = this()
  }
  
  /**
    * Whitelist based off of
    * https://developer.mozilla.org/en-US/docs/Web/Guide/HTML/HTML5/Constraint_validation
    * under the "Validation-related attributes" section.
    */
  @JSImport("material-components-web", "textField.VALIDATION_ATTR_WHITELIST")
  @js.native
  val VALIDATION_ATTR_WHITELIST: js.Array[String] = js.native
  
  object characterCountCssClasses {
    
    @JSImport("material-components-web", "textField.characterCountCssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "textField.characterCountCssClasses.ROOT")
    @js.native
    def ROOT: String = js.native
    inline def ROOT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(x.asInstanceOf[js.Any])
  }
  
  object characterCountStrings {
    
    @JSImport("material-components-web", "textField.characterCountStrings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "textField.characterCountStrings.ROOT_SELECTOR")
    @js.native
    def ROOT_SELECTOR: String = js.native
    inline def ROOT_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT_SELECTOR")(x.asInstanceOf[js.Any])
  }
  
  object cssClasses {
    
    @JSImport("material-components-web", "textField.cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "textField.cssClasses.DISABLED")
    @js.native
    def DISABLED: String = js.native
    inline def DISABLED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DISABLED")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "textField.cssClasses.FOCUSED")
    @js.native
    def FOCUSED: String = js.native
    inline def FOCUSED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOCUSED")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "textField.cssClasses.HELPER_LINE")
    @js.native
    def HELPER_LINE: String = js.native
    inline def HELPER_LINE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HELPER_LINE")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "textField.cssClasses.INVALID")
    @js.native
    def INVALID: String = js.native
    inline def INVALID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "textField.cssClasses.LABEL_FLOATING")
    @js.native
    def LABEL_FLOATING: String = js.native
    inline def LABEL_FLOATING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LABEL_FLOATING")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "textField.cssClasses.NO_LABEL")
    @js.native
    def NO_LABEL: String = js.native
    inline def NO_LABEL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_LABEL")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "textField.cssClasses.OUTLINED")
    @js.native
    def OUTLINED: String = js.native
    inline def OUTLINED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OUTLINED")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "textField.cssClasses.ROOT")
    @js.native
    def ROOT: String = js.native
    inline def ROOT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "textField.cssClasses.TEXTAREA")
    @js.native
    def TEXTAREA: String = js.native
    inline def TEXTAREA_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXTAREA")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "textField.cssClasses.WITH_INTERNAL_COUNTER")
    @js.native
    def WITH_INTERNAL_COUNTER: String = js.native
    inline def WITH_INTERNAL_COUNTER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WITH_INTERNAL_COUNTER")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "textField.cssClasses.WITH_LEADING_ICON")
    @js.native
    def WITH_LEADING_ICON: String = js.native
    inline def WITH_LEADING_ICON_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WITH_LEADING_ICON")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "textField.cssClasses.WITH_TRAILING_ICON")
    @js.native
    def WITH_TRAILING_ICON: String = js.native
    inline def WITH_TRAILING_ICON_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WITH_TRAILING_ICON")(x.asInstanceOf[js.Any])
  }
  
  object helperTextCssClasses {
    
    @JSImport("material-components-web", "textField.helperTextCssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "textField.helperTextCssClasses.HELPER_TEXT_PERSISTENT")
    @js.native
    def HELPER_TEXT_PERSISTENT: String = js.native
    inline def HELPER_TEXT_PERSISTENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HELPER_TEXT_PERSISTENT")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "textField.helperTextCssClasses.HELPER_TEXT_VALIDATION_MSG")
    @js.native
    def HELPER_TEXT_VALIDATION_MSG: String = js.native
    inline def HELPER_TEXT_VALIDATION_MSG_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HELPER_TEXT_VALIDATION_MSG")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "textField.helperTextCssClasses.ROOT")
    @js.native
    def ROOT: String = js.native
    inline def ROOT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(x.asInstanceOf[js.Any])
  }
  
  object helperTextStrings {
    
    @JSImport("material-components-web", "textField.helperTextStrings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "textField.helperTextStrings.ARIA_HIDDEN")
    @js.native
    def ARIA_HIDDEN: String = js.native
    inline def ARIA_HIDDEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_HIDDEN")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "textField.helperTextStrings.ROLE")
    @js.native
    def ROLE: String = js.native
    inline def ROLE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROLE")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "textField.helperTextStrings.ROOT_SELECTOR")
    @js.native
    def ROOT_SELECTOR: String = js.native
    inline def ROOT_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT_SELECTOR")(x.asInstanceOf[js.Any])
  }
  
  object iconCssClasses {
    
    @JSImport("material-components-web", "textField.iconCssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "textField.iconCssClasses.ROOT")
    @js.native
    def ROOT: String = js.native
    inline def ROOT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(x.asInstanceOf[js.Any])
  }
  
  object iconStrings {
    
    @JSImport("material-components-web", "textField.iconStrings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "textField.iconStrings.ICON_EVENT")
    @js.native
    def ICON_EVENT: String = js.native
    inline def ICON_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ICON_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "textField.iconStrings.ICON_ROLE")
    @js.native
    def ICON_ROLE: String = js.native
    inline def ICON_ROLE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ICON_ROLE")(x.asInstanceOf[js.Any])
  }
  
  object numbers {
    
    @JSImport("material-components-web", "textField.numbers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "textField.numbers.LABEL_SCALE")
    @js.native
    def LABEL_SCALE: Double = js.native
    inline def LABEL_SCALE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LABEL_SCALE")(x.asInstanceOf[js.Any])
  }
  
  object strings {
    
    @JSImport("material-components-web", "textField.strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "textField.strings.ARIA_CONTROLS")
    @js.native
    def ARIA_CONTROLS: String = js.native
    inline def ARIA_CONTROLS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_CONTROLS")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "textField.strings.ARIA_DESCRIBEDBY")
    @js.native
    def ARIA_DESCRIBEDBY: String = js.native
    inline def ARIA_DESCRIBEDBY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_DESCRIBEDBY")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "textField.strings.INPUT_SELECTOR")
    @js.native
    def INPUT_SELECTOR: String = js.native
    inline def INPUT_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INPUT_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "textField.strings.LABEL_SELECTOR")
    @js.native
    def LABEL_SELECTOR: String = js.native
    inline def LABEL_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LABEL_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "textField.strings.LEADING_ICON_SELECTOR")
    @js.native
    def LEADING_ICON_SELECTOR: String = js.native
    inline def LEADING_ICON_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEADING_ICON_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "textField.strings.LINE_RIPPLE_SELECTOR")
    @js.native
    def LINE_RIPPLE_SELECTOR: String = js.native
    inline def LINE_RIPPLE_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINE_RIPPLE_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "textField.strings.OUTLINE_SELECTOR")
    @js.native
    def OUTLINE_SELECTOR: String = js.native
    inline def OUTLINE_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OUTLINE_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "textField.strings.PREFIX_SELECTOR")
    @js.native
    def PREFIX_SELECTOR: String = js.native
    inline def PREFIX_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PREFIX_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "textField.strings.SUFFIX_SELECTOR")
    @js.native
    def SUFFIX_SELECTOR: String = js.native
    inline def SUFFIX_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUFFIX_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "textField.strings.TRAILING_ICON_SELECTOR")
    @js.native
    def TRAILING_ICON_SELECTOR: String = js.native
    inline def TRAILING_ICON_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRAILING_ICON_SELECTOR")(x.asInstanceOf[js.Any])
  }
}
