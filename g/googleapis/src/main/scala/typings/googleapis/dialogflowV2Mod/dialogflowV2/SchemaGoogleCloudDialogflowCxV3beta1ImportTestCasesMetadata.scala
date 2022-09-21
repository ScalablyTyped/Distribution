package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1ImportTestCasesMetadata extends StObject {
  
  /**
    * Errors for failed test cases.
    */
  var errors: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3beta1TestCaseError]] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1ImportTestCasesMetadata {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1ImportTestCasesMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1ImportTestCasesMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1ImportTestCasesMetadata](x: Self) {
    
    inline def setErrors(value: js.Array[SchemaGoogleCloudDialogflowCxV3beta1TestCaseError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: SchemaGoogleCloudDialogflowCxV3beta1TestCaseError*): Self = StObject.set(x, "errors", js.Array(value*))
  }
}
