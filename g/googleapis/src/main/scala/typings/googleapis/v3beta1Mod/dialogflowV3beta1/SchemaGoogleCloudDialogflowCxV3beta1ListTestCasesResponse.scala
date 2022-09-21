package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1ListTestCasesResponse extends StObject {
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of test cases. There will be a maximum number of items returned based on the page_size field in the request.
    */
  var testCases: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3beta1TestCase]] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1ListTestCasesResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1ListTestCasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1ListTestCasesResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1ListTestCasesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTestCases(value: js.Array[SchemaGoogleCloudDialogflowCxV3beta1TestCase]): Self = StObject.set(x, "testCases", value.asInstanceOf[js.Any])
    
    inline def setTestCasesUndefined: Self = StObject.set(x, "testCases", js.undefined)
    
    inline def setTestCasesVarargs(value: SchemaGoogleCloudDialogflowCxV3beta1TestCase*): Self = StObject.set(x, "testCases", js.Array(value*))
  }
}
