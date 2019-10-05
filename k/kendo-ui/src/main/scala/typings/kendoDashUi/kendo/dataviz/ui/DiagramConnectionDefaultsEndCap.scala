package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramConnectionDefaultsEndCap extends js.Object {
  var fill: js.UndefOr[String | DiagramConnectionDefaultsEndCapFill] = js.undefined
  var stroke: js.UndefOr[String | DiagramConnectionDefaultsEndCapStroke] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object DiagramConnectionDefaultsEndCap {
  @scala.inline
  def apply(
    fill: String | DiagramConnectionDefaultsEndCapFill = null,
    stroke: String | DiagramConnectionDefaultsEndCapStroke = null,
    `type`: String = null
  ): DiagramConnectionDefaultsEndCap = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DiagramConnectionDefaultsEndCap]
  }
}

