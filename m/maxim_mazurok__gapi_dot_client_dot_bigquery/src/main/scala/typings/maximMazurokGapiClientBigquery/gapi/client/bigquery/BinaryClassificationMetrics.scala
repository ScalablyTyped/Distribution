package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BinaryClassificationMetrics extends StObject {
  
  /** Aggregate classification metrics. */
  var aggregateClassificationMetrics: js.UndefOr[AggregateClassificationMetrics] = js.native
  
  /** Binary confusion matrix at multiple thresholds. */
  var binaryConfusionMatrixList: js.UndefOr[js.Array[BinaryConfusionMatrix]] = js.native
  
  /** Label representing the negative class. */
  var negativeLabel: js.UndefOr[String] = js.native
  
  /** Label representing the positive class. */
  var positiveLabel: js.UndefOr[String] = js.native
}
object BinaryClassificationMetrics {
  
  @scala.inline
  def apply(): BinaryClassificationMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BinaryClassificationMetrics]
  }
  
  @scala.inline
  implicit class BinaryClassificationMetricsMutableBuilder[Self <: BinaryClassificationMetrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregateClassificationMetrics(value: AggregateClassificationMetrics): Self = StObject.set(x, "aggregateClassificationMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregateClassificationMetricsUndefined: Self = StObject.set(x, "aggregateClassificationMetrics", js.undefined)
    
    @scala.inline
    def setBinaryConfusionMatrixList(value: js.Array[BinaryConfusionMatrix]): Self = StObject.set(x, "binaryConfusionMatrixList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryConfusionMatrixListUndefined: Self = StObject.set(x, "binaryConfusionMatrixList", js.undefined)
    
    @scala.inline
    def setBinaryConfusionMatrixListVarargs(value: BinaryConfusionMatrix*): Self = StObject.set(x, "binaryConfusionMatrixList", js.Array(value :_*))
    
    @scala.inline
    def setNegativeLabel(value: String): Self = StObject.set(x, "negativeLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegativeLabelUndefined: Self = StObject.set(x, "negativeLabel", js.undefined)
    
    @scala.inline
    def setPositiveLabel(value: String): Self = StObject.set(x, "positiveLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositiveLabelUndefined: Self = StObject.set(x, "positiveLabel", js.undefined)
  }
}
