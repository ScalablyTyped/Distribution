package typings.kendoUi.kendo.dataviz.diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectorOptions extends js.Object {
  var fill: js.UndefOr[String | ConnectorFill] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hover: js.UndefOr[ConnectorHover] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var stroke: js.UndefOr[String | ConnectorStroke] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object ConnectorOptions {
  @scala.inline
  def apply(
    fill: String | ConnectorFill = null,
    height: js.UndefOr[Double] = js.undefined,
    hover: ConnectorHover = null,
    name: String = null,
    stroke: String | ConnectorStroke = null,
    width: js.UndefOr[Double] = js.undefined
  ): ConnectorOptions = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectorOptions]
  }
}

