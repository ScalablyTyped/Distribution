package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramLayoutGrid extends js.Object {
  var componentSpacingX: js.UndefOr[Double] = js.undefined
  var componentSpacingY: js.UndefOr[Double] = js.undefined
  var offsetX: js.UndefOr[Double] = js.undefined
  var offsetY: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object DiagramLayoutGrid {
  @scala.inline
  def apply(
    componentSpacingX: js.UndefOr[Double] = js.undefined,
    componentSpacingY: js.UndefOr[Double] = js.undefined,
    offsetX: js.UndefOr[Double] = js.undefined,
    offsetY: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): DiagramLayoutGrid = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(componentSpacingX)) __obj.updateDynamic("componentSpacingX")(componentSpacingX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(componentSpacingY)) __obj.updateDynamic("componentSpacingY")(componentSpacingY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetX)) __obj.updateDynamic("offsetX")(offsetX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetY)) __obj.updateDynamic("offsetY")(offsetY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramLayoutGrid]
  }
}

