package typings.maximMazurokGapiClientAnalytics.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Field extends StObject {
  
  /** Field to use in the filter. */
  var field: js.UndefOr[String] = js.undefined
  
  /** The Index of the custom dimension. Required if field is a CUSTOM_DIMENSION. */
  var fieldIndex: js.UndefOr[Double] = js.undefined
}
object Field {
  
  inline def apply(): Field = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Field]
  }
  
  extension [Self <: Field](x: Self) {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldIndex(value: Double): Self = StObject.set(x, "fieldIndex", value.asInstanceOf[js.Any])
    
    inline def setFieldIndexUndefined: Self = StObject.set(x, "fieldIndex", js.undefined)
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
  }
}
