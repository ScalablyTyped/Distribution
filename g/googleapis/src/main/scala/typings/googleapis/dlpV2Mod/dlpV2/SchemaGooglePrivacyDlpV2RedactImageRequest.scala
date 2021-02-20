package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to search for potentially sensitive info in an image and redact it
  * by covering it with a colored rectangle.
  */
@js.native
trait SchemaGooglePrivacyDlpV2RedactImageRequest extends StObject {
  
  /**
    * The content must be PNG, JPEG, SVG or BMP.
    */
  var byteItem: js.UndefOr[SchemaGooglePrivacyDlpV2ByteContentItem] = js.native
  
  /**
    * The configuration for specifying what content to redact from images.
    */
  var imageRedactionConfigs: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2ImageRedactionConfig]] = js.native
  
  /**
    * Whether the response should include findings along with the redacted
    * image.
    */
  var includeFindings: js.UndefOr[Boolean] = js.native
  
  /**
    * Configuration for the inspector.
    */
  var inspectConfig: js.UndefOr[SchemaGooglePrivacyDlpV2InspectConfig] = js.native
}
object SchemaGooglePrivacyDlpV2RedactImageRequest {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2RedactImageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2RedactImageRequest]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2RedactImageRequestMutableBuilder[Self <: SchemaGooglePrivacyDlpV2RedactImageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setByteItem(value: SchemaGooglePrivacyDlpV2ByteContentItem): Self = StObject.set(x, "byteItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByteItemUndefined: Self = StObject.set(x, "byteItem", js.undefined)
    
    @scala.inline
    def setImageRedactionConfigs(value: js.Array[SchemaGooglePrivacyDlpV2ImageRedactionConfig]): Self = StObject.set(x, "imageRedactionConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageRedactionConfigsUndefined: Self = StObject.set(x, "imageRedactionConfigs", js.undefined)
    
    @scala.inline
    def setImageRedactionConfigsVarargs(value: SchemaGooglePrivacyDlpV2ImageRedactionConfig*): Self = StObject.set(x, "imageRedactionConfigs", js.Array(value :_*))
    
    @scala.inline
    def setIncludeFindings(value: Boolean): Self = StObject.set(x, "includeFindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeFindingsUndefined: Self = StObject.set(x, "includeFindings", js.undefined)
    
    @scala.inline
    def setInspectConfig(value: SchemaGooglePrivacyDlpV2InspectConfig): Self = StObject.set(x, "inspectConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInspectConfigUndefined: Self = StObject.set(x, "inspectConfig", js.undefined)
  }
}
