package typings.atJupyterlabTooltip

import org.scalablytyped.runtime.TopLevel
import typings.atJupyterlabTooltip.libWidgetMod.Tooltip.IOptions
import typings.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/tooltip", JSImport.Namespace)
@js.native
object atJupyterlabTooltipMod extends js.Object {
  @js.native
  class Tooltip protected ()
    extends typings.atJupyterlabTooltip.libWidgetMod.Tooltip {
    /**
      * Instantiate a tooltip.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  object ITooltipManager
    extends TopLevel[Token[typings.atJupyterlabTooltip.libTokensMod.ITooltipManager]]
  
}

