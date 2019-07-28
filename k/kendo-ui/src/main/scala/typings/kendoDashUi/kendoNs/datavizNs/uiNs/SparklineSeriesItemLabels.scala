package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklineSeriesItemLabels extends js.Object {
  var align: js.UndefOr[String] = js.undefined
  var background: js.UndefOr[String | js.Function] = js.undefined
  var border: js.UndefOr[SparklineSeriesItemLabelsBorder] = js.undefined
  var color: js.UndefOr[String | js.Function] = js.undefined
  var distance: js.UndefOr[Double] = js.undefined
  var font: js.UndefOr[String | js.Function] = js.undefined
  var format: js.UndefOr[String | js.Function] = js.undefined
  var margin: js.UndefOr[Double | js.Any] = js.undefined
  var padding: js.UndefOr[Double | js.Any] = js.undefined
  var position: js.UndefOr[String | js.Function] = js.undefined
  var template: js.UndefOr[String | js.Function] = js.undefined
  var visible: js.UndefOr[Boolean | js.Function] = js.undefined
}

object SparklineSeriesItemLabels {
  @scala.inline
  def apply(
    align: String = null,
    background: String | js.Function = null,
    border: SparklineSeriesItemLabelsBorder = null,
    color: String | js.Function = null,
    distance: Int | Double = null,
    font: String | js.Function = null,
    format: String | js.Function = null,
    margin: Double | js.Any = null,
    padding: Double | js.Any = null,
    position: String | js.Function = null,
    template: String | js.Function = null,
    visible: Boolean | js.Function = null
  ): SparklineSeriesItemLabels = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (visible != null) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparklineSeriesItemLabels]
  }
}

