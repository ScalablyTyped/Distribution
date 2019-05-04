package typings
package atJupyterlabTooltipLib.atJupyterlabTooltipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITooltipManager extends js.Object {
  /**
    * Invoke a tooltip.
    */
  def invoke(options: atJupyterlabTooltipLib.atJupyterlabTooltipMod.ITooltipManagerNs.IOptions): scala.Unit
}

object ITooltipManager {
  @scala.inline
  def apply(invoke: atJupyterlabTooltipLib.atJupyterlabTooltipMod.ITooltipManagerNs.IOptions => scala.Unit): ITooltipManager = {
    val __obj = js.Dynamic.literal(invoke = js.Any.fromFunction1(invoke))
  
    __obj.asInstanceOf[ITooltipManager]
  }
}

