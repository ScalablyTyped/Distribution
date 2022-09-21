package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3ImportTestCasesMetadata extends StObject {
  
  /**
    * Errors for failed test cases.
    */
  var errors: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3TestCaseError]] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3ImportTestCasesMetadata {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3ImportTestCasesMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3ImportTestCasesMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3ImportTestCasesMetadata](x: Self) {
    
    inline def setErrors(value: js.Array[SchemaGoogleCloudDialogflowCxV3TestCaseError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: SchemaGoogleCloudDialogflowCxV3TestCaseError*): Self = StObject.set(x, "errors", js.Array(value*))
  }
}
