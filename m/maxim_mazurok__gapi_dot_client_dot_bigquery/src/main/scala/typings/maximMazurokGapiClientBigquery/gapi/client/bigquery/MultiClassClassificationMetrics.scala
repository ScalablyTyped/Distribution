package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiClassClassificationMetrics extends StObject {
  
  /** Aggregate classification metrics. */
  var aggregateClassificationMetrics: js.UndefOr[AggregateClassificationMetrics] = js.undefined
  
  /** Confusion matrix at different thresholds. */
  var confusionMatrixList: js.UndefOr[js.Array[ConfusionMatrix]] = js.undefined
}
object MultiClassClassificationMetrics {
  
  inline def apply(): MultiClassClassificationMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiClassClassificationMetrics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultiClassClassificationMetrics] (val x: Self) extends AnyVal {
    
    inline def setAggregateClassificationMetrics(value: AggregateClassificationMetrics): Self = StObject.set(x, "aggregateClassificationMetrics", value.asInstanceOf[js.Any])
    
    inline def setAggregateClassificationMetricsUndefined: Self = StObject.set(x, "aggregateClassificationMetrics", js.undefined)
    
    inline def setConfusionMatrixList(value: js.Array[ConfusionMatrix]): Self = StObject.set(x, "confusionMatrixList", value.asInstanceOf[js.Any])
    
    inline def setConfusionMatrixListUndefined: Self = StObject.set(x, "confusionMatrixList", js.undefined)
    
    inline def setConfusionMatrixListVarargs(value: ConfusionMatrix*): Self = StObject.set(x, "confusionMatrixList", js.Array(value*))
  }
}
