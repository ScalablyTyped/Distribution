package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2beta1IntentMessageSimpleResponses extends StObject {
  
  /** Required. The list of simple responses. */
  var simpleResponses: js.UndefOr[js.Array[GoogleCloudDialogflowV2beta1IntentMessageSimpleResponse]] = js.undefined
}
object GoogleCloudDialogflowV2beta1IntentMessageSimpleResponses {
  
  inline def apply(): GoogleCloudDialogflowV2beta1IntentMessageSimpleResponses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1IntentMessageSimpleResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowV2beta1IntentMessageSimpleResponses] (val x: Self) extends AnyVal {
    
    inline def setSimpleResponses(value: js.Array[GoogleCloudDialogflowV2beta1IntentMessageSimpleResponse]): Self = StObject.set(x, "simpleResponses", value.asInstanceOf[js.Any])
    
    inline def setSimpleResponsesUndefined: Self = StObject.set(x, "simpleResponses", js.undefined)
    
    inline def setSimpleResponsesVarargs(value: GoogleCloudDialogflowV2beta1IntentMessageSimpleResponse*): Self = StObject.set(x, "simpleResponses", js.Array(value*))
  }
}
