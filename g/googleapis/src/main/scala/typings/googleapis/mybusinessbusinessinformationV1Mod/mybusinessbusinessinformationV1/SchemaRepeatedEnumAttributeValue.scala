package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRepeatedEnumAttributeValue extends StObject {
  
  /**
    * Enum values that are set.
    */
  var setValues: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Enum values that are unset.
    */
  var unsetValues: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaRepeatedEnumAttributeValue {
  
  inline def apply(): SchemaRepeatedEnumAttributeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRepeatedEnumAttributeValue]
  }
  
  extension [Self <: SchemaRepeatedEnumAttributeValue](x: Self) {
    
    inline def setSetValues(value: js.Array[String]): Self = StObject.set(x, "setValues", value.asInstanceOf[js.Any])
    
    inline def setSetValuesNull: Self = StObject.set(x, "setValues", null)
    
    inline def setSetValuesUndefined: Self = StObject.set(x, "setValues", js.undefined)
    
    inline def setSetValuesVarargs(value: String*): Self = StObject.set(x, "setValues", js.Array(value*))
    
    inline def setUnsetValues(value: js.Array[String]): Self = StObject.set(x, "unsetValues", value.asInstanceOf[js.Any])
    
    inline def setUnsetValuesNull: Self = StObject.set(x, "unsetValues", null)
    
    inline def setUnsetValuesUndefined: Self = StObject.set(x, "unsetValues", js.undefined)
    
    inline def setUnsetValuesVarargs(value: String*): Self = StObject.set(x, "unsetValues", js.Array(value*))
  }
}
