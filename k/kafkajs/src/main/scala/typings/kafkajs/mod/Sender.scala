package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sender extends StObject {
  
  def send(record: ProducerRecord): js.Promise[js.Array[RecordMetadata]]
  
  def sendBatch(batch: ProducerBatch): js.Promise[js.Array[RecordMetadata]]
}
object Sender {
  
  inline def apply(
    send: ProducerRecord => js.Promise[js.Array[RecordMetadata]],
    sendBatch: ProducerBatch => js.Promise[js.Array[RecordMetadata]]
  ): Sender = {
    val __obj = js.Dynamic.literal(send = js.Any.fromFunction1(send), sendBatch = js.Any.fromFunction1(sendBatch))
    __obj.asInstanceOf[Sender]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Sender] (val x: Self) extends AnyVal {
    
    inline def setSend(value: ProducerRecord => js.Promise[js.Array[RecordMetadata]]): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
    
    inline def setSendBatch(value: ProducerBatch => js.Promise[js.Array[RecordMetadata]]): Self = StObject.set(x, "sendBatch", js.Any.fromFunction1(value))
  }
}
