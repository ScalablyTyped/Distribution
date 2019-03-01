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
    abort: js.Function0[js.Promise[scala.Unit]],
    commit: js.Function0[js.Promise[scala.Unit]],
    send: js.Function1[MessagePayload, js.Promise[scala.Unit]],
    sendBatch: js.Function1[MessageBatchPayload, js.Promise[scala.Unit]],
    sendOffsets: js.Function1[TransactionSendOffsets, js.Promise[scala.Unit]]
  ): Transaction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abort")(abort)
    __obj.updateDynamic("commit")(commit)
    __obj.updateDynamic("send")(send)
    __obj.updateDynamic("sendBatch")(sendBatch)
    __obj.updateDynamic("sendOffsets")(sendOffsets)
    __obj.asInstanceOf[Transaction]
  }
}

