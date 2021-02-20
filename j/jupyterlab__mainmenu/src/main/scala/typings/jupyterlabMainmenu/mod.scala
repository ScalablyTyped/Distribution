package typings.jupyterlabMainmenu

import org.scalablytyped.runtime.Shortcut
import typings.luminoCommands.mod.CommandRegistry
import typings.luminoCoreutils.mod.Token
import typings.luminoWidgets.menuMod.Menu.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/mainmenu", "EditMenu")
  @js.native
  class EditMenu protected ()
    extends typings.jupyterlabMainmenu.editMod.EditMenu {
    /**
      * Construct the edit menu.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/mainmenu", "FileMenu")
  @js.native
  class FileMenu protected ()
    extends typings.jupyterlabMainmenu.fileMod.FileMenu {
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/mainmenu", "HelpMenu")
  @js.native
  class HelpMenu protected ()
    extends typings.jupyterlabMainmenu.helpMod.HelpMenu {
    /**
      * Construct the help menu.
      */
    def this(options: IOptions) = this()
  }
  
  object IMainMenu extends Shortcut {
    
    @JSImport("@jupyterlab/mainmenu", "IMainMenu")
    @js.native
    val ^ : Token[typings.jupyterlabMainmenu.tokensMod.IMainMenu] = js.native
    
    type _To = Token[typings.jupyterlabMainmenu.tokensMod.IMainMenu]
    
    /* This means you don't have to write `^`, but can instead just say `IMainMenu.foo` */
    override def _to: Token[typings.jupyterlabMainmenu.tokensMod.IMainMenu] = ^
  }
  
  @JSImport("@jupyterlab/mainmenu", "JupyterLabMenu")
  @js.native
  class JupyterLabMenu protected ()
    extends typings.jupyterlabMainmenu.labmenuMod.JupyterLabMenu {
    /**
      * Construct a new menu.
      *
      * @param options - Options for the phosphor menu.
      *
      * @param includeSeparators - whether to include separators between the
      *   groups that are added to the menu.
      */
    def this(options: IOptions) = this()
    def this(options: IOptions, includeSeparators: Boolean) = this()
  }
  
  @JSImport("@jupyterlab/mainmenu", "KernelMenu")
  @js.native
  class KernelMenu protected ()
    extends typings.jupyterlabMainmenu.kernelMod.KernelMenu {
    /**
      * Construct the kernel menu.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/mainmenu", "MainMenu")
  @js.native
  class MainMenu protected ()
    extends typings.jupyterlabMainmenu.mainmenuMod.MainMenu {
    /**
      * Construct the main menu bar.
      */
    def this(commands: CommandRegistry) = this()
  }
  
  @JSImport("@jupyterlab/mainmenu", "RunMenu")
  @js.native
  class RunMenu protected ()
    extends typings.jupyterlabMainmenu.runMod.RunMenu {
    /**
      * Construct the run menu.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/mainmenu", "SettingsMenu")
  @js.native
  class SettingsMenu protected ()
    extends typings.jupyterlabMainmenu.settingsMod.SettingsMenu {
    /**
      * Construct the settings menu.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/mainmenu", "TabsMenu")
  @js.native
  class TabsMenu protected ()
    extends typings.jupyterlabMainmenu.tabsMod.TabsMenu {
    /**
      * Construct the tabs menu.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/mainmenu", "ViewMenu")
  @js.native
  class ViewMenu protected ()
    extends typings.jupyterlabMainmenu.viewMod.ViewMenu {
    /**
      * Construct the view menu.
      */
    def this(options: IOptions) = this()
  }
}
