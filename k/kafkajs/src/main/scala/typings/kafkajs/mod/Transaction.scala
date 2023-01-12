package typings.kafkajs.mod

import typings.kafkajs.anon.OffsetsconsumerGroupIdstr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transaction
  extends StObject
     with Sender {
  
  def abort(): js.Promise[Unit]
  
  def commit(): js.Promise[Unit]
  
  def isActive(): Boolean
  
  def sendOffsets(offsets: OffsetsconsumerGroupIdstr): js.Promise[Unit]
}
object Transaction {
  
  inline def apply(
    abort: () => js.Promise[Unit],
    commit: () => js.Promise[Unit],
    isActive: () => Boolean,
    send: ProducerRecord => js.Promise[js.Array[RecordMetadata]],
    sendBatch: ProducerBatch => js.Promise[js.Array[RecordMetadata]],
    sendOffsets: OffsetsconsumerGroupIdstr => js.Promise[Unit]
  ): Transaction = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), commit = js.Any.fromFunction0(commit), isActive = js.Any.fromFunction0(isActive), send = js.Any.fromFunction1(send), sendBatch = js.Any.fromFunction1(sendBatch), sendOffsets = js.Any.fromFunction1(sendOffsets))
    __obj.asInstanceOf[Transaction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Transaction] (val x: Self) extends AnyVal {
    
    inline def setAbort(value: () => js.Promise[Unit]): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
    
    inline def setCommit(value: () => js.Promise[Unit]): Self = StObject.set(x, "commit", js.Any.fromFunction0(value))
    
    inline def setIsActive(value: () => Boolean): Self = StObject.set(x, "isActive", js.Any.fromFunction0(value))
    
    inline def setSendOffsets(value: OffsetsconsumerGroupIdstr => js.Promise[Unit]): Self = StObject.set(x, "sendOffsets", js.Any.fromFunction1(value))
  }
}
