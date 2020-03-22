package typings.jupyterlabMainmenu.runMod

import typings.jupyterlabMainmenu.labmenuMod.JupyterLabMenu
import typings.jupyterlabMainmenu.runMod.IRunMenu.ICodeRunner
import typings.luminoWidgets.menuMod.Menu.IOptions
import typings.luminoWidgets.mod.Widget
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.luminoDisposable.mod.IDisposable because Already inherited
- typings.jupyterlabMainmenu.labmenuMod.IJupyterLabMenu because Already inherited
- typings.jupyterlabMainmenu.runMod.IRunMenu because var conflicts: isDisposed. Inlined codeRunners */ @JSImport("@jupyterlab/mainmenu/lib/run", "RunMenu")
@js.native
class RunMenu protected () extends JupyterLabMenu {
  /**
    * Construct the run menu.
    */
  def this(options: IOptions) = this()
  /**
    * A set storing ICodeRunner for the Run menu.
    *
    * ### Notes
    * The key for the set may be used in menu labels.
    */
  val codeRunners: Set[ICodeRunner[Widget]] = js.native
}

