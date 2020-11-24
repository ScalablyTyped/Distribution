package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BinaryClassificationMetrics extends js.Object {
  
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
  implicit class BinaryClassificationMetricsOps[Self <: BinaryClassificationMetrics] (val x: Self) extends AnyVal {
    
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
    def setBinaryConfusionMatrixListVarargs(value: BinaryConfusionMatrix*): Self = this.set("binaryConfusionMatrixList", js.Array(value :_*))
    
    @scala.inline
    def setBinaryConfusionMatrixList(value: js.Array[BinaryConfusionMatrix]): Self = this.set("binaryConfusionMatrixList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinaryConfusionMatrixList: Self = this.set("binaryConfusionMatrixList", js.undefined)
    
    @scala.inline
    def setNegativeLabel(value: String): Self = this.set("negativeLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNegativeLabel: Self = this.set("negativeLabel", js.undefined)
    
    @scala.inline
    def setPositiveLabel(value: String): Self = this.set("positiveLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositiveLabel: Self = this.set("positiveLabel", js.undefined)
  }
}
