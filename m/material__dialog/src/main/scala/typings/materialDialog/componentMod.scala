package typings.materialDialog

import typings.materialBase.componentMod.MDCComponent
import typings.materialDialog.foundationMod.MDCDialogFoundation
import typings.materialDialog.utilMod.MDCDialogFocusTrapFactory
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/dialog/component", JSImport.Namespace)
@js.native
object componentMod extends js.Object {
  @js.native
  class MDCDialog () extends MDCComponent[MDCDialogFoundation] {
    def autoStackButtons: Boolean = js.native
    def autoStackButtons_=(autoStack: Boolean): Unit = js.native
    def close(): Unit = js.native
    def close(action: String): Unit = js.native
    def escapeKeyAction: String = js.native
    def escapeKeyAction_=(action: String): Unit = js.native
    def initialize(): Unit = js.native
    def initialize(focusTrapFactory: MDCDialogFocusTrapFactory): Unit = js.native
    def isOpen: Boolean = js.native
    def layout(): Unit = js.native
    def open(): Unit = js.native
    def scrimClickAction: String = js.native
    def scrimClickAction_=(action: String): Unit = js.native
  }
  
  /* static members */
  @js.native
  object MDCDialog extends js.Object {
    def attachTo(root: Element): MDCDialog = js.native
  }
  
}

