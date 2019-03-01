package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartLegend extends js.Object {
  var align: js.UndefOr[java.lang.String] = js.undefined
  var background: js.UndefOr[java.lang.String] = js.undefined
  var border: js.UndefOr[ChartLegendBorder] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var inactiveItems: js.UndefOr[ChartLegendInactiveItems] = js.undefined
  var item: js.UndefOr[ChartLegendItem] = js.undefined
  var labels: js.UndefOr[ChartLegendLabels] = js.undefined
  var margin: js.UndefOr[ChartLegendMargin] = js.undefined
  var offsetX: js.UndefOr[scala.Double] = js.undefined
  var offsetY: js.UndefOr[scala.Double] = js.undefined
  var orientation: js.UndefOr[java.lang.String] = js.undefined
  var padding: js.UndefOr[ChartLegendPadding] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
  var reverse: js.UndefOr[scala.Boolean] = js.undefined
  var spacing: js.UndefOr[scala.Double] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ChartLegend {
  @scala.inline
  def apply(
    align: java.lang.String = null,
    background: java.lang.String = null,
    border: ChartLegendBorder = null,
    height: scala.Int | scala.Double = null,
    inactiveItems: ChartLegendInactiveItems = null,
    item: ChartLegendItem = null,
    labels: ChartLegendLabels = null,
    margin: ChartLegendMargin = null,
    offsetX: scala.Int | scala.Double = null,
    offsetY: scala.Int | scala.Double = null,
    orientation: java.lang.String = null,
    padding: ChartLegendPadding = null,
    position: java.lang.String = null,
    reverse: js.UndefOr[scala.Boolean] = js.undefined,
    spacing: scala.Int | scala.Double = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): ChartLegend = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (background != null) __obj.updateDynamic("background")(background)
    if (border != null) __obj.updateDynamic("border")(border)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (inactiveItems != null) __obj.updateDynamic("inactiveItems")(inactiveItems)
    if (item != null) __obj.updateDynamic("item")(item)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (offsetX != null) __obj.updateDynamic("offsetX")(offsetX.asInstanceOf[js.Any])
    if (offsetY != null) __obj.updateDynamic("offsetY")(offsetY.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartLegend]
  }
}

