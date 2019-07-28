package typings.materialDashComponentsDashWeb.materialDashComponentsDashWebMod

import typings.atMaterialDialog.adapterMod.MDCDialogAdapter
import typings.atMaterialDialog.utilMod.MDCFocusTrapFactory
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "dialog")
@js.native
object dialogNs extends js.Object {
  @js.native
  class MDCDialog ()
    extends typings.atMaterialDialog.atMaterialDialogMod.MDCDialog
  
  @js.native
  class MDCDialogFoundation ()
    extends typings.atMaterialDialog.atMaterialDialogMod.MDCDialogFoundation
  
  /* static members */
  @js.native
  object MDCDialog extends js.Object {
    def attachTo(root: Element): typings.atMaterialDialog.atMaterialDialogMod.MDCDialog = js.native
  }
  
  /* static members */
  @js.native
  object MDCDialogFoundation extends js.Object {
    val cssClasses: typings.atMaterialDialog.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCDialogAdapter = js.native
    val strings: typings.atMaterialDialog.constantsMod.strings = js.native
  }
  
  @JSName("util")
  @js.native
  object utilNs extends js.Object {
    def createFocusTrapInstance(surfaceEl: Element, acceptButtonEl: Element): js.Any = js.native
    def createFocusTrapInstance(surfaceEl: Element, acceptButtonEl: Element, focusTrapFactory: MDCFocusTrapFactory): js.Any = js.native
  }
  
}

