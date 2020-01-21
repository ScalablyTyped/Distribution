package typings.materialDialog

import typings.materialBase.mod.MDCComponent
import typings.materialDialog.adapterMod.MDCDialogAdapter
import typings.materialDialog.foundationMod.default
import typings.materialDialog.utilMod.MDCFocusTrapFactory
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/dialog", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MDCDialog () extends MDCComponent[MDCDialogAdapter, default] {
    val open: Boolean = js.native
    def close(): Unit = js.native
    def show(): Unit = js.native
  }
  
  @js.native
  class MDCDialogFoundation () extends default
  
  /* static members */
  @js.native
  object MDCDialog extends js.Object {
    def attachTo(root: Element): MDCDialog = js.native
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

