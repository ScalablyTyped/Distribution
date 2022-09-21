package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3beta1BatchRunTestCasesResponse extends StObject {
  
  /** The test case results. The detailed conversation turns are empty in this response. */
  var results: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3beta1TestCaseResult]] = js.undefined
}
object GoogleCloudDialogflowCxV3beta1BatchRunTestCasesResponse {
  
  inline def apply(): GoogleCloudDialogflowCxV3beta1BatchRunTestCasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1BatchRunTestCasesResponse]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3beta1BatchRunTestCasesResponse](x: Self) {
    
    inline def setResults(value: js.Array[GoogleCloudDialogflowCxV3beta1TestCaseResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: GoogleCloudDialogflowCxV3beta1TestCaseResult*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
