package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3TestCaseError extends StObject {
  
  /** The status associated with the test case. */
  var status: js.UndefOr[GoogleRpcStatus] = js.undefined
  
  /** The test case. */
  var testCase: js.UndefOr[GoogleCloudDialogflowCxV3TestCase] = js.undefined
}
object GoogleCloudDialogflowCxV3TestCaseError {
  
  inline def apply(): GoogleCloudDialogflowCxV3TestCaseError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3TestCaseError]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3TestCaseError](x: Self) {
    
    inline def setStatus(value: GoogleRpcStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTestCase(value: GoogleCloudDialogflowCxV3TestCase): Self = StObject.set(x, "testCase", value.asInstanceOf[js.Any])
    
    inline def setTestCaseUndefined: Self = StObject.set(x, "testCase", js.undefined)
  }
}
