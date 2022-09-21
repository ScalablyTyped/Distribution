package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3CompareVersionsRequest extends StObject {
  
  /**
    * The language to compare the flow versions for. If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow/docs/reference/language)
    * are supported. Note: languages must be enabled in the agent before they can be used.
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Name of the target flow version to compare with the base version. Use version ID `0` to indicate the draft version of the specified flow. Format:
    * `projects//locations//agents//flows//versions/`.
    */
  var targetVersion: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3CompareVersionsRequest {
  
  inline def apply(): GoogleCloudDialogflowCxV3CompareVersionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3CompareVersionsRequest]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3CompareVersionsRequest](x: Self) {
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setTargetVersion(value: String): Self = StObject.set(x, "targetVersion", value.asInstanceOf[js.Any])
    
    inline def setTargetVersionUndefined: Self = StObject.set(x, "targetVersion", js.undefined)
  }
}
