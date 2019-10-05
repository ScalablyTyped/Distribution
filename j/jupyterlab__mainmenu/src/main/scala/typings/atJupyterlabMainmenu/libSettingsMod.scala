package typings.atJupyterlabMainmenu

import typings.atJupyterlabMainmenu.libLabmenuMod.IJupyterLabMenu
import typings.atJupyterlabMainmenu.libLabmenuMod.JupyterLabMenu
import typings.atPhosphorWidgets.libMenuMod.Menu.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/mainmenu/lib/settings", JSImport.Namespace)
@js.native
object libSettingsMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.atPhosphorDisposable.atPhosphorDisposableMod.IDisposable because Already inherited
  - typings.atJupyterlabMainmenu.libSettingsMod.ISettingsMenu because Already inherited */ @js.native
  class SettingsMenu protected () extends JupyterLabMenu {
    /**
      * Construct the settings menu.
      */
    def this(options: IOptions) = this()
  }
  
  type ISettingsMenu = IJupyterLabMenu
}

