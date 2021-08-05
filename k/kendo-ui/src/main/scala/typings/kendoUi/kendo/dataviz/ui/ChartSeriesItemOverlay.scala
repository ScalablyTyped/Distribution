package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartSeriesItemOverlay extends StObject {
  
  var gradient: js.UndefOr[String] = js.undefined
}
object ChartSeriesItemOverlay {
  
  inline def apply(): ChartSeriesItemOverlay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesItemOverlay]
  }
  
  extension [Self <: ChartSeriesItemOverlay](x: Self) {
    
    inline def setGradient(value: String): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    
    inline def setGradientUndefined: Self = StObject.set(x, "gradient", js.undefined)
  }
}
