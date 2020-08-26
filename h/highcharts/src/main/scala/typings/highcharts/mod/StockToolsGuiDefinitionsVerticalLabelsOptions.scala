package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StockToolsGuiDefinitionsVerticalLabelsOptions extends js.Object {
  /**
    * (Highstock) A collection of strings pointing to config options for the
    * items.
    */
  var items: js.UndefOr[js.Array[_]] = js.native
  var verticalArrow: js.UndefOr[StockToolsGuiDefinitionsVerticalLabelsVerticalArrowOptions] = js.native
  var verticalCounter: js.UndefOr[StockToolsGuiDefinitionsVerticalLabelsVerticalCounterOptions] = js.native
  var verticalLabel: js.UndefOr[StockToolsGuiDefinitionsVerticalLabelsVerticalLabelOptions] = js.native
}

object StockToolsGuiDefinitionsVerticalLabelsOptions {
  @scala.inline
  def apply(): StockToolsGuiDefinitionsVerticalLabelsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockToolsGuiDefinitionsVerticalLabelsOptions]
  }
  @scala.inline
  implicit class StockToolsGuiDefinitionsVerticalLabelsOptionsOps[Self <: StockToolsGuiDefinitionsVerticalLabelsOptions] (val x: Self) extends AnyVal {
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
    def setVerticalArrow(value: StockToolsGuiDefinitionsVerticalLabelsVerticalArrowOptions): Self = this.set("verticalArrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalArrow: Self = this.set("verticalArrow", js.undefined)
    @scala.inline
    def setVerticalCounter(value: StockToolsGuiDefinitionsVerticalLabelsVerticalCounterOptions): Self = this.set("verticalCounter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalCounter: Self = this.set("verticalCounter", js.undefined)
    @scala.inline
    def setVerticalLabel(value: StockToolsGuiDefinitionsVerticalLabelsVerticalLabelOptions): Self = this.set("verticalLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalLabel: Self = this.set("verticalLabel", js.undefined)
  }
  
}

