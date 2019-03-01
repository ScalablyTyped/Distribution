package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramConnectionDefaultsSelectionHandles extends js.Object {
  var fill: js.UndefOr[java.lang.String | DiagramConnectionDefaultsSelectionHandlesFill] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var stroke: js.UndefOr[DiagramConnectionDefaultsSelectionHandlesStroke] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object DiagramConnectionDefaultsSelectionHandles {
  @scala.inline
  def apply(
    fill: java.lang.String | DiagramConnectionDefaultsSelectionHandlesFill = null,
    height: scala.Int | scala.Double = null,
    stroke: DiagramConnectionDefaultsSelectionHandlesStroke = null,
    width: scala.Int | scala.Double = null
  ): DiagramConnectionDefaultsSelectionHandles = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramConnectionDefaultsSelectionHandles]
  }
}

