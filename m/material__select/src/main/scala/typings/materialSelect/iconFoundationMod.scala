package typings.materialSelect

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialSelect.anon.PartialMDCSelectIconAdapt
import typings.materialSelect.iconAdapterMod.MDCSelectIconAdapter
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconFoundationMod {
  
  @JSImport("@material/select/icon/foundation", JSImport.Default)
  @js.native
  class default () extends MDCSelectIconFoundation {
    def this(adapter: PartialMDCSelectIconAdapt) = this()
  }
  
  @JSImport("@material/select/icon/foundation", "MDCSelectIconFoundation")
  @js.native
  class MDCSelectIconFoundation () extends MDCFoundation[MDCSelectIconAdapter] {
    def this(adapter: PartialMDCSelectIconAdapt) = this()
    
    def handleInteraction(evt: KeyboardEvent): Unit = js.native
    def handleInteraction(evt: MouseEvent): Unit = js.native
    
    def setAriaLabel(label: String): Unit = js.native
    
    def setContent(content: String): Unit = js.native
    
    def setDisabled(disabled: Boolean): Unit = js.native
  }
}
