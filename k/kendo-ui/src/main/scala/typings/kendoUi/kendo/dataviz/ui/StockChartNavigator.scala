package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StockChartNavigator extends StObject {
  
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
  implicit class StockChartNavigatorMutableBuilder[Self <: StockChartNavigator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoBind(value: Boolean): Self = StObject.set(x, "autoBind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoBindUndefined: Self = StObject.set(x, "autoBind", js.undefined)
    
    @scala.inline
    def setCategoryAxis(value: StockChartNavigatorCategoryAxis): Self = StObject.set(x, "categoryAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryAxisUndefined: Self = StObject.set(x, "categoryAxis", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setDateField(value: String): Self = StObject.set(x, "dateField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateFieldUndefined: Self = StObject.set(x, "dateField", js.undefined)
    
    @scala.inline
    def setHint(value: StockChartNavigatorHint): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    @scala.inline
    def setPane(value: StockChartNavigatorPane): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
    
    @scala.inline
    def setSelect(value: StockChartNavigatorSelect): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setSeries(value: js.Array[StockChartNavigatorSeriesItem]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    @scala.inline
    def setSeriesVarargs(value: StockChartNavigatorSeriesItem*): Self = StObject.set(x, "series", js.Array(value :_*))
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
