package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3IntentCoverageIntent extends StObject {
  
  /** Whether or not the intent is covered by at least one of the agent's test cases. */
  var covered: js.UndefOr[Boolean] = js.undefined
  
  /** The intent full resource name */
  var intent: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3IntentCoverageIntent {
  
  inline def apply(): GoogleCloudDialogflowCxV3IntentCoverageIntent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3IntentCoverageIntent]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3IntentCoverageIntent](x: Self) {
    
    inline def setCovered(value: Boolean): Self = StObject.set(x, "covered", value.asInstanceOf[js.Any])
    
    inline def setCoveredUndefined: Self = StObject.set(x, "covered", js.undefined)
    
    inline def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
  }
}
