package typings.atJupyterlabMainmenu.libViewMod

import typings.atJupyterlabMainmenu.libLabmenuMod.IJupyterLabMenu
import typings.atJupyterlabMainmenu.libViewMod.IViewMenu.IEditorViewer
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("IViewMenu")
@js.native
trait IViewMenu_ extends IJupyterLabMenu {
  /**
    * A set storing IKernelUsers for the Kernel menu.
    */
  val editorViewers: Set[IEditorViewer[Widget]] = js.native
}

