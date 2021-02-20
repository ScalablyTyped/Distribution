package typings.jupyterlabTooltip

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabTooltip.widgetMod.Tooltip.IOptions
import typings.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object ITooltipManager extends Shortcut {
    
    @JSImport("@jupyterlab/tooltip", "ITooltipManager")
    @js.native
    val ^ : Token[typings.jupyterlabTooltip.tokensMod.ITooltipManager] = js.native
    
    type _To = Token[typings.jupyterlabTooltip.tokensMod.ITooltipManager]
    
    /* This means you don't have to write `^`, but can instead just say `ITooltipManager.foo` */
    override def _to: Token[typings.jupyterlabTooltip.tokensMod.ITooltipManager] = ^
  }
  
  @JSImport("@jupyterlab/tooltip", "Tooltip")
  @js.native
  class Tooltip protected ()
    extends typings.jupyterlabTooltip.widgetMod.Tooltip {
    /**
      * Instantiate a tooltip.
      */
    def this(options: IOptions) = this()
  }
}
