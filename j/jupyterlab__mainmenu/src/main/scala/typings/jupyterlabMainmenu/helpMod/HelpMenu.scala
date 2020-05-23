package typings.jupyterlabMainmenu.helpMod

import typings.jupyterlabMainmenu.helpMod.IHelpMenu.IKernelUser
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
- typings.jupyterlabMainmenu.helpMod.IHelpMenu because var conflicts: isDisposed. Inlined kernelUsers */ @JSImport("@jupyterlab/mainmenu/lib/help", "HelpMenu")
@js.native
class HelpMenu protected () extends JupyterLabMenu {
  /**
    * Construct the help menu.
    */
  def this(options: IOptions) = this()
  /**
    * A set of kernel users for the help menu.
    * This is used to populate additional help
    * links provided by the kernel of a widget.
    */
  val kernelUsers: Set[IKernelUser[Widget]] = js.native
}

