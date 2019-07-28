package typings.kendoDashUi.kendoNs.datavizNs.diagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShapeRotation extends js.Object {
  var angle: js.UndefOr[Double] = js.undefined
}

object ShapeRotation {
  @scala.inline
  def apply(angle: Int | Double = null): ShapeRotation = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeRotation]
  }
}

