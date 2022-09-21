package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1RunContinuousTestMetadata extends StObject {
  
  /**
    * The test errors.
    */
  var errors: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3beta1TestError]] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1RunContinuousTestMetadata {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1RunContinuousTestMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1RunContinuousTestMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1RunContinuousTestMetadata](x: Self) {
    
    inline def setErrors(value: js.Array[SchemaGoogleCloudDialogflowCxV3beta1TestError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: SchemaGoogleCloudDialogflowCxV3beta1TestError*): Self = StObject.set(x, "errors", js.Array(value*))
  }
}
