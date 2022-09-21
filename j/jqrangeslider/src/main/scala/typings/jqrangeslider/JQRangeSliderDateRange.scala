package typings.jqrangeslider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQRangeSliderDateRange extends StObject {
  
  var max: js.UndefOr[js.Date] = js.undefined
  
  var min: js.UndefOr[js.Date] = js.undefined
}
object JQRangeSliderDateRange {
  
  inline def apply(): JQRangeSliderDateRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQRangeSliderDateRange]
  }
  
  extension [Self <: JQRangeSliderDateRange](x: Self) {
    
    inline def setMax(value: js.Date): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: js.Date): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
