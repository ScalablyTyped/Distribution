package typings.jupyterlabMainmenu.tokensMod

import typings.jupyterlabMainmenu.editMod.IEditMenu
import typings.jupyterlabMainmenu.fileMod.IFileMenu
import typings.jupyterlabMainmenu.helpMod.IHelpMenu
import typings.jupyterlabMainmenu.kernelMod.IKernelMenu
import typings.jupyterlabMainmenu.runMod.IRunMenu
import typings.jupyterlabMainmenu.settingsMod.ISettingsMenu
import typings.jupyterlabMainmenu.tabsMod.ITabsMenu
import typings.jupyterlabMainmenu.tokensMod.IMainMenu.IAddOptions
import typings.jupyterlabMainmenu.viewMod.IViewMenu
import typings.luminoWidgets.mod.Menu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMainMenu_ extends js.Object {
  
  /**
    * Add a new menu to the main menu bar.
    */
  def addMenu(menu: Menu): Unit = js.native
  def addMenu(menu: Menu, options: IAddOptions): Unit = js.native
  
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
}
