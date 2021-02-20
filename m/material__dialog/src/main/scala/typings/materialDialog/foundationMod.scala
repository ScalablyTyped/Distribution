package typings.materialDialog

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialDialog.adapterMod.MDCDialogAdapter
import typings.materialDialog.anon.PartialMDCDialogAdapter
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/dialog/foundation", JSImport.Default)
  @js.native
  class default () extends MDCDialogFoundation {
    def this(adapter: PartialMDCDialogAdapter) = this()
  }
  
  @JSImport("@material/dialog/foundation", "MDCDialogFoundation")
  @js.native
  class MDCDialogFoundation () extends MDCFoundation[MDCDialogAdapter] {
    def this(adapter: PartialMDCDialogAdapter) = this()
    
    def close(): Unit = js.native
    def close(action: String): Unit = js.native
    
    def getAutoStackButtons(): Boolean = js.native
    
    def getEscapeKeyAction(): String = js.native
    
    def getScrimClickAction(): String = js.native
    
    def getSuppressDefaultPressSelector(): String = js.native
    
    /** Handles click on the dialog root element. */
    def handleClick(evt: MouseEvent): Unit = js.native
    
    /** Handles keydown on the document. */
    def handleDocumentKeydown(evt: KeyboardEvent): Unit = js.native
    
    /** Handles keydown on the dialog root element. */
    def handleKeydown(evt: KeyboardEvent): Unit = js.native
    
    def isOpen(): Boolean = js.native
    
    def layout(): Unit = js.native
    
    def open(): Unit = js.native
    
    def setAutoStackButtons(autoStack: Boolean): Unit = js.native
    
    def setEscapeKeyAction(action: String): Unit = js.native
    
    def setScrimClickAction(action: String): Unit = js.native
    
    def setSuppressDefaultPressSelector(selector: String): Unit = js.native
  }
}
