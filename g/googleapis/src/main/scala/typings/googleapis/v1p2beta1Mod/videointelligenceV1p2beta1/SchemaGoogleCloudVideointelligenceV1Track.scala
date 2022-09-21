package typings.googleapis.v1p2beta1Mod.videointelligenceV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVideointelligenceV1Track extends StObject {
  
  /**
    * Optional. Attributes in the track level.
    */
  var attributes: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1DetectedAttribute]] = js.undefined
  
  /**
    * Optional. The confidence score of the tracked object.
    */
  var confidence: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Video segment of a track.
    */
  var segment: js.UndefOr[SchemaGoogleCloudVideointelligenceV1VideoSegment] = js.undefined
  
  /**
    * The object with timestamp and attributes per frame in the track.
    */
  var timestampedObjects: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1TimestampedObject]] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1Track {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1Track = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1Track]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1Track](x: Self) {
    
    inline def setAttributes(value: js.Array[SchemaGoogleCloudVideointelligenceV1DetectedAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: SchemaGoogleCloudVideointelligenceV1DetectedAttribute*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceNull: Self = StObject.set(x, "confidence", null)
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setSegment(value: SchemaGoogleCloudVideointelligenceV1VideoSegment): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    inline def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
    
    inline def setTimestampedObjects(value: js.Array[SchemaGoogleCloudVideointelligenceV1TimestampedObject]): Self = StObject.set(x, "timestampedObjects", value.asInstanceOf[js.Any])
    
    inline def setTimestampedObjectsUndefined: Self = StObject.set(x, "timestampedObjects", js.undefined)
    
    inline def setTimestampedObjectsVarargs(value: SchemaGoogleCloudVideointelligenceV1TimestampedObject*): Self = StObject.set(x, "timestampedObjects", js.Array(value*))
  }
}
