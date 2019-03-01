package typings
package kendoDashUiLib.kendoNs.datavizNs.diagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionEndCap extends js.Object {
  var fill: js.UndefOr[java.lang.String | ConnectionEndCapFill] = js.undefined
  var stroke: js.UndefOr[java.lang.String | ConnectionEndCapStroke] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ConnectionEndCap {
  @scala.inline
  def apply(
    fill: java.lang.String | ConnectionEndCapFill = null,
    stroke: java.lang.String | ConnectionEndCapStroke = null,
    `type`: java.lang.String = null
  ): ConnectionEndCap = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ConnectionEndCap]
  }
}

