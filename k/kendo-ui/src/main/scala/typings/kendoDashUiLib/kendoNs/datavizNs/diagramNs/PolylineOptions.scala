package typings
package kendoDashUiLib.kendoNs.datavizNs.diagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolylineOptions extends js.Object {
  var endCap: js.UndefOr[java.lang.String | PolylineEndCap] = js.undefined
  var fill: js.UndefOr[java.lang.String | PolylineFill] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var startCap: js.UndefOr[java.lang.String | PolylineStartCap] = js.undefined
  var stroke: js.UndefOr[PolylineStroke] = js.undefined
}

object PolylineOptions {
  @scala.inline
  def apply(
    endCap: java.lang.String | PolylineEndCap = null,
    fill: java.lang.String | PolylineFill = null,
    name: java.lang.String = null,
    startCap: java.lang.String | PolylineStartCap = null,
    stroke: PolylineStroke = null
  ): PolylineOptions = {
    val __obj = js.Dynamic.literal()
    if (endCap != null) __obj.updateDynamic("endCap")(endCap.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (startCap != null) __obj.updateDynamic("startCap")(startCap.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    __obj.asInstanceOf[PolylineOptions]
  }
}

