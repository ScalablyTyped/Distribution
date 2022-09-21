package typings.googleapis.v1p2beta1Mod.videointelligenceV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVideointelligenceV1VideoAnnotationProgress extends StObject {
  
  /**
    * Specifies which feature is being tracked if the request contains more than one feature.
    */
  var feature: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Video file location in [Cloud Storage](https://cloud.google.com/storage/).
    */
  var inputUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Approximate percentage processed thus far. Guaranteed to be 100 when fully processed.
    */
  var progressPercent: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Specifies which segment is being tracked if the request contains more than one segment.
    */
  var segment: js.UndefOr[SchemaGoogleCloudVideointelligenceV1VideoSegment] = js.undefined
  
  /**
    * Time when the request was received.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Time of the most recent update.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1VideoAnnotationProgress {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1VideoAnnotationProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1VideoAnnotationProgress]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1VideoAnnotationProgress](x: Self) {
    
    inline def setFeature(value: String): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setFeatureNull: Self = StObject.set(x, "feature", null)
    
    inline def setFeatureUndefined: Self = StObject.set(x, "feature", js.undefined)
    
    inline def setInputUri(value: String): Self = StObject.set(x, "inputUri", value.asInstanceOf[js.Any])
    
    inline def setInputUriNull: Self = StObject.set(x, "inputUri", null)
    
    inline def setInputUriUndefined: Self = StObject.set(x, "inputUri", js.undefined)
    
    inline def setProgressPercent(value: Double): Self = StObject.set(x, "progressPercent", value.asInstanceOf[js.Any])
    
    inline def setProgressPercentNull: Self = StObject.set(x, "progressPercent", null)
    
    inline def setProgressPercentUndefined: Self = StObject.set(x, "progressPercent", js.undefined)
    
    inline def setSegment(value: SchemaGoogleCloudVideointelligenceV1VideoSegment): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    inline def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
