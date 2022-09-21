package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1TestCaseError extends StObject {
  
  /**
    * The status associated with the test case.
    */
  var status: js.UndefOr[SchemaGoogleRpcStatus] = js.undefined
  
  /**
    * The test case.
    */
  var testCase: js.UndefOr[SchemaGoogleCloudDialogflowCxV3beta1TestCase] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1TestCaseError {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1TestCaseError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1TestCaseError]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1TestCaseError](x: Self) {
    
    inline def setStatus(value: SchemaGoogleRpcStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTestCase(value: SchemaGoogleCloudDialogflowCxV3beta1TestCase): Self = StObject.set(x, "testCase", value.asInstanceOf[js.Any])
    
    inline def setTestCaseUndefined: Self = StObject.set(x, "testCase", js.undefined)
  }
}
