package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPartitionReassignmentsResponse extends StObject {
  
  var topics: js.Array[OngoingTopicReassignment]
}
object ListPartitionReassignmentsResponse {
  
  inline def apply(topics: js.Array[OngoingTopicReassignment]): ListPartitionReassignmentsResponse = {
    val __obj = js.Dynamic.literal(topics = topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPartitionReassignmentsResponse]
  }
  
  extension [Self <: ListPartitionReassignmentsResponse](x: Self) {
    
    inline def setTopics(value: js.Array[OngoingTopicReassignment]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    inline def setTopicsVarargs(value: OngoingTopicReassignment*): Self = StObject.set(x, "topics", js.Array(value*))
  }
}
