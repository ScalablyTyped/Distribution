package typings.googleapis.servicecontrolV2Mod.servicecontrolV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaViolationInfo extends StObject {
  
  /**
    * Optional. Value that is being checked for the policy. This could be in encrypted form (if pii sensitive). This field will only be emitted in LIST_POLICY types
    */
  var checkedValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Constraint name
    */
  var constraint: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Error message that policy is indicating.
    */
  var errorMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Indicates the type of the policy.
    */
  var policyType: js.UndefOr[String | Null] = js.undefined
}
object SchemaViolationInfo {
  
  inline def apply(): SchemaViolationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaViolationInfo]
  }
  
  extension [Self <: SchemaViolationInfo](x: Self) {
    
    inline def setCheckedValue(value: String): Self = StObject.set(x, "checkedValue", value.asInstanceOf[js.Any])
    
    inline def setCheckedValueNull: Self = StObject.set(x, "checkedValue", null)
    
    inline def setCheckedValueUndefined: Self = StObject.set(x, "checkedValue", js.undefined)
    
    inline def setConstraint(value: String): Self = StObject.set(x, "constraint", value.asInstanceOf[js.Any])
    
    inline def setConstraintNull: Self = StObject.set(x, "constraint", null)
    
    inline def setConstraintUndefined: Self = StObject.set(x, "constraint", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageNull: Self = StObject.set(x, "errorMessage", null)
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setPolicyType(value: String): Self = StObject.set(x, "policyType", value.asInstanceOf[js.Any])
    
    inline def setPolicyTypeNull: Self = StObject.set(x, "policyType", null)
    
    inline def setPolicyTypeUndefined: Self = StObject.set(x, "policyType", js.undefined)
  }
}
