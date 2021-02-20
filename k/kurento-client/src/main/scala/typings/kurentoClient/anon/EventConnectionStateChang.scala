package typings.kurentoClient.anon

import typings.kurentoClient.kurentoClientStrings.ConnectionStateChanged
import typings.kurentoClient.mod.ConnectionState
import typings.kurentoClient.mod.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined kurento-client.kurento-client.Event<'ConnectionStateChanged', {  oldState :kurento-client.kurento-client.ConnectionState,   newState :kurento-client.kurento-client.ConnectionState}> */
@js.native
trait EventConnectionStateChang extends StObject {
  
  var newState: ConnectionState = js.native
  
  var oldState: ConnectionState = js.native
  
  var source: String = js.native
  
  var tags: js.Array[Tag] = js.native
  
  var timestamp: String = js.native
  
  var timestampMillis: String = js.native
  
  var `type`: ConnectionStateChanged = js.native
}
object EventConnectionStateChang {
  
  @scala.inline
  def apply(
    newState: ConnectionState,
    oldState: ConnectionState,
    source: String,
    tags: js.Array[Tag],
    timestamp: String,
    timestampMillis: String,
    `type`: ConnectionStateChanged
  ): EventConnectionStateChang = {
    val __obj = js.Dynamic.literal(newState = newState.asInstanceOf[js.Any], oldState = oldState.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], timestampMillis = timestampMillis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventConnectionStateChang]
  }
  
  @scala.inline
  implicit class EventConnectionStateChangMutableBuilder[Self <: EventConnectionStateChang] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewState(value: ConnectionState): Self = StObject.set(x, "newState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldState(value: ConnectionState): Self = StObject.set(x, "oldState", value.asInstanceOf[js.Any])
    
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
    def setType(value: ConnectionStateChanged): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
