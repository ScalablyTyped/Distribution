package typings.kafkajs.anon

import typings.kafkajs.mod.TopicOffsets
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupIdTopics extends StObject {
  
  var groupId: String
  
  var topics: js.Array[TopicOffsets]
}
object GroupIdTopics {
  
  inline def apply(groupId: String, topics: js.Array[TopicOffsets]): GroupIdTopics = {
    val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupIdTopics]
  }
  
  extension [Self <: GroupIdTopics](x: Self) {
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setTopics(value: js.Array[TopicOffsets]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    inline def setTopicsVarargs(value: TopicOffsets*): Self = StObject.set(x, "topics", js.Array(value*))
  }
}
