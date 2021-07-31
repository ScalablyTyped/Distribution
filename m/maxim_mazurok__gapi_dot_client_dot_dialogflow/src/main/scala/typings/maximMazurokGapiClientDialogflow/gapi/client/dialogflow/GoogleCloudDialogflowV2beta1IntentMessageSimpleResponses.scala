package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2beta1IntentMessageSimpleResponses extends StObject {
  
  /** Required. The list of simple responses. */
  var simpleResponses: js.UndefOr[js.Array[GoogleCloudDialogflowV2beta1IntentMessageSimpleResponse]] = js.undefined
}
object GoogleCloudDialogflowV2beta1IntentMessageSimpleResponses {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2beta1IntentMessageSimpleResponses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1IntentMessageSimpleResponses]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2beta1IntentMessageSimpleResponsesMutableBuilder[Self <: GoogleCloudDialogflowV2beta1IntentMessageSimpleResponses] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSimpleResponses(value: js.Array[GoogleCloudDialogflowV2beta1IntentMessageSimpleResponse]): Self = StObject.set(x, "simpleResponses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimpleResponsesUndefined: Self = StObject.set(x, "simpleResponses", js.undefined)
    
    @scala.inline
    def setSimpleResponsesVarargs(value: GoogleCloudDialogflowV2beta1IntentMessageSimpleResponse*): Self = StObject.set(x, "simpleResponses", js.Array(value :_*))
  }
}
