package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramConnectionDefaultsSelectionHandles extends js.Object {
  var fill: js.UndefOr[String | DiagramConnectionDefaultsSelectionHandlesFill] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var stroke: js.UndefOr[DiagramConnectionDefaultsSelectionHandlesStroke] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object DiagramConnectionDefaultsSelectionHandles {
  @scala.inline
  def apply(
    fill: String | DiagramConnectionDefaultsSelectionHandlesFill = null,
    height: js.UndefOr[Double] = js.undefined,
    stroke: DiagramConnectionDefaultsSelectionHandlesStroke = null,
    width: js.UndefOr[Double] = js.undefined
  ): DiagramConnectionDefaultsSelectionHandles = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramConnectionDefaultsSelectionHandles]
  }
}

