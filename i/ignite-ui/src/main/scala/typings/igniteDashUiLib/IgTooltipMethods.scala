package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTooltipMethods extends js.Object {
  def destroy(): scala.Unit
}

object IgTooltipMethods {
  @scala.inline
  def apply(destroy: js.Function0[scala.Unit]): IgTooltipMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy)
    __obj.asInstanceOf[IgTooltipMethods]
  }
}

