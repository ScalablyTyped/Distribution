package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3beta1ImportTestCasesMetadata extends StObject {
  
  /** Errors for failed test cases. */
  var errors: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3beta1TestCaseError]] = js.undefined
}
object GoogleCloudDialogflowCxV3beta1ImportTestCasesMetadata {
  
  inline def apply(): GoogleCloudDialogflowCxV3beta1ImportTestCasesMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1ImportTestCasesMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3beta1ImportTestCasesMetadata] (val x: Self) extends AnyVal {
    
    inline def setErrors(value: js.Array[GoogleCloudDialogflowCxV3beta1TestCaseError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: GoogleCloudDialogflowCxV3beta1TestCaseError*): Self = StObject.set(x, "errors", js.Array(value*))
  }
}
