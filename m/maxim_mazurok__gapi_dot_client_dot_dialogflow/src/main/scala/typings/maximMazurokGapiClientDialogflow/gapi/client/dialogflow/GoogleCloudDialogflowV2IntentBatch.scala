package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2IntentBatch extends StObject {
  
  /** A collection of intents. */
  var intents: js.UndefOr[js.Array[GoogleCloudDialogflowV2Intent]] = js.undefined
}
object GoogleCloudDialogflowV2IntentBatch {
  
  inline def apply(): GoogleCloudDialogflowV2IntentBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentBatch]
  }
  
  extension [Self <: GoogleCloudDialogflowV2IntentBatch](x: Self) {
    
    inline def setIntents(value: js.Array[GoogleCloudDialogflowV2Intent]): Self = StObject.set(x, "intents", value.asInstanceOf[js.Any])
    
    inline def setIntentsUndefined: Self = StObject.set(x, "intents", js.undefined)
    
    inline def setIntentsVarargs(value: GoogleCloudDialogflowV2Intent*): Self = StObject.set(x, "intents", js.Array(value :_*))
  }
}
