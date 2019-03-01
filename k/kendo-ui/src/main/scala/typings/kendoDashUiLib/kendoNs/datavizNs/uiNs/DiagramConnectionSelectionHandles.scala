package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramConnectionSelectionHandles extends js.Object {
  var fill: js.UndefOr[java.lang.String | DiagramConnectionSelectionHandlesFill] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var stroke: js.UndefOr[DiagramConnectionSelectionHandlesStroke] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object DiagramConnectionSelectionHandles {
  @scala.inline
  def apply(
    fill: java.lang.String | DiagramConnectionSelectionHandlesFill = null,
    height: scala.Int | scala.Double = null,
    stroke: DiagramConnectionSelectionHandlesStroke = null,
    width: scala.Int | scala.Double = null
  ): DiagramConnectionSelectionHandles = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramConnectionSelectionHandles]
  }
}

