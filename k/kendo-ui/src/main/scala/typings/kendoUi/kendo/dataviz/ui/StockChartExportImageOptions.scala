package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockChartExportImageOptions extends StObject {
  
  var height: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[String] = js.undefined
}
object StockChartExportImageOptions {
  
  inline def apply(): StockChartExportImageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartExportImageOptions]
  }
  
  extension [Self <: StockChartExportImageOptions](x: Self) {
    
    inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
