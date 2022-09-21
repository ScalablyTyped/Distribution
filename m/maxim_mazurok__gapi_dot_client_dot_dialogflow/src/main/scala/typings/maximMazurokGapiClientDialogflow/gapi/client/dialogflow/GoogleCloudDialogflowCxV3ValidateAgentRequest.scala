package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3ValidateAgentRequest extends StObject {
  
  /** If not specified, the agent's default language is used. */
  var languageCode: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3ValidateAgentRequest {
  
  inline def apply(): GoogleCloudDialogflowCxV3ValidateAgentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3ValidateAgentRequest]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3ValidateAgentRequest](x: Self) {
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
  }
}
