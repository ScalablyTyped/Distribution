package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartPane extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var border: js.UndefOr[ChartPaneBorder] = js.undefined
  var clip: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var margin: js.UndefOr[Double | ChartPaneMargin] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var padding: js.UndefOr[ChartPanePadding] = js.undefined
  var title: js.UndefOr[String | ChartPaneTitle] = js.undefined
}

object ChartPane {
  @scala.inline
  def apply(
    background: String = null,
    border: ChartPaneBorder = null,
    clip: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    margin: Double | ChartPaneMargin = null,
    name: String = null,
    padding: ChartPanePadding = null,
    title: String | ChartPaneTitle = null
  ): ChartPane = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (!js.isUndefined(clip)) __obj.updateDynamic("clip")(clip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartPane]
  }
}

