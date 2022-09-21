package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2DataProfilePubSubCondition extends StObject {
  
  /**
    * An expression.
    */
  var expressions: js.UndefOr[SchemaGooglePrivacyDlpV2PubSubExpressions] = js.undefined
}
object SchemaGooglePrivacyDlpV2DataProfilePubSubCondition {
  
  inline def apply(): SchemaGooglePrivacyDlpV2DataProfilePubSubCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DataProfilePubSubCondition]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2DataProfilePubSubCondition](x: Self) {
    
    inline def setExpressions(value: SchemaGooglePrivacyDlpV2PubSubExpressions): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    inline def setExpressionsUndefined: Self = StObject.set(x, "expressions", js.undefined)
  }
}
