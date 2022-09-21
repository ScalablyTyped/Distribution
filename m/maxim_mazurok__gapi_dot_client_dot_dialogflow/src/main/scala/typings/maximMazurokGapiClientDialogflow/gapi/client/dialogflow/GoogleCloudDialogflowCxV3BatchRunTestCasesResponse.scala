package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3BatchRunTestCasesResponse extends StObject {
  
  /** The test case results. The detailed conversation turns are empty in this response. */
  var results: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3TestCaseResult]] = js.undefined
}
object GoogleCloudDialogflowCxV3BatchRunTestCasesResponse {
  
  inline def apply(): GoogleCloudDialogflowCxV3BatchRunTestCasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3BatchRunTestCasesResponse]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3BatchRunTestCasesResponse](x: Self) {
    
    inline def setResults(value: js.Array[GoogleCloudDialogflowCxV3TestCaseResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: GoogleCloudDialogflowCxV3TestCaseResult*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
