package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3DeployFlowMetadata extends StObject {
  
  /** Errors of running deployment tests. */
  var testErrors: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3TestError]] = js.undefined
}
object GoogleCloudDialogflowCxV3DeployFlowMetadata {
  
  inline def apply(): GoogleCloudDialogflowCxV3DeployFlowMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3DeployFlowMetadata]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3DeployFlowMetadata](x: Self) {
    
    inline def setTestErrors(value: js.Array[GoogleCloudDialogflowCxV3TestError]): Self = StObject.set(x, "testErrors", value.asInstanceOf[js.Any])
    
    inline def setTestErrorsUndefined: Self = StObject.set(x, "testErrors", js.undefined)
    
    inline def setTestErrorsVarargs(value: GoogleCloudDialogflowCxV3TestError*): Self = StObject.set(x, "testErrors", js.Array(value*))
  }
}
