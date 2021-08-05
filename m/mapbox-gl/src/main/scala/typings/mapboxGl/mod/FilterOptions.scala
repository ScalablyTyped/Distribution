package typings.mapboxGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterOptions extends StObject {
  
  /**
    * Whether to check if the filter conforms to the Mapbox GL Style Specification.
    * Disabling validation is a performance optimization that should only be used
    * if you have previously validated the values you will be passing to this function.
    */
  var validate: js.UndefOr[Boolean | Null] = js.undefined
}
object FilterOptions {
  
  inline def apply(): FilterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterOptions]
  }
  
  extension [Self <: FilterOptions](x: Self) {
    
    inline def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    inline def setValidateNull: Self = StObject.set(x, "validate", null)
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
