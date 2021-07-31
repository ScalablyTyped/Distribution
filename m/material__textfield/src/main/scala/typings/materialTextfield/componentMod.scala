package typings.materialTextfield

import typings.materialBase.componentMod.MDCComponent
import typings.materialTextfield.foundationMod.MDCTextFieldCharacterCounterFoundation
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/textfield/character-counter/component", "MDCTextFieldCharacterCounter")
  @js.native
  class MDCTextFieldCharacterCounter protected () extends MDCComponent[MDCTextFieldCharacterCounterFoundation] {
    def this(root: Element, foundation: Unit, args: js.Any*) = this()
    def this(root: Element, foundation: MDCTextFieldCharacterCounterFoundation, args: js.Any*) = this()
    
    def foundationForTextField: MDCTextFieldCharacterCounterFoundation = js.native
  }
  /* static members */
  object MDCTextFieldCharacterCounter {
    
    @JSImport("@material/textfield/character-counter/component", "MDCTextFieldCharacterCounter")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def attachTo(root: Element): MDCTextFieldCharacterCounter = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCTextFieldCharacterCounter]
  }
  
  type MDCTextFieldCharacterCounterFactory = js.Function2[
    /* el */ Element, 
    /* foundation */ js.UndefOr[MDCTextFieldCharacterCounterFoundation], 
    MDCTextFieldCharacterCounter
  ]
}
