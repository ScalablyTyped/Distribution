package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramShapeDefaultsRotation extends js.Object {
  var angle: js.UndefOr[scala.Double] = js.undefined
}

object DiagramShapeDefaultsRotation {
  @scala.inline
  def apply(angle: scala.Int | scala.Double = null): DiagramShapeDefaultsRotation = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramShapeDefaultsRotation]
  }
}

