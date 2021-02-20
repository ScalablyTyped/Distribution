package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for determining how redaction of images should occur.
  */
@js.native
trait SchemaGooglePrivacyDlpV2ImageRedactionConfig extends StObject {
  
  /**
    * Only one per info_type should be provided per request. If not specified,
    * and redact_all_text is false, the DLP API will redact all text that it
    * matches against all info_types that are found, but not specified in
    * another ImageRedactionConfig.
    */
  var infoType: js.UndefOr[SchemaGooglePrivacyDlpV2InfoType] = js.native
  
  /**
    * If true, all text found in the image, regardless whether it matches an
    * info_type, is redacted. Only one should be provided.
    */
  var redactAllText: js.UndefOr[Boolean] = js.native
  
  /**
    * The color to use when redacting content from an image. If not specified,
    * the default is black.
    */
  var redactionColor: js.UndefOr[SchemaGooglePrivacyDlpV2Color] = js.native
}
object SchemaGooglePrivacyDlpV2ImageRedactionConfig {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2ImageRedactionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ImageRedactionConfig]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ImageRedactionConfigMutableBuilder[Self <: SchemaGooglePrivacyDlpV2ImageRedactionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfoType(value: SchemaGooglePrivacyDlpV2InfoType): Self = StObject.set(x, "infoType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoTypeUndefined: Self = StObject.set(x, "infoType", js.undefined)
    
    @scala.inline
    def setRedactAllText(value: Boolean): Self = StObject.set(x, "redactAllText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedactAllTextUndefined: Self = StObject.set(x, "redactAllText", js.undefined)
    
    @scala.inline
    def setRedactionColor(value: SchemaGooglePrivacyDlpV2Color): Self = StObject.set(x, "redactionColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedactionColorUndefined: Self = StObject.set(x, "redactionColor", js.undefined)
  }
}
