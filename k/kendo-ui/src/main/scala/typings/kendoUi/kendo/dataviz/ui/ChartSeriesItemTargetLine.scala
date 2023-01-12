package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartSeriesItemTargetLine extends StObject {
  
  var width: js.UndefOr[Double | js.Function] = js.undefined
}
object ChartSeriesItemTargetLine {
  
  inline def apply(): ChartSeriesItemTargetLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesItemTargetLine]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartSeriesItemTargetLine] (val x: Self) extends AnyVal {
    
    inline def setWidth(value: Double | js.Function): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
