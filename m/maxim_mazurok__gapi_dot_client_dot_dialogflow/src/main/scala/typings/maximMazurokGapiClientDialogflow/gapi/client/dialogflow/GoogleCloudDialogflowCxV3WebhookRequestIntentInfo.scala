package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3WebhookRequestIntentInfo extends StObject {
  
  /** Always present. The unique identifier of the last matched intent. Format: `projects//locations//agents//intents/`. */
  var lastMatchedIntent: js.UndefOr[String] = js.undefined
  
  /**
    * Parameters identified as a result of intent matching. This is a map of the name of the identified parameter to the value of the parameter identified from the user's utterance. All
    * parameters defined in the matched intent that are identified will be surfaced here.
    */
  var parameters: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.dialogflow.gapi.client.dialogflow.GoogleCloudDialogflowCxV3WebhookRequestIntentInfoIntentParameterValue}
    */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowCxV3WebhookRequestIntentInfo & TopLevel[js.Any]
  ] = js.undefined
}
object GoogleCloudDialogflowCxV3WebhookRequestIntentInfo {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowCxV3WebhookRequestIntentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3WebhookRequestIntentInfo]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowCxV3WebhookRequestIntentInfoMutableBuilder[Self <: GoogleCloudDialogflowCxV3WebhookRequestIntentInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastMatchedIntent(value: String): Self = StObject.set(x, "lastMatchedIntent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastMatchedIntentUndefined: Self = StObject.set(x, "lastMatchedIntent", js.undefined)
    
    @scala.inline
    def setParameters(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.dialogflow.gapi.client.dialogflow.GoogleCloudDialogflowCxV3WebhookRequestIntentInfoIntentParameterValue}
      */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowCxV3WebhookRequestIntentInfo & TopLevel[js.Any]
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
  }
}
