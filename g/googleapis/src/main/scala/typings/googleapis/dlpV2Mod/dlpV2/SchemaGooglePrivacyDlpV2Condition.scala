package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2Condition extends StObject {
  
  /**
    * Required. Field within the record this condition is evaluated against.
    */
  var field: js.UndefOr[SchemaGooglePrivacyDlpV2FieldId] = js.undefined
  
  /**
    * Required. Operator used to compare the field or infoType to the value.
    */
  var operator: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Value to compare against. [Mandatory, except for `EXISTS` tests.]
    */
  var value: js.UndefOr[SchemaGooglePrivacyDlpV2Value] = js.undefined
}
object SchemaGooglePrivacyDlpV2Condition {
  
  inline def apply(): SchemaGooglePrivacyDlpV2Condition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Condition]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2Condition](x: Self) {
    
    inline def setField(value: SchemaGooglePrivacyDlpV2FieldId): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorNull: Self = StObject.set(x, "operator", null)
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setValue(value: SchemaGooglePrivacyDlpV2Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
