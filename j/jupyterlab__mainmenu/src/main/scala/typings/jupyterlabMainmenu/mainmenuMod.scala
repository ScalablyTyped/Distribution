package typings.jupyterlabMainmenu

import typings.jupyterlabMainmenu.editMod.EditMenu
import typings.jupyterlabMainmenu.fileMod.FileMenu
import typings.jupyterlabMainmenu.helpMod.HelpMenu
import typings.jupyterlabMainmenu.kernelMod.KernelMenu
import typings.jupyterlabMainmenu.runMod.RunMenu
import typings.jupyterlabMainmenu.settingsMod.SettingsMenu
import typings.jupyterlabMainmenu.tabsMod.TabsMenu
import typings.jupyterlabMainmenu.tokensMod.IMainMenu
import typings.jupyterlabMainmenu.viewMod.ViewMenu
import typings.luminoCommands.mod.CommandRegistry
import typings.luminoWidgets.mod.MenuBar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mainmenuMod {
  
  @JSImport("@jupyterlab/mainmenu/lib/mainmenu", "MainMenu")
  @js.native
  class MainMenu protected ()
    extends MenuBar
       with IMainMenu {
    /**
      * Construct the main menu bar.
      */
    def this(commands: CommandRegistry) = this()
    
    var _items: js.Any = js.native
    
    /**
      * Handle the disposal of a menu.
      */
    var _onMenuDisposed: js.Any = js.native
    
    /**
      * The application "Edit" menu.
      */
    @JSName("editMenu")
    val editMenu_MainMenu: EditMenu = js.native
    
    /**
      * The application "File" menu.
      */
    @JSName("fileMenu")
    val fileMenu_MainMenu: FileMenu = js.native
    
    /**
      * The application "Help" menu.
      */
    @JSName("helpMenu")
    val helpMenu_MainMenu: HelpMenu = js.native
    
    /**
      * The application "Kernel" menu.
      */
    @JSName("kernelMenu")
    val kernelMenu_MainMenu: KernelMenu = js.native
    
    /**
      * The application "Run" menu.
      */
    @JSName("runMenu")
    val runMenu_MainMenu: RunMenu = js.native
    
    /**
      * The application "Settings" menu.
      */
    @JSName("settingsMenu")
    val settingsMenu_MainMenu: SettingsMenu = js.native
    
    /**
      * The application "Tabs" menu.
      */
    @JSName("tabsMenu")
    val tabsMenu_MainMenu: TabsMenu = js.native
    
    /**
      * The application "View" menu.
      */
    @JSName("viewMenu")
    val viewMenu_MainMenu: ViewMenu = js.native
  }
}
