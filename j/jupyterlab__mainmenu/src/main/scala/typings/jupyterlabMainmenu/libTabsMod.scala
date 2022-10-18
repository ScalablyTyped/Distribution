package typings.jupyterlabMainmenu

import typings.jupyterlabUiComponents.libComponentsMenuMod.IRankedMenu
import typings.jupyterlabUiComponents.libComponentsMenuMod.IRankedMenu.IOptions
import typings.jupyterlabUiComponents.mod.RankedMenu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTabsMod {
  
  @JSImport("@jupyterlab/mainmenu/lib/tabs", "TabsMenu")
  @js.native
  open class TabsMenu protected () extends RankedMenu {
    /**
      * Construct the tabs menu.
      */
    def this(options: IOptions) = this()
  }
  
  type ITabsMenu = IRankedMenu
}
