package typings.materialSnackbar

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialSnackbar.adapterMod.MDCSnackbarAdapter
import typings.materialSnackbar.anon.PartialMDCSnackbarAdapter
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/snackbar/foundation", JSImport.Default)
  @js.native
  class default () extends MDCSnackbarFoundation {
    def this(adapter: PartialMDCSnackbarAdapter) = this()
  }
  
  @JSImport("@material/snackbar/foundation", "MDCSnackbarFoundation")
  @js.native
  class MDCSnackbarFoundation () extends MDCFoundation[MDCSnackbarAdapter] {
    def this(adapter: PartialMDCSnackbarAdapter) = this()
    
    /**
      * @param reason Why the snackbar was closed. Value will be passed to CLOSING_EVENT and CLOSED_EVENT via the
      *     `event.detail.reason` property. Standard values are REASON_ACTION and REASON_DISMISS, but custom
      *     client-specific values may also be used if desired.
      */
    def close(): Unit = js.native
    def close(reason: String): Unit = js.native
    
    def getCloseOnEscape(): Boolean = js.native
    
    def getTimeoutMs(): Double = js.native
    
    def handleActionButtonClick(_evt: MouseEvent): Unit = js.native
    
    def handleActionIconClick(_evt: MouseEvent): Unit = js.native
    
    def handleKeyDown(evt: KeyboardEvent): Unit = js.native
    
    def isOpen(): Boolean = js.native
    
    def open(): Unit = js.native
    
    def setCloseOnEscape(closeOnEscape: Boolean): Unit = js.native
    
    def setTimeoutMs(timeoutMs: Double): Unit = js.native
  }
}
