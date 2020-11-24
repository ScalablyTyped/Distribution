package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiClassClassificationMetrics extends js.Object {
  
  /** Aggregate classification metrics. */
  var aggregateClassificationMetrics: js.UndefOr[AggregateClassificationMetrics] = js.native
  
  /** Confusion matrix at different thresholds. */
  var confusionMatrixList: js.UndefOr[js.Array[ConfusionMatrix]] = js.native
}
object MultiClassClassificationMetrics {
  
  @scala.inline
  def apply(): MultiClassClassificationMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiClassClassificationMetrics]
  }
  
  @scala.inline
  implicit class MultiClassClassificationMetricsOps[Self <: MultiClassClassificationMetrics] (val x: Self) extends AnyVal {
    
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
    def setAggregateClassificationMetrics(value: AggregateClassificationMetrics): Self = this.set("aggregateClassificationMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregateClassificationMetrics: Self = this.set("aggregateClassificationMetrics", js.undefined)
    
    @scala.inline
    def setConfusionMatrixListVarargs(value: ConfusionMatrix*): Self = this.set("confusionMatrixList", js.Array(value :_*))
    
    @scala.inline
    def setConfusionMatrixList(value: js.Array[ConfusionMatrix]): Self = this.set("confusionMatrixList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfusionMatrixList: Self = this.set("confusionMatrixList", js.undefined)
  }
}
