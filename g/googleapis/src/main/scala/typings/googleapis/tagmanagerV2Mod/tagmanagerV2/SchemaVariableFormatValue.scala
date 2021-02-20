package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaVariableFormatValue extends StObject {
  
  /**
    * The option to convert a string-type variable value to either lowercase or
    * uppercase.
    */
  var caseConversionType: js.UndefOr[String] = js.native
  
  /**
    * The value to convert if a variable value is false.
    */
  var convertFalseToValue: js.UndefOr[SchemaParameter] = js.native
  
  /**
    * The value to convert if a variable value is null.
    */
  var convertNullToValue: js.UndefOr[SchemaParameter] = js.native
  
  /**
    * The value to convert if a variable value is true.
    */
  var convertTrueToValue: js.UndefOr[SchemaParameter] = js.native
  
  /**
    * The value to convert if a variable value is undefined.
    */
  var convertUndefinedToValue: js.UndefOr[SchemaParameter] = js.native
}
object SchemaVariableFormatValue {
  
  @scala.inline
  def apply(): SchemaVariableFormatValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVariableFormatValue]
  }
  
  @scala.inline
  implicit class SchemaVariableFormatValueMutableBuilder[Self <: SchemaVariableFormatValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaseConversionType(value: String): Self = StObject.set(x, "caseConversionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaseConversionTypeUndefined: Self = StObject.set(x, "caseConversionType", js.undefined)
    
    @scala.inline
    def setConvertFalseToValue(value: SchemaParameter): Self = StObject.set(x, "convertFalseToValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvertFalseToValueUndefined: Self = StObject.set(x, "convertFalseToValue", js.undefined)
    
    @scala.inline
    def setConvertNullToValue(value: SchemaParameter): Self = StObject.set(x, "convertNullToValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvertNullToValueUndefined: Self = StObject.set(x, "convertNullToValue", js.undefined)
    
    @scala.inline
    def setConvertTrueToValue(value: SchemaParameter): Self = StObject.set(x, "convertTrueToValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvertTrueToValueUndefined: Self = StObject.set(x, "convertTrueToValue", js.undefined)
    
    @scala.inline
    def setConvertUndefinedToValue(value: SchemaParameter): Self = StObject.set(x, "convertUndefinedToValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvertUndefinedToValueUndefined: Self = StObject.set(x, "convertUndefinedToValue", js.undefined)
  }
}
