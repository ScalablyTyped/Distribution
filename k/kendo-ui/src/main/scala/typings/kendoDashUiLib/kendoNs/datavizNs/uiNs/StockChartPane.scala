package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartPane extends js.Object {
  var background: js.UndefOr[java.lang.String] = js.undefined
  var border: js.UndefOr[StockChartPaneBorder] = js.undefined
  var clip: js.UndefOr[scala.Boolean] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var margin: js.UndefOr[scala.Double | js.Any] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var padding: js.UndefOr[scala.Double | js.Any] = js.undefined
  var title: js.UndefOr[java.lang.String | StockChartPaneTitle] = js.undefined
}

object StockChartPane {
  @scala.inline
  def apply(
    background: java.lang.String = null,
    border: StockChartPaneBorder = null,
    clip: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    margin: scala.Double | js.Any = null,
    name: java.lang.String = null,
    padding: scala.Double | js.Any = null,
    title: java.lang.String | StockChartPaneTitle = null
  ): StockChartPane = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (border != null) __obj.updateDynamic("border")(border)
    if (!js.isUndefined(clip)) __obj.updateDynamic("clip")(clip)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockChartPane]
  }
}

