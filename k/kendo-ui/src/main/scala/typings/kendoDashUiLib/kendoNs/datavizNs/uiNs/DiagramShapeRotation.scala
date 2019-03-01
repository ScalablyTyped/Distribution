package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramShapeRotation extends js.Object {
  var angle: js.UndefOr[scala.Double] = js.undefined
}

object DiagramShapeRotation {
  @scala.inline
  def apply(angle: scala.Int | scala.Double = null): DiagramShapeRotation = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramShapeRotation]
  }
}

