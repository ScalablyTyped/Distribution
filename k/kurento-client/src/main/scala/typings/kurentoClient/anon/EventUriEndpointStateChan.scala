package typings.kurentoClient.anon

import typings.kurentoClient.kurentoClientStrings.UriEndpointStateChanged
import typings.kurentoClient.mod.Tag
import typings.kurentoClient.mod.UriEndpointState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined kurento-client.kurento-client.Event<'UriEndpointStateChanged', {  state :kurento-client.kurento-client.UriEndpointState}> */
trait EventUriEndpointStateChan extends StObject {
  
  var source: String
  
  var state: UriEndpointState
  
  var tags: js.Array[Tag]
  
  var timestamp: String
  
  var timestampMillis: String
  
  var `type`: UriEndpointStateChanged
}
object EventUriEndpointStateChan {
  
  inline def apply(
    source: String,
    state: UriEndpointState,
    tags: js.Array[Tag],
    timestamp: String,
    timestampMillis: String
  ): EventUriEndpointStateChan = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], timestampMillis = timestampMillis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UriEndpointStateChanged")
    __obj.asInstanceOf[EventUriEndpointStateChan]
  }
  
  extension [Self <: EventUriEndpointStateChan](x: Self) {
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setState(value: UriEndpointState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampMillis(value: String): Self = StObject.set(x, "timestampMillis", value.asInstanceOf[js.Any])
    
    inline def setType(value: UriEndpointStateChanged): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
