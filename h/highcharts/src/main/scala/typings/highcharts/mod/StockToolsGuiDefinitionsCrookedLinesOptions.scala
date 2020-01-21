package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockToolsGuiDefinitionsCrookedLinesOptions extends js.Object {
  var crooked3: js.UndefOr[StockToolsGuiDefinitionsCrookedLinesCrooked3Options] = js.undefined
  var crooked5: js.UndefOr[StockToolsGuiDefinitionsCrookedLinesCrooked5Options] = js.undefined
  var elliott3: js.UndefOr[StockToolsGuiDefinitionsCrookedLinesElliott3Options] = js.undefined
  var elliott5: js.UndefOr[StockToolsGuiDefinitionsCrookedLinesElliott5Options] = js.undefined
  /**
    * (Highstock) A collection of strings pointing to config options for the
    * items.
    */
  var items: js.UndefOr[js.Array[_]] = js.undefined
}

object StockToolsGuiDefinitionsCrookedLinesOptions {
  @scala.inline
  def apply(
    crooked3: StockToolsGuiDefinitionsCrookedLinesCrooked3Options = null,
    crooked5: StockToolsGuiDefinitionsCrookedLinesCrooked5Options = null,
    elliott3: StockToolsGuiDefinitionsCrookedLinesElliott3Options = null,
    elliott5: StockToolsGuiDefinitionsCrookedLinesElliott5Options = null,
    items: js.Array[_] = null
  ): StockToolsGuiDefinitionsCrookedLinesOptions = {
    val __obj = js.Dynamic.literal()
    if (crooked3 != null) __obj.updateDynamic("crooked3")(crooked3.asInstanceOf[js.Any])
    if (crooked5 != null) __obj.updateDynamic("crooked5")(crooked5.asInstanceOf[js.Any])
    if (elliott3 != null) __obj.updateDynamic("elliott3")(elliott3.asInstanceOf[js.Any])
    if (elliott5 != null) __obj.updateDynamic("elliott5")(elliott5.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockToolsGuiDefinitionsCrookedLinesOptions]
  }
}

