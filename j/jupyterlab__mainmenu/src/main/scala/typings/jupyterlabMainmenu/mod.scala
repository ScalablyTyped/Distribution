package typings.jupyterlabMainmenu

import typings.jupyterlabMainmenu.libTokensMod.IMainMenu.IMenuOptions
import typings.jupyterlabTranslation.libTokensMod.TranslationBundle
import typings.jupyterlabUiComponents.libComponentsMenuMod.IRankedMenu.IOptions
import typings.jupyterlabUiComponents.mod.RankedMenu
import typings.luminoCommands.mod.CommandRegistry
import typings.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/mainmenu", "EditMenu")
  @js.native
  open class EditMenu protected ()
    extends typings.jupyterlabMainmenu.libEditMod.EditMenu {
    /**
      * Construct the edit menu.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/mainmenu", "FileMenu")
  @js.native
  open class FileMenu protected ()
    extends typings.jupyterlabMainmenu.libFileMod.FileMenu {
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/mainmenu", "HelpMenu")
  @js.native
  open class HelpMenu protected ()
    extends typings.jupyterlabMainmenu.libHelpMod.HelpMenu {
    /**
      * Construct the help menu.
      */
    def this(options: IOptions) = this()
  }
  
  object IJupyterLabMenu {
    
    /**
      * Default menu item rank
      */
    @JSImport("@jupyterlab/mainmenu", "IJupyterLabMenu.DEFAULT_RANK")
    @js.native
    val DEFAULT_RANK: /* 100 */ Double = js.native
  }
  
  @JSImport("@jupyterlab/mainmenu", "IMainMenu")
  @js.native
  val IMainMenu: Token[typings.jupyterlabMainmenu.libTokensMod.IMainMenu] = js.native
  
  @JSImport("@jupyterlab/mainmenu", "JupyterLabMenu")
  @js.native
  open class JupyterLabMenu protected () extends RankedMenu {
    /**
      * Construct a new menu.
      *
      * @param options - Options for the lumino menu.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/mainmenu", "KernelMenu")
  @js.native
  open class KernelMenu protected ()
    extends typings.jupyterlabMainmenu.libKernelMod.KernelMenu {
    /**
      * Construct the kernel menu.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/mainmenu", "MainMenu")
  @js.native
  open class MainMenu protected ()
    extends typings.jupyterlabMainmenu.libMainmenuMod.MainMenu {
    /**
      * Construct the main menu bar.
      */
    def this(commands: CommandRegistry) = this()
  }
  /* static members */
  object MainMenu {
    
    @JSImport("@jupyterlab/mainmenu", "MainMenu")
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
  
  @JSImport("@jupyterlab/mainmenu", "RunMenu")
  @js.native
  open class RunMenu protected ()
    extends typings.jupyterlabMainmenu.libRunMod.RunMenu {
    /**
      * Construct the run menu.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/mainmenu", "SettingsMenu")
  @js.native
  open class SettingsMenu protected ()
    extends typings.jupyterlabMainmenu.libSettingsMod.SettingsMenu {
    /**
      * Construct the settings menu.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/mainmenu", "TabsMenu")
  @js.native
  open class TabsMenu protected ()
    extends typings.jupyterlabMainmenu.libTabsMod.TabsMenu {
    /**
      * Construct the tabs menu.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/mainmenu", "ViewMenu")
  @js.native
  open class ViewMenu protected ()
    extends typings.jupyterlabMainmenu.libViewMod.ViewMenu {
    /**
      * Construct the view menu.
      */
    def this(options: IOptions) = this()
  }
}
