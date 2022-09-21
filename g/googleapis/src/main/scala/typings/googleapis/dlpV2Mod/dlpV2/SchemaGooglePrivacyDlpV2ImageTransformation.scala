package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2ImageTransformation extends StObject {
  
  /**
    * Apply transformation to all findings not specified in other ImageTransformation's selected_info_types. Only one instance is allowed within the ImageTransformations message.
    */
  var allInfoTypes: js.UndefOr[SchemaGooglePrivacyDlpV2AllInfoTypes] = js.undefined
  
  /**
    * Apply transformation to all text that doesn't match an infoType. Only one instance is allowed within the ImageTransformations message.
    */
  var allText: js.UndefOr[SchemaGooglePrivacyDlpV2AllText] = js.undefined
  
  /**
    * The color to use when redacting content from an image. If not specified, the default is black.
    */
  var redactionColor: js.UndefOr[SchemaGooglePrivacyDlpV2Color] = js.undefined
  
  /**
    * Apply transformation to the selected info_types.
    */
  var selectedInfoTypes: js.UndefOr[SchemaGooglePrivacyDlpV2SelectedInfoTypes] = js.undefined
}
object SchemaGooglePrivacyDlpV2ImageTransformation {
  
  inline def apply(): SchemaGooglePrivacyDlpV2ImageTransformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ImageTransformation]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2ImageTransformation](x: Self) {
    
    inline def setAllInfoTypes(value: SchemaGooglePrivacyDlpV2AllInfoTypes): Self = StObject.set(x, "allInfoTypes", value.asInstanceOf[js.Any])
    
    inline def setAllInfoTypesUndefined: Self = StObject.set(x, "allInfoTypes", js.undefined)
    
    inline def setAllText(value: SchemaGooglePrivacyDlpV2AllText): Self = StObject.set(x, "allText", value.asInstanceOf[js.Any])
    
    inline def setAllTextUndefined: Self = StObject.set(x, "allText", js.undefined)
    
    inline def setRedactionColor(value: SchemaGooglePrivacyDlpV2Color): Self = StObject.set(x, "redactionColor", value.asInstanceOf[js.Any])
    
    inline def setRedactionColorUndefined: Self = StObject.set(x, "redactionColor", js.undefined)
    
    inline def setSelectedInfoTypes(value: SchemaGooglePrivacyDlpV2SelectedInfoTypes): Self = StObject.set(x, "selectedInfoTypes", value.asInstanceOf[js.Any])
    
    inline def setSelectedInfoTypesUndefined: Self = StObject.set(x, "selectedInfoTypes", js.undefined)
  }
}
