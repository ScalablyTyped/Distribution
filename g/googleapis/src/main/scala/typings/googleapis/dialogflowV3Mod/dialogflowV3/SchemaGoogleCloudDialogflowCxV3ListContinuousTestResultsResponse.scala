package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3ListContinuousTestResultsResponse extends StObject {
  
  /**
    * The list of continuous test results.
    */
  var continuousTestResults: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3ContinuousTestResult]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3ListContinuousTestResultsResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3ListContinuousTestResultsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3ListContinuousTestResultsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3ListContinuousTestResultsResponse](x: Self) {
    
    inline def setContinuousTestResults(value: js.Array[SchemaGoogleCloudDialogflowCxV3ContinuousTestResult]): Self = StObject.set(x, "continuousTestResults", value.asInstanceOf[js.Any])
    
    inline def setContinuousTestResultsUndefined: Self = StObject.set(x, "continuousTestResults", js.undefined)
    
    inline def setContinuousTestResultsVarargs(value: SchemaGoogleCloudDialogflowCxV3ContinuousTestResult*): Self = StObject.set(x, "continuousTestResults", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
