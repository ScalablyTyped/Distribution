package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTooltipMethods extends js.Object {
  def destroy(): Unit
}

object IgTooltipMethods {
  @scala.inline
  def apply(destroy: () => Unit): IgTooltipMethods = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
  
    __obj.asInstanceOf[IgTooltipMethods]
  }
}

