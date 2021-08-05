package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2BatchDeleteIntentsRequest extends StObject {
  
  /** Required. The collection of intents to delete. Only intent `name` must be filled in. */
  var intents: js.UndefOr[js.Array[GoogleCloudDialogflowV2Intent]] = js.undefined
}
object GoogleCloudDialogflowV2BatchDeleteIntentsRequest {
  
  inline def apply(): GoogleCloudDialogflowV2BatchDeleteIntentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2BatchDeleteIntentsRequest]
  }
  
  extension [Self <: GoogleCloudDialogflowV2BatchDeleteIntentsRequest](x: Self) {
    
    inline def setIntents(value: js.Array[GoogleCloudDialogflowV2Intent]): Self = StObject.set(x, "intents", value.asInstanceOf[js.Any])
    
    inline def setIntentsUndefined: Self = StObject.set(x, "intents", js.undefined)
    
    inline def setIntentsVarargs(value: GoogleCloudDialogflowV2Intent*): Self = StObject.set(x, "intents", js.Array(value :_*))
  }
}
