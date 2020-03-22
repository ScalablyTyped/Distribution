package typings.jupyterlabMainmenu.kernelMod

import typings.jupyterlabMainmenu.kernelMod.IKernelMenu.IKernelUser
import typings.jupyterlabMainmenu.labmenuMod.JupyterLabMenu
import typings.luminoWidgets.menuMod.Menu.IOptions
import typings.luminoWidgets.mod.Widget
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.luminoDisposable.mod.IDisposable because Already inherited
- typings.jupyterlabMainmenu.labmenuMod.IJupyterLabMenu because Already inherited
- typings.jupyterlabMainmenu.kernelMod.IKernelMenu because var conflicts: isDisposed. Inlined kernelUsers */ @JSImport("@jupyterlab/mainmenu/lib/kernel", "KernelMenu")
@js.native
class KernelMenu protected () extends JupyterLabMenu {
  /**
    * Construct the kernel menu.
    */
  def this(options: IOptions) = this()
  /**
    * A set storing IKernelUsers for the Kernel menu.
    */
  val kernelUsers: Set[IKernelUser[Widget]] = js.native
}

