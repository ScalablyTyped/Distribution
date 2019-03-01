package typings
package kendoDashUiLib.kendoNs.datavizNs.diagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShapeConnectorDefaultsFill extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
}

object ShapeConnectorDefaultsFill {
  @scala.inline
  def apply(color: java.lang.String = null, opacity: scala.Int | scala.Double = null): ShapeConnectorDefaultsFill = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeConnectorDefaultsFill]
  }
}

