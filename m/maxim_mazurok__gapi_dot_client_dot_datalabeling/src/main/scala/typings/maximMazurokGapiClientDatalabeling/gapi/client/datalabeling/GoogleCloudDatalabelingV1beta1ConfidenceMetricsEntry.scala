package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1ConfidenceMetricsEntry extends StObject {
  
  /**
    * Threshold used for this entry. For classification tasks, this is a classification threshold: a predicted label is categorized as positive or negative (in the context of this point
    * on the PR curve) based on whether the label's score meets this threshold. For image object detection (bounding box) tasks, this is the [intersection-over-union
    * (IOU)](/vision/automl/object-detection/docs/evaluate#intersection-over-union) threshold for the context of this point on the PR curve.
    */
  var confidenceThreshold: js.UndefOr[Double] = js.undefined
  
  /** Harmonic mean of recall and precision. */
  var f1Score: js.UndefOr[Double] = js.undefined
  
  /** The harmonic mean of recall_at1 and precision_at1. */
  var f1ScoreAt1: js.UndefOr[Double] = js.undefined
  
  /** The harmonic mean of recall_at5 and precision_at5. */
  var f1ScoreAt5: js.UndefOr[Double] = js.undefined
  
  /** Precision value. */
  var precision: js.UndefOr[Double] = js.undefined
  
  /** Precision value for entries with label that has highest score. */
  var precisionAt1: js.UndefOr[Double] = js.undefined
  
  /** Precision value for entries with label that has highest 5 scores. */
  var precisionAt5: js.UndefOr[Double] = js.undefined
  
  /** Recall value. */
  var recall: js.UndefOr[Double] = js.undefined
  
  /** Recall value for entries with label that has highest score. */
  var recallAt1: js.UndefOr[Double] = js.undefined
  
  /** Recall value for entries with label that has highest 5 scores. */
  var recallAt5: js.UndefOr[Double] = js.undefined
}
object GoogleCloudDatalabelingV1beta1ConfidenceMetricsEntry {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1ConfidenceMetricsEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ConfidenceMetricsEntry]
  }
  
  extension [Self <: GoogleCloudDatalabelingV1beta1ConfidenceMetricsEntry](x: Self) {
    
    inline def setConfidenceThreshold(value: Double): Self = StObject.set(x, "confidenceThreshold", value.asInstanceOf[js.Any])
    
    inline def setConfidenceThresholdUndefined: Self = StObject.set(x, "confidenceThreshold", js.undefined)
    
    inline def setF1Score(value: Double): Self = StObject.set(x, "f1Score", value.asInstanceOf[js.Any])
    
    inline def setF1ScoreAt1(value: Double): Self = StObject.set(x, "f1ScoreAt1", value.asInstanceOf[js.Any])
    
    inline def setF1ScoreAt1Undefined: Self = StObject.set(x, "f1ScoreAt1", js.undefined)
    
    inline def setF1ScoreAt5(value: Double): Self = StObject.set(x, "f1ScoreAt5", value.asInstanceOf[js.Any])
    
    inline def setF1ScoreAt5Undefined: Self = StObject.set(x, "f1ScoreAt5", js.undefined)
    
    inline def setF1ScoreUndefined: Self = StObject.set(x, "f1Score", js.undefined)
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionAt1(value: Double): Self = StObject.set(x, "precisionAt1", value.asInstanceOf[js.Any])
    
    inline def setPrecisionAt1Undefined: Self = StObject.set(x, "precisionAt1", js.undefined)
    
    inline def setPrecisionAt5(value: Double): Self = StObject.set(x, "precisionAt5", value.asInstanceOf[js.Any])
    
    inline def setPrecisionAt5Undefined: Self = StObject.set(x, "precisionAt5", js.undefined)
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setRecall(value: Double): Self = StObject.set(x, "recall", value.asInstanceOf[js.Any])
    
    inline def setRecallAt1(value: Double): Self = StObject.set(x, "recallAt1", value.asInstanceOf[js.Any])
    
    inline def setRecallAt1Undefined: Self = StObject.set(x, "recallAt1", js.undefined)
    
    inline def setRecallAt5(value: Double): Self = StObject.set(x, "recallAt5", value.asInstanceOf[js.Any])
    
    inline def setRecallAt5Undefined: Self = StObject.set(x, "recallAt5", js.undefined)
    
    inline def setRecallUndefined: Self = StObject.set(x, "recall", js.undefined)
  }
}
