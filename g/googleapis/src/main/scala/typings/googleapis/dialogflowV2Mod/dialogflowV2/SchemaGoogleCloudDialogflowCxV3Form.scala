package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3Form extends StObject {
  
  /**
    * Parameters to collect from the user.
    */
  var parameters: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3FormParameter]] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3Form {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3Form = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3Form]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3Form](x: Self) {
    
    inline def setParameters(value: js.Array[SchemaGoogleCloudDialogflowCxV3FormParameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: SchemaGoogleCloudDialogflowCxV3FormParameter*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
