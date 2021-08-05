package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockChartNavigatorPane extends StObject {
  
  var background: js.UndefOr[String] = js.undefined
  
  var border: js.UndefOr[StockChartNavigatorPaneBorder] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var margin: js.UndefOr[Double | StockChartNavigatorPaneMargin] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var padding: js.UndefOr[Double | StockChartNavigatorPanePadding] = js.undefined
  
  var title: js.UndefOr[String | StockChartNavigatorPaneTitle] = js.undefined
}
object StockChartNavigatorPane {
  
  inline def apply(): StockChartNavigatorPane = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartNavigatorPane]
  }
  
  extension [Self <: StockChartNavigatorPane](x: Self) {
    
    inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setBorder(value: StockChartNavigatorPaneBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setMargin(value: Double | StockChartNavigatorPaneMargin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPadding(value: Double | StockChartNavigatorPanePadding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setTitle(value: String | StockChartNavigatorPaneTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
