package typings.googleapis.connectorsV1Mod.connectorsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfigVariable extends StObject {
  
  /**
    * Value is a bool.
    */
  var boolValue: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Value is an integer
    */
  var intValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Key of the config variable.
    */
  var key: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Value is a secret.
    */
  var secretValue: js.UndefOr[SchemaSecret] = js.undefined
  
  /**
    * Value is a string.
    */
  var stringValue: js.UndefOr[String | Null] = js.undefined
}
object SchemaConfigVariable {
  
  inline def apply(): SchemaConfigVariable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigVariable]
  }
  
  extension [Self <: SchemaConfigVariable](x: Self) {
    
    inline def setBoolValue(value: Boolean): Self = StObject.set(x, "boolValue", value.asInstanceOf[js.Any])
    
    inline def setBoolValueNull: Self = StObject.set(x, "boolValue", null)
    
    inline def setBoolValueUndefined: Self = StObject.set(x, "boolValue", js.undefined)
    
    inline def setIntValue(value: String): Self = StObject.set(x, "intValue", value.asInstanceOf[js.Any])
    
    inline def setIntValueNull: Self = StObject.set(x, "intValue", null)
    
    inline def setIntValueUndefined: Self = StObject.set(x, "intValue", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setSecretValue(value: SchemaSecret): Self = StObject.set(x, "secretValue", value.asInstanceOf[js.Any])
    
    inline def setSecretValueUndefined: Self = StObject.set(x, "secretValue", js.undefined)
    
    inline def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueNull: Self = StObject.set(x, "stringValue", null)
    
    inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}
