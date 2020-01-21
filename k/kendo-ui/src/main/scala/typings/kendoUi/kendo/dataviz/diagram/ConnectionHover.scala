package typings.kendoUi.kendo.dataviz.diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionHover extends js.Object {
  var stroke: js.UndefOr[ConnectionHoverStroke] = js.undefined
}

object ConnectionHover {
  @scala.inline
  def apply(stroke: ConnectionHoverStroke = null): ConnectionHover = {
    val __obj = js.Dynamic.literal()
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionHover]
  }
}

