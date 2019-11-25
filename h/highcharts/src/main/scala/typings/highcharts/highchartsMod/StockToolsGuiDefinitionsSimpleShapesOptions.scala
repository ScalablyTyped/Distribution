package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockToolsGuiDefinitionsSimpleShapesOptions extends js.Object {
  var circle: js.UndefOr[StockToolsGuiDefinitionsSimpleShapesCircleOptions] = js.undefined
  /**
    * (Highstock) A collection of strings pointing to config options for the
    * items.
    */
  var items: js.UndefOr[js.Array[_]] = js.undefined
  var label: js.UndefOr[StockToolsGuiDefinitionsSimpleShapesLabelOptions] = js.undefined
  var rectangle: js.UndefOr[StockToolsGuiDefinitionsSimpleShapesRectangleOptions] = js.undefined
}

object StockToolsGuiDefinitionsSimpleShapesOptions {
  @scala.inline
  def apply(
    circle: StockToolsGuiDefinitionsSimpleShapesCircleOptions = null,
    items: js.Array[_] = null,
    label: StockToolsGuiDefinitionsSimpleShapesLabelOptions = null,
    rectangle: StockToolsGuiDefinitionsSimpleShapesRectangleOptions = null
  ): StockToolsGuiDefinitionsSimpleShapesOptions = {
    val __obj = js.Dynamic.literal()
    if (circle != null) __obj.updateDynamic("circle")(circle.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (rectangle != null) __obj.updateDynamic("rectangle")(rectangle.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockToolsGuiDefinitionsSimpleShapesOptions]
  }
}

