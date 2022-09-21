package typings.googleapis.videointelligenceV1Mod.videointelligenceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVideointelligenceV1DetectedLandmark extends StObject {
  
  /**
    * The confidence score of the detected landmark. Range [0, 1].
    */
  var confidence: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The name of this landmark, for example, left_hand, right_shoulder.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The 2D point of the detected landmark using the normalized image coordindate system. The normalized coordinates have the range from 0 to 1.
    */
  var point: js.UndefOr[SchemaGoogleCloudVideointelligenceV1NormalizedVertex] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1DetectedLandmark {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1DetectedLandmark = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1DetectedLandmark]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1DetectedLandmark](x: Self) {
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceNull: Self = StObject.set(x, "confidence", null)
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPoint(value: SchemaGoogleCloudVideointelligenceV1NormalizedVertex): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
  }
}
