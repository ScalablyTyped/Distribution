package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Results of redacting an image.
  */
trait SchemaGooglePrivacyDlpV2RedactImageResponse extends StObject {
  
  /**
    * If an image was being inspected and the InspectConfig&#39;s include_quote
    * was set to true, then this field will include all text, if any, that was
    * found in the image.
    */
  var extractedText: js.UndefOr[String] = js.undefined
  
  /**
    * The findings. Populated when include_findings in the request is true.
    */
  var inspectResult: js.UndefOr[SchemaGooglePrivacyDlpV2InspectResult] = js.undefined
  
  /**
    * The redacted image. The type will be the same as the original image.
    */
  var redactedImage: js.UndefOr[String] = js.undefined
}
object SchemaGooglePrivacyDlpV2RedactImageResponse {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2RedactImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2RedactImageResponse]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2RedactImageResponseMutableBuilder[Self <: SchemaGooglePrivacyDlpV2RedactImageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtractedText(value: String): Self = StObject.set(x, "extractedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtractedTextUndefined: Self = StObject.set(x, "extractedText", js.undefined)
    
    @scala.inline
    def setInspectResult(value: SchemaGooglePrivacyDlpV2InspectResult): Self = StObject.set(x, "inspectResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInspectResultUndefined: Self = StObject.set(x, "inspectResult", js.undefined)
    
    @scala.inline
    def setRedactedImage(value: String): Self = StObject.set(x, "redactedImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedactedImageUndefined: Self = StObject.set(x, "redactedImage", js.undefined)
  }
}
