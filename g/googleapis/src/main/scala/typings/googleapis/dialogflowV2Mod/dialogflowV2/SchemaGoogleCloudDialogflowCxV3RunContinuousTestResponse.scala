package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3RunContinuousTestResponse extends StObject {
  
  /**
    * The result for a continuous test run.
    */
  var continuousTestResult: js.UndefOr[SchemaGoogleCloudDialogflowCxV3ContinuousTestResult] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3RunContinuousTestResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3RunContinuousTestResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3RunContinuousTestResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3RunContinuousTestResponse](x: Self) {
    
    inline def setContinuousTestResult(value: SchemaGoogleCloudDialogflowCxV3ContinuousTestResult): Self = StObject.set(x, "continuousTestResult", value.asInstanceOf[js.Any])
    
    inline def setContinuousTestResultUndefined: Self = StObject.set(x, "continuousTestResult", js.undefined)
  }
}
