package typings.kurentoClient.anon

import typings.kurentoClient.kurentoClientStrings.ElementConnected
import typings.kurentoClient.mod.MediaElement
import typings.kurentoClient.mod.MediaType
import typings.kurentoClient.mod.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined kurento-client.kurento-client.Event<'ElementConnected', {  sink :kurento-client.kurento-client.MediaElement,   mediaType :kurento-client.kurento-client.MediaType,   sourceMediaDescription :string,   sinkMediaDescription :string}> */
trait EventElementConnectedsinkMediaType extends StObject {
  
  var mediaType: MediaType
  
  var sink: MediaElement
  
  var sinkMediaDescription: String
  
  var source: String
  
  var sourceMediaDescription: String
  
  var tags: js.Array[Tag]
  
  var timestamp: String
  
  var timestampMillis: String
  
  var `type`: ElementConnected
}
object EventElementConnectedsinkMediaType {
  
  inline def apply(
    mediaType: MediaType,
    sink: MediaElement,
    sinkMediaDescription: String,
    source: String,
    sourceMediaDescription: String,
    tags: js.Array[Tag],
    timestamp: String,
    timestampMillis: String
  ): EventElementConnectedsinkMediaType = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], sink = sink.asInstanceOf[js.Any], sinkMediaDescription = sinkMediaDescription.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceMediaDescription = sourceMediaDescription.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], timestampMillis = timestampMillis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ElementConnected")
    __obj.asInstanceOf[EventElementConnectedsinkMediaType]
  }
  
  extension [Self <: EventElementConnectedsinkMediaType](x: Self) {
    
    inline def setMediaType(value: MediaType): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setSink(value: MediaElement): Self = StObject.set(x, "sink", value.asInstanceOf[js.Any])
    
    inline def setSinkMediaDescription(value: String): Self = StObject.set(x, "sinkMediaDescription", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceMediaDescription(value: String): Self = StObject.set(x, "sourceMediaDescription", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampMillis(value: String): Self = StObject.set(x, "timestampMillis", value.asInstanceOf[js.Any])
    
    inline def setType(value: ElementConnected): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
