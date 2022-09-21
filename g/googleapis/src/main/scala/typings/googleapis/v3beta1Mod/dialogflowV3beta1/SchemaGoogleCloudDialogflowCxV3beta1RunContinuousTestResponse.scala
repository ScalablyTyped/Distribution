package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1RunContinuousTestResponse extends StObject {
  
  /**
    * The result for a continuous test run.
    */
  var continuousTestResult: js.UndefOr[SchemaGoogleCloudDialogflowCxV3beta1ContinuousTestResult] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1RunContinuousTestResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1RunContinuousTestResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1RunContinuousTestResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1RunContinuousTestResponse](x: Self) {
    
    inline def setContinuousTestResult(value: SchemaGoogleCloudDialogflowCxV3beta1ContinuousTestResult): Self = StObject.set(x, "continuousTestResult", value.asInstanceOf[js.Any])
    
    inline def setContinuousTestResultUndefined: Self = StObject.set(x, "continuousTestResult", js.undefined)
  }
}
