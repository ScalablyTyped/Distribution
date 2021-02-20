package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EvaluationMetrics extends StObject {
  
  /** Populated for ARIMA models. */
  var arimaForecastingMetrics: js.UndefOr[ArimaForecastingMetrics] = js.native
  
  /** Populated for binary classification/classifier models. */
  var binaryClassificationMetrics: js.UndefOr[BinaryClassificationMetrics] = js.native
  
  /** Populated for clustering models. */
  var clusteringMetrics: js.UndefOr[ClusteringMetrics] = js.native
  
  /** Populated for multi-class classification/classifier models. */
  var multiClassClassificationMetrics: js.UndefOr[MultiClassClassificationMetrics] = js.native
  
  /** Populated for implicit feedback type matrix factorization models. */
  var rankingMetrics: js.UndefOr[RankingMetrics] = js.native
  
  /** Populated for regression models and explicit feedback type matrix factorization models. */
  var regressionMetrics: js.UndefOr[RegressionMetrics] = js.native
}
object EvaluationMetrics {
  
  @scala.inline
  def apply(): EvaluationMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvaluationMetrics]
  }
  
  @scala.inline
  implicit class EvaluationMetricsMutableBuilder[Self <: EvaluationMetrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArimaForecastingMetrics(value: ArimaForecastingMetrics): Self = StObject.set(x, "arimaForecastingMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArimaForecastingMetricsUndefined: Self = StObject.set(x, "arimaForecastingMetrics", js.undefined)
    
    @scala.inline
    def setBinaryClassificationMetrics(value: BinaryClassificationMetrics): Self = StObject.set(x, "binaryClassificationMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryClassificationMetricsUndefined: Self = StObject.set(x, "binaryClassificationMetrics", js.undefined)
    
    @scala.inline
    def setClusteringMetrics(value: ClusteringMetrics): Self = StObject.set(x, "clusteringMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusteringMetricsUndefined: Self = StObject.set(x, "clusteringMetrics", js.undefined)
    
    @scala.inline
    def setMultiClassClassificationMetrics(value: MultiClassClassificationMetrics): Self = StObject.set(x, "multiClassClassificationMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiClassClassificationMetricsUndefined: Self = StObject.set(x, "multiClassClassificationMetrics", js.undefined)
    
    @scala.inline
    def setRankingMetrics(value: RankingMetrics): Self = StObject.set(x, "rankingMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRankingMetricsUndefined: Self = StObject.set(x, "rankingMetrics", js.undefined)
    
    @scala.inline
    def setRegressionMetrics(value: RegressionMetrics): Self = StObject.set(x, "regressionMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegressionMetricsUndefined: Self = StObject.set(x, "regressionMetrics", js.undefined)
  }
}
