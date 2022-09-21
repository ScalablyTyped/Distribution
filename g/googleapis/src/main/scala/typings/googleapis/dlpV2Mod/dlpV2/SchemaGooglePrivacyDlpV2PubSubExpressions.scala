package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2PubSubExpressions extends StObject {
  
  /**
    * Conditions to apply to the expression.
    */
  var conditions: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2PubSubCondition]] = js.undefined
  
  /**
    * The operator to apply to the collection of conditions.
    */
  var logicalOperator: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2PubSubExpressions {
  
  inline def apply(): SchemaGooglePrivacyDlpV2PubSubExpressions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2PubSubExpressions]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2PubSubExpressions](x: Self) {
    
    inline def setConditions(value: js.Array[SchemaGooglePrivacyDlpV2PubSubCondition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: SchemaGooglePrivacyDlpV2PubSubCondition*): Self = StObject.set(x, "conditions", js.Array(value*))
    
    inline def setLogicalOperator(value: String): Self = StObject.set(x, "logicalOperator", value.asInstanceOf[js.Any])
    
    inline def setLogicalOperatorNull: Self = StObject.set(x, "logicalOperator", null)
    
    inline def setLogicalOperatorUndefined: Self = StObject.set(x, "logicalOperator", js.undefined)
  }
}
