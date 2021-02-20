package typings.materialTextfield

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialTextfield.anon.PartialMDCTextFieldCharac
import typings.materialTextfield.characterCounterAdapterMod.MDCTextFieldCharacterCounterAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/textfield/character-counter/foundation", JSImport.Default)
  @js.native
  class default () extends MDCTextFieldCharacterCounterFoundation {
    def this(adapter: PartialMDCTextFieldCharac) = this()
  }
  
  @JSImport("@material/textfield/character-counter/foundation", "MDCTextFieldCharacterCounterFoundation")
  @js.native
  class MDCTextFieldCharacterCounterFoundation () extends MDCFoundation[MDCTextFieldCharacterCounterAdapter] {
    def this(adapter: PartialMDCTextFieldCharac) = this()
    
    def setCounterValue(currentLength: Double, maxLength: Double): Unit = js.native
  }
}
