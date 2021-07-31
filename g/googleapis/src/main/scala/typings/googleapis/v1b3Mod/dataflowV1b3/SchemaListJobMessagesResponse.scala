package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response to a request to list job messages.
  */
trait SchemaListJobMessagesResponse extends StObject {
  
  /**
    * Autoscaling events in ascending timestamp order.
    */
  var autoscalingEvents: js.UndefOr[js.Array[SchemaAutoscalingEvent]] = js.undefined
  
  /**
    * Messages in ascending timestamp order.
    */
  var jobMessages: js.UndefOr[js.Array[SchemaJobMessage]] = js.undefined
  
  /**
    * The token to obtain the next page of results if there are more.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListJobMessagesResponse {
  
  @scala.inline
  def apply(): SchemaListJobMessagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListJobMessagesResponse]
  }
  
  @scala.inline
  implicit class SchemaListJobMessagesResponseMutableBuilder[Self <: SchemaListJobMessagesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoscalingEvents(value: js.Array[SchemaAutoscalingEvent]): Self = StObject.set(x, "autoscalingEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoscalingEventsUndefined: Self = StObject.set(x, "autoscalingEvents", js.undefined)
    
    @scala.inline
    def setAutoscalingEventsVarargs(value: SchemaAutoscalingEvent*): Self = StObject.set(x, "autoscalingEvents", js.Array(value :_*))
    
    @scala.inline
    def setJobMessages(value: js.Array[SchemaJobMessage]): Self = StObject.set(x, "jobMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobMessagesUndefined: Self = StObject.set(x, "jobMessages", js.undefined)
    
    @scala.inline
    def setJobMessagesVarargs(value: SchemaJobMessage*): Self = StObject.set(x, "jobMessages", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
