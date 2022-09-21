package typings.knuddelsUserappBackendApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinimumValue extends StObject {
  
  var ascending: js.UndefOr[Boolean] = js.undefined
  
  var minimumValue: js.UndefOr[Double] = js.undefined
}
object MinimumValue {
  
  inline def apply(): MinimumValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinimumValue]
  }
  
  extension [Self <: MinimumValue](x: Self) {
    
    inline def setAscending(value: Boolean): Self = StObject.set(x, "ascending", value.asInstanceOf[js.Any])
    
    inline def setAscendingUndefined: Self = StObject.set(x, "ascending", js.undefined)
    
    inline def setMinimumValue(value: Double): Self = StObject.set(x, "minimumValue", value.asInstanceOf[js.Any])
    
    inline def setMinimumValueUndefined: Self = StObject.set(x, "minimumValue", js.undefined)
  }
}
