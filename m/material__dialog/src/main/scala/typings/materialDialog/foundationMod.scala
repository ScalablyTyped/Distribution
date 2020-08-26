package typings.materialDialog

import typings.materialBase.foundationMod.MDCFoundation
import typings.materialDialog.adapterMod.MDCDialogAdapter
import typings.materialDialog.anon.ACTIONATTRIBUTE
import typings.materialDialog.anon.CLOSING
import typings.materialDialog.anon.DIALOGANIMATIONCLOSETIMEMS
import typings.materialDialog.anon.PartialMDCDialogAdapter
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/dialog/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  class MDCDialogFoundation () extends MDCFoundation[MDCDialogAdapter] {
    def this(adapter: PartialMDCDialogAdapter) = this()
    def close(): Unit = js.native
    def close(action: String): Unit = js.native
    def getAutoStackButtons(): Boolean = js.native
    def getEscapeKeyAction(): String = js.native
    def getScrimClickAction(): String = js.native
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
  }
  
  @js.native
  class default () extends MDCDialogFoundation {
    def this(adapter: PartialMDCDialogAdapter) = this()
  }
  
  /* static members */
  @js.native
  object MDCDialogFoundation extends js.Object {
    def cssClasses: CLOSING = js.native
    def defaultAdapter: MDCDialogAdapter = js.native
    def numbers: DIALOGANIMATIONCLOSETIMEMS = js.native
    def strings: ACTIONATTRIBUTE = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def cssClasses: CLOSING = js.native
    def defaultAdapter: MDCDialogAdapter = js.native
    def numbers: DIALOGANIMATIONCLOSETIMEMS = js.native
    def strings: ACTIONATTRIBUTE = js.native
  }
  
}

