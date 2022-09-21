package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2ImageRedactionConfig extends StObject {
  
  /**
    * Only one per info_type should be provided per request. If not specified, and redact_all_text is false, the DLP API will redact all text that it matches against all info_types that are found, but not specified in another ImageRedactionConfig.
    */
  var infoType: js.UndefOr[SchemaGooglePrivacyDlpV2InfoType] = js.undefined
  
  /**
    * If true, all text found in the image, regardless whether it matches an info_type, is redacted. Only one should be provided.
    */
  var redactAllText: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The color to use when redacting content from an image. If not specified, the default is black.
    */
  var redactionColor: js.UndefOr[SchemaGooglePrivacyDlpV2Color] = js.undefined
}
object SchemaGooglePrivacyDlpV2ImageRedactionConfig {
  
  inline def apply(): SchemaGooglePrivacyDlpV2ImageRedactionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ImageRedactionConfig]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2ImageRedactionConfig](x: Self) {
    
    inline def setInfoType(value: SchemaGooglePrivacyDlpV2InfoType): Self = StObject.set(x, "infoType", value.asInstanceOf[js.Any])
    
    inline def setInfoTypeUndefined: Self = StObject.set(x, "infoType", js.undefined)
    
    inline def setRedactAllText(value: Boolean): Self = StObject.set(x, "redactAllText", value.asInstanceOf[js.Any])
    
    inline def setRedactAllTextNull: Self = StObject.set(x, "redactAllText", null)
    
    inline def setRedactAllTextUndefined: Self = StObject.set(x, "redactAllText", js.undefined)
    
    inline def setRedactionColor(value: SchemaGooglePrivacyDlpV2Color): Self = StObject.set(x, "redactionColor", value.asInstanceOf[js.Any])
    
    inline def setRedactionColorUndefined: Self = StObject.set(x, "redactionColor", js.undefined)
  }
}
