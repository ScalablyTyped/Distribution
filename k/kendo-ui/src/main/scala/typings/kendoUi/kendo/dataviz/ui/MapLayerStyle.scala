package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapLayerStyle extends js.Object {
  var fill: js.UndefOr[MapLayerStyleFill] = js.undefined
  var stroke: js.UndefOr[MapLayerStyleStroke] = js.undefined
}

object MapLayerStyle {
  @scala.inline
  def apply(fill: MapLayerStyleFill = null, stroke: MapLayerStyleStroke = null): MapLayerStyle = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLayerStyle]
  }
}

