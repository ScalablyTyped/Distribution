package typings.jqueryui.JQueryUI

import typings.jqueryui.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderUIParams extends StObject {
  
  var handle: js.UndefOr[JQuery] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
  
  var values: js.UndefOr[js.Array[Double]] = js.undefined
}
object SliderUIParams {
  
  inline def apply(): SliderUIParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderUIParams]
  }
  
  extension [Self <: SliderUIParams](x: Self) {
    
    inline def setHandle(value: JQuery): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
