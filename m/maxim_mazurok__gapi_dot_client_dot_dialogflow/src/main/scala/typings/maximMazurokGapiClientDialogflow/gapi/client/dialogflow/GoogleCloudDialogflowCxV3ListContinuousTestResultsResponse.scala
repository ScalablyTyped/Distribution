package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3ListContinuousTestResultsResponse extends StObject {
  
  /** The list of continuous test results. */
  var continuousTestResults: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3ContinuousTestResult]] = js.undefined
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3ListContinuousTestResultsResponse {
  
  inline def apply(): GoogleCloudDialogflowCxV3ListContinuousTestResultsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3ListContinuousTestResultsResponse]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3ListContinuousTestResultsResponse](x: Self) {
    
    inline def setContinuousTestResults(value: js.Array[GoogleCloudDialogflowCxV3ContinuousTestResult]): Self = StObject.set(x, "continuousTestResults", value.asInstanceOf[js.Any])
    
    inline def setContinuousTestResultsUndefined: Self = StObject.set(x, "continuousTestResults", js.undefined)
    
    inline def setContinuousTestResultsVarargs(value: GoogleCloudDialogflowCxV3ContinuousTestResult*): Self = StObject.set(x, "continuousTestResults", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
