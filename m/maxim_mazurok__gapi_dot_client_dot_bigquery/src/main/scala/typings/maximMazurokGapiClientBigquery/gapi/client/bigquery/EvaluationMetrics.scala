package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EvaluationMetrics extends js.Object {
  
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
  implicit class EvaluationMetricsOps[Self <: EvaluationMetrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArimaForecastingMetrics(value: ArimaForecastingMetrics): Self = this.set("arimaForecastingMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArimaForecastingMetrics: Self = this.set("arimaForecastingMetrics", js.undefined)
    
    @scala.inline
    def setBinaryClassificationMetrics(value: BinaryClassificationMetrics): Self = this.set("binaryClassificationMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinaryClassificationMetrics: Self = this.set("binaryClassificationMetrics", js.undefined)
    
    @scala.inline
    def setClusteringMetrics(value: ClusteringMetrics): Self = this.set("clusteringMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusteringMetrics: Self = this.set("clusteringMetrics", js.undefined)
    
    @scala.inline
    def setMultiClassClassificationMetrics(value: MultiClassClassificationMetrics): Self = this.set("multiClassClassificationMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiClassClassificationMetrics: Self = this.set("multiClassClassificationMetrics", js.undefined)
    
    @scala.inline
    def setRankingMetrics(value: RankingMetrics): Self = this.set("rankingMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRankingMetrics: Self = this.set("rankingMetrics", js.undefined)
    
    @scala.inline
    def setRegressionMetrics(value: RegressionMetrics): Self = this.set("regressionMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegressionMetrics: Self = this.set("regressionMetrics", js.undefined)
  }
}
