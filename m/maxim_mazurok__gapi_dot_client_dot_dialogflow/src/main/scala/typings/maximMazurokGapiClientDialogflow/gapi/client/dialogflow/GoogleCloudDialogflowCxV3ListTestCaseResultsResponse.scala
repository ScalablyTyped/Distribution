package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3ListTestCaseResultsResponse extends StObject {
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The list of test case results. */
  var testCaseResults: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3TestCaseResult]] = js.undefined
}
object GoogleCloudDialogflowCxV3ListTestCaseResultsResponse {
  
  inline def apply(): GoogleCloudDialogflowCxV3ListTestCaseResultsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3ListTestCaseResultsResponse]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3ListTestCaseResultsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTestCaseResults(value: js.Array[GoogleCloudDialogflowCxV3TestCaseResult]): Self = StObject.set(x, "testCaseResults", value.asInstanceOf[js.Any])
    
    inline def setTestCaseResultsUndefined: Self = StObject.set(x, "testCaseResults", js.undefined)
    
    inline def setTestCaseResultsVarargs(value: GoogleCloudDialogflowCxV3TestCaseResult*): Self = StObject.set(x, "testCaseResults", js.Array(value*))
  }
}
