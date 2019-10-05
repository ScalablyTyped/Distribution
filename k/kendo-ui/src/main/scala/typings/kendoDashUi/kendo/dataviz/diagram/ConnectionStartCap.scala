package typings.kendoDashUi.kendo.dataviz.diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionStartCap extends js.Object {
  var fill: js.UndefOr[String | ConnectionStartCapFill] = js.undefined
  var stroke: js.UndefOr[String | ConnectionStartCapStroke] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object ConnectionStartCap {
  @scala.inline
  def apply(
    fill: String | ConnectionStartCapFill = null,
    stroke: String | ConnectionStartCapStroke = null,
    `type`: String = null
  ): ConnectionStartCap = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ConnectionStartCap]
  }
}

