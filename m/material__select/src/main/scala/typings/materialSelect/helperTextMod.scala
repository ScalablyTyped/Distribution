package typings.materialSelect

import typings.materialBase.Element
import typings.materialSelect.anon.PartialMDCSelectHelperTex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helperTextMod {
  
  @JSImport("@material/select/helper-text", "MDCSelectHelperText")
  @js.native
  open class MDCSelectHelperText protected ()
    extends typings.materialSelect.helperTextComponentMod.MDCSelectHelperText {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialSelect.helperTextFoundationMod.MDCSelectHelperTextFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCSelectHelperText {
    
    @JSImport("@material/select/helper-text", "MDCSelectHelperText")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): typings.materialSelect.helperTextComponentMod.MDCSelectHelperText = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialSelect.helperTextComponentMod.MDCSelectHelperText]
  }
  
  @JSImport("@material/select/helper-text", "MDCSelectHelperTextFoundation")
  @js.native
  open class MDCSelectHelperTextFoundation ()
    extends typings.materialSelect.helperTextFoundationMod.MDCSelectHelperTextFoundation {
    def this(adapter: PartialMDCSelectHelperTex) = this()
  }
  
  object helperTextCssClasses {
    
    @JSImport("@material/select/helper-text", "helperTextCssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/select/helper-text", "helperTextCssClasses.HELPER_TEXT_VALIDATION_MSG")
    @js.native
    def HELPER_TEXT_VALIDATION_MSG: String = js.native
    inline def HELPER_TEXT_VALIDATION_MSG_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HELPER_TEXT_VALIDATION_MSG")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/select/helper-text", "helperTextCssClasses.HELPER_TEXT_VALIDATION_MSG_PERSISTENT")
    @js.native
    def HELPER_TEXT_VALIDATION_MSG_PERSISTENT: String = js.native
    inline def HELPER_TEXT_VALIDATION_MSG_PERSISTENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HELPER_TEXT_VALIDATION_MSG_PERSISTENT")(x.asInstanceOf[js.Any])
  }
  
  object helperTextStrings {
    
    @JSImport("@material/select/helper-text", "helperTextStrings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/select/helper-text", "helperTextStrings.ARIA_HIDDEN")
    @js.native
    def ARIA_HIDDEN: String = js.native
    inline def ARIA_HIDDEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_HIDDEN")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/select/helper-text", "helperTextStrings.ROLE")
    @js.native
    def ROLE: String = js.native
    inline def ROLE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROLE")(x.asInstanceOf[js.Any])
  }
}
