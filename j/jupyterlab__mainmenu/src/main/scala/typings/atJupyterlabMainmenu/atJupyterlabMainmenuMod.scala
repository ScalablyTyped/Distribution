package typings.atJupyterlabMainmenu

import org.scalablytyped.runtime.TopLevel
import typings.atPhosphorCommands.atPhosphorCommandsMod.CommandRegistry
import typings.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import typings.atPhosphorWidgets.libMenuMod.Menu.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/mainmenu", JSImport.Namespace)
@js.native
object atJupyterlabMainmenuMod extends js.Object {
  @js.native
  class EditMenu protected ()
    extends typings.atJupyterlabMainmenu.libEditMod.EditMenu {
    /**
      * Construct the edit menu.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class FileMenu protected ()
    extends typings.atJupyterlabMainmenu.libFileMod.FileMenu {
    def this(options: IOptions) = this()
  }
  
  @js.native
  class HelpMenu protected ()
    extends typings.atJupyterlabMainmenu.libHelpMod.HelpMenu {
    /**
      * Construct the help menu.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class JupyterLabMenu protected ()
    extends typings.atJupyterlabMainmenu.libLabmenuMod.JupyterLabMenu {
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
    extends typings.atJupyterlabMainmenu.libKernelMod.KernelMenu {
    /**
      * Construct the kernel menu.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class MainMenu protected ()
    extends typings.atJupyterlabMainmenu.libMainmenuMod.MainMenu {
    /**
      * Construct the main menu bar.
      */
    def this(commands: CommandRegistry) = this()
  }
  
  @js.native
  class RunMenu protected ()
    extends typings.atJupyterlabMainmenu.libRunMod.RunMenu {
    /**
      * Construct the run menu.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class SettingsMenu protected ()
    extends typings.atJupyterlabMainmenu.libSettingsMod.SettingsMenu {
    /**
      * Construct the settings menu.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class TabsMenu protected ()
    extends typings.atJupyterlabMainmenu.libTabsMod.TabsMenu {
    /**
      * Construct the tabs menu.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class ViewMenu protected ()
    extends typings.atJupyterlabMainmenu.libViewMod.ViewMenu {
    /**
      * Construct the view menu.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  object IMainMenu
    extends TopLevel[Token[typings.atJupyterlabMainmenu.libTokensMod.IMainMenu]]
  
}

