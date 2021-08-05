package typings.knuddelsUserappsApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaximumValue extends StObject {
  
  var maximumValue: js.UndefOr[Double] = js.undefined
  
  var minimumValue: js.UndefOr[Double] = js.undefined
}
object MaximumValue {
  
  inline def apply(): MaximumValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaximumValue]
  }
  
  extension [Self <: MaximumValue](x: Self) {
    
    inline def setMaximumValue(value: Double): Self = StObject.set(x, "maximumValue", value.asInstanceOf[js.Any])
    
    inline def setMaximumValueUndefined: Self = StObject.set(x, "maximumValue", js.undefined)
    
    inline def setMinimumValue(value: Double): Self = StObject.set(x, "minimumValue", value.asInstanceOf[js.Any])
    
    inline def setMinimumValueUndefined: Self = StObject.set(x, "minimumValue", js.undefined)
  }
}
