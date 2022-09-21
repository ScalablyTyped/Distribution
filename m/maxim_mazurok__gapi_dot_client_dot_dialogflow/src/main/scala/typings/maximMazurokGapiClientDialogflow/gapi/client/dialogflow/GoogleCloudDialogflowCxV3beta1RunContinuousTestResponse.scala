package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3beta1RunContinuousTestResponse extends StObject {
  
  /** The result for a continuous test run. */
  var continuousTestResult: js.UndefOr[GoogleCloudDialogflowCxV3beta1ContinuousTestResult] = js.undefined
}
object GoogleCloudDialogflowCxV3beta1RunContinuousTestResponse {
  
  inline def apply(): GoogleCloudDialogflowCxV3beta1RunContinuousTestResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1RunContinuousTestResponse]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3beta1RunContinuousTestResponse](x: Self) {
    
    inline def setContinuousTestResult(value: GoogleCloudDialogflowCxV3beta1ContinuousTestResult): Self = StObject.set(x, "continuousTestResult", value.asInstanceOf[js.Any])
    
    inline def setContinuousTestResultUndefined: Self = StObject.set(x, "continuousTestResult", js.undefined)
  }
}
