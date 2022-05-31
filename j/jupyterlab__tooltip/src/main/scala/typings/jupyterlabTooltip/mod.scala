package typings.jupyterlabTooltip

import typings.jupyterlabTooltip.widgetMod.Tooltip.IOptions
import typings.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/tooltip", "ITooltipManager")
  @js.native
  val ITooltipManager: Token[typings.jupyterlabTooltip.tokensMod.ITooltipManager] = js.native
  
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
