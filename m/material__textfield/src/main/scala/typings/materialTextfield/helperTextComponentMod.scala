package typings.materialTextfield

import typings.materialBase.Element
import typings.materialBase.componentMod.MDCComponent
import typings.materialTextfield.helperTextFoundationMod.MDCTextFieldHelperTextFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helperTextComponentMod {
  
  @JSImport("@material/textfield/helper-text/component", "MDCTextFieldHelperText")
  @js.native
  open class MDCTextFieldHelperText protected () extends MDCComponent[MDCTextFieldHelperTextFoundation] {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: MDCTextFieldHelperTextFoundation, args: Any*) = this()
    
    def foundationForTextField: MDCTextFieldHelperTextFoundation = js.native
  }
  /* static members */
  object MDCTextFieldHelperText {
    
    @JSImport("@material/textfield/helper-text/component", "MDCTextFieldHelperText")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): MDCTextFieldHelperText = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCTextFieldHelperText]
  }
  
  type MDCTextFieldHelperTextFactory = js.Function2[
    /* el */ typings.std.Element, 
    /* foundation */ js.UndefOr[MDCTextFieldHelperTextFoundation], 
    MDCTextFieldHelperText
  ]
}
