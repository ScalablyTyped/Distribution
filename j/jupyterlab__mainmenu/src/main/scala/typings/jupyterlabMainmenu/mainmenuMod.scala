package typings.jupyterlabMainmenu

import typings.jupyterlabMainmenu.editMod.EditMenu
import typings.jupyterlabMainmenu.fileMod.FileMenu
import typings.jupyterlabMainmenu.helpMod.HelpMenu
import typings.jupyterlabMainmenu.kernelMod.KernelMenu
import typings.jupyterlabMainmenu.runMod.RunMenu
import typings.jupyterlabMainmenu.settingsMod.SettingsMenu
import typings.jupyterlabMainmenu.tabsMod.TabsMenu
import typings.jupyterlabMainmenu.tokensMod.IMainMenu
import typings.jupyterlabMainmenu.tokensMod.IMainMenu.IMenuOptions
import typings.jupyterlabMainmenu.viewMod.ViewMenu
import typings.jupyterlabTranslation.tokensMod.TranslationBundle
import typings.jupyterlabUiComponents.mod.RankedMenu
import typings.luminoCommands.mod.CommandRegistry
import typings.luminoMessaging.mod.Message
import typings.luminoWidgets.mod.MenuBar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mainmenuMod {
  
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
      * Dispose of the resources held by the object.
      *
      * #### Notes
      * If the object's `dispose` method is called more than once, all
      * calls made after the first will be a no-op.
      *
      * #### Undefined Behavior
      * It is undefined behavior to use any functionality of the object
      * after it has been disposed unless otherwise explicitly noted.
      */
    /* InferMemberOverrides */
    override def dispose(): Unit = js.native
    
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
      * Process a message sent to the handler.
      *
      * @param msg - The message to be processed.
      */
    /* InferMemberOverrides */
    override def processMessage(msg: Message): Unit = js.native
    
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
