package typings.kendoDashUi.kendo.dataviz.ui

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
    componentSpacingX: Int | Double = null,
    componentSpacingY: Int | Double = null,
    offsetX: Int | Double = null,
    offsetY: Int | Double = null,
    width: Int | Double = null
  ): DiagramLayoutGrid = {
    val __obj = js.Dynamic.literal()
    if (componentSpacingX != null) __obj.updateDynamic("componentSpacingX")(componentSpacingX.asInstanceOf[js.Any])
    if (componentSpacingY != null) __obj.updateDynamic("componentSpacingY")(componentSpacingY.asInstanceOf[js.Any])
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramLayoutGrid]
  }
}

