package typings.googleapis.pubsubliteV1Mod.pubsubliteV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaComputeMessageStatsResponse extends StObject {
  
  /**
    * The number of quota bytes accounted to these messages.
    */
  var messageBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The count of messages.
    */
  var messageCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The minimum event timestamp across these messages. For the purposes of this computation, if a message does not have an event time, we use the publish time. The timestamp will be unset if there are no messages.
    */
  var minimumEventTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The minimum publish timestamp across these messages. Note that publish timestamps within a partition are not guaranteed to be non-decreasing. The timestamp will be unset if there are no messages.
    */
  var minimumPublishTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaComputeMessageStatsResponse {
  
  inline def apply(): SchemaComputeMessageStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaComputeMessageStatsResponse]
  }
  
  extension [Self <: SchemaComputeMessageStatsResponse](x: Self) {
    
    inline def setMessageBytes(value: String): Self = StObject.set(x, "messageBytes", value.asInstanceOf[js.Any])
    
    inline def setMessageBytesNull: Self = StObject.set(x, "messageBytes", null)
    
    inline def setMessageBytesUndefined: Self = StObject.set(x, "messageBytes", js.undefined)
    
    inline def setMessageCount(value: String): Self = StObject.set(x, "messageCount", value.asInstanceOf[js.Any])
    
    inline def setMessageCountNull: Self = StObject.set(x, "messageCount", null)
    
    inline def setMessageCountUndefined: Self = StObject.set(x, "messageCount", js.undefined)
    
    inline def setMinimumEventTime(value: String): Self = StObject.set(x, "minimumEventTime", value.asInstanceOf[js.Any])
    
    inline def setMinimumEventTimeNull: Self = StObject.set(x, "minimumEventTime", null)
    
    inline def setMinimumEventTimeUndefined: Self = StObject.set(x, "minimumEventTime", js.undefined)
    
    inline def setMinimumPublishTime(value: String): Self = StObject.set(x, "minimumPublishTime", value.asInstanceOf[js.Any])
    
    inline def setMinimumPublishTimeNull: Self = StObject.set(x, "minimumPublishTime", null)
    
    inline def setMinimumPublishTimeUndefined: Self = StObject.set(x, "minimumPublishTime", js.undefined)
  }
}
