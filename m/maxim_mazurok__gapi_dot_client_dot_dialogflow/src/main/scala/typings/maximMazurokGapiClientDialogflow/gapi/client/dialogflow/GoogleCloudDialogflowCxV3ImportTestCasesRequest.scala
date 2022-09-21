package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3ImportTestCasesRequest extends StObject {
  
  /** Uncompressed raw byte content for test cases. */
  var content: js.UndefOr[String] = js.undefined
  
  /**
    * The [Google Cloud Storage](https://cloud.google.com/storage/docs/) URI to import test cases from. The format of this URI must be `gs:///`. Dialogflow performs a read operation for
    * the Cloud Storage object on the caller's behalf, so your request authentication must have read permissions for the object. For more information, see [Dialogflow access
    * control](https://cloud.google.com/dialogflow/cx/docs/concept/access-control#storage).
    */
  var gcsUri: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3ImportTestCasesRequest {
  
  inline def apply(): GoogleCloudDialogflowCxV3ImportTestCasesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3ImportTestCasesRequest]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3ImportTestCasesRequest](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setGcsUri(value: String): Self = StObject.set(x, "gcsUri", value.asInstanceOf[js.Any])
    
    inline def setGcsUriUndefined: Self = StObject.set(x, "gcsUri", js.undefined)
  }
}
