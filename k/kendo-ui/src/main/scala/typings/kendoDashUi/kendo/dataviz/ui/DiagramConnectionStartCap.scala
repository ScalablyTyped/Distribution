package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramConnectionStartCap extends js.Object {
  var fill: js.UndefOr[String | DiagramConnectionStartCapFill] = js.undefined
  var stroke: js.UndefOr[String | DiagramConnectionStartCapStroke] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object DiagramConnectionStartCap {
  @scala.inline
  def apply(
    fill: String | DiagramConnectionStartCapFill = null,
    stroke: String | DiagramConnectionStartCapStroke = null,
    `type`: String = null
  ): DiagramConnectionStartCap = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DiagramConnectionStartCap]
  }
}

