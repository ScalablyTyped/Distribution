package typings.kurentoClient.anon

import typings.kurentoClient.kurentoClientStrings.ElementConnected
import typings.kurentoClient.mod.MediaType
import typings.kurentoClient.mod.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined kurento-client.kurento-client.Event<'ElementConnected', {  sink :kurento-client.kurento-client.MediaElement,   mediaType :kurento-client.kurento-client.MediaType,   sourceMediaDescription :string,   sinkMediaDescription :string}> */
@js.native
trait EventElementConnectedsink extends js.Object {
  
  var mediaType: MediaType = js.native
  
  var sink: this.type = js.native
  
  var sinkMediaDescription: String = js.native
  
  var source: String = js.native
  
  var sourceMediaDescription: String = js.native
  
  var tags: js.Array[Tag] = js.native
  
  var timestamp: String = js.native
  
  var timestampMillis: String = js.native
  
  var `type`: ElementConnected = js.native
}
object EventElementConnectedsink {
  
  @scala.inline
  def apply(
    mediaType: MediaType,
    sink: EventElementConnectedsink,
    sinkMediaDescription: String,
    source: String,
    sourceMediaDescription: String,
    tags: js.Array[Tag],
    timestamp: String,
    timestampMillis: String,
    `type`: ElementConnected
  ): EventElementConnectedsink = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], sink = sink.asInstanceOf[js.Any], sinkMediaDescription = sinkMediaDescription.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceMediaDescription = sourceMediaDescription.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], timestampMillis = timestampMillis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventElementConnectedsink]
  }
  
  @scala.inline
  implicit class EventElementConnectedsinkOps[Self <: EventElementConnectedsink] (val x: Self) extends AnyVal {
    
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
    def setMediaType(value: MediaType): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSink(value: EventElementConnectedsink): Self = this.set("sink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSinkMediaDescription(value: String): Self = this.set("sinkMediaDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceMediaDescription(value: String): Self = this.set("sourceMediaDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[Tag]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampMillis(value: String): Self = this.set("timestampMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ElementConnected): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
