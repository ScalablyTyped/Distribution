package typings.kendoUi.kendo.dataviz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartSeriesOptions extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
}
object ChartSeriesOptions {
  
  inline def apply(): ChartSeriesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartSeriesOptions] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
