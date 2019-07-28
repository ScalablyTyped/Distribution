package typings.kendoDashUi.kendoNs.datavizNs.diagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathEndCap extends js.Object {
  var fill: js.UndefOr[String | PathEndCapFill] = js.undefined
  var stroke: js.UndefOr[String | PathEndCapStroke] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object PathEndCap {
  @scala.inline
  def apply(
    fill: String | PathEndCapFill = null,
    stroke: String | PathEndCapStroke = null,
    `type`: String = null
  ): PathEndCap = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PathEndCap]
  }
}

