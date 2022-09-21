package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3BatchRunTestCasesRequest extends StObject {
  
  /** Optional. If not set, draft environment is assumed. Format: `projects//locations//agents//environments/`. */
  var environment: js.UndefOr[String] = js.undefined
  
  /** Required. Format: `projects//locations//agents//testCases/`. */
  var testCases: js.UndefOr[js.Array[String]] = js.undefined
}
object GoogleCloudDialogflowCxV3BatchRunTestCasesRequest {
  
  inline def apply(): GoogleCloudDialogflowCxV3BatchRunTestCasesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3BatchRunTestCasesRequest]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3BatchRunTestCasesRequest](x: Self) {
    
    inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setTestCases(value: js.Array[String]): Self = StObject.set(x, "testCases", value.asInstanceOf[js.Any])
    
    inline def setTestCasesUndefined: Self = StObject.set(x, "testCases", js.undefined)
    
    inline def setTestCasesVarargs(value: String*): Self = StObject.set(x, "testCases", js.Array(value*))
  }
}
