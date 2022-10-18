package typings.jupyterlabMainmenu

import typings.jupyterlabMainmenu.libEditMod.EditMenu
import typings.jupyterlabMainmenu.libFileMod.FileMenu
import typings.jupyterlabMainmenu.libHelpMod.HelpMenu
import typings.jupyterlabMainmenu.libKernelMod.KernelMenu
import typings.jupyterlabMainmenu.libRunMod.RunMenu
import typings.jupyterlabMainmenu.libSettingsMod.SettingsMenu
import typings.jupyterlabMainmenu.libTabsMod.TabsMenu
import typings.jupyterlabMainmenu.libTokensMod.IMainMenu
import typings.jupyterlabMainmenu.libTokensMod.IMainMenu.IMenuOptions
import typings.jupyterlabMainmenu.libViewMod.ViewMenu
import typings.jupyterlabTranslation.libTokensMod.TranslationBundle
import typings.jupyterlabUiComponents.mod.RankedMenu
import typings.luminoCommands.mod.CommandRegistry
import typings.luminoWidgets.mod.MenuBar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMainmenuMod {
  
  @JSImport("@jupyterlab/mainmenu/lib/mainmenu", "MainMenu")
  @js.native
  open class MainMenu protected ()
    extends MenuBar
       with IMainMenu {
    /**
      * Construct the main menu bar.
      */
    def this(commands: CommandRegistry) = this()
    
    /* private */ var _commands: Any = js.native
    
    /* private */ var _editMenu: Any = js.native
    
    /* private */ var _fileMenu: Any = js.native
    
    /* private */ var _helpMenu: Any = js.native
    
    /* private */ var _items: Any = js.native
    
    /* private */ var _kernelMenu: Any = js.native
    
    /**
      * Handle the disposal of a menu.
      */
    /* private */ var _onMenuDisposed: Any = js.native
    
    /* private */ var _runMenu: Any = js.native
    
    /* private */ var _settingsMenu: Any = js.native
    
    /* private */ var _tabsMenu: Any = js.native
    
    /* private */ var _viewMenu: Any = js.native
    
    /**
      * The application "Edit" menu.
      */
    @JSName("editMenu")
    def editMenu_MMainMenu: EditMenu = js.native
    
    /**
      * The application "File" menu.
      */
    @JSName("fileMenu")
    def fileMenu_MMainMenu: FileMenu = js.native
    
    /**
      * The application "Help" menu.
      */
    @JSName("helpMenu")
    def helpMenu_MMainMenu: HelpMenu = js.native
    
    /**
      * The application "Kernel" menu.
      */
    @JSName("kernelMenu")
    def kernelMenu_MMainMenu: KernelMenu = js.native
    
    /**
      * The application "Run" menu.
      */
    @JSName("runMenu")
    def runMenu_MMainMenu: RunMenu = js.native
    
    /**
      * The application "Settings" menu.
      */
    @JSName("settingsMenu")
    def settingsMenu_MMainMenu: SettingsMenu = js.native
    
    /**
      * The application "Tabs" menu.
      */
    @JSName("tabsMenu")
    def tabsMenu_MMainMenu: TabsMenu = js.native
    
    /**
      * The application "View" menu.
      */
    @JSName("viewMenu")
    def viewMenu_MMainMenu: ViewMenu = js.native
  }
  /* static members */
  object MainMenu {
    
    @JSImport("@jupyterlab/mainmenu/lib/mainmenu", "MainMenu")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Generate the menu.
      *
      * @param commands The command registry
      * @param options The main menu options.
      * @param trans - The application language translator.
      */
    inline def generateMenu(commands: CommandRegistry, options: IMenuOptions, trans: TranslationBundle): RankedMenu = (^.asInstanceOf[js.Dynamic].applyDynamic("generateMenu")(commands.asInstanceOf[js.Any], options.asInstanceOf[js.Any], trans.asInstanceOf[js.Any])).asInstanceOf[RankedMenu]
  }
}
