package typings.materialTextfield

import typings.materialBase.Element
import typings.materialBase.componentMod.MDCComponent
import typings.materialTextfield.iconFoundationMod.MDCTextFieldIconFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconComponentMod {
  
  @JSImport("@material/textfield/icon/component", "MDCTextFieldIcon")
  @js.native
  open class MDCTextFieldIcon protected () extends MDCComponent[MDCTextFieldIconFoundation] {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: MDCTextFieldIconFoundation, args: Any*) = this()
    
    def foundationForTextField: MDCTextFieldIconFoundation = js.native
  }
  /* static members */
  object MDCTextFieldIcon {
    
    @JSImport("@material/textfield/icon/component", "MDCTextFieldIcon")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): MDCTextFieldIcon = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCTextFieldIcon]
  }
  
  type MDCTextFieldIconFactory = js.Function2[
    /* el */ typings.std.Element, 
    /* foundation */ js.UndefOr[MDCTextFieldIconFoundation], 
    MDCTextFieldIcon
  ]
}
