package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3BatchRunTestCasesMetadata extends StObject {
  
  /** The test errors. */
  var errors: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3TestError]] = js.undefined
}
object GoogleCloudDialogflowCxV3BatchRunTestCasesMetadata {
  
  inline def apply(): GoogleCloudDialogflowCxV3BatchRunTestCasesMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3BatchRunTestCasesMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3BatchRunTestCasesMetadata] (val x: Self) extends AnyVal {
    
    inline def setErrors(value: js.Array[GoogleCloudDialogflowCxV3TestError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: GoogleCloudDialogflowCxV3TestError*): Self = StObject.set(x, "errors", js.Array(value*))
  }
}
