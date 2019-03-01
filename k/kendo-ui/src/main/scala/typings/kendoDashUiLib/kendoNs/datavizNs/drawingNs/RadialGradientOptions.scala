package typings
package kendoDashUiLib.kendoNs.datavizNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadialGradientOptions extends js.Object {
  var center: js.UndefOr[js.Any | kendoDashUiLib.kendoNs.geometryNs.Point] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var radius: js.UndefOr[scala.Double] = js.undefined
  var stops: js.UndefOr[js.Any] = js.undefined
}

object RadialGradientOptions {
  @scala.inline
  def apply(
    center: js.Any | kendoDashUiLib.kendoNs.geometryNs.Point = null,
    name: java.lang.String = null,
    radius: scala.Int | scala.Double = null,
    stops: js.Any = null
  ): RadialGradientOptions = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (stops != null) __obj.updateDynamic("stops")(stops)
    __obj.asInstanceOf[RadialGradientOptions]
  }
}

