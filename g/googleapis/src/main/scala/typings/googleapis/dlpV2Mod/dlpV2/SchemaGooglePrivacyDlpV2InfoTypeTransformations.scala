package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2InfoTypeTransformations extends StObject {
  
  /**
    * Required. Transformation for each infoType. Cannot specify more than one for a given infoType.
    */
  var transformations: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2InfoTypeTransformation]] = js.undefined
}
object SchemaGooglePrivacyDlpV2InfoTypeTransformations {
  
  inline def apply(): SchemaGooglePrivacyDlpV2InfoTypeTransformations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InfoTypeTransformations]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2InfoTypeTransformations](x: Self) {
    
    inline def setTransformations(value: js.Array[SchemaGooglePrivacyDlpV2InfoTypeTransformation]): Self = StObject.set(x, "transformations", value.asInstanceOf[js.Any])
    
    inline def setTransformationsUndefined: Self = StObject.set(x, "transformations", js.undefined)
    
    inline def setTransformationsVarargs(value: SchemaGooglePrivacyDlpV2InfoTypeTransformation*): Self = StObject.set(x, "transformations", js.Array(value*))
  }
}
