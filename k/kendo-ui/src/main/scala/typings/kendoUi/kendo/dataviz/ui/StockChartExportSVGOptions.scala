package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StockChartExportSVGOptions extends StObject {
  
  var raw: js.UndefOr[Boolean] = js.undefined
}
object StockChartExportSVGOptions {
  
  inline def apply(): StockChartExportSVGOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartExportSVGOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StockChartExportSVGOptions] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
  }
}
