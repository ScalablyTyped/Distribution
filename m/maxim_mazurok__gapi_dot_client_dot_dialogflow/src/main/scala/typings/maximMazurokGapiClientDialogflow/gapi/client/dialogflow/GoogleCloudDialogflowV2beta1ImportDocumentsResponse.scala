package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2beta1ImportDocumentsResponse extends StObject {
  
  /** Includes details about skipped documents or any other warnings. */
  var warnings: js.UndefOr[js.Array[GoogleRpcStatus]] = js.undefined
}
object GoogleCloudDialogflowV2beta1ImportDocumentsResponse {
  
  inline def apply(): GoogleCloudDialogflowV2beta1ImportDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1ImportDocumentsResponse]
  }
  
  extension [Self <: GoogleCloudDialogflowV2beta1ImportDocumentsResponse](x: Self) {
    
    inline def setWarnings(value: js.Array[GoogleRpcStatus]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: GoogleRpcStatus*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
