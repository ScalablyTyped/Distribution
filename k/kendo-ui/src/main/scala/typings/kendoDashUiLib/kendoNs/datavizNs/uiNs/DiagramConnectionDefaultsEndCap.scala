package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramConnectionDefaultsEndCap extends js.Object {
  var fill: js.UndefOr[java.lang.String | DiagramConnectionDefaultsEndCapFill] = js.undefined
  var stroke: js.UndefOr[java.lang.String | DiagramConnectionDefaultsEndCapStroke] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object DiagramConnectionDefaultsEndCap {
  @scala.inline
  def apply(
    fill: java.lang.String | DiagramConnectionDefaultsEndCapFill = null,
    stroke: java.lang.String | DiagramConnectionDefaultsEndCapStroke = null,
    `type`: java.lang.String = null
  ): DiagramConnectionDefaultsEndCap = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DiagramConnectionDefaultsEndCap]
  }
}

