package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramShapeRotation extends js.Object {
  var angle: js.UndefOr[Double] = js.undefined
}

object DiagramShapeRotation {
  @scala.inline
  def apply(angle: js.UndefOr[Double] = js.undefined): DiagramShapeRotation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(angle)) __obj.updateDynamic("angle")(angle.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramShapeRotation]
  }
}

