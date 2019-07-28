package typings.atJupyterlabMainmenu.libTokensMod

import typings.atJupyterlabMainmenu.libEditMod.IEditMenu
import typings.atJupyterlabMainmenu.libFileMod.IFileMenu
import typings.atJupyterlabMainmenu.libHelpMod.IHelpMenu
import typings.atJupyterlabMainmenu.libKernelMod.IKernelMenu
import typings.atJupyterlabMainmenu.libRunMod.IRunMenu
import typings.atJupyterlabMainmenu.libSettingsMod.ISettingsMenu
import typings.atJupyterlabMainmenu.libTabsMod.ITabsMenu
import typings.atJupyterlabMainmenu.libTokensMod.IMainMenuNs.IAddOptions
import typings.atJupyterlabMainmenu.libViewMod.IViewMenu
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Menu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMainMenu extends js.Object {
  /**
    * The application "Edit" menu.
    */
  val editMenu: IEditMenu = js.native
  /**
    * The application "File" menu.
    */
  val fileMenu: IFileMenu = js.native
  /**
    * The application "Help" menu.
    */
  val helpMenu: IHelpMenu = js.native
  /**
    * The application "Kernel" menu.
    */
  val kernelMenu: IKernelMenu = js.native
  /**
    * The application "Run" menu.
    */
  val runMenu: IRunMenu = js.native
  /**
    * The application "Settings" menu.
    */
  val settingsMenu: ISettingsMenu = js.native
  /**
    * The application "Tabs" menu.
    */
  val tabsMenu: ITabsMenu = js.native
  /**
    * The application "View" menu.
    */
  val viewMenu: IViewMenu = js.native
  /**
    * Add a new menu to the main menu bar.
    */
  def addMenu(menu: Menu): Unit = js.native
  def addMenu(menu: Menu, options: IAddOptions): Unit = js.native
}

