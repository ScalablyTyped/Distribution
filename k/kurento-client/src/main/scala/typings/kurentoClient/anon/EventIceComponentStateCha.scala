package typings.kurentoClient.anon

import typings.kurentoClient.kurentoClientStrings.IceComponentStateChange
import typings.kurentoClient.mod.IceComponentState
import typings.kurentoClient.mod.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined kurento-client.kurento-client.Event<'IceComponentStateChange', {  streamId :number,   componentId :number,   state :kurento-client.kurento-client.IceComponentState}> */
@js.native
trait EventIceComponentStateCha extends js.Object {
  
  var componentId: Double = js.native
  
  var source: String = js.native
  
  var state: IceComponentState = js.native
  
  var streamId: Double = js.native
  
  var tags: js.Array[Tag] = js.native
  
  var timestamp: String = js.native
  
  var timestampMillis: String = js.native
  
  var `type`: IceComponentStateChange = js.native
}
object EventIceComponentStateCha {
  
  @scala.inline
  def apply(
    componentId: Double,
    source: String,
    state: IceComponentState,
    streamId: Double,
    tags: js.Array[Tag],
    timestamp: String,
    timestampMillis: String,
    `type`: IceComponentStateChange
  ): EventIceComponentStateCha = {
    val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], timestampMillis = timestampMillis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventIceComponentStateCha]
  }
  
  @scala.inline
  implicit class EventIceComponentStateChaOps[Self <: EventIceComponentStateCha] (val x: Self) extends AnyVal {
    
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
    def setComponentId(value: Double): Self = this.set("componentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: IceComponentState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamId(value: Double): Self = this.set("streamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[Tag]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampMillis(value: String): Self = this.set("timestampMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: IceComponentStateChange): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
