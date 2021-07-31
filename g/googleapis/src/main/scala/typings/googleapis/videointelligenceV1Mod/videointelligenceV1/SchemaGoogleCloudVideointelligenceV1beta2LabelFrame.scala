package typings.googleapis.videointelligenceV1Mod.videointelligenceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Video frame level annotation results for label detection.
  */
trait SchemaGoogleCloudVideointelligenceV1beta2LabelFrame extends StObject {
  
  /**
    * Confidence that the label is accurate. Range: [0, 1].
    */
  var confidence: js.UndefOr[Double] = js.undefined
  
  /**
    * Time-offset, relative to the beginning of the video, corresponding to the
    * video frame for this location.
    */
  var timeOffset: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1beta2LabelFrame {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1beta2LabelFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1beta2LabelFrame]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1beta2LabelFrameMutableBuilder[Self <: SchemaGoogleCloudVideointelligenceV1beta2LabelFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    @scala.inline
    def setTimeOffset(value: String): Self = StObject.set(x, "timeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeOffsetUndefined: Self = StObject.set(x, "timeOffset", js.undefined)
  }
}
