package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1Form extends StObject {
  
  /**
    * Parameters to collect from the user.
    */
  var parameters: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3beta1FormParameter]] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1Form {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1Form = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1Form]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1Form](x: Self) {
    
    inline def setParameters(value: js.Array[SchemaGoogleCloudDialogflowCxV3beta1FormParameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: SchemaGoogleCloudDialogflowCxV3beta1FormParameter*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
