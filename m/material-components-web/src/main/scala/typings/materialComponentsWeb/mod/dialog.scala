package typings.materialComponentsWeb.mod

import typings.materialDialog.adapterMod.MDCDialogAdapter
import typings.materialDialog.utilMod.MDCFocusTrapFactory
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "dialog")
@js.native
object dialog extends js.Object {
  @js.native
  class MDCDialog ()
    extends typings.materialDialog.mod.MDCDialog
  
  @js.native
  class MDCDialogFoundation ()
    extends typings.materialDialog.mod.MDCDialogFoundation
  
  /* static members */
  @js.native
  object MDCDialog extends js.Object {
    def attachTo(root: Element): typings.materialDialog.mod.MDCDialog = js.native
  }
  
  /* static members */
  @js.native
  object MDCDialogFoundation extends js.Object {
    val cssClasses: typings.materialDialog.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCDialogAdapter = js.native
    val strings: typings.materialDialog.constantsMod.strings = js.native
  }
  
  @js.native
  object util extends js.Object {
    def createFocusTrapInstance(surfaceEl: Element, acceptButtonEl: Element): js.Any = js.native
    def createFocusTrapInstance(surfaceEl: Element, acceptButtonEl: Element, focusTrapFactory: MDCFocusTrapFactory): js.Any = js.native
  }
  
}

