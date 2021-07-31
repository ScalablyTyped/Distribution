package typings.kurentoClient.anon

import typings.kurentoClient.kurentoClientStrings.NewCandidatePairSelected
import typings.kurentoClient.mod.IceCandidatePair
import typings.kurentoClient.mod.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined kurento-client.kurento-client.Event<'NewCandidatePairSelected', {  candidatePair :kurento-client.kurento-client.IceCandidatePair}> */
trait EventNewCandidatePairSele extends StObject {
  
  var candidatePair: IceCandidatePair
  
  var source: String
  
  var tags: js.Array[Tag]
  
  var timestamp: String
  
  var timestampMillis: String
  
  var `type`: NewCandidatePairSelected
}
object EventNewCandidatePairSele {
  
  @scala.inline
  def apply(
    candidatePair: IceCandidatePair,
    source: String,
    tags: js.Array[Tag],
    timestamp: String,
    timestampMillis: String
  ): EventNewCandidatePairSele = {
    val __obj = js.Dynamic.literal(candidatePair = candidatePair.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], timestampMillis = timestampMillis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NewCandidatePairSelected")
    __obj.asInstanceOf[EventNewCandidatePairSele]
  }
  
  @scala.inline
  implicit class EventNewCandidatePairSeleMutableBuilder[Self <: EventNewCandidatePairSele] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCandidatePair(value: IceCandidatePair): Self = StObject.set(x, "candidatePair", value.asInstanceOf[js.Any])
    
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
    def setType(value: NewCandidatePairSelected): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
