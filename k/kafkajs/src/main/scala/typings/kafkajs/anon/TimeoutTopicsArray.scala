package typings.kafkajs.anon

import typings.kafkajs.mod.PartitionReassignment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeoutTopicsArray extends StObject {
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var topics: js.Array[PartitionReassignment]
}
object TimeoutTopicsArray {
  
  inline def apply(topics: js.Array[PartitionReassignment]): TimeoutTopicsArray = {
    val __obj = js.Dynamic.literal(topics = topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeoutTopicsArray]
  }
  
  extension [Self <: TimeoutTopicsArray](x: Self) {
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTopics(value: js.Array[PartitionReassignment]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    inline def setTopicsVarargs(value: PartitionReassignment*): Self = StObject.set(x, "topics", js.Array(value*))
  }
}
