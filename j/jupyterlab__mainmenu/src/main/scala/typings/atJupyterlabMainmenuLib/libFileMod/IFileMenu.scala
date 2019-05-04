package typings
package atJupyterlabMainmenuLib.libFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileMenu
  extends atJupyterlabMainmenuLib.libLabmenuMod.IJupyterLabMenu {
  /**
    * The close and cleanup extension point.
    */
  val closeAndCleaners: stdLib.Set[
    atJupyterlabMainmenuLib.libFileMod.IFileMenuNs.ICloseAndCleaner[atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget]
  ] = js.native
  /**
    * A set storing IConsoleCreators for the File menu.
    */
  val consoleCreators: stdLib.Set[
    atJupyterlabMainmenuLib.libFileMod.IFileMenuNs.IConsoleCreator[atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget]
  ] = js.native
  /**
    * A submenu for creating new files/launching new activities.
    */
  val newMenu: atJupyterlabMainmenuLib.libLabmenuMod.IJupyterLabMenu = js.native
  /**
    * The persist and save extension point.
    */
  val persistAndSavers: stdLib.Set[
    atJupyterlabMainmenuLib.libFileMod.IFileMenuNs.IPersistAndSave[atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget]
  ] = js.native
  /**
    * Option to add a `Quit` entry in the File menu
    */
  var quitEntry: scala.Boolean = js.native
}

