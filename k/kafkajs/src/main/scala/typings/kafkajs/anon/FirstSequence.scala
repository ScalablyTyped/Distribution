package typings.kafkajs.anon

import typings.kafkajs.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirstSequence extends StObject {
  
  var firstSequence: js.UndefOr[Double] = js.undefined
  
  var messages: js.Array[Message]
  
  var partition: Double
}
object FirstSequence {
  
  inline def apply(messages: js.Array[Message], partition: Double): FirstSequence = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], partition = partition.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstSequence]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FirstSequence] (val x: Self) extends AnyVal {
    
    inline def setFirstSequence(value: Double): Self = StObject.set(x, "firstSequence", value.asInstanceOf[js.Any])
    
    inline def setFirstSequenceUndefined: Self = StObject.set(x, "firstSequence", js.undefined)
    
    inline def setMessages(value: js.Array[Message]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesVarargs(value: Message*): Self = StObject.set(x, "messages", js.Array(value*))
    
    inline def setPartition(value: Double): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
  }
}
