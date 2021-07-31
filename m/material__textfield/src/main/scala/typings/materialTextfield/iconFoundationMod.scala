package typings.materialTextfield

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialTextfield.anon.PartialMDCTextFieldIconAd
import typings.materialTextfield.iconAdapterMod.MDCTextFieldIconAdapter
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconFoundationMod {
  
  @JSImport("@material/textfield/icon/foundation", JSImport.Default)
  @js.native
  class default () extends MDCTextFieldIconFoundation {
    def this(adapter: PartialMDCTextFieldIconAd) = this()
  }
  
  @JSImport("@material/textfield/icon/foundation", "MDCTextFieldIconFoundation")
  @js.native
  class MDCTextFieldIconFoundation () extends MDCFoundation[MDCTextFieldIconAdapter] {
    def this(adapter: PartialMDCTextFieldIconAd) = this()
    
    def handleInteraction(evt: KeyboardEvent): Unit = js.native
    def handleInteraction(evt: MouseEvent): Unit = js.native
    
    def setAriaLabel(label: String): Unit = js.native
    
    def setContent(content: String): Unit = js.native
    
    def setDisabled(disabled: Boolean): Unit = js.native
  }
}
