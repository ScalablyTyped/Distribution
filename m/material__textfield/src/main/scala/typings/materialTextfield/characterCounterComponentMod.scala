package typings.materialTextfield

import typings.materialBase.Element
import typings.materialBase.componentMod.MDCComponent
import typings.materialTextfield.characterCounterFoundationMod.MDCTextFieldCharacterCounterFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object characterCounterComponentMod {
  
  @JSImport("@material/textfield/character-counter/component", "MDCTextFieldCharacterCounter")
  @js.native
  open class MDCTextFieldCharacterCounter protected () extends MDCComponent[MDCTextFieldCharacterCounterFoundation] {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: MDCTextFieldCharacterCounterFoundation, args: Any*) = this()
    
    def foundationForTextField: MDCTextFieldCharacterCounterFoundation = js.native
  }
  /* static members */
  object MDCTextFieldCharacterCounter {
    
    @JSImport("@material/textfield/character-counter/component", "MDCTextFieldCharacterCounter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): MDCTextFieldCharacterCounter = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCTextFieldCharacterCounter]
  }
  
  type MDCTextFieldCharacterCounterFactory = js.Function2[
    /* el */ typings.std.Element, 
    /* foundation */ js.UndefOr[MDCTextFieldCharacterCounterFoundation], 
    MDCTextFieldCharacterCounter
  ]
}
