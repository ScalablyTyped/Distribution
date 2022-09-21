package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2Expressions extends StObject {
  
  /**
    * Conditions to apply to the expression.
    */
  var conditions: js.UndefOr[SchemaGooglePrivacyDlpV2Conditions] = js.undefined
  
  /**
    * The operator to apply to the result of conditions. Default and currently only supported value is `AND`.
    */
  var logicalOperator: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2Expressions {
  
  inline def apply(): SchemaGooglePrivacyDlpV2Expressions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Expressions]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2Expressions](x: Self) {
    
    inline def setConditions(value: SchemaGooglePrivacyDlpV2Conditions): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setLogicalOperator(value: String): Self = StObject.set(x, "logicalOperator", value.asInstanceOf[js.Any])
    
    inline def setLogicalOperatorNull: Self = StObject.set(x, "logicalOperator", null)
    
    inline def setLogicalOperatorUndefined: Self = StObject.set(x, "logicalOperator", js.undefined)
  }
}
