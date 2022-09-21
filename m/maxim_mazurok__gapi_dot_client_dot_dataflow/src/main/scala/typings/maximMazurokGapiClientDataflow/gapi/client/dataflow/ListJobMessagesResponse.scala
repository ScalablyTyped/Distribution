package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListJobMessagesResponse extends StObject {
  
  /** Autoscaling events in ascending timestamp order. */
  var autoscalingEvents: js.UndefOr[js.Array[AutoscalingEvent]] = js.undefined
  
  /** Messages in ascending timestamp order. */
  var jobMessages: js.UndefOr[js.Array[JobMessage]] = js.undefined
  
  /** The token to obtain the next page of results if there are more. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListJobMessagesResponse {
  
  inline def apply(): ListJobMessagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobMessagesResponse]
  }
  
  extension [Self <: ListJobMessagesResponse](x: Self) {
    
    inline def setAutoscalingEvents(value: js.Array[AutoscalingEvent]): Self = StObject.set(x, "autoscalingEvents", value.asInstanceOf[js.Any])
    
    inline def setAutoscalingEventsUndefined: Self = StObject.set(x, "autoscalingEvents", js.undefined)
    
    inline def setAutoscalingEventsVarargs(value: AutoscalingEvent*): Self = StObject.set(x, "autoscalingEvents", js.Array(value*))
    
    inline def setJobMessages(value: js.Array[JobMessage]): Self = StObject.set(x, "jobMessages", value.asInstanceOf[js.Any])
    
    inline def setJobMessagesUndefined: Self = StObject.set(x, "jobMessages", js.undefined)
    
    inline def setJobMessagesVarargs(value: JobMessage*): Self = StObject.set(x, "jobMessages", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
