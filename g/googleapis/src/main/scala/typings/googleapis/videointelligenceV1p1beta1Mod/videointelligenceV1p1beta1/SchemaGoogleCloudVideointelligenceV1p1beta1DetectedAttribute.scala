package typings.googleapis.videointelligenceV1p1beta1Mod.videointelligenceV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVideointelligenceV1p1beta1DetectedAttribute extends StObject {
  
  /**
    * Detected attribute confidence. Range [0, 1].
    */
  var confidence: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The name of the attribute, for example, glasses, dark_glasses, mouth_open. A full list of supported type names will be provided in the document.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Text value of the detection result. For example, the value for "HairColor" can be "black", "blonde", etc.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1p1beta1DetectedAttribute {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1p1beta1DetectedAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p1beta1DetectedAttribute]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1p1beta1DetectedAttribute](x: Self) {
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceNull: Self = StObject.set(x, "confidence", null)
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
