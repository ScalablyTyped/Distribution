package typings.atJupyterlabMainmenu.libViewMod

import typings.atJupyterlabMainmenu.libLabmenuMod.IJupyterLabMenu
import typings.atJupyterlabMainmenu.libViewMod.IViewMenuNs.IEditorViewer
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IViewMenu extends IJupyterLabMenu {
  /**
    * A set storing IKernelUsers for the Kernel menu.
    */
  val editorViewers: Set[IEditorViewer[Widget]] = js.native
}

