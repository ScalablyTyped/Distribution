package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartAxisDefaultsLabels extends js.Object {
  var font: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var margin: js.UndefOr[Double | ChartAxisDefaultsLabelsMargin] = js.undefined
  var mirror: js.UndefOr[Boolean] = js.undefined
  var padding: js.UndefOr[Double | ChartAxisDefaultsLabelsPadding] = js.undefined
  var rotation: js.UndefOr[String | Double | ChartAxisDefaultsLabelsRotation] = js.undefined
  var skip: js.UndefOr[Double] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
  var template: js.UndefOr[String | js.Function] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var visual: js.UndefOr[js.Function] = js.undefined
}

object ChartAxisDefaultsLabels {
  @scala.inline
  def apply(
    font: String = null,
    format: String = null,
    margin: Double | ChartAxisDefaultsLabelsMargin = null,
    mirror: js.UndefOr[Boolean] = js.undefined,
    padding: Double | ChartAxisDefaultsLabelsPadding = null,
    rotation: String | Double | ChartAxisDefaultsLabelsRotation = null,
    skip: js.UndefOr[Double] = js.undefined,
    step: js.UndefOr[Double] = js.undefined,
    template: String | js.Function = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    visual: js.Function = null
  ): ChartAxisDefaultsLabels = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(mirror)) __obj.updateDynamic("mirror")(mirror.get.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (visual != null) __obj.updateDynamic("visual")(visual.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartAxisDefaultsLabels]
  }
}

