package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Offsets extends StObject {
  
  var topics: js.Array[TopicOffsets]
}
object Offsets {
  
  inline def apply(topics: js.Array[TopicOffsets]): Offsets = {
    val __obj = js.Dynamic.literal(topics = topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offsets]
  }
  
  extension [Self <: Offsets](x: Self) {
    
    inline def setTopics(value: js.Array[TopicOffsets]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    inline def setTopicsVarargs(value: TopicOffsets*): Self = StObject.set(x, "topics", js.Array(value*))
  }
}
