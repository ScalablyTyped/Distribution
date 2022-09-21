package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2ImageTransformations extends StObject {
  
  var transforms: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2ImageTransformation]] = js.undefined
}
object SchemaGooglePrivacyDlpV2ImageTransformations {
  
  inline def apply(): SchemaGooglePrivacyDlpV2ImageTransformations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ImageTransformations]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2ImageTransformations](x: Self) {
    
    inline def setTransforms(value: js.Array[SchemaGooglePrivacyDlpV2ImageTransformation]): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
    
    inline def setTransformsUndefined: Self = StObject.set(x, "transforms", js.undefined)
    
    inline def setTransformsVarargs(value: SchemaGooglePrivacyDlpV2ImageTransformation*): Self = StObject.set(x, "transforms", js.Array(value*))
  }
}
