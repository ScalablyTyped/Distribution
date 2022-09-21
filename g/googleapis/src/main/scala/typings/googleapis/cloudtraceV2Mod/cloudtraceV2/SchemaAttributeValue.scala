package typings.googleapis.cloudtraceV2Mod.cloudtraceV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAttributeValue extends StObject {
  
  /**
    * A Boolean value represented by `true` or `false`.
    */
  var boolValue: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * A 64-bit signed integer.
    */
  var intValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A string up to 256 bytes long.
    */
  var stringValue: js.UndefOr[SchemaTruncatableString] = js.undefined
}
object SchemaAttributeValue {
  
  inline def apply(): SchemaAttributeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttributeValue]
  }
  
  extension [Self <: SchemaAttributeValue](x: Self) {
    
    inline def setBoolValue(value: Boolean): Self = StObject.set(x, "boolValue", value.asInstanceOf[js.Any])
    
    inline def setBoolValueNull: Self = StObject.set(x, "boolValue", null)
    
    inline def setBoolValueUndefined: Self = StObject.set(x, "boolValue", js.undefined)
    
    inline def setIntValue(value: String): Self = StObject.set(x, "intValue", value.asInstanceOf[js.Any])
    
    inline def setIntValueNull: Self = StObject.set(x, "intValue", null)
    
    inline def setIntValueUndefined: Self = StObject.set(x, "intValue", js.undefined)
    
    inline def setStringValue(value: SchemaTruncatableString): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}
