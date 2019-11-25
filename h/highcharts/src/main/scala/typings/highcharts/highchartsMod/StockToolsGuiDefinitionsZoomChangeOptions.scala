package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockToolsGuiDefinitionsZoomChangeOptions extends js.Object {
  /**
    * (Highstock) A collection of strings pointing to config options for the
    * items.
    */
  var items: js.UndefOr[js.Array[_]] = js.undefined
  var zoomX: js.UndefOr[StockToolsGuiDefinitionsZoomChangeZoomXOptions] = js.undefined
  var zoomXY: js.UndefOr[StockToolsGuiDefinitionsZoomChangeZoomXYOptions] = js.undefined
  var zoomY: js.UndefOr[StockToolsGuiDefinitionsZoomChangeZoomYOptions] = js.undefined
}

object StockToolsGuiDefinitionsZoomChangeOptions {
  @scala.inline
  def apply(
    items: js.Array[_] = null,
    zoomX: StockToolsGuiDefinitionsZoomChangeZoomXOptions = null,
    zoomXY: StockToolsGuiDefinitionsZoomChangeZoomXYOptions = null,
    zoomY: StockToolsGuiDefinitionsZoomChangeZoomYOptions = null
  ): StockToolsGuiDefinitionsZoomChangeOptions = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (zoomX != null) __obj.updateDynamic("zoomX")(zoomX.asInstanceOf[js.Any])
    if (zoomXY != null) __obj.updateDynamic("zoomXY")(zoomXY.asInstanceOf[js.Any])
    if (zoomY != null) __obj.updateDynamic("zoomY")(zoomY.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockToolsGuiDefinitionsZoomChangeOptions]
  }
}

