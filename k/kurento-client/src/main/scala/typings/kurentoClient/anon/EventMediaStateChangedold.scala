package typings.kurentoClient.anon

import typings.kurentoClient.kurentoClientStrings.MediaStateChanged
import typings.kurentoClient.mod.MediaState
import typings.kurentoClient.mod.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined kurento-client.kurento-client.Event<'MediaStateChanged', {  oldState :kurento-client.kurento-client.MediaState,   newState :kurento-client.kurento-client.MediaState}> */
@js.native
trait EventMediaStateChangedold extends StObject {
  
  var newState: MediaState = js.native
  
  var oldState: MediaState = js.native
  
  var source: String = js.native
  
  var tags: js.Array[Tag] = js.native
  
  var timestamp: String = js.native
  
  var timestampMillis: String = js.native
  
  var `type`: MediaStateChanged = js.native
}
object EventMediaStateChangedold {
  
  @scala.inline
  def apply(
    newState: MediaState,
    oldState: MediaState,
    source: String,
    tags: js.Array[Tag],
    timestamp: String,
    timestampMillis: String,
    `type`: MediaStateChanged
  ): EventMediaStateChangedold = {
    val __obj = js.Dynamic.literal(newState = newState.asInstanceOf[js.Any], oldState = oldState.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], timestampMillis = timestampMillis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMediaStateChangedold]
  }
  
  @scala.inline
  implicit class EventMediaStateChangedoldMutableBuilder[Self <: EventMediaStateChangedold] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewState(value: MediaState): Self = StObject.set(x, "newState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldState(value: MediaState): Self = StObject.set(x, "oldState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampMillis(value: String): Self = StObject.set(x, "timestampMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MediaStateChanged): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
