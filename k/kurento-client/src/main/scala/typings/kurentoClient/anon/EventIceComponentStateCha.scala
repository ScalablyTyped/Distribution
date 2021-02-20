package typings.kurentoClient.anon

import typings.kurentoClient.kurentoClientStrings.IceComponentStateChange
import typings.kurentoClient.mod.IceComponentState
import typings.kurentoClient.mod.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined kurento-client.kurento-client.Event<'IceComponentStateChange', {  streamId :number,   componentId :number,   state :kurento-client.kurento-client.IceComponentState}> */
@js.native
trait EventIceComponentStateCha extends StObject {
  
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
  implicit class EventIceComponentStateChaMutableBuilder[Self <: EventIceComponentStateCha] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponentId(value: Double): Self = StObject.set(x, "componentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: IceComponentState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamId(value: Double): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampMillis(value: String): Self = StObject.set(x, "timestampMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: IceComponentStateChange): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
