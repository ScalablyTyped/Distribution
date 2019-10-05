package typings.atJupyterlabTooltip.libTokensMod

import typings.atJupyterlabTooltip.libTokensMod.ITooltipManager.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("ITooltipManager")
trait ITooltipManager_ extends js.Object {
  /**
    * Invoke a tooltip.
    */
  def invoke(options: IOptions): Unit
}

object ITooltipManager_ {
  @scala.inline
  def apply(invoke: IOptions => Unit): ITooltipManager_ = {
    val __obj = js.Dynamic.literal(invoke = js.Any.fromFunction1(invoke))
  
    __obj.asInstanceOf[ITooltipManager_]
  }
}

