package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3RunTestCaseResponse extends StObject {
  
  /**
    * The result.
    */
  var result: js.UndefOr[SchemaGoogleCloudDialogflowCxV3TestCaseResult] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3RunTestCaseResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3RunTestCaseResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3RunTestCaseResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3RunTestCaseResponse](x: Self) {
    
    inline def setResult(value: SchemaGoogleCloudDialogflowCxV3TestCaseResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
