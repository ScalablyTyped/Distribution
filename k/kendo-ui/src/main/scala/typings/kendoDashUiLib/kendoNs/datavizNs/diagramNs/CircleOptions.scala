package typings
package kendoDashUiLib.kendoNs.datavizNs.diagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircleOptions extends js.Object {
  var center: js.UndefOr[js.Any] = js.undefined
  var fill: js.UndefOr[java.lang.String | CircleFill] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var radius: js.UndefOr[scala.Double] = js.undefined
  var stroke: js.UndefOr[CircleStroke] = js.undefined
}

object CircleOptions {
  @scala.inline
  def apply(
    center: js.Any = null,
    fill: java.lang.String | CircleFill = null,
    name: java.lang.String = null,
    radius: scala.Int | scala.Double = null,
    stroke: CircleStroke = null
  ): CircleOptions = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center)
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    __obj.asInstanceOf[CircleOptions]
  }
}

