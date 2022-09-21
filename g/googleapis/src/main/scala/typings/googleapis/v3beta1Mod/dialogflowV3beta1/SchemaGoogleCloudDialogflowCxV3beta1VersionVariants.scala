package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1VersionVariants extends StObject {
  
  /**
    * A list of flow version variants.
    */
  var variants: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3beta1VersionVariantsVariant]] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1VersionVariants {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1VersionVariants = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1VersionVariants]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1VersionVariants](x: Self) {
    
    inline def setVariants(value: js.Array[SchemaGoogleCloudDialogflowCxV3beta1VersionVariantsVariant]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: SchemaGoogleCloudDialogflowCxV3beta1VersionVariantsVariant*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
