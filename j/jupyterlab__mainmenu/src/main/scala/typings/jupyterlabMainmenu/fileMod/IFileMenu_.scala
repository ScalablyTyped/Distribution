package typings.jupyterlabMainmenu.fileMod

import typings.jupyterlabMainmenu.fileMod.IFileMenu.ICloseAndCleaner
import typings.jupyterlabMainmenu.fileMod.IFileMenu.IConsoleCreator
import typings.jupyterlabMainmenu.labmenuMod.IJupyterLabMenu
import typings.phosphorWidgets.mod.Widget
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileMenu_ extends IJupyterLabMenu {
  /**
    * The close and cleanup extension point.
    */
  val closeAndCleaners: Set[ICloseAndCleaner[Widget]] = js.native
  /**
    * A set storing IConsoleCreators for the File menu.
    */
  val consoleCreators: Set[IConsoleCreator[Widget]] = js.native
  /**
    * A submenu for creating new files/launching new activities.
    */
  val newMenu: IJupyterLabMenu = js.native
  /**
    * Option to add a `Quit` entry in the File menu
    */
  var quitEntry: Boolean = js.native
}

