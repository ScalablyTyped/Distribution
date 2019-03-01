package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramConnectionStartCap extends js.Object {
  var fill: js.UndefOr[java.lang.String | DiagramConnectionStartCapFill] = js.undefined
  var stroke: js.UndefOr[java.lang.String | DiagramConnectionStartCapStroke] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object DiagramConnectionStartCap {
  @scala.inline
  def apply(
    fill: java.lang.String | DiagramConnectionStartCapFill = null,
    stroke: java.lang.String | DiagramConnectionStartCapStroke = null,
    `type`: java.lang.String = null
  ): DiagramConnectionStartCap = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DiagramConnectionStartCap]
  }
}

