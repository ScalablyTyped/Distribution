package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramConnectionSelectionHandles extends js.Object {
  var fill: js.UndefOr[String | DiagramConnectionSelectionHandlesFill] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var stroke: js.UndefOr[DiagramConnectionSelectionHandlesStroke] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object DiagramConnectionSelectionHandles {
  @scala.inline
  def apply(
    fill: String | DiagramConnectionSelectionHandlesFill = null,
    height: js.UndefOr[Double] = js.undefined,
    stroke: DiagramConnectionSelectionHandlesStroke = null,
    width: js.UndefOr[Double] = js.undefined
  ): DiagramConnectionSelectionHandles = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramConnectionSelectionHandles]
  }
}

