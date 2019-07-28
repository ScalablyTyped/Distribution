package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramShapeDefaultsRotation extends js.Object {
  var angle: js.UndefOr[Double] = js.undefined
}

object DiagramShapeDefaultsRotation {
  @scala.inline
  def apply(angle: Int | Double = null): DiagramShapeDefaultsRotation = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramShapeDefaultsRotation]
  }
}

