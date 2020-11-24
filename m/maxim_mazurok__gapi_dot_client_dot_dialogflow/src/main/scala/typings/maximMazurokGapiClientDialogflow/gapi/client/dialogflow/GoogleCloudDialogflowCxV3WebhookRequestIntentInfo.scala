package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowCxV3WebhookRequestIntentInfo extends js.Object {
  
  /** Always present. The unique identifier of the last matched intent. Format: `projects//locations//agents//intents/`. */
  var lastMatchedIntent: js.UndefOr[String] = js.native
  
  /**
    * Parameters identified as a result of intent matching. This is a map of the name of the identified parameter to the value of the parameter identified from the user's utterance. All
    * parameters defined in the matched intent that are identified will be surfaced here.
    */
  var parameters: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.dialogflow.gapi.client.dialogflow.GoogleCloudDialogflowCxV3WebhookRequestIntentInfoIntentParameterValue}
    */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowCxV3WebhookRequestIntentInfo with TopLevel[js.Any]
  ] = js.native
}
object GoogleCloudDialogflowCxV3WebhookRequestIntentInfo {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowCxV3WebhookRequestIntentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3WebhookRequestIntentInfo]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowCxV3WebhookRequestIntentInfoOps[Self <: GoogleCloudDialogflowCxV3WebhookRequestIntentInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLastMatchedIntent(value: String): Self = this.set("lastMatchedIntent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastMatchedIntent: Self = this.set("lastMatchedIntent", js.undefined)
    
    @scala.inline
    def setParameters(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.dialogflow.gapi.client.dialogflow.GoogleCloudDialogflowCxV3WebhookRequestIntentInfoIntentParameterValue}
      */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowCxV3WebhookRequestIntentInfo with TopLevel[js.Any]
    ): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
  }
}
