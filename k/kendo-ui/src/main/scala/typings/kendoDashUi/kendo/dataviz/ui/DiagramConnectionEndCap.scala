package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramConnectionEndCap extends js.Object {
  var fill: js.UndefOr[String | DiagramConnectionEndCapFill] = js.undefined
  var stroke: js.UndefOr[String | DiagramConnectionEndCapStroke] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object DiagramConnectionEndCap {
  @scala.inline
  def apply(
    fill: String | DiagramConnectionEndCapFill = null,
    stroke: String | DiagramConnectionEndCapStroke = null,
    `type`: String = null
  ): DiagramConnectionEndCap = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramConnectionEndCap]
  }
}

