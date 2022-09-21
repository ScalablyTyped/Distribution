package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1RunTestCaseResponse extends StObject {
  
  /**
    * The result.
    */
  var result: js.UndefOr[SchemaGoogleCloudDialogflowCxV3beta1TestCaseResult] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1RunTestCaseResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1RunTestCaseResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1RunTestCaseResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1RunTestCaseResponse](x: Self) {
    
    inline def setResult(value: SchemaGoogleCloudDialogflowCxV3beta1TestCaseResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
