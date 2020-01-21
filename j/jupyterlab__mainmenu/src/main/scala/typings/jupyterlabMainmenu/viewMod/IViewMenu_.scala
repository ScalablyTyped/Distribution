package typings.jupyterlabMainmenu.viewMod

import typings.jupyterlabMainmenu.labmenuMod.IJupyterLabMenu
import typings.jupyterlabMainmenu.viewMod.IViewMenu.IEditorViewer
import typings.phosphorWidgets.mod.Widget
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IViewMenu_ extends IJupyterLabMenu {
  /**
    * A set storing IKernelUsers for the Kernel menu.
    */
  val editorViewers: Set[IEditorViewer[Widget]] = js.native
}

