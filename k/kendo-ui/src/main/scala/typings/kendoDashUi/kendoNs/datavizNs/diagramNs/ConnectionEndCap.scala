package typings.kendoDashUi.kendoNs.datavizNs.diagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionEndCap extends js.Object {
  var fill: js.UndefOr[String | ConnectionEndCapFill] = js.undefined
  var stroke: js.UndefOr[String | ConnectionEndCapStroke] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object ConnectionEndCap {
  @scala.inline
  def apply(
    fill: String | ConnectionEndCapFill = null,
    stroke: String | ConnectionEndCapStroke = null,
    `type`: String = null
  ): ConnectionEndCap = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ConnectionEndCap]
  }
}

