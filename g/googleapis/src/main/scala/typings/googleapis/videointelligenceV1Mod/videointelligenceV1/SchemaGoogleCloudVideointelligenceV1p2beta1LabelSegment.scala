package typings.googleapis.videointelligenceV1Mod.videointelligenceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Video segment level annotation results for label detection.
  */
trait SchemaGoogleCloudVideointelligenceV1p2beta1LabelSegment extends StObject {
  
  /**
    * Confidence that the label is accurate. Range: [0, 1].
    */
  var confidence: js.UndefOr[Double] = js.undefined
  
  /**
    * Video segment where a label was detected.
    */
  var segment: js.UndefOr[SchemaGoogleCloudVideointelligenceV1p2beta1VideoSegment] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1p2beta1LabelSegment {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1p2beta1LabelSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p2beta1LabelSegment]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1p2beta1LabelSegmentMutableBuilder[Self <: SchemaGoogleCloudVideointelligenceV1p2beta1LabelSegment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    @scala.inline
    def setSegment(value: SchemaGoogleCloudVideointelligenceV1p2beta1VideoSegment): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
  }
}
