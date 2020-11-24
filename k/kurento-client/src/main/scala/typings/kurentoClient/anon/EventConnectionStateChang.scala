package typings.kurentoClient.anon

import typings.kurentoClient.kurentoClientStrings.ConnectionStateChanged
import typings.kurentoClient.mod.ConnectionState
import typings.kurentoClient.mod.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined kurento-client.kurento-client.Event<'ConnectionStateChanged', {  oldState :kurento-client.kurento-client.ConnectionState,   newState :kurento-client.kurento-client.ConnectionState}> */
@js.native
trait EventConnectionStateChang extends js.Object {
  
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
  implicit class EventConnectionStateChangOps[Self <: EventConnectionStateChang] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNewState(value: ConnectionState): Self = this.set("newState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldState(value: ConnectionState): Self = this.set("oldState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[Tag]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampMillis(value: String): Self = this.set("timestampMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ConnectionStateChanged): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
