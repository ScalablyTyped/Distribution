package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2RedactImageRequest extends StObject {
  
  /**
    * The content must be PNG, JPEG, SVG or BMP.
    */
  var byteItem: js.UndefOr[SchemaGooglePrivacyDlpV2ByteContentItem] = js.undefined
  
  /**
    * The configuration for specifying what content to redact from images.
    */
  var imageRedactionConfigs: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2ImageRedactionConfig]] = js.undefined
  
  /**
    * Whether the response should include findings along with the redacted image.
    */
  var includeFindings: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Configuration for the inspector.
    */
  var inspectConfig: js.UndefOr[SchemaGooglePrivacyDlpV2InspectConfig] = js.undefined
  
  /**
    * Deprecated. This field has no effect.
    */
  var locationId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2RedactImageRequest {
  
  inline def apply(): SchemaGooglePrivacyDlpV2RedactImageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2RedactImageRequest]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2RedactImageRequest](x: Self) {
    
    inline def setByteItem(value: SchemaGooglePrivacyDlpV2ByteContentItem): Self = StObject.set(x, "byteItem", value.asInstanceOf[js.Any])
    
    inline def setByteItemUndefined: Self = StObject.set(x, "byteItem", js.undefined)
    
    inline def setImageRedactionConfigs(value: js.Array[SchemaGooglePrivacyDlpV2ImageRedactionConfig]): Self = StObject.set(x, "imageRedactionConfigs", value.asInstanceOf[js.Any])
    
    inline def setImageRedactionConfigsUndefined: Self = StObject.set(x, "imageRedactionConfigs", js.undefined)
    
    inline def setImageRedactionConfigsVarargs(value: SchemaGooglePrivacyDlpV2ImageRedactionConfig*): Self = StObject.set(x, "imageRedactionConfigs", js.Array(value*))
    
    inline def setIncludeFindings(value: Boolean): Self = StObject.set(x, "includeFindings", value.asInstanceOf[js.Any])
    
    inline def setIncludeFindingsNull: Self = StObject.set(x, "includeFindings", null)
    
    inline def setIncludeFindingsUndefined: Self = StObject.set(x, "includeFindings", js.undefined)
    
    inline def setInspectConfig(value: SchemaGooglePrivacyDlpV2InspectConfig): Self = StObject.set(x, "inspectConfig", value.asInstanceOf[js.Any])
    
    inline def setInspectConfigUndefined: Self = StObject.set(x, "inspectConfig", js.undefined)
    
    inline def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    inline def setLocationIdNull: Self = StObject.set(x, "locationId", null)
    
    inline def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
  }
}
