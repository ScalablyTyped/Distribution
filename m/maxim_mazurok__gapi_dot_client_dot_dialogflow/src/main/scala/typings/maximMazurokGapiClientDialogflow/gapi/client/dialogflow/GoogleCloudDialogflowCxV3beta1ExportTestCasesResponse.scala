package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3beta1ExportTestCasesResponse extends StObject {
  
  /** Uncompressed raw byte content for test cases. */
  var content: js.UndefOr[String] = js.undefined
  
  /** The URI to a file containing the exported test cases. This field is populated only if `gcs_uri` is specified in ExportTestCasesRequest. */
  var gcsUri: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3beta1ExportTestCasesResponse {
  
  inline def apply(): GoogleCloudDialogflowCxV3beta1ExportTestCasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1ExportTestCasesResponse]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3beta1ExportTestCasesResponse](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setGcsUri(value: String): Self = StObject.set(x, "gcsUri", value.asInstanceOf[js.Any])
    
    inline def setGcsUriUndefined: Self = StObject.set(x, "gcsUri", js.undefined)
  }
}
