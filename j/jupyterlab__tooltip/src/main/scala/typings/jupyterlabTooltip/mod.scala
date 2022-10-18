package typings.jupyterlabTooltip

import typings.jupyterlabTooltip.libWidgetMod.Tooltip.IOptions
import typings.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/tooltip", "ITooltipManager")
  @js.native
  val ITooltipManager: Token[typings.jupyterlabTooltip.libTokensMod.ITooltipManager] = js.native
  
  @JSImport("@jupyterlab/tooltip", "Tooltip")
  @js.native
  open class Tooltip protected ()
    extends typings.jupyterlabTooltip.libWidgetMod.Tooltip {
    /**
      * Instantiate a tooltip.
      */
    def this(options: IOptions) = this()
  }
}
