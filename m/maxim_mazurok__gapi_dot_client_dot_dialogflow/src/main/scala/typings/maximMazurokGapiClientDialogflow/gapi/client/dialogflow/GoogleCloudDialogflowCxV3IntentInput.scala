package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3IntentInput extends StObject {
  
  /** Required. The unique identifier of the intent. Format: `projects//locations//agents//intents/`. */
  var intent: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3IntentInput {
  
  inline def apply(): GoogleCloudDialogflowCxV3IntentInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3IntentInput]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3IntentInput](x: Self) {
    
    inline def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
  }
}
