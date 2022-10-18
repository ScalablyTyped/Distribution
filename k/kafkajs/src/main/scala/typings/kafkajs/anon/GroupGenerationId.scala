package typings.kafkajs.anon

import typings.kafkajs.mod.TopicOffsets
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupGenerationId extends StObject {
  
  var groupGenerationId: Double
  
  var groupId: String
  
  var memberId: String
  
  var retentionTime: js.UndefOr[Double] = js.undefined
  
  var topics: js.Array[TopicOffsets]
}
object GroupGenerationId {
  
  inline def apply(groupGenerationId: Double, groupId: String, memberId: String, topics: js.Array[TopicOffsets]): GroupGenerationId = {
    val __obj = js.Dynamic.literal(groupGenerationId = groupGenerationId.asInstanceOf[js.Any], groupId = groupId.asInstanceOf[js.Any], memberId = memberId.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupGenerationId]
  }
  
  extension [Self <: GroupGenerationId](x: Self) {
    
    inline def setGroupGenerationId(value: Double): Self = StObject.set(x, "groupGenerationId", value.asInstanceOf[js.Any])
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setMemberId(value: String): Self = StObject.set(x, "memberId", value.asInstanceOf[js.Any])
    
    inline def setRetentionTime(value: Double): Self = StObject.set(x, "retentionTime", value.asInstanceOf[js.Any])
    
    inline def setRetentionTimeUndefined: Self = StObject.set(x, "retentionTime", js.undefined)
    
    inline def setTopics(value: js.Array[TopicOffsets]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    inline def setTopicsVarargs(value: TopicOffsets*): Self = StObject.set(x, "topics", js.Array(value*))
  }
}
