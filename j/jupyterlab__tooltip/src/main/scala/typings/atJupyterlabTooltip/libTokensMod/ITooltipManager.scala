package typings.atJupyterlabTooltip.libTokensMod

import typings.atJupyterlabTooltip.libTokensMod.ITooltipManagerNs.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITooltipManager extends js.Object {
  /**
    * Invoke a tooltip.
    */
  def invoke(options: IOptions): Unit
}

object ITooltipManager {
  @scala.inline
  def apply(invoke: IOptions => Unit): ITooltipManager = {
    val __obj = js.Dynamic.literal(invoke = js.Any.fromFunction1(invoke))
  
    __obj.asInstanceOf[ITooltipManager]
  }
}

