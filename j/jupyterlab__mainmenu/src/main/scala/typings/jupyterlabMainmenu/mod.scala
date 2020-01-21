package typings.jupyterlabMainmenu

import org.scalablytyped.runtime.TopLevel
import typings.phosphorCommands.mod.CommandRegistry
import typings.phosphorCoreutils.mod.Token
import typings.phosphorWidgets.menuMod.Menu.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/mainmenu", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class EditMenu protected ()
    extends typings.jupyterlabMainmenu.editMod.EditMenu {
    /**
      * Construct the edit menu.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class FileMenu protected ()
    extends typings.jupyterlabMainmenu.fileMod.FileMenu {
    def this(options: IOptions) = this()
  }
  
  @js.native
  class HelpMenu protected ()
    extends typings.jupyterlabMainmenu.helpMod.HelpMenu {
    /**
      * Construct the help menu.
      */
    def this(options: IOptions) = this()
  }
  
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
  
  @js.native
  class KernelMenu protected ()
    extends typings.jupyterlabMainmenu.kernelMod.KernelMenu {
    /**
      * Construct the kernel menu.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class MainMenu protected ()
    extends typings.jupyterlabMainmenu.mainmenuMod.MainMenu {
    /**
      * Construct the main menu bar.
      */
    def this(commands: CommandRegistry) = this()
  }
  
  @js.native
  class RunMenu protected ()
    extends typings.jupyterlabMainmenu.runMod.RunMenu {
    /**
      * Construct the run menu.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class SettingsMenu protected ()
    extends typings.jupyterlabMainmenu.settingsMod.SettingsMenu {
    /**
      * Construct the settings menu.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class TabsMenu protected ()
    extends typings.jupyterlabMainmenu.tabsMod.TabsMenu {
    /**
      * Construct the tabs menu.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class ViewMenu protected ()
    extends typings.jupyterlabMainmenu.viewMod.ViewMenu {
    /**
      * Construct the view menu.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  object IMainMenu
    extends TopLevel[Token[typings.jupyterlabMainmenu.tokensMod.IMainMenu]]
  
}

