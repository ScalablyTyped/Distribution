package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3beta1Form extends StObject {
  
  /** Parameters to collect from the user. */
  var parameters: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3beta1FormParameter]] = js.undefined
}
object GoogleCloudDialogflowCxV3beta1Form {
  
  inline def apply(): GoogleCloudDialogflowCxV3beta1Form = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1Form]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3beta1Form](x: Self) {
    
    inline def setParameters(value: js.Array[GoogleCloudDialogflowCxV3beta1FormParameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: GoogleCloudDialogflowCxV3beta1FormParameter*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
