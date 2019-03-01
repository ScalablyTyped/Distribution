package typings
package kendoDashUiLib.kendoNs.datavizNs.diagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathStartCap extends js.Object {
  var fill: js.UndefOr[java.lang.String | PathStartCapFill] = js.undefined
  var stroke: js.UndefOr[java.lang.String | PathStartCapStroke] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object PathStartCap {
  @scala.inline
  def apply(
    fill: java.lang.String | PathStartCapFill = null,
    stroke: java.lang.String | PathStartCapStroke = null,
    `type`: java.lang.String = null
  ): PathStartCap = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PathStartCap]
  }
}

