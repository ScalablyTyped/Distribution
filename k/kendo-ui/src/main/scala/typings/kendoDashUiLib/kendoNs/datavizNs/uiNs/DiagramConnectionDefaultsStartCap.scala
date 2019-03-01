package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramConnectionDefaultsStartCap extends js.Object {
  var fill: js.UndefOr[java.lang.String | DiagramConnectionDefaultsStartCapFill] = js.undefined
  var stroke: js.UndefOr[java.lang.String | DiagramConnectionDefaultsStartCapStroke] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object DiagramConnectionDefaultsStartCap {
  @scala.inline
  def apply(
    fill: java.lang.String | DiagramConnectionDefaultsStartCapFill = null,
    stroke: java.lang.String | DiagramConnectionDefaultsStartCapStroke = null,
    `type`: java.lang.String = null
  ): DiagramConnectionDefaultsStartCap = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DiagramConnectionDefaultsStartCap]
  }
}

