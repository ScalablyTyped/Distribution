package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartLegend extends js.Object {
  var align: js.UndefOr[String] = js.undefined
  var background: js.UndefOr[String] = js.undefined
  var border: js.UndefOr[ChartLegendBorder] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var inactiveItems: js.UndefOr[ChartLegendInactiveItems] = js.undefined
  var item: js.UndefOr[ChartLegendItem] = js.undefined
  var labels: js.UndefOr[ChartLegendLabels] = js.undefined
  var margin: js.UndefOr[Double | ChartLegendMargin] = js.undefined
  var offsetX: js.UndefOr[Double] = js.undefined
  var offsetY: js.UndefOr[Double] = js.undefined
  var orientation: js.UndefOr[String] = js.undefined
  var padding: js.UndefOr[Double | ChartLegendPadding] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var reverse: js.UndefOr[Boolean] = js.undefined
  var spacing: js.UndefOr[Double] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object ChartLegend {
  @scala.inline
  def apply(
    align: String = null,
    background: String = null,
    border: ChartLegendBorder = null,
    height: Int | Double = null,
    inactiveItems: ChartLegendInactiveItems = null,
    item: ChartLegendItem = null,
    labels: ChartLegendLabels = null,
    margin: Double | ChartLegendMargin = null,
    offsetX: Int | Double = null,
    offsetY: Int | Double = null,
    orientation: String = null,
    padding: Double | ChartLegendPadding = null,
    position: String = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    spacing: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): ChartLegend = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (inactiveItems != null) __obj.updateDynamic("inactiveItems")(inactiveItems.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartLegend]
  }
}

