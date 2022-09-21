package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2PubSubCondition extends StObject {
  
  /**
    * The minimum data risk score that triggers the condition.
    */
  var minimumRiskScore: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The minimum sensitivity level that triggers the condition.
    */
  var minimumSensitivityScore: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2PubSubCondition {
  
  inline def apply(): SchemaGooglePrivacyDlpV2PubSubCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2PubSubCondition]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2PubSubCondition](x: Self) {
    
    inline def setMinimumRiskScore(value: String): Self = StObject.set(x, "minimumRiskScore", value.asInstanceOf[js.Any])
    
    inline def setMinimumRiskScoreNull: Self = StObject.set(x, "minimumRiskScore", null)
    
    inline def setMinimumRiskScoreUndefined: Self = StObject.set(x, "minimumRiskScore", js.undefined)
    
    inline def setMinimumSensitivityScore(value: String): Self = StObject.set(x, "minimumSensitivityScore", value.asInstanceOf[js.Any])
    
    inline def setMinimumSensitivityScoreNull: Self = StObject.set(x, "minimumSensitivityScore", null)
    
    inline def setMinimumSensitivityScoreUndefined: Self = StObject.set(x, "minimumSensitivityScore", js.undefined)
  }
}
