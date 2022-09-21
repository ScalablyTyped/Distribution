package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3BatchRunTestCasesMetadata extends StObject {
  
  /**
    * The test errors.
    */
  var errors: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3TestError]] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3BatchRunTestCasesMetadata {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3BatchRunTestCasesMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3BatchRunTestCasesMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3BatchRunTestCasesMetadata](x: Self) {
    
    inline def setErrors(value: js.Array[SchemaGoogleCloudDialogflowCxV3TestError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: SchemaGoogleCloudDialogflowCxV3TestError*): Self = StObject.set(x, "errors", js.Array(value*))
  }
}
