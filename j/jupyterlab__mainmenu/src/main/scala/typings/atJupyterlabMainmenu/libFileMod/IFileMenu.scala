package typings.atJupyterlabMainmenu.libFileMod

import typings.atJupyterlabMainmenu.libFileMod.IFileMenuNs.ICloseAndCleaner
import typings.atJupyterlabMainmenu.libFileMod.IFileMenuNs.IConsoleCreator
import typings.atJupyterlabMainmenu.libLabmenuMod.IJupyterLabMenu
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileMenu extends IJupyterLabMenu {
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

