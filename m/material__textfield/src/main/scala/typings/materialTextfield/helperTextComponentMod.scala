package typings.materialTextfield

import typings.materialBase.componentMod.MDCComponent
import typings.materialTextfield.helperTextFoundationMod.MDCTextFieldHelperTextFoundation
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helperTextComponentMod {
  
  @JSImport("@material/textfield/helper-text/component", "MDCTextFieldHelperText")
  @js.native
  class MDCTextFieldHelperText protected () extends MDCComponent[MDCTextFieldHelperTextFoundation] {
    def this(root: Element, foundation: Unit, args: js.Any*) = this()
    def this(root: Element, foundation: MDCTextFieldHelperTextFoundation, args: js.Any*) = this()
    
    def foundationForTextField: MDCTextFieldHelperTextFoundation = js.native
  }
  /* static members */
  object MDCTextFieldHelperText {
    
    @JSImport("@material/textfield/helper-text/component", "MDCTextFieldHelperText")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def attachTo(root: Element): MDCTextFieldHelperText = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCTextFieldHelperText]
  }
  
  type MDCTextFieldHelperTextFactory = js.Function2[
    /* el */ Element, 
    /* foundation */ js.UndefOr[MDCTextFieldHelperTextFoundation], 
    MDCTextFieldHelperText
  ]
}
