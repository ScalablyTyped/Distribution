package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListJobMessagesResponse extends StObject {
  
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
  implicit class ListJobMessagesResponseMutableBuilder[Self <: ListJobMessagesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoscalingEvents(value: js.Array[AutoscalingEvent]): Self = StObject.set(x, "autoscalingEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoscalingEventsUndefined: Self = StObject.set(x, "autoscalingEvents", js.undefined)
    
    @scala.inline
    def setAutoscalingEventsVarargs(value: AutoscalingEvent*): Self = StObject.set(x, "autoscalingEvents", js.Array(value :_*))
    
    @scala.inline
    def setJobMessages(value: js.Array[JobMessage]): Self = StObject.set(x, "jobMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobMessagesUndefined: Self = StObject.set(x, "jobMessages", js.undefined)
    
    @scala.inline
    def setJobMessagesVarargs(value: JobMessage*): Self = StObject.set(x, "jobMessages", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
