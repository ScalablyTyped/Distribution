package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3RunTestCaseRequest extends StObject {
  
  /** Optional. Environment name. If not set, draft environment is assumed. Format: `projects//locations//agents//environments/`. */
  var environment: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3RunTestCaseRequest {
  
  inline def apply(): GoogleCloudDialogflowCxV3RunTestCaseRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3RunTestCaseRequest]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3RunTestCaseRequest](x: Self) {
    
    inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
  }
}
