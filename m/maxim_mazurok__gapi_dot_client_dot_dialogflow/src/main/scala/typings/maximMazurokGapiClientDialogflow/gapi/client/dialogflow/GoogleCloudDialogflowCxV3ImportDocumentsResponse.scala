package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3ImportDocumentsResponse extends StObject {
  
  /** Includes details about skipped documents or any other warnings. */
  var warnings: js.UndefOr[js.Array[GoogleRpcStatus]] = js.undefined
}
object GoogleCloudDialogflowCxV3ImportDocumentsResponse {
  
  inline def apply(): GoogleCloudDialogflowCxV3ImportDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3ImportDocumentsResponse]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3ImportDocumentsResponse](x: Self) {
    
    inline def setWarnings(value: js.Array[GoogleRpcStatus]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: GoogleRpcStatus*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
