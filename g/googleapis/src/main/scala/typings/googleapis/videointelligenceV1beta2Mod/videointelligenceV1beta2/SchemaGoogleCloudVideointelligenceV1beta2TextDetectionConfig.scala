package typings.googleapis.videointelligenceV1beta2Mod.videointelligenceV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVideointelligenceV1beta2TextDetectionConfig extends StObject {
  
  /**
    * Language hint can be specified if the language to be detected is known a priori. It can increase the accuracy of the detection. Language hint must be language code in BCP-47 format. Automatic language detection is performed if no hint is provided.
    */
  var languageHints: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Model to use for text detection. Supported values: "builtin/stable" (the default if unset) and "builtin/latest".
    */
  var model: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1beta2TextDetectionConfig {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1beta2TextDetectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1beta2TextDetectionConfig]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1beta2TextDetectionConfig](x: Self) {
    
    inline def setLanguageHints(value: js.Array[String]): Self = StObject.set(x, "languageHints", value.asInstanceOf[js.Any])
    
    inline def setLanguageHintsNull: Self = StObject.set(x, "languageHints", null)
    
    inline def setLanguageHintsUndefined: Self = StObject.set(x, "languageHints", js.undefined)
    
    inline def setLanguageHintsVarargs(value: String*): Self = StObject.set(x, "languageHints", js.Array(value*))
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelNull: Self = StObject.set(x, "model", null)
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
