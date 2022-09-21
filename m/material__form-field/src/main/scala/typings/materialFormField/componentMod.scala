package typings.materialFormField

import typings.materialBase.Element
import typings.materialBase.componentMod.MDCComponent
import typings.materialFormField.foundationMod.MDCFormFieldFoundation
import typings.materialRipple.componentMod.MDCRipple
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/form-field/component", "MDCFormField")
  @js.native
  open class MDCFormField protected () extends MDCComponent[MDCFormFieldFoundation] {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: MDCFormFieldFoundation, args: Any*) = this()
    
    var input: js.UndefOr[MDCFormFieldInput] = js.native
    
    /* private */ var labelEl: Any = js.native
  }
  /* static members */
  object MDCFormField {
    
    @JSImport("@material/form-field/component", "MDCFormField")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: HTMLElement): MDCFormField = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCFormField]
  }
  
  trait MDCFormFieldInput extends StObject {
    
    val ripple: js.UndefOr[MDCRipple] = js.undefined
  }
  object MDCFormFieldInput {
    
    inline def apply(): MDCFormFieldInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MDCFormFieldInput]
    }
    
    extension [Self <: MDCFormFieldInput](x: Self) {
      
      inline def setRipple(value: MDCRipple): Self = StObject.set(x, "ripple", value.asInstanceOf[js.Any])
      
      inline def setRippleUndefined: Self = StObject.set(x, "ripple", js.undefined)
    }
  }
}
