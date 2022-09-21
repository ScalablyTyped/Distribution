package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3WebhookRequestIntentInfoIntentParameterValue extends StObject {
  
  /**
    * Always present. Original text value extracted from user utterance.
    */
  var originalValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Always present. Structured value for the parameter extracted from user utterance.
    */
  var resolvedValue: js.UndefOr[Any | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3WebhookRequestIntentInfoIntentParameterValue {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3WebhookRequestIntentInfoIntentParameterValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3WebhookRequestIntentInfoIntentParameterValue]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3WebhookRequestIntentInfoIntentParameterValue](x: Self) {
    
    inline def setOriginalValue(value: String): Self = StObject.set(x, "originalValue", value.asInstanceOf[js.Any])
    
    inline def setOriginalValueNull: Self = StObject.set(x, "originalValue", null)
    
    inline def setOriginalValueUndefined: Self = StObject.set(x, "originalValue", js.undefined)
    
    inline def setResolvedValue(value: Any): Self = StObject.set(x, "resolvedValue", value.asInstanceOf[js.Any])
    
    inline def setResolvedValueNull: Self = StObject.set(x, "resolvedValue", null)
    
    inline def setResolvedValueUndefined: Self = StObject.set(x, "resolvedValue", js.undefined)
  }
}
