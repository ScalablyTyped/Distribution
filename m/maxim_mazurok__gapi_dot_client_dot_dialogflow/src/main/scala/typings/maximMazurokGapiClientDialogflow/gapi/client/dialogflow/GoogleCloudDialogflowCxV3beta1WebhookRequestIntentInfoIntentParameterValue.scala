package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowCxV3beta1WebhookRequestIntentInfoIntentParameterValue extends StObject {
  
  /** Always present. Original text value extracted from user utterance. */
  var originalValue: js.UndefOr[String] = js.native
  
  /** Always present. Structured value for the parameter extracted from user utterance. */
  var resolvedValue: js.UndefOr[js.Any] = js.native
}
object GoogleCloudDialogflowCxV3beta1WebhookRequestIntentInfoIntentParameterValue {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowCxV3beta1WebhookRequestIntentInfoIntentParameterValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1WebhookRequestIntentInfoIntentParameterValue]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowCxV3beta1WebhookRequestIntentInfoIntentParameterValueMutableBuilder[Self <: GoogleCloudDialogflowCxV3beta1WebhookRequestIntentInfoIntentParameterValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginalValue(value: String): Self = StObject.set(x, "originalValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalValueUndefined: Self = StObject.set(x, "originalValue", js.undefined)
    
    @scala.inline
    def setResolvedValue(value: js.Any): Self = StObject.set(x, "resolvedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvedValueUndefined: Self = StObject.set(x, "resolvedValue", js.undefined)
  }
}
