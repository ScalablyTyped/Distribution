package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3VersionVariants extends StObject {
  
  /**
    * A list of flow version variants.
    */
  var variants: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3VersionVariantsVariant]] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3VersionVariants {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3VersionVariants = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3VersionVariants]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3VersionVariants](x: Self) {
    
    inline def setVariants(value: js.Array[SchemaGoogleCloudDialogflowCxV3VersionVariantsVariant]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: SchemaGoogleCloudDialogflowCxV3VersionVariantsVariant*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
