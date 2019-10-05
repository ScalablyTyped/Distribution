package typings.kendoDashUi.kendo.dataviz.ui

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
    height: Int | Double = null,
    stroke: DiagramConnectionDefaultsSelectionHandlesStroke = null,
    width: Int | Double = null
  ): DiagramConnectionDefaultsSelectionHandles = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramConnectionDefaultsSelectionHandles]
  }
}

