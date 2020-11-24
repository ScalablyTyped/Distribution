package typings.kurentoClient.anon

import typings.kurentoClient.kurentoClientStrings.NewCandidatePairSelected
import typings.kurentoClient.mod.IceCandidatePair
import typings.kurentoClient.mod.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined kurento-client.kurento-client.Event<'NewCandidatePairSelected', {  candidatePair :kurento-client.kurento-client.IceCandidatePair}> */
@js.native
trait EventNewCandidatePairSele extends js.Object {
  
  var candidatePair: IceCandidatePair = js.native
  
  var source: String = js.native
  
  var tags: js.Array[Tag] = js.native
  
  var timestamp: String = js.native
  
  var timestampMillis: String = js.native
  
  var `type`: NewCandidatePairSelected = js.native
}
object EventNewCandidatePairSele {
  
  @scala.inline
  def apply(
    candidatePair: IceCandidatePair,
    source: String,
    tags: js.Array[Tag],
    timestamp: String,
    timestampMillis: String,
    `type`: NewCandidatePairSelected
  ): EventNewCandidatePairSele = {
    val __obj = js.Dynamic.literal(candidatePair = candidatePair.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], timestampMillis = timestampMillis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventNewCandidatePairSele]
  }
  
  @scala.inline
  implicit class EventNewCandidatePairSeleOps[Self <: EventNewCandidatePairSele] (val x: Self) extends AnyVal {
    
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
    def setCandidatePair(value: IceCandidatePair): Self = this.set("candidatePair", value.asInstanceOf[js.Any])
    
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
    def setType(value: NewCandidatePairSelected): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
