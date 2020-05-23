package typings.kendoUi.kendo.dataviz.drawing

import typings.kendoUi.kendo.geometry.Transformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathOptions extends js.Object {
  var clip: js.UndefOr[typings.kendoUi.kendo.drawing.Path] = js.undefined
  var cursor: js.UndefOr[String] = js.undefined
  var fill: js.UndefOr[typings.kendoUi.kendo.drawing.FillOptions] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var stroke: js.UndefOr[typings.kendoUi.kendo.drawing.StrokeOptions] = js.undefined
  var tooltip: js.UndefOr[typings.kendoUi.kendo.drawing.TooltipOptions] = js.undefined
  var transform: js.UndefOr[Transformation] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object PathOptions {
  @scala.inline
  def apply(
    clip: typings.kendoUi.kendo.drawing.Path = null,
    cursor: String = null,
    fill: typings.kendoUi.kendo.drawing.FillOptions = null,
    name: String = null,
    opacity: js.UndefOr[Double] = js.undefined,
    stroke: typings.kendoUi.kendo.drawing.StrokeOptions = null,
    tooltip: typings.kendoUi.kendo.drawing.TooltipOptions = null,
    transform: Transformation = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): PathOptions = {
    val __obj = js.Dynamic.literal()
    if (clip != null) __obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOptions]
  }
}

