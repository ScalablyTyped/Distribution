package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluationMetrics extends StObject {
  
  /** Populated for ARIMA models. */
  var arimaForecastingMetrics: js.UndefOr[ArimaForecastingMetrics] = js.undefined
  
  /** Populated for binary classification/classifier models. */
  var binaryClassificationMetrics: js.UndefOr[BinaryClassificationMetrics] = js.undefined
  
  /** Populated for clustering models. */
  var clusteringMetrics: js.UndefOr[ClusteringMetrics] = js.undefined
  
  /** Evaluation metrics when the model is a dimensionality reduction model, which currently includes PCA. */
  var dimensionalityReductionMetrics: js.UndefOr[DimensionalityReductionMetrics] = js.undefined
  
  /** Populated for multi-class classification/classifier models. */
  var multiClassClassificationMetrics: js.UndefOr[MultiClassClassificationMetrics] = js.undefined
  
  /** Populated for implicit feedback type matrix factorization models. */
  var rankingMetrics: js.UndefOr[RankingMetrics] = js.undefined
  
  /** Populated for regression models and explicit feedback type matrix factorization models. */
  var regressionMetrics: js.UndefOr[RegressionMetrics] = js.undefined
}
object EvaluationMetrics {
  
  inline def apply(): EvaluationMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvaluationMetrics]
  }
  
  extension [Self <: EvaluationMetrics](x: Self) {
    
    inline def setArimaForecastingMetrics(value: ArimaForecastingMetrics): Self = StObject.set(x, "arimaForecastingMetrics", value.asInstanceOf[js.Any])
    
    inline def setArimaForecastingMetricsUndefined: Self = StObject.set(x, "arimaForecastingMetrics", js.undefined)
    
    inline def setBinaryClassificationMetrics(value: BinaryClassificationMetrics): Self = StObject.set(x, "binaryClassificationMetrics", value.asInstanceOf[js.Any])
    
    inline def setBinaryClassificationMetricsUndefined: Self = StObject.set(x, "binaryClassificationMetrics", js.undefined)
    
    inline def setClusteringMetrics(value: ClusteringMetrics): Self = StObject.set(x, "clusteringMetrics", value.asInstanceOf[js.Any])
    
    inline def setClusteringMetricsUndefined: Self = StObject.set(x, "clusteringMetrics", js.undefined)
    
    inline def setDimensionalityReductionMetrics(value: DimensionalityReductionMetrics): Self = StObject.set(x, "dimensionalityReductionMetrics", value.asInstanceOf[js.Any])
    
    inline def setDimensionalityReductionMetricsUndefined: Self = StObject.set(x, "dimensionalityReductionMetrics", js.undefined)
    
    inline def setMultiClassClassificationMetrics(value: MultiClassClassificationMetrics): Self = StObject.set(x, "multiClassClassificationMetrics", value.asInstanceOf[js.Any])
    
    inline def setMultiClassClassificationMetricsUndefined: Self = StObject.set(x, "multiClassClassificationMetrics", js.undefined)
    
    inline def setRankingMetrics(value: RankingMetrics): Self = StObject.set(x, "rankingMetrics", value.asInstanceOf[js.Any])
    
    inline def setRankingMetricsUndefined: Self = StObject.set(x, "rankingMetrics", js.undefined)
    
    inline def setRegressionMetrics(value: RegressionMetrics): Self = StObject.set(x, "regressionMetrics", value.asInstanceOf[js.Any])
    
    inline def setRegressionMetricsUndefined: Self = StObject.set(x, "regressionMetrics", js.undefined)
  }
}
