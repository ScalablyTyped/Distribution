package typings
package kendoDashUiLib.kendoNs.datavizNs.diagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolylineFillGradient extends js.Object {
  var center: js.UndefOr[js.Any] = js.undefined
  var end: js.UndefOr[js.Any] = js.undefined
  var radius: js.UndefOr[scala.Double] = js.undefined
  var start: js.UndefOr[js.Any] = js.undefined
  var stops: js.UndefOr[js.Array[PolylineFillGradientStop]] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object PolylineFillGradient {
  @scala.inline
  def apply(
    center: js.Any = null,
    end: js.Any = null,
    radius: scala.Int | scala.Double = null,
    start: js.Any = null,
    stops: js.Array[PolylineFillGradientStop] = null,
    `type`: java.lang.String = null
  ): PolylineFillGradient = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center)
    if (end != null) __obj.updateDynamic("end")(end)
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start)
    if (stops != null) __obj.updateDynamic("stops")(stops)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PolylineFillGradient]
  }
}

