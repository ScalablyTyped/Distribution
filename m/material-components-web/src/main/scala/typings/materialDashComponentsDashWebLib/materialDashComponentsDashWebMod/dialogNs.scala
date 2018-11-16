package typings
package materialDashComponentsDashWebLib.materialDashComponentsDashWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "dialog")
@js.native
object dialogNs extends js.Object {
  @js.native
  class MDCDialog ()
    extends atMaterialDialogLib.dialogMod.MDCDialog
  
  @js.native
  class MDCDialogFoundation ()
    extends atMaterialDialogLib.dialogMod.MDCDialogFoundation
  
  @js.native
  object MDCDialog extends js.Object {
    def attachTo(root: stdLib.Element): atMaterialDialogLib.dialogMod.MDCDialog = js.native
  }
  
  @js.native
  object MDCDialogFoundation extends js.Object {
    val cssClasses: atMaterialDialogLib.constantsMod.cssClasses = js.native
    val defaultAdapter: atMaterialDialogLib.adapterMod.MDCDialogAdapter = js.native
    val strings: atMaterialDialogLib.constantsMod.strings = js.native
  }
  
  @JSName("util")
  @js.native
  object utilNs extends js.Object {
    def createFocusTrapInstance(surfaceEl: stdLib.Element, acceptButtonEl: stdLib.Element): js.Any = js.native
    def createFocusTrapInstance(
      surfaceEl: stdLib.Element,
      acceptButtonEl: stdLib.Element,
      focusTrapFactory: atMaterialDialogLib.utilMod.MDCFocusTrapFactory
    ): js.Any = js.native
  }
  
}

