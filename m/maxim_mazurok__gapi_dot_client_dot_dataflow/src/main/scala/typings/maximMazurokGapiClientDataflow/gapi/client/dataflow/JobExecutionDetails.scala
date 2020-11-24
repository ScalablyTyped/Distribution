package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobExecutionDetails extends js.Object {
  
  /** If present, this response does not contain all requested tasks. To obtain the next page of results, repeat the request with page_token set to this value. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The stages of the job execution. */
  var stages: js.UndefOr[js.Array[StageSummary]] = js.native
}
object JobExecutionDetails {
  
  @scala.inline
  def apply(): JobExecutionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobExecutionDetails]
  }
  
  @scala.inline
  implicit class JobExecutionDetailsOps[Self <: JobExecutionDetails] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setStagesVarargs(value: StageSummary*): Self = this.set("stages", js.Array(value :_*))
    
    @scala.inline
    def setStages(value: js.Array[StageSummary]): Self = this.set("stages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStages: Self = this.set("stages", js.undefined)
  }
}
