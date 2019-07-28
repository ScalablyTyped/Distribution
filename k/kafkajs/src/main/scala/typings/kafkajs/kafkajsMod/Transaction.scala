package typings.kafkajs.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transaction extends js.Object {
  def abort(): js.Promise[Unit]
  def commit(): js.Promise[Unit]
  def send(payload: MessagePayload): js.Promise[Unit]
  def sendBatch(payload: MessageBatchPayload): js.Promise[Unit]
  def sendOffsets(offsets: TransactionSendOffsets): js.Promise[Unit]
}

object Transaction {
  @scala.inline
  def apply(
    abort: () => js.Promise[Unit],
    commit: () => js.Promise[Unit],
    send: MessagePayload => js.Promise[Unit],
    sendBatch: MessageBatchPayload => js.Promise[Unit],
    sendOffsets: TransactionSendOffsets => js.Promise[Unit]
  ): Transaction = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), commit = js.Any.fromFunction0(commit), send = js.Any.fromFunction1(send), sendBatch = js.Any.fromFunction1(sendBatch), sendOffsets = js.Any.fromFunction1(sendOffsets))
  
    __obj.asInstanceOf[Transaction]
  }
}

