package typings.jqrangeslider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQRangeSliderRangeLength extends StObject {
  
  var max: js.UndefOr[Any] = js.undefined
  
  var min: js.UndefOr[Any] = js.undefined
}
object JQRangeSliderRangeLength {
  
  inline def apply(): JQRangeSliderRangeLength = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQRangeSliderRangeLength]
  }
  
  extension [Self <: JQRangeSliderRangeLength](x: Self) {
    
    inline def setMax(value: Any): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Any): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
