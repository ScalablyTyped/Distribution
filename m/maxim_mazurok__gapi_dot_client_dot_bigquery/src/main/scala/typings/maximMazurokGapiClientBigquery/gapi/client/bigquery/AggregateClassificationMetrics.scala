package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggregateClassificationMetrics extends StObject {
  
  /** Accuracy is the fraction of predictions given the correct label. For multiclass this is a micro-averaged metric. */
  var accuracy: js.UndefOr[Double] = js.native
  
  /** The F1 score is an average of recall and precision. For multiclass this is a macro-averaged metric. */
  var f1Score: js.UndefOr[Double] = js.native
  
  /** Logarithmic Loss. For multiclass this is a macro-averaged metric. */
  var logLoss: js.UndefOr[Double] = js.native
  
  /** Precision is the fraction of actual positive predictions that had positive actual labels. For multiclass this is a macro-averaged metric treating each class as a binary classifier. */
  var precision: js.UndefOr[Double] = js.native
  
  /** Recall is the fraction of actual positive labels that were given a positive prediction. For multiclass this is a macro-averaged metric. */
  var recall: js.UndefOr[Double] = js.native
  
  /** Area Under a ROC Curve. For multiclass this is a macro-averaged metric. */
  var rocAuc: js.UndefOr[Double] = js.native
  
  /**
    * Threshold at which the metrics are computed. For binary classification models this is the positive class threshold. For multi-class classfication models this is the confidence
    * threshold.
    */
  var threshold: js.UndefOr[Double] = js.native
}
object AggregateClassificationMetrics {
  
  @scala.inline
  def apply(): AggregateClassificationMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregateClassificationMetrics]
  }
  
  @scala.inline
  implicit class AggregateClassificationMetricsMutableBuilder[Self <: AggregateClassificationMetrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccuracyUndefined: Self = StObject.set(x, "accuracy", js.undefined)
    
    @scala.inline
    def setF1Score(value: Double): Self = StObject.set(x, "f1Score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF1ScoreUndefined: Self = StObject.set(x, "f1Score", js.undefined)
    
    @scala.inline
    def setLogLoss(value: Double): Self = StObject.set(x, "logLoss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogLossUndefined: Self = StObject.set(x, "logLoss", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    @scala.inline
    def setRecall(value: Double): Self = StObject.set(x, "recall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecallUndefined: Self = StObject.set(x, "recall", js.undefined)
    
    @scala.inline
    def setRocAuc(value: Double): Self = StObject.set(x, "rocAuc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRocAucUndefined: Self = StObject.set(x, "rocAuc", js.undefined)
    
    @scala.inline
    def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
