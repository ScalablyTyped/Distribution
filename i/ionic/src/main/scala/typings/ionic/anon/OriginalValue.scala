package typings.ionic.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginalValue extends StObject {
  
  var originalValue: Any
  
  var property: String
}
object OriginalValue {
  
  inline def apply(originalValue: Any, property: String): OriginalValue = {
    val __obj = js.Dynamic.literal(originalValue = originalValue.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalValue]
  }
  
  extension [Self <: OriginalValue](x: Self) {
    
    inline def setOriginalValue(value: Any): Self = StObject.set(x, "originalValue", value.asInstanceOf[js.Any])
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
  }
}
