package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregateClassificationMetrics extends StObject {
  
  /** Accuracy is the fraction of predictions given the correct label. For multiclass this is a micro-averaged metric. */
  var accuracy: js.UndefOr[Double] = js.undefined
  
  /** The F1 score is an average of recall and precision. For multiclass this is a macro-averaged metric. */
  var f1Score: js.UndefOr[Double] = js.undefined
  
  /** Logarithmic Loss. For multiclass this is a macro-averaged metric. */
  var logLoss: js.UndefOr[Double] = js.undefined
  
  /** Precision is the fraction of actual positive predictions that had positive actual labels. For multiclass this is a macro-averaged metric treating each class as a binary classifier. */
  var precision: js.UndefOr[Double] = js.undefined
  
  /** Recall is the fraction of actual positive labels that were given a positive prediction. For multiclass this is a macro-averaged metric. */
  var recall: js.UndefOr[Double] = js.undefined
  
  /** Area Under a ROC Curve. For multiclass this is a macro-averaged metric. */
  var rocAuc: js.UndefOr[Double] = js.undefined
  
  /**
    * Threshold at which the metrics are computed. For binary classification models this is the positive class threshold. For multi-class classfication models this is the confidence
    * threshold.
    */
  var threshold: js.UndefOr[Double] = js.undefined
}
object AggregateClassificationMetrics {
  
  inline def apply(): AggregateClassificationMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregateClassificationMetrics]
  }
  
  extension [Self <: AggregateClassificationMetrics](x: Self) {
    
    inline def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    inline def setAccuracyUndefined: Self = StObject.set(x, "accuracy", js.undefined)
    
    inline def setF1Score(value: Double): Self = StObject.set(x, "f1Score", value.asInstanceOf[js.Any])
    
    inline def setF1ScoreUndefined: Self = StObject.set(x, "f1Score", js.undefined)
    
    inline def setLogLoss(value: Double): Self = StObject.set(x, "logLoss", value.asInstanceOf[js.Any])
    
    inline def setLogLossUndefined: Self = StObject.set(x, "logLoss", js.undefined)
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setRecall(value: Double): Self = StObject.set(x, "recall", value.asInstanceOf[js.Any])
    
    inline def setRecallUndefined: Self = StObject.set(x, "recall", js.undefined)
    
    inline def setRocAuc(value: Double): Self = StObject.set(x, "rocAuc", value.asInstanceOf[js.Any])
    
    inline def setRocAucUndefined: Self = StObject.set(x, "rocAuc", js.undefined)
    
    inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
