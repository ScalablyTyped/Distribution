package typings.jupyterlabTooltip

import org.scalablytyped.runtime.TopLevel
import typings.jupyterlabTooltip.widgetMod.Tooltip.IOptions
import typings.luminoCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/tooltip", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object ITooltipManager
    extends TopLevel[Token[typings.jupyterlabTooltip.tokensMod.ITooltipManager]]
  
  @js.native
  class Tooltip protected ()
    extends typings.jupyterlabTooltip.widgetMod.Tooltip {
    /**
      * Instantiate a tooltip.
      */
    def this(options: IOptions) = this()
  }
}
