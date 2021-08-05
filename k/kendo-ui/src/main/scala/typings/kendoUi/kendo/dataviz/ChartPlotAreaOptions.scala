package typings.kendoUi.kendo.dataviz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartPlotAreaOptions extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
}
object ChartPlotAreaOptions {
  
  inline def apply(): ChartPlotAreaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPlotAreaOptions]
  }
  
  extension [Self <: ChartPlotAreaOptions](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
