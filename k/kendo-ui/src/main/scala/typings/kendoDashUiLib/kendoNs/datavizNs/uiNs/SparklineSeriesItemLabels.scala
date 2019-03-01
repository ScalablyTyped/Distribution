package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklineSeriesItemLabels extends js.Object {
  var align: js.UndefOr[java.lang.String] = js.undefined
  var background: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var border: js.UndefOr[SparklineSeriesItemLabelsBorder] = js.undefined
  var color: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var distance: js.UndefOr[scala.Double] = js.undefined
  var font: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var format: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var margin: js.UndefOr[scala.Double | js.Any] = js.undefined
  var padding: js.UndefOr[scala.Double | js.Any] = js.undefined
  var position: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var template: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var visible: js.UndefOr[scala.Boolean | js.Function] = js.undefined
}

object SparklineSeriesItemLabels {
  @scala.inline
  def apply(
    align: java.lang.String = null,
    background: java.lang.String | js.Function = null,
    border: SparklineSeriesItemLabelsBorder = null,
    color: java.lang.String | js.Function = null,
    distance: scala.Int | scala.Double = null,
    font: java.lang.String | js.Function = null,
    format: java.lang.String | js.Function = null,
    margin: scala.Double | js.Any = null,
    padding: scala.Double | js.Any = null,
    position: java.lang.String | js.Function = null,
    template: java.lang.String | js.Function = null,
    visible: scala.Boolean | js.Function = null
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

