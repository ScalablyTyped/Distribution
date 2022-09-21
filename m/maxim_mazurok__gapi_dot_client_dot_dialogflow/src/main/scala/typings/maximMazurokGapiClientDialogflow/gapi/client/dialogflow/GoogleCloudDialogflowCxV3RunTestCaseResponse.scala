package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3RunTestCaseResponse extends StObject {
  
  /** The result. */
  var result: js.UndefOr[GoogleCloudDialogflowCxV3TestCaseResult] = js.undefined
}
object GoogleCloudDialogflowCxV3RunTestCaseResponse {
  
  inline def apply(): GoogleCloudDialogflowCxV3RunTestCaseResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3RunTestCaseResponse]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3RunTestCaseResponse](x: Self) {
    
    inline def setResult(value: GoogleCloudDialogflowCxV3TestCaseResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
