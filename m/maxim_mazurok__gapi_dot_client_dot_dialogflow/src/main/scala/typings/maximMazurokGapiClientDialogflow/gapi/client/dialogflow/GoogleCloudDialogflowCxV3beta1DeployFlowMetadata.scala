package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3beta1DeployFlowMetadata extends StObject {
  
  /** Errors of running deployment tests. */
  var testErrors: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3beta1TestError]] = js.undefined
}
object GoogleCloudDialogflowCxV3beta1DeployFlowMetadata {
  
  inline def apply(): GoogleCloudDialogflowCxV3beta1DeployFlowMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1DeployFlowMetadata]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3beta1DeployFlowMetadata](x: Self) {
    
    inline def setTestErrors(value: js.Array[GoogleCloudDialogflowCxV3beta1TestError]): Self = StObject.set(x, "testErrors", value.asInstanceOf[js.Any])
    
    inline def setTestErrorsUndefined: Self = StObject.set(x, "testErrors", js.undefined)
    
    inline def setTestErrorsVarargs(value: GoogleCloudDialogflowCxV3beta1TestError*): Self = StObject.set(x, "testErrors", js.Array(value*))
  }
}
