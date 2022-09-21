package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3RunContinuousTestMetadata extends StObject {
  
  /** The test errors. */
  var errors: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3TestError]] = js.undefined
}
object GoogleCloudDialogflowCxV3RunContinuousTestMetadata {
  
  inline def apply(): GoogleCloudDialogflowCxV3RunContinuousTestMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3RunContinuousTestMetadata]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3RunContinuousTestMetadata](x: Self) {
    
    inline def setErrors(value: js.Array[GoogleCloudDialogflowCxV3TestError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: GoogleCloudDialogflowCxV3TestError*): Self = StObject.set(x, "errors", js.Array(value*))
  }
}
