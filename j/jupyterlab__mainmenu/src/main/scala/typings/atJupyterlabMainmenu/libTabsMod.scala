package typings.atJupyterlabMainmenu

import typings.atJupyterlabMainmenu.libLabmenuMod.IJupyterLabMenu
import typings.atJupyterlabMainmenu.libLabmenuMod.JupyterLabMenu
import typings.atPhosphorWidgets.libMenuMod.Menu.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/mainmenu/lib/tabs", JSImport.Namespace)
@js.native
object libTabsMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.atPhosphorDisposable.atPhosphorDisposableMod.IDisposable because Already inherited
  - typings.atJupyterlabMainmenu.libTabsMod.ITabsMenu because Already inherited */ @js.native
  class TabsMenu protected () extends JupyterLabMenu {
    /**
      * Construct the tabs menu.
      */
    def this(options: IOptions) = this()
  }
  
  type ITabsMenu = IJupyterLabMenu
}

