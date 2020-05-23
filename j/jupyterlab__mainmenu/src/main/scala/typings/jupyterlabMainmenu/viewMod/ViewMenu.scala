package typings.jupyterlabMainmenu.viewMod

import typings.jupyterlabMainmenu.labmenuMod.JupyterLabMenu
import typings.jupyterlabMainmenu.viewMod.IViewMenu.IEditorViewer
import typings.luminoWidgets.menuMod.Menu.IOptions
import typings.luminoWidgets.mod.Widget
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.luminoDisposable.mod.IDisposable because Already inherited
- typings.jupyterlabMainmenu.labmenuMod.IJupyterLabMenu because Already inherited
- typings.jupyterlabMainmenu.viewMod.IViewMenu because var conflicts: isDisposed. Inlined editorViewers */ @JSImport("@jupyterlab/mainmenu/lib/view", "ViewMenu")
@js.native
class ViewMenu protected () extends JupyterLabMenu {
  /**
    * Construct the view menu.
    */
  def this(options: IOptions) = this()
  /**
    * A set storing IEditorViewers for the View menu.
    */
  val editorViewers: Set[IEditorViewer[Widget]] = js.native
}

