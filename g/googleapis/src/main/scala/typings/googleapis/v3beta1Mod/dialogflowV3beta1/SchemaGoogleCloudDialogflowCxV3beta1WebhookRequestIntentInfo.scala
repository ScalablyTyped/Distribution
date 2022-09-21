package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1WebhookRequestIntentInfo extends StObject {
  
  /**
    * The confidence of the matched intent. Values range from 0.0 (completely uncertain) to 1.0 (completely certain).
    */
  var confidence: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Always present. The display name of the last matched intent.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Always present. The unique identifier of the last matched intent. Format: `projects//locations//agents//intents/`.
    */
  var lastMatchedIntent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Parameters identified as a result of intent matching. This is a map of the name of the identified parameter to the value of the parameter identified from the user's utterance. All parameters defined in the matched intent that are identified will be surfaced here.
    */
  var parameters: js.UndefOr[
    StringDictionary[SchemaGoogleCloudDialogflowCxV3beta1WebhookRequestIntentInfoIntentParameterValue] | Null
  ] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1WebhookRequestIntentInfo {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1WebhookRequestIntentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1WebhookRequestIntentInfo]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1WebhookRequestIntentInfo](x: Self) {
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceNull: Self = StObject.set(x, "confidence", null)
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLastMatchedIntent(value: String): Self = StObject.set(x, "lastMatchedIntent", value.asInstanceOf[js.Any])
    
    inline def setLastMatchedIntentNull: Self = StObject.set(x, "lastMatchedIntent", null)
    
    inline def setLastMatchedIntentUndefined: Self = StObject.set(x, "lastMatchedIntent", js.undefined)
    
    inline def setParameters(
      value: StringDictionary[SchemaGoogleCloudDialogflowCxV3beta1WebhookRequestIntentInfoIntentParameterValue]
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersNull: Self = StObject.set(x, "parameters", null)
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
  }
}
