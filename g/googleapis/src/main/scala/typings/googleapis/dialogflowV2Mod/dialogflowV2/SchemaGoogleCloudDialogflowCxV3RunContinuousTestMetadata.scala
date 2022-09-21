package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3RunContinuousTestMetadata extends StObject {
  
  /**
    * The test errors.
    */
  var errors: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3TestError]] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3RunContinuousTestMetadata {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3RunContinuousTestMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3RunContinuousTestMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3RunContinuousTestMetadata](x: Self) {
    
    inline def setErrors(value: js.Array[SchemaGoogleCloudDialogflowCxV3TestError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: SchemaGoogleCloudDialogflowCxV3TestError*): Self = StObject.set(x, "errors", js.Array(value*))
  }
}
