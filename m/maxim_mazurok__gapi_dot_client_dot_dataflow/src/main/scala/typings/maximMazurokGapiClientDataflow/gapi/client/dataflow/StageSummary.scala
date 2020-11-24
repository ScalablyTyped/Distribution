package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StageSummary extends js.Object {
  
  /** End time of this stage. If the work item is completed, this is the actual end time of the stage. Otherwise, it is the predicted end time. */
  var endTime: js.UndefOr[String] = js.native
  
  /** Metrics for this stage. */
  var metrics: js.UndefOr[js.Array[MetricUpdate]] = js.native
  
  /** Progress for this stage. Only applicable to Batch jobs. */
  var progress: js.UndefOr[ProgressTimeseries] = js.native
  
  /** ID of this stage */
  var stageId: js.UndefOr[String] = js.native
  
  /** Start time of this stage. */
  var startTime: js.UndefOr[String] = js.native
  
  /** State of this stage. */
  var state: js.UndefOr[String] = js.native
}
object StageSummary {
  
  @scala.inline
  def apply(): StageSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StageSummary]
  }
  
  @scala.inline
  implicit class StageSummaryOps[Self <: StageSummary] (val x: Self) extends AnyVal {
    
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
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setMetricsVarargs(value: MetricUpdate*): Self = this.set("metrics", js.Array(value :_*))
    
    @scala.inline
    def setMetrics(value: js.Array[MetricUpdate]): Self = this.set("metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetrics: Self = this.set("metrics", js.undefined)
    
    @scala.inline
    def setProgress(value: ProgressTimeseries): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    
    @scala.inline
    def setStageId(value: String): Self = this.set("stageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStageId: Self = this.set("stageId", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
