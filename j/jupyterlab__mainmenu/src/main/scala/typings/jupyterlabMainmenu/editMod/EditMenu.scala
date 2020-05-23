package typings.jupyterlabMainmenu.editMod

import typings.jupyterlabMainmenu.editMod.IEditMenu.IClearer
import typings.jupyterlabMainmenu.editMod.IEditMenu.IGoToLiner
import typings.jupyterlabMainmenu.editMod.IEditMenu.IUndoer
import typings.jupyterlabMainmenu.labmenuMod.JupyterLabMenu
import typings.luminoWidgets.menuMod.Menu.IOptions
import typings.luminoWidgets.mod.Widget
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.luminoDisposable.mod.IDisposable because Already inherited
- typings.jupyterlabMainmenu.labmenuMod.IJupyterLabMenu because Already inherited
- typings.jupyterlabMainmenu.editMod.IEditMenu because var conflicts: isDisposed. Inlined undoers, clearers, goToLiners */ @JSImport("@jupyterlab/mainmenu/lib/edit", "EditMenu")
@js.native
class EditMenu protected () extends JupyterLabMenu {
  /**
    * Construct the edit menu.
    */
  def this(options: IOptions) = this()
  /**
    * A set storing IClearers for the Edit menu.
    */
  val clearers: Set[IClearer[Widget]] = js.native
  /**
    * A set storing IGoToLiners for the Edit menu.
    */
  val goToLiners: Set[IGoToLiner[Widget]] = js.native
  /**
    * A set storing IUndoers for the Edit menu.
    */
  val undoers: Set[IUndoer[Widget]] = js.native
}

