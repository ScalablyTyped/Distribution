package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3beta1BatchRunTestCasesMetadata extends StObject {
  
  /** The test errors. */
  var errors: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3beta1TestError]] = js.undefined
}
object GoogleCloudDialogflowCxV3beta1BatchRunTestCasesMetadata {
  
  inline def apply(): GoogleCloudDialogflowCxV3beta1BatchRunTestCasesMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1BatchRunTestCasesMetadata]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3beta1BatchRunTestCasesMetadata](x: Self) {
    
    inline def setErrors(value: js.Array[GoogleCloudDialogflowCxV3beta1TestError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: GoogleCloudDialogflowCxV3beta1TestError*): Self = StObject.set(x, "errors", js.Array(value*))
  }
}
