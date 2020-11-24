package typings.kurentoClient.anon

import typings.kurentoClient.kurentoClientStrings.MediaTranscodingStateChange
import typings.kurentoClient.mod.MediaTranscodingState
import typings.kurentoClient.mod.MediaType
import typings.kurentoClient.mod.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined kurento-client.kurento-client.Event<'MediaTranscodingStateChange', {  state :kurento-client.kurento-client.MediaTranscodingState,   binName :string,   mediaType :kurento-client.kurento-client.MediaType}> */
@js.native
trait EventMediaTranscodingStat extends js.Object {
  
  var binName: String = js.native
  
  var mediaType: MediaType = js.native
  
  var source: String = js.native
  
  var state: MediaTranscodingState = js.native
  
  var tags: js.Array[Tag] = js.native
  
  var timestamp: String = js.native
  
  var timestampMillis: String = js.native
  
  var `type`: MediaTranscodingStateChange = js.native
}
object EventMediaTranscodingStat {
  
  @scala.inline
  def apply(
    binName: String,
    mediaType: MediaType,
    source: String,
    state: MediaTranscodingState,
    tags: js.Array[Tag],
    timestamp: String,
    timestampMillis: String,
    `type`: MediaTranscodingStateChange
  ): EventMediaTranscodingStat = {
    val __obj = js.Dynamic.literal(binName = binName.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], timestampMillis = timestampMillis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMediaTranscodingStat]
  }
  
  @scala.inline
  implicit class EventMediaTranscodingStatOps[Self <: EventMediaTranscodingStat] (val x: Self) extends AnyVal {
    
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
    def setBinName(value: String): Self = this.set("binName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaType(value: MediaType): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: MediaTranscodingState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[Tag]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampMillis(value: String): Self = this.set("timestampMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MediaTranscodingStateChange): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
