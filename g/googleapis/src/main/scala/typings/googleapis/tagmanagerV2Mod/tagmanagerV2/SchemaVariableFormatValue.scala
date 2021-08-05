package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVariableFormatValue extends StObject {
  
  /**
    * The option to convert a string-type variable value to either lowercase or
    * uppercase.
    */
  var caseConversionType: js.UndefOr[String] = js.undefined
  
  /**
    * The value to convert if a variable value is false.
    */
  var convertFalseToValue: js.UndefOr[SchemaParameter] = js.undefined
  
  /**
    * The value to convert if a variable value is null.
    */
  var convertNullToValue: js.UndefOr[SchemaParameter] = js.undefined
  
  /**
    * The value to convert if a variable value is true.
    */
  var convertTrueToValue: js.UndefOr[SchemaParameter] = js.undefined
  
  /**
    * The value to convert if a variable value is undefined.
    */
  var convertUndefinedToValue: js.UndefOr[SchemaParameter] = js.undefined
}
object SchemaVariableFormatValue {
  
  inline def apply(): SchemaVariableFormatValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVariableFormatValue]
  }
  
  extension [Self <: SchemaVariableFormatValue](x: Self) {
    
    inline def setCaseConversionType(value: String): Self = StObject.set(x, "caseConversionType", value.asInstanceOf[js.Any])
    
    inline def setCaseConversionTypeUndefined: Self = StObject.set(x, "caseConversionType", js.undefined)
    
    inline def setConvertFalseToValue(value: SchemaParameter): Self = StObject.set(x, "convertFalseToValue", value.asInstanceOf[js.Any])
    
    inline def setConvertFalseToValueUndefined: Self = StObject.set(x, "convertFalseToValue", js.undefined)
    
    inline def setConvertNullToValue(value: SchemaParameter): Self = StObject.set(x, "convertNullToValue", value.asInstanceOf[js.Any])
    
    inline def setConvertNullToValueUndefined: Self = StObject.set(x, "convertNullToValue", js.undefined)
    
    inline def setConvertTrueToValue(value: SchemaParameter): Self = StObject.set(x, "convertTrueToValue", value.asInstanceOf[js.Any])
    
    inline def setConvertTrueToValueUndefined: Self = StObject.set(x, "convertTrueToValue", js.undefined)
    
    inline def setConvertUndefinedToValue(value: SchemaParameter): Self = StObject.set(x, "convertUndefinedToValue", value.asInstanceOf[js.Any])
    
    inline def setConvertUndefinedToValueUndefined: Self = StObject.set(x, "convertUndefinedToValue", js.undefined)
  }
}
