package typings.kendoDashUi.kendo.dataviz.diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectorHover extends js.Object {
  var fill: js.UndefOr[String | ConnectorHoverFill] = js.undefined
  var stroke: js.UndefOr[String | ConnectorHoverStroke] = js.undefined
}

object ConnectorHover {
  @scala.inline
  def apply(fill: String | ConnectorHoverFill = null, stroke: String | ConnectorHoverStroke = null): ConnectorHover = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectorHover]
  }
}

