package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramConnectionDefaultsStartCap extends js.Object {
  var fill: js.UndefOr[String | DiagramConnectionDefaultsStartCapFill] = js.undefined
  var stroke: js.UndefOr[String | DiagramConnectionDefaultsStartCapStroke] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object DiagramConnectionDefaultsStartCap {
  @scala.inline
  def apply(
    fill: String | DiagramConnectionDefaultsStartCapFill = null,
    stroke: String | DiagramConnectionDefaultsStartCapStroke = null,
    `type`: String = null
  ): DiagramConnectionDefaultsStartCap = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramConnectionDefaultsStartCap]
  }
}

