package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListJobMessagesResponse extends js.Object {
  
  /** Autoscaling events in ascending timestamp order. */
  var autoscalingEvents: js.UndefOr[js.Array[AutoscalingEvent]] = js.native
  
  /** Messages in ascending timestamp order. */
  var jobMessages: js.UndefOr[js.Array[JobMessage]] = js.native
  
  /** The token to obtain the next page of results if there are more. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListJobMessagesResponse {
  
  @scala.inline
  def apply(): ListJobMessagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobMessagesResponse]
  }
  
  @scala.inline
  implicit class ListJobMessagesResponseOps[Self <: ListJobMessagesResponse] (val x: Self) extends AnyVal {
    
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
    def setAutoscalingEventsVarargs(value: AutoscalingEvent*): Self = this.set("autoscalingEvents", js.Array(value :_*))
    
    @scala.inline
    def setAutoscalingEvents(value: js.Array[AutoscalingEvent]): Self = this.set("autoscalingEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoscalingEvents: Self = this.set("autoscalingEvents", js.undefined)
    
    @scala.inline
    def setJobMessagesVarargs(value: JobMessage*): Self = this.set("jobMessages", js.Array(value :_*))
    
    @scala.inline
    def setJobMessages(value: js.Array[JobMessage]): Self = this.set("jobMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobMessages: Self = this.set("jobMessages", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
