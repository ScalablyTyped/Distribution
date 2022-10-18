package typings.kafkajs.anon

import typings.kafkajs.mod.PartitionReassignment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeoutTopics extends StObject {
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var topics: js.Array[PartitionReassignment]
}
object TimeoutTopics {
  
  inline def apply(topics: js.Array[PartitionReassignment]): TimeoutTopics = {
    val __obj = js.Dynamic.literal(topics = topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeoutTopics]
  }
  
  extension [Self <: TimeoutTopics](x: Self) {
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTopics(value: js.Array[PartitionReassignment]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    inline def setTopicsVarargs(value: PartitionReassignment*): Self = StObject.set(x, "topics", js.Array(value*))
  }
}
