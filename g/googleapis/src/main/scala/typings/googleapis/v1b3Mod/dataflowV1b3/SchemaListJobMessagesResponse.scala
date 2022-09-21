package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListJobMessagesResponse {
  
  inline def apply(): SchemaListJobMessagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListJobMessagesResponse]
  }
  
  extension [Self <: SchemaListJobMessagesResponse](x: Self) {
    
    inline def setAutoscalingEvents(value: js.Array[SchemaAutoscalingEvent]): Self = StObject.set(x, "autoscalingEvents", value.asInstanceOf[js.Any])
    
    inline def setAutoscalingEventsUndefined: Self = StObject.set(x, "autoscalingEvents", js.undefined)
    
    inline def setAutoscalingEventsVarargs(value: SchemaAutoscalingEvent*): Self = StObject.set(x, "autoscalingEvents", js.Array(value*))
    
    inline def setJobMessages(value: js.Array[SchemaJobMessage]): Self = StObject.set(x, "jobMessages", value.asInstanceOf[js.Any])
    
    inline def setJobMessagesUndefined: Self = StObject.set(x, "jobMessages", js.undefined)
    
    inline def setJobMessagesVarargs(value: SchemaJobMessage*): Self = StObject.set(x, "jobMessages", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
