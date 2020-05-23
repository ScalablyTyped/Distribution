package typings.kendoUi.kendo.dataviz.diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShapeRotation extends js.Object {
  var angle: js.UndefOr[Double] = js.undefined
}

object ShapeRotation {
  @scala.inline
  def apply(angle: js.UndefOr[Double] = js.undefined): ShapeRotation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(angle)) __obj.updateDynamic("angle")(angle.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeRotation]
  }
}

