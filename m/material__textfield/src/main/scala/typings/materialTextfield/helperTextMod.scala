package typings.materialTextfield

import typings.materialBase.Element
import typings.materialTextfield.anon.PartialMDCTextFieldHelper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helperTextMod {
  
  @JSImport("@material/textfield/helper-text", JSImport.Default)
  @js.native
  open class default ()
    extends typings.materialTextfield.helperTextFoundationMod.default {
    def this(adapter: PartialMDCTextFieldHelper) = this()
  }
  
  @JSImport("@material/textfield/helper-text", "MDCTextFieldHelperText")
  @js.native
  open class MDCTextFieldHelperText protected ()
    extends typings.materialTextfield.helperTextComponentMod.MDCTextFieldHelperText {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialTextfield.helperTextFoundationMod.MDCTextFieldHelperTextFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCTextFieldHelperText {
    
    @JSImport("@material/textfield/helper-text", "MDCTextFieldHelperText")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): typings.materialTextfield.helperTextComponentMod.MDCTextFieldHelperText = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialTextfield.helperTextComponentMod.MDCTextFieldHelperText]
  }
  
  @JSImport("@material/textfield/helper-text", "MDCTextFieldHelperTextFoundation")
  @js.native
  open class MDCTextFieldHelperTextFoundation ()
    extends typings.materialTextfield.helperTextFoundationMod.MDCTextFieldHelperTextFoundation {
    def this(adapter: PartialMDCTextFieldHelper) = this()
  }
  
  object helperTextCssClasses {
    
    @JSImport("@material/textfield/helper-text", "helperTextCssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/textfield/helper-text", "helperTextCssClasses.HELPER_TEXT_PERSISTENT")
    @js.native
    def HELPER_TEXT_PERSISTENT: String = js.native
    inline def HELPER_TEXT_PERSISTENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HELPER_TEXT_PERSISTENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/textfield/helper-text", "helperTextCssClasses.HELPER_TEXT_VALIDATION_MSG")
    @js.native
    def HELPER_TEXT_VALIDATION_MSG: String = js.native
    inline def HELPER_TEXT_VALIDATION_MSG_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HELPER_TEXT_VALIDATION_MSG")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/textfield/helper-text", "helperTextCssClasses.ROOT")
    @js.native
    def ROOT: String = js.native
    inline def ROOT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(x.asInstanceOf[js.Any])
  }
  
  object helperTextStrings {
    
    @JSImport("@material/textfield/helper-text", "helperTextStrings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/textfield/helper-text", "helperTextStrings.ARIA_HIDDEN")
    @js.native
    def ARIA_HIDDEN: String = js.native
    inline def ARIA_HIDDEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_HIDDEN")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/textfield/helper-text", "helperTextStrings.ROLE")
    @js.native
    def ROLE: String = js.native
    inline def ROLE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROLE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/textfield/helper-text", "helperTextStrings.ROOT_SELECTOR")
    @js.native
    def ROOT_SELECTOR: String = js.native
    inline def ROOT_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT_SELECTOR")(x.asInstanceOf[js.Any])
  }
}
