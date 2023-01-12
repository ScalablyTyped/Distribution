package typings.kurentoClient.anon

import typings.kurentoClient.kurentoClientStrings.MediaStateChanged
import typings.kurentoClient.mod.MediaState
import typings.kurentoClient.mod.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined kurento-client.kurento-client.Event<'MediaStateChanged', {  oldState :kurento-client.kurento-client.MediaState,   newState :kurento-client.kurento-client.MediaState}> */
trait EventMediaStateChangedold extends StObject {
  
  var newState: MediaState
  
  var oldState: MediaState
  
  var source: String
  
  var tags: js.Array[Tag]
  
  var timestamp: String
  
  var timestampMillis: String
  
  var `type`: MediaStateChanged
}
object EventMediaStateChangedold {
  
  inline def apply(
    newState: MediaState,
    oldState: MediaState,
    source: String,
    tags: js.Array[Tag],
    timestamp: String,
    timestampMillis: String
  ): EventMediaStateChangedold = {
    val __obj = js.Dynamic.literal(newState = newState.asInstanceOf[js.Any], oldState = oldState.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], timestampMillis = timestampMillis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MediaStateChanged")
    __obj.asInstanceOf[EventMediaStateChangedold]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventMediaStateChangedold] (val x: Self) extends AnyVal {
    
    inline def setNewState(value: MediaState): Self = StObject.set(x, "newState", value.asInstanceOf[js.Any])
    
    inline def setOldState(value: MediaState): Self = StObject.set(x, "oldState", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampMillis(value: String): Self = StObject.set(x, "timestampMillis", value.asInstanceOf[js.Any])
    
    inline def setType(value: MediaStateChanged): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
