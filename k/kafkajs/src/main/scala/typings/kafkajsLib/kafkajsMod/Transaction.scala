package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transaction extends js.Object {
  def abort(): js.Promise[scala.Unit]
  def commit(): js.Promise[scala.Unit]
  def send(payload: MessagePayload): js.Promise[scala.Unit]
  def sendBatch(payload: MessageBatchPayload): js.Promise[scala.Unit]
  def sendOffsets(offsets: TransactionSendOffsets): js.Promise[scala.Unit]
}

object Transaction {
  @scala.inline
  def apply(
    abort: () => js.Promise[scala.Unit],
    commit: () => js.Promise[scala.Unit],
    send: MessagePayload => js.Promise[scala.Unit],
    sendBatch: MessageBatchPayload => js.Promise[scala.Unit],
    sendOffsets: TransactionSendOffsets => js.Promise[scala.Unit]
  ): Transaction = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), commit = js.Any.fromFunction0(commit), send = js.Any.fromFunction1(send), sendBatch = js.Any.fromFunction1(sendBatch), sendOffsets = js.Any.fromFunction1(sendOffsets))
  
    __obj.asInstanceOf[Transaction]
  }
}

