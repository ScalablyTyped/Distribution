package typings
package kendoDashUiLib.kendoNs.datavizNs.diagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolylineStartCap extends js.Object {
  var fill: js.UndefOr[java.lang.String | PolylineStartCapFill] = js.undefined
  var stroke: js.UndefOr[java.lang.String | PolylineStartCapStroke] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object PolylineStartCap {
  @scala.inline
  def apply(
    fill: java.lang.String | PolylineStartCapFill = null,
    stroke: java.lang.String | PolylineStartCapStroke = null,
    `type`: java.lang.String = null
  ): PolylineStartCap = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PolylineStartCap]
  }
}

