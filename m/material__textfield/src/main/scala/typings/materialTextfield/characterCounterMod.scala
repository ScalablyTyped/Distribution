package typings.materialTextfield

import typings.materialBase.Element
import typings.materialTextfield.anon.PartialMDCTextFieldCharac
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object characterCounterMod {
  
  @JSImport("@material/textfield/character-counter", JSImport.Default)
  @js.native
  open class default ()
    extends typings.materialTextfield.characterCounterFoundationMod.default {
    def this(adapter: PartialMDCTextFieldCharac) = this()
  }
  
  @JSImport("@material/textfield/character-counter", "MDCTextFieldCharacterCounter")
  @js.native
  open class MDCTextFieldCharacterCounter protected ()
    extends typings.materialTextfield.characterCounterComponentMod.MDCTextFieldCharacterCounter {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialTextfield.characterCounterFoundationMod.MDCTextFieldCharacterCounterFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCTextFieldCharacterCounter {
    
    @JSImport("@material/textfield/character-counter", "MDCTextFieldCharacterCounter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: typings.std.Element): typings.materialTextfield.characterCounterComponentMod.MDCTextFieldCharacterCounter = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialTextfield.characterCounterComponentMod.MDCTextFieldCharacterCounter]
  }
  
  @JSImport("@material/textfield/character-counter", "MDCTextFieldCharacterCounterFoundation")
  @js.native
  open class MDCTextFieldCharacterCounterFoundation ()
    extends typings.materialTextfield.characterCounterFoundationMod.MDCTextFieldCharacterCounterFoundation {
    def this(adapter: PartialMDCTextFieldCharac) = this()
  }
  
  object characterCountCssClasses {
    
    @JSImport("@material/textfield/character-counter", "characterCountCssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/textfield/character-counter", "characterCountCssClasses.ROOT")
    @js.native
    def ROOT: String = js.native
    inline def ROOT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(x.asInstanceOf[js.Any])
  }
  
  object characterCountStrings {
    
    @JSImport("@material/textfield/character-counter", "characterCountStrings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/textfield/character-counter", "characterCountStrings.ROOT_SELECTOR")
    @js.native
    def ROOT_SELECTOR: String = js.native
    inline def ROOT_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT_SELECTOR")(x.asInstanceOf[js.Any])
  }
}
