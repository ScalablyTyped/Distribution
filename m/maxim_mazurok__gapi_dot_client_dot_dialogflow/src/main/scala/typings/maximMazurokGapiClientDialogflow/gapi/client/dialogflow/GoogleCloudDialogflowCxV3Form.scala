package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3Form extends StObject {
  
  /** Parameters to collect from the user. */
  var parameters: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3FormParameter]] = js.undefined
}
object GoogleCloudDialogflowCxV3Form {
  
  inline def apply(): GoogleCloudDialogflowCxV3Form = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3Form]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3Form] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: js.Array[GoogleCloudDialogflowCxV3FormParameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: GoogleCloudDialogflowCxV3FormParameter*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
