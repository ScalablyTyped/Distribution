package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3ImportTestCasesResponse extends StObject {
  
  /** The unique identifiers of the new test cases. Format: `projects//locations//agents//testCases/`. */
  var names: js.UndefOr[js.Array[String]] = js.undefined
}
object GoogleCloudDialogflowCxV3ImportTestCasesResponse {
  
  inline def apply(): GoogleCloudDialogflowCxV3ImportTestCasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3ImportTestCasesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3ImportTestCasesResponse] (val x: Self) extends AnyVal {
    
    inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
  }
}
