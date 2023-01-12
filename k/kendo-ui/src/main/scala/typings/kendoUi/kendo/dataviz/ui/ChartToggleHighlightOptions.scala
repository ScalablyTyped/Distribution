package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartToggleHighlightOptions extends StObject {
  
  var category: js.UndefOr[String] = js.undefined
  
  var series: js.UndefOr[String] = js.undefined
}
object ChartToggleHighlightOptions {
  
  inline def apply(): ChartToggleHighlightOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartToggleHighlightOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartToggleHighlightOptions] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setSeries(value: String): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
  }
}
