package typings.jupyterlabMainmenu

import typings.jupyterlabUiComponents.menuMod.IRankedMenu
import typings.jupyterlabUiComponents.menuMod.IRankedMenu.IOptions
import typings.jupyterlabUiComponents.mod.RankedMenu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settingsMod {
  
  @JSImport("@jupyterlab/mainmenu/lib/settings", "SettingsMenu")
  @js.native
  open class SettingsMenu protected () extends RankedMenu {
    /**
      * Construct the settings menu.
      */
    def this(options: IOptions) = this()
  }
  
  type ISettingsMenu = IRankedMenu
}
