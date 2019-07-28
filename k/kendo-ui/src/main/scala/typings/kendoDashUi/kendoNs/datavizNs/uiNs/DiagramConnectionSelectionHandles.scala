package typings.kendoDashUi.kendoNs.datavizNs.uiNs

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
    height: Int | Double = null,
    stroke: DiagramConnectionSelectionHandlesStroke = null,
    width: Int | Double = null
  ): DiagramConnectionSelectionHandles = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramConnectionSelectionHandles]
  }
}

