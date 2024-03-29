package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2IntentMessageSimpleResponses extends StObject {
  
  /** Required. The list of simple responses. */
  var simpleResponses: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentMessageSimpleResponse]] = js.undefined
}
object GoogleCloudDialogflowV2IntentMessageSimpleResponses {
  
  inline def apply(): GoogleCloudDialogflowV2IntentMessageSimpleResponses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageSimpleResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowV2IntentMessageSimpleResponses] (val x: Self) extends AnyVal {
    
    inline def setSimpleResponses(value: js.Array[GoogleCloudDialogflowV2IntentMessageSimpleResponse]): Self = StObject.set(x, "simpleResponses", value.asInstanceOf[js.Any])
    
    inline def setSimpleResponsesUndefined: Self = StObject.set(x, "simpleResponses", js.undefined)
    
    inline def setSimpleResponsesVarargs(value: GoogleCloudDialogflowV2IntentMessageSimpleResponse*): Self = StObject.set(x, "simpleResponses", js.Array(value*))
  }
}
