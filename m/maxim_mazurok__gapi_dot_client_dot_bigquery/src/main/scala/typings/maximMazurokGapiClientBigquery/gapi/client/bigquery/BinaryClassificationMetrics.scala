package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinaryClassificationMetrics extends StObject {
  
  /** Aggregate classification metrics. */
  var aggregateClassificationMetrics: js.UndefOr[AggregateClassificationMetrics] = js.undefined
  
  /** Binary confusion matrix at multiple thresholds. */
  var binaryConfusionMatrixList: js.UndefOr[js.Array[BinaryConfusionMatrix]] = js.undefined
  
  /** Label representing the negative class. */
  var negativeLabel: js.UndefOr[String] = js.undefined
  
  /** Label representing the positive class. */
  var positiveLabel: js.UndefOr[String] = js.undefined
}
object BinaryClassificationMetrics {
  
  inline def apply(): BinaryClassificationMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BinaryClassificationMetrics]
  }
  
  extension [Self <: BinaryClassificationMetrics](x: Self) {
    
    inline def setAggregateClassificationMetrics(value: AggregateClassificationMetrics): Self = StObject.set(x, "aggregateClassificationMetrics", value.asInstanceOf[js.Any])
    
    inline def setAggregateClassificationMetricsUndefined: Self = StObject.set(x, "aggregateClassificationMetrics", js.undefined)
    
    inline def setBinaryConfusionMatrixList(value: js.Array[BinaryConfusionMatrix]): Self = StObject.set(x, "binaryConfusionMatrixList", value.asInstanceOf[js.Any])
    
    inline def setBinaryConfusionMatrixListUndefined: Self = StObject.set(x, "binaryConfusionMatrixList", js.undefined)
    
    inline def setBinaryConfusionMatrixListVarargs(value: BinaryConfusionMatrix*): Self = StObject.set(x, "binaryConfusionMatrixList", js.Array(value*))
    
    inline def setNegativeLabel(value: String): Self = StObject.set(x, "negativeLabel", value.asInstanceOf[js.Any])
    
    inline def setNegativeLabelUndefined: Self = StObject.set(x, "negativeLabel", js.undefined)
    
    inline def setPositiveLabel(value: String): Self = StObject.set(x, "positiveLabel", value.asInstanceOf[js.Any])
    
    inline def setPositiveLabelUndefined: Self = StObject.set(x, "positiveLabel", js.undefined)
  }
}
