package typings
package atJupyterlabMainmenuLib.libMainmenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMainMenu extends js.Object {
  /**
    * The application "Edit" menu.
    */
  val editMenu: atJupyterlabMainmenuLib.libEditMod.IEditMenu = js.native
  /**
    * The application "File" menu.
    */
  val fileMenu: atJupyterlabMainmenuLib.libFileMod.IFileMenu = js.native
  /**
    * The application "Help" menu.
    */
  val helpMenu: atJupyterlabMainmenuLib.libHelpMod.IHelpMenu = js.native
  /**
    * The application "Kernel" menu.
    */
  val kernelMenu: atJupyterlabMainmenuLib.libKernelMod.IKernelMenu = js.native
  /**
    * The application "Run" menu.
    */
  val runMenu: atJupyterlabMainmenuLib.libRunMod.IRunMenu = js.native
  /**
    * The application "Settings" menu.
    */
  val settingsMenu: atJupyterlabMainmenuLib.libSettingsMod.ISettingsMenu = js.native
  /**
    * The application "Tabs" menu.
    */
  val tabsMenu: atJupyterlabMainmenuLib.libTabsMod.ITabsMenu = js.native
  /**
    * The application "View" menu.
    */
  val viewMenu: atJupyterlabMainmenuLib.libViewMod.IViewMenu = js.native
  /**
    * Add a new menu to the main menu bar.
    */
  def addMenu(menu: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Menu): scala.Unit = js.native
  def addMenu(
    menu: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Menu,
    options: atJupyterlabMainmenuLib.libMainmenuMod.IMainMenuNs.IAddOptions
  ): scala.Unit = js.native
}

