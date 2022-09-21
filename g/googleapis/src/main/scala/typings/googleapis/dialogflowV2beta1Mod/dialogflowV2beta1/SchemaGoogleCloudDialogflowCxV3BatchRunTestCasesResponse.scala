package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3BatchRunTestCasesResponse extends StObject {
  
  /**
    * The test case results. The detailed conversation turns are empty in this response.
    */
  var results: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3TestCaseResult]] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3BatchRunTestCasesResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3BatchRunTestCasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3BatchRunTestCasesResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3BatchRunTestCasesResponse](x: Self) {
    
    inline def setResults(value: js.Array[SchemaGoogleCloudDialogflowCxV3TestCaseResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: SchemaGoogleCloudDialogflowCxV3TestCaseResult*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
