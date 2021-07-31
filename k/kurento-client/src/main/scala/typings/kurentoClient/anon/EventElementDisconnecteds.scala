package typings.kurentoClient.anon

import typings.kurentoClient.kurentoClientStrings.ElementDisconnected
import typings.kurentoClient.mod.MediaType
import typings.kurentoClient.mod.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined kurento-client.kurento-client.Event<'ElementDisconnected', {  sink :kurento-client.kurento-client.MediaElement,   mediaType :kurento-client.kurento-client.MediaType,   sourceMediaDescription :string,   sinkMediaDescription :string}> */
trait EventElementDisconnecteds extends StObject {
  
  var mediaType: MediaType
  
  var sink: this.type
  
  var sinkMediaDescription: String
  
  var source: String
  
  var sourceMediaDescription: String
  
  var tags: js.Array[Tag]
  
  var timestamp: String
  
  var timestampMillis: String
  
  var `type`: ElementDisconnected
}
object EventElementDisconnecteds {
  
  @scala.inline
  def apply(
    mediaType: MediaType,
    sink: EventElementDisconnecteds,
    sinkMediaDescription: String,
    source: String,
    sourceMediaDescription: String,
    tags: js.Array[Tag],
    timestamp: String,
    timestampMillis: String
  ): EventElementDisconnecteds = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], sink = sink.asInstanceOf[js.Any], sinkMediaDescription = sinkMediaDescription.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceMediaDescription = sourceMediaDescription.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], timestampMillis = timestampMillis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ElementDisconnected")
    __obj.asInstanceOf[EventElementDisconnecteds]
  }
  
  @scala.inline
  implicit class EventElementDisconnectedsMutableBuilder[Self <: EventElementDisconnecteds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaType(value: MediaType): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSink(value: EventElementDisconnecteds): Self = StObject.set(x, "sink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSinkMediaDescription(value: String): Self = StObject.set(x, "sinkMediaDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceMediaDescription(value: String): Self = StObject.set(x, "sourceMediaDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampMillis(value: String): Self = StObject.set(x, "timestampMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ElementDisconnected): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
