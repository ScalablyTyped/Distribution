package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2ImportDocumentsResponse extends StObject {
  
  /** Includes details about skipped documents or any other warnings. */
  var warnings: js.UndefOr[js.Array[GoogleRpcStatus]] = js.undefined
}
object GoogleCloudDialogflowV2ImportDocumentsResponse {
  
  inline def apply(): GoogleCloudDialogflowV2ImportDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2ImportDocumentsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowV2ImportDocumentsResponse] (val x: Self) extends AnyVal {
    
    inline def setWarnings(value: js.Array[GoogleRpcStatus]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: GoogleRpcStatus*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
