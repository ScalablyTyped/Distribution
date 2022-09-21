package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1SpeechToTextConfig extends StObject {
  
  /**
    * The speech model used in speech to text. `SPEECH_MODEL_VARIANT_UNSPECIFIED`, `USE_BEST_AVAILABLE` will be treated as `USE_ENHANCED`. It can be overridden in AnalyzeContentRequest and StreamingAnalyzeContentRequest request. If enhanced model variant is specified and an enhanced version of the specified model for the language does not exist, then it would emit an error.
    */
  var speechModelVariant: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1SpeechToTextConfig {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1SpeechToTextConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1SpeechToTextConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1SpeechToTextConfig](x: Self) {
    
    inline def setSpeechModelVariant(value: String): Self = StObject.set(x, "speechModelVariant", value.asInstanceOf[js.Any])
    
    inline def setSpeechModelVariantNull: Self = StObject.set(x, "speechModelVariant", null)
    
    inline def setSpeechModelVariantUndefined: Self = StObject.set(x, "speechModelVariant", js.undefined)
  }
}
