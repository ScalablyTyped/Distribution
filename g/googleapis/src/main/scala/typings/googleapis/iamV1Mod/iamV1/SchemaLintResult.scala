package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLintResult extends StObject {
  
  /**
    * Human readable debug message associated with the issue.
    */
  var debugMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the field for which this lint result is about. For nested messages `field_name` consists of names of the embedded fields separated by period character. The top-level qualifier is the input object to lint in the request. For example, the `field_name` value `condition.expression` identifies a lint result for the `expression` field of the provided condition.
    */
  var fieldName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The validation unit level.
    */
  var level: js.UndefOr[String | Null] = js.undefined
  
  /**
    * 0-based character position of problematic construct within the object identified by `field_name`. Currently, this is populated only for condition expression.
    */
  var locationOffset: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The validation unit severity.
    */
  var severity: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The validation unit name, for instance "lintValidationUnits/ConditionComplexityCheck".
    */
  var validationUnitName: js.UndefOr[String | Null] = js.undefined
}
object SchemaLintResult {
  
  inline def apply(): SchemaLintResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLintResult]
  }
  
  extension [Self <: SchemaLintResult](x: Self) {
    
    inline def setDebugMessage(value: String): Self = StObject.set(x, "debugMessage", value.asInstanceOf[js.Any])
    
    inline def setDebugMessageNull: Self = StObject.set(x, "debugMessage", null)
    
    inline def setDebugMessageUndefined: Self = StObject.set(x, "debugMessage", js.undefined)
    
    inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setFieldNameNull: Self = StObject.set(x, "fieldName", null)
    
    inline def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
    
    inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelNull: Self = StObject.set(x, "level", null)
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setLocationOffset(value: Double): Self = StObject.set(x, "locationOffset", value.asInstanceOf[js.Any])
    
    inline def setLocationOffsetNull: Self = StObject.set(x, "locationOffset", null)
    
    inline def setLocationOffsetUndefined: Self = StObject.set(x, "locationOffset", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityNull: Self = StObject.set(x, "severity", null)
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setValidationUnitName(value: String): Self = StObject.set(x, "validationUnitName", value.asInstanceOf[js.Any])
    
    inline def setValidationUnitNameNull: Self = StObject.set(x, "validationUnitName", null)
    
    inline def setValidationUnitNameUndefined: Self = StObject.set(x, "validationUnitName", js.undefined)
  }
}
