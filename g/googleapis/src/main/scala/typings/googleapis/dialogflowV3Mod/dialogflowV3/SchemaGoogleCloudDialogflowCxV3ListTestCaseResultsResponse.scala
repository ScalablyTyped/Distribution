package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3ListTestCaseResultsResponse extends StObject {
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of test case results.
    */
  var testCaseResults: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3TestCaseResult]] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3ListTestCaseResultsResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3ListTestCaseResultsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3ListTestCaseResultsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3ListTestCaseResultsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTestCaseResults(value: js.Array[SchemaGoogleCloudDialogflowCxV3TestCaseResult]): Self = StObject.set(x, "testCaseResults", value.asInstanceOf[js.Any])
    
    inline def setTestCaseResultsUndefined: Self = StObject.set(x, "testCaseResults", js.undefined)
    
    inline def setTestCaseResultsVarargs(value: SchemaGoogleCloudDialogflowCxV3TestCaseResult*): Self = StObject.set(x, "testCaseResults", js.Array(value*))
  }
}
