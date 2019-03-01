package typings
package kendoDashUiLib.kendoNs.datavizNs.diagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectorHover extends js.Object {
  var fill: js.UndefOr[java.lang.String | ConnectorHoverFill] = js.undefined
  var stroke: js.UndefOr[java.lang.String | ConnectorHoverStroke] = js.undefined
}

object ConnectorHover {
  @scala.inline
  def apply(
    fill: java.lang.String | ConnectorHoverFill = null,
    stroke: java.lang.String | ConnectorHoverStroke = null
  ): ConnectorHover = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectorHover]
  }
}

