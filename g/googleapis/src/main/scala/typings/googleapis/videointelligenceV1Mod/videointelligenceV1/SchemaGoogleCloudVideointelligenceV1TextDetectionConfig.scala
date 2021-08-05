package typings.googleapis.videointelligenceV1Mod.videointelligenceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Config for TEXT_DETECTION.
  */
trait SchemaGoogleCloudVideointelligenceV1TextDetectionConfig extends StObject {
  
  /**
    * Language hint can be specified if the language to be detected is known a
    * priori. It can increase the accuracy of the detection. Language hint must
    * be language code in BCP-47 format.  Automatic language detection is
    * performed if no hint is provided.
    */
  var languageHints: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1TextDetectionConfig {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1TextDetectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1TextDetectionConfig]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1TextDetectionConfig](x: Self) {
    
    inline def setLanguageHints(value: js.Array[String]): Self = StObject.set(x, "languageHints", value.asInstanceOf[js.Any])
    
    inline def setLanguageHintsUndefined: Self = StObject.set(x, "languageHints", js.undefined)
    
    inline def setLanguageHintsVarargs(value: String*): Self = StObject.set(x, "languageHints", js.Array(value :_*))
  }
}
