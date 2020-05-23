package typings.kendoUi.kendo.dataviz.diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShapeConnectorDefaultsHoverFill extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
}

object ShapeConnectorDefaultsHoverFill {
  @scala.inline
  def apply(color: String = null, opacity: js.UndefOr[Double] = js.undefined): ShapeConnectorDefaultsHoverFill = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeConnectorDefaultsHoverFill]
  }
}

