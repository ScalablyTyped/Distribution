package typings.jupyterlabMainmenu.fileMod

import typings.jupyterlabMainmenu.fileMod.IFileMenu.ICloseAndCleaner
import typings.jupyterlabMainmenu.fileMod.IFileMenu.IConsoleCreator
import typings.jupyterlabMainmenu.labmenuMod.IJupyterLabMenu
import typings.jupyterlabMainmenu.labmenuMod.JupyterLabMenu
import typings.luminoWidgets.menuMod.Menu.IOptions
import typings.luminoWidgets.mod.Widget
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.luminoDisposable.mod.IDisposable because Already inherited
- typings.jupyterlabMainmenu.labmenuMod.IJupyterLabMenu because Already inherited
- typings.jupyterlabMainmenu.fileMod.IFileMenu because var conflicts: isDisposed. Inlined quitEntry, newMenu, closeAndCleaners, consoleCreators */ @JSImport("@jupyterlab/mainmenu/lib/file", "FileMenu")
@js.native
class FileMenu protected () extends JupyterLabMenu {
  def this(options: IOptions) = this()
  
  /**
    * The close and cleanup extension point.
    */
  val closeAndCleaners: Set[ICloseAndCleaner[Widget]] = js.native
  
  /**
    * A set storing IConsoleCreators for the Kernel menu.
    */
  val consoleCreators: Set[IConsoleCreator[Widget]] = js.native
  
  /**
    * The New submenu.
    */
  val newMenu: IJupyterLabMenu | JupyterLabMenu = js.native
  
  /**
    * Option to add a `Quit` entry in File menu
    */
  var quitEntry: Boolean = js.native
}
