package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1beta1ConfidenceMetricsEntry extends StObject {
  
  /**
    * Threshold used for this entry. For classification tasks, this is a classification threshold: a predicted label is categorized as positive or negative (in the context of this point on the PR curve) based on whether the label's score meets this threshold. For image object detection (bounding box) tasks, this is the [intersection-over-union (IOU)](/vision/automl/object-detection/docs/evaluate#intersection-over-union) threshold for the context of this point on the PR curve.
    */
  var confidenceThreshold: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Harmonic mean of recall and precision.
    */
  var f1Score: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The harmonic mean of recall_at1 and precision_at1.
    */
  var f1ScoreAt1: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The harmonic mean of recall_at5 and precision_at5.
    */
  var f1ScoreAt5: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Precision value.
    */
  var precision: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Precision value for entries with label that has highest score.
    */
  var precisionAt1: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Precision value for entries with label that has highest 5 scores.
    */
  var precisionAt5: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Recall value.
    */
  var recall: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Recall value for entries with label that has highest score.
    */
  var recallAt1: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Recall value for entries with label that has highest 5 scores.
    */
  var recallAt5: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1beta1ConfidenceMetricsEntry {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1beta1ConfidenceMetricsEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1beta1ConfidenceMetricsEntry]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1beta1ConfidenceMetricsEntry](x: Self) {
    
    inline def setConfidenceThreshold(value: Double): Self = StObject.set(x, "confidenceThreshold", value.asInstanceOf[js.Any])
    
    inline def setConfidenceThresholdNull: Self = StObject.set(x, "confidenceThreshold", null)
    
    inline def setConfidenceThresholdUndefined: Self = StObject.set(x, "confidenceThreshold", js.undefined)
    
    inline def setF1Score(value: Double): Self = StObject.set(x, "f1Score", value.asInstanceOf[js.Any])
    
    inline def setF1ScoreAt1(value: Double): Self = StObject.set(x, "f1ScoreAt1", value.asInstanceOf[js.Any])
    
    inline def setF1ScoreAt1Null: Self = StObject.set(x, "f1ScoreAt1", null)
    
    inline def setF1ScoreAt1Undefined: Self = StObject.set(x, "f1ScoreAt1", js.undefined)
    
    inline def setF1ScoreAt5(value: Double): Self = StObject.set(x, "f1ScoreAt5", value.asInstanceOf[js.Any])
    
    inline def setF1ScoreAt5Null: Self = StObject.set(x, "f1ScoreAt5", null)
    
    inline def setF1ScoreAt5Undefined: Self = StObject.set(x, "f1ScoreAt5", js.undefined)
    
    inline def setF1ScoreNull: Self = StObject.set(x, "f1Score", null)
    
    inline def setF1ScoreUndefined: Self = StObject.set(x, "f1Score", js.undefined)
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionAt1(value: Double): Self = StObject.set(x, "precisionAt1", value.asInstanceOf[js.Any])
    
    inline def setPrecisionAt1Null: Self = StObject.set(x, "precisionAt1", null)
    
    inline def setPrecisionAt1Undefined: Self = StObject.set(x, "precisionAt1", js.undefined)
    
    inline def setPrecisionAt5(value: Double): Self = StObject.set(x, "precisionAt5", value.asInstanceOf[js.Any])
    
    inline def setPrecisionAt5Null: Self = StObject.set(x, "precisionAt5", null)
    
    inline def setPrecisionAt5Undefined: Self = StObject.set(x, "precisionAt5", js.undefined)
    
    inline def setPrecisionNull: Self = StObject.set(x, "precision", null)
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setRecall(value: Double): Self = StObject.set(x, "recall", value.asInstanceOf[js.Any])
    
    inline def setRecallAt1(value: Double): Self = StObject.set(x, "recallAt1", value.asInstanceOf[js.Any])
    
    inline def setRecallAt1Null: Self = StObject.set(x, "recallAt1", null)
    
    inline def setRecallAt1Undefined: Self = StObject.set(x, "recallAt1", js.undefined)
    
    inline def setRecallAt5(value: Double): Self = StObject.set(x, "recallAt5", value.asInstanceOf[js.Any])
    
    inline def setRecallAt5Null: Self = StObject.set(x, "recallAt5", null)
    
    inline def setRecallAt5Undefined: Self = StObject.set(x, "recallAt5", js.undefined)
    
    inline def setRecallNull: Self = StObject.set(x, "recall", null)
    
    inline def setRecallUndefined: Self = StObject.set(x, "recall", js.undefined)
  }
}
