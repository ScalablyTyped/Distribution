package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3beta1RunTestCaseResponse extends StObject {
  
  /** The result. */
  var result: js.UndefOr[GoogleCloudDialogflowCxV3beta1TestCaseResult] = js.undefined
}
object GoogleCloudDialogflowCxV3beta1RunTestCaseResponse {
  
  inline def apply(): GoogleCloudDialogflowCxV3beta1RunTestCaseResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1RunTestCaseResponse]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3beta1RunTestCaseResponse](x: Self) {
    
    inline def setResult(value: GoogleCloudDialogflowCxV3beta1TestCaseResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
