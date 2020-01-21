package typings.kendoUi.kendo.dataviz.diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionEndCapFill extends js.Object {
  var color: js.UndefOr[String] = js.undefined
}

object ConnectionEndCapFill {
  @scala.inline
  def apply(color: String = null): ConnectionEndCapFill = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionEndCapFill]
  }
}

