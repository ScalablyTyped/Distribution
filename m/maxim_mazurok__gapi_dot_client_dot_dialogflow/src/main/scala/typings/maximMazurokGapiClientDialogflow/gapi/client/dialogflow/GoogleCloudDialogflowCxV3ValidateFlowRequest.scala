package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3ValidateFlowRequest extends StObject {
  
  /** If not specified, the agent's default language is used. */
  var languageCode: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3ValidateFlowRequest {
  
  inline def apply(): GoogleCloudDialogflowCxV3ValidateFlowRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3ValidateFlowRequest]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3ValidateFlowRequest](x: Self) {
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
  }
}
