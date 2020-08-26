package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StockToolsGuiDefinitionsMeasureOptions extends js.Object {
  /**
    * (Highstock) A collection of strings pointing to config options for the
    * items.
    */
  var items: js.UndefOr[js.Array[_]] = js.native
  var measureX: js.UndefOr[StockToolsGuiDefinitionsMeasureMeasureXOptions] = js.native
  var measureXY: js.UndefOr[StockToolsGuiDefinitionsMeasureMeasureXYOptions] = js.native
  var measureY: js.UndefOr[StockToolsGuiDefinitionsMeasureMeasureYOptions] = js.native
}

object StockToolsGuiDefinitionsMeasureOptions {
  @scala.inline
  def apply(): StockToolsGuiDefinitionsMeasureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiDefinitionsMeasureOptions]
  }
  @scala.inline
  implicit class StockToolsGuiDefinitionsMeasureOptionsOps[Self <: StockToolsGuiDefinitionsMeasureOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[_]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setMeasureX(value: StockToolsGuiDefinitionsMeasureMeasureXOptions): Self = this.set("measureX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeasureX: Self = this.set("measureX", js.undefined)
    @scala.inline
    def setMeasureXY(value: StockToolsGuiDefinitionsMeasureMeasureXYOptions): Self = this.set("measureXY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeasureXY: Self = this.set("measureXY", js.undefined)
    @scala.inline
    def setMeasureY(value: StockToolsGuiDefinitionsMeasureMeasureYOptions): Self = this.set("measureY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeasureY: Self = this.set("measureY", js.undefined)
  }
  
}

