package typings.kurentoClient.anon

import typings.kurentoClient.kurentoClientStrings.DataChannelClose
import typings.kurentoClient.mod.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined kurento-client.kurento-client.Event<'DataChannelClose', {  channelId :number}> */
trait EventDataChannelClosechan extends StObject {
  
  var channelId: Double
  
  var source: String
  
  var tags: js.Array[Tag]
  
  var timestamp: String
  
  var timestampMillis: String
  
  var `type`: DataChannelClose
}
object EventDataChannelClosechan {
  
  inline def apply(channelId: Double, source: String, tags: js.Array[Tag], timestamp: String, timestampMillis: String): EventDataChannelClosechan = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], timestampMillis = timestampMillis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DataChannelClose")
    __obj.asInstanceOf[EventDataChannelClosechan]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventDataChannelClosechan] (val x: Self) extends AnyVal {
    
    inline def setChannelId(value: Double): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampMillis(value: String): Self = StObject.set(x, "timestampMillis", value.asInstanceOf[js.Any])
    
    inline def setType(value: DataChannelClose): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
