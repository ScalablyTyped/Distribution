package typings.kendoUi.kendo.dataviz.diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathStartCap extends js.Object {
  var fill: js.UndefOr[String | PathStartCapFill] = js.undefined
  var stroke: js.UndefOr[String | PathStartCapStroke] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object PathStartCap {
  @scala.inline
  def apply(
    fill: String | PathStartCapFill = null,
    stroke: String | PathStartCapStroke = null,
    `type`: String = null
  ): PathStartCap = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathStartCap]
  }
}

