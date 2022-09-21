package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3BatchDeleteTestCasesRequest extends StObject {
  
  /** Required. Format of test case names: `projects//locations/ /agents//testCases/`. */
  var names: js.UndefOr[js.Array[String]] = js.undefined
}
object GoogleCloudDialogflowCxV3BatchDeleteTestCasesRequest {
  
  inline def apply(): GoogleCloudDialogflowCxV3BatchDeleteTestCasesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3BatchDeleteTestCasesRequest]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3BatchDeleteTestCasesRequest](x: Self) {
    
    inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
  }
}
