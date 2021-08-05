package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockChartNavigator extends StObject {
  
  var autoBind: js.UndefOr[Boolean] = js.undefined
  
  var categoryAxis: js.UndefOr[StockChartNavigatorCategoryAxis] = js.undefined
  
  var dataSource: js.UndefOr[js.Any] = js.undefined
  
  var dateField: js.UndefOr[String] = js.undefined
  
  var hint: js.UndefOr[StockChartNavigatorHint] = js.undefined
  
  var pane: js.UndefOr[StockChartNavigatorPane] = js.undefined
  
  var select: js.UndefOr[StockChartNavigatorSelect] = js.undefined
  
  var series: js.UndefOr[js.Array[StockChartNavigatorSeriesItem]] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object StockChartNavigator {
  
  inline def apply(): StockChartNavigator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartNavigator]
  }
  
  extension [Self <: StockChartNavigator](x: Self) {
    
    inline def setAutoBind(value: Boolean): Self = StObject.set(x, "autoBind", value.asInstanceOf[js.Any])
    
    inline def setAutoBindUndefined: Self = StObject.set(x, "autoBind", js.undefined)
    
    inline def setCategoryAxis(value: StockChartNavigatorCategoryAxis): Self = StObject.set(x, "categoryAxis", value.asInstanceOf[js.Any])
    
    inline def setCategoryAxisUndefined: Self = StObject.set(x, "categoryAxis", js.undefined)
    
    inline def setDataSource(value: js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDateField(value: String): Self = StObject.set(x, "dateField", value.asInstanceOf[js.Any])
    
    inline def setDateFieldUndefined: Self = StObject.set(x, "dateField", js.undefined)
    
    inline def setHint(value: StockChartNavigatorHint): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    inline def setPane(value: StockChartNavigatorPane): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    inline def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
    
    inline def setSelect(value: StockChartNavigatorSelect): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setSeries(value: js.Array[StockChartNavigatorSeriesItem]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setSeriesVarargs(value: StockChartNavigatorSeriesItem*): Self = StObject.set(x, "series", js.Array(value :_*))
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
