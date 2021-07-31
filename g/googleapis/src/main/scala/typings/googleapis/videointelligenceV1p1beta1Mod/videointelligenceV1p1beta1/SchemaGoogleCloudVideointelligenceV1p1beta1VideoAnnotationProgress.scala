package typings.googleapis.videointelligenceV1p1beta1Mod.videointelligenceV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Annotation progress for a single video.
  */
trait SchemaGoogleCloudVideointelligenceV1p1beta1VideoAnnotationProgress extends StObject {
  
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
object SchemaGoogleCloudVideointelligenceV1p1beta1VideoAnnotationProgress {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1p1beta1VideoAnnotationProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p1beta1VideoAnnotationProgress]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1p1beta1VideoAnnotationProgressMutableBuilder[Self <: SchemaGoogleCloudVideointelligenceV1p1beta1VideoAnnotationProgress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputUri(value: String): Self = StObject.set(x, "inputUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUriUndefined: Self = StObject.set(x, "inputUri", js.undefined)
    
    @scala.inline
    def setProgressPercent(value: Double): Self = StObject.set(x, "progressPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressPercentUndefined: Self = StObject.set(x, "progressPercent", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
