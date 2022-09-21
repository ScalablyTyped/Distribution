package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3VersionVariants extends StObject {
  
  /** A list of flow version variants. */
  var variants: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3VersionVariantsVariant]] = js.undefined
}
object GoogleCloudDialogflowCxV3VersionVariants {
  
  inline def apply(): GoogleCloudDialogflowCxV3VersionVariants = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3VersionVariants]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3VersionVariants](x: Self) {
    
    inline def setVariants(value: js.Array[GoogleCloudDialogflowCxV3VersionVariantsVariant]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: GoogleCloudDialogflowCxV3VersionVariantsVariant*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
