package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StockChartNavigator extends js.Object {
  
  var autoBind: js.UndefOr[Boolean] = js.native
  
  var categoryAxis: js.UndefOr[StockChartNavigatorCategoryAxis] = js.native
  
  var dataSource: js.UndefOr[js.Any] = js.native
  
  var dateField: js.UndefOr[String] = js.native
  
  var hint: js.UndefOr[StockChartNavigatorHint] = js.native
  
  var pane: js.UndefOr[StockChartNavigatorPane] = js.native
  
  var select: js.UndefOr[StockChartNavigatorSelect] = js.native
  
  var series: js.UndefOr[js.Array[StockChartNavigatorSeriesItem]] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object StockChartNavigator {
  
  @scala.inline
  def apply(): StockChartNavigator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartNavigator]
  }
  
  @scala.inline
  implicit class StockChartNavigatorOps[Self <: StockChartNavigator] (val x: Self) extends AnyVal {
    
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
    def setAutoBind(value: Boolean): Self = this.set("autoBind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoBind: Self = this.set("autoBind", js.undefined)
    
    @scala.inline
    def setCategoryAxis(value: StockChartNavigatorCategoryAxis): Self = this.set("categoryAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategoryAxis: Self = this.set("categoryAxis", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDateField(value: String): Self = this.set("dateField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateField: Self = this.set("dateField", js.undefined)
    
    @scala.inline
    def setHint(value: StockChartNavigatorHint): Self = this.set("hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHint: Self = this.set("hint", js.undefined)
    
    @scala.inline
    def setPane(value: StockChartNavigatorPane): Self = this.set("pane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePane: Self = this.set("pane", js.undefined)
    
    @scala.inline
    def setSelect(value: StockChartNavigatorSelect): Self = this.set("select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    
    @scala.inline
    def setSeriesVarargs(value: StockChartNavigatorSeriesItem*): Self = this.set("series", js.Array(value :_*))
    
    @scala.inline
    def setSeries(value: js.Array[StockChartNavigatorSeriesItem]): Self = this.set("series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
