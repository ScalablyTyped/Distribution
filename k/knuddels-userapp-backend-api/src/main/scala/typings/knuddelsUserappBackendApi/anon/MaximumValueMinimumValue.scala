package typings.knuddelsUserappBackendApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaximumValueMinimumValue extends StObject {
  
  var maximumValue: js.UndefOr[Double] = js.undefined
  
  var minimumValue: js.UndefOr[Double] = js.undefined
}
object MaximumValueMinimumValue {
  
  inline def apply(): MaximumValueMinimumValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaximumValueMinimumValue]
  }
  
  extension [Self <: MaximumValueMinimumValue](x: Self) {
    
    inline def setMaximumValue(value: Double): Self = StObject.set(x, "maximumValue", value.asInstanceOf[js.Any])
    
    inline def setMaximumValueUndefined: Self = StObject.set(x, "maximumValue", js.undefined)
    
    inline def setMinimumValue(value: Double): Self = StObject.set(x, "minimumValue", value.asInstanceOf[js.Any])
    
    inline def setMinimumValueUndefined: Self = StObject.set(x, "minimumValue", js.undefined)
  }
}
