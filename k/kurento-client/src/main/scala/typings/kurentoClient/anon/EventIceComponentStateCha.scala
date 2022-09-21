package typings.kurentoClient.anon

import typings.kurentoClient.kurentoClientStrings.IceComponentStateChange
import typings.kurentoClient.mod.IceComponentState
import typings.kurentoClient.mod.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined kurento-client.kurento-client.Event<'IceComponentStateChange', {  streamId :number,   componentId :number,   state :kurento-client.kurento-client.IceComponentState}> */
trait EventIceComponentStateCha extends StObject {
  
  var componentId: Double
  
  var source: String
  
  var state: IceComponentState
  
  var streamId: Double
  
  var tags: js.Array[Tag]
  
  var timestamp: String
  
  var timestampMillis: String
  
  var `type`: IceComponentStateChange
}
object EventIceComponentStateCha {
  
  inline def apply(
    componentId: Double,
    source: String,
    state: IceComponentState,
    streamId: Double,
    tags: js.Array[Tag],
    timestamp: String,
    timestampMillis: String
  ): EventIceComponentStateCha = {
    val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], timestampMillis = timestampMillis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IceComponentStateChange")
    __obj.asInstanceOf[EventIceComponentStateCha]
  }
  
  extension [Self <: EventIceComponentStateCha](x: Self) {
    
    inline def setComponentId(value: Double): Self = StObject.set(x, "componentId", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setState(value: IceComponentState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStreamId(value: Double): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampMillis(value: String): Self = StObject.set(x, "timestampMillis", value.asInstanceOf[js.Any])
    
    inline def setType(value: IceComponentStateChange): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
