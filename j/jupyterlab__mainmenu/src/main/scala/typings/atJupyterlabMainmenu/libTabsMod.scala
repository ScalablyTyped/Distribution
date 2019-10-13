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
  @js.native
  class TabsMenu protected () extends JupyterLabMenu {
    /**
      * Construct the tabs menu.
      */
    def this(options: IOptions) = this()
  }
  
  type ITabsMenu = IJupyterLabMenu
}

