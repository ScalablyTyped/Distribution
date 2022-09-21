package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1ListContinuousTestResultsResponse extends StObject {
  
  /**
    * The list of continuous test results.
    */
  var continuousTestResults: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3beta1ContinuousTestResult]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1ListContinuousTestResultsResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1ListContinuousTestResultsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1ListContinuousTestResultsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1ListContinuousTestResultsResponse](x: Self) {
    
    inline def setContinuousTestResults(value: js.Array[SchemaGoogleCloudDialogflowCxV3beta1ContinuousTestResult]): Self = StObject.set(x, "continuousTestResults", value.asInstanceOf[js.Any])
    
    inline def setContinuousTestResultsUndefined: Self = StObject.set(x, "continuousTestResults", js.undefined)
    
    inline def setContinuousTestResultsVarargs(value: SchemaGoogleCloudDialogflowCxV3beta1ContinuousTestResult*): Self = StObject.set(x, "continuousTestResults", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
