package typings.googleapis.videointelligenceV1Mod.videointelligenceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Annotation progress for a single video.
  */
trait SchemaGoogleCloudVideointelligenceV1p3beta1VideoAnnotationProgress extends StObject {
  
  /**
    * Video file location in [Google Cloud
    * Storage](https://cloud.google.com/storage/).
    */
  var inputUri: js.UndefOr[String] = js.undefined
  
  /**
    * Approximate percentage processed thus far. Guaranteed to be 100 when
    * fully processed.
    */
  var progressPercent: js.UndefOr[Double] = js.undefined
  
  /**
    * Time when the request was received.
    */
  var startTime: js.UndefOr[String] = js.undefined
  
  /**
    * Time of the most recent update.
    */
  var updateTime: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1p3beta1VideoAnnotationProgress {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1p3beta1VideoAnnotationProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p3beta1VideoAnnotationProgress]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1p3beta1VideoAnnotationProgress](x: Self) {
    
    inline def setInputUri(value: String): Self = StObject.set(x, "inputUri", value.asInstanceOf[js.Any])
    
    inline def setInputUriUndefined: Self = StObject.set(x, "inputUri", js.undefined)
    
    inline def setProgressPercent(value: Double): Self = StObject.set(x, "progressPercent", value.asInstanceOf[js.Any])
    
    inline def setProgressPercentUndefined: Self = StObject.set(x, "progressPercent", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
