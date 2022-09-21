package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2SelectedInfoTypes extends StObject {
  
  /**
    * Required. InfoTypes to apply the transformation to. Required. Provided InfoType must be unique within the ImageTransformations message.
    */
  var infoTypes: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2InfoType]] = js.undefined
}
object SchemaGooglePrivacyDlpV2SelectedInfoTypes {
  
  inline def apply(): SchemaGooglePrivacyDlpV2SelectedInfoTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2SelectedInfoTypes]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2SelectedInfoTypes](x: Self) {
    
    inline def setInfoTypes(value: js.Array[SchemaGooglePrivacyDlpV2InfoType]): Self = StObject.set(x, "infoTypes", value.asInstanceOf[js.Any])
    
    inline def setInfoTypesUndefined: Self = StObject.set(x, "infoTypes", js.undefined)
    
    inline def setInfoTypesVarargs(value: SchemaGooglePrivacyDlpV2InfoType*): Self = StObject.set(x, "infoTypes", js.Array(value*))
  }
}
