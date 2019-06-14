package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sender extends js.Object {
  def send(record: ProducerRecord): js.Promise[js.Array[RecordMetadata]]
  def sendBatch(batch: ProducerBatch): js.Promise[js.Array[RecordMetadata]]
}

object Sender {
  @scala.inline
  def apply(
    send: ProducerRecord => js.Promise[js.Array[RecordMetadata]],
    sendBatch: ProducerBatch => js.Promise[js.Array[RecordMetadata]]
  ): Sender = {
    val __obj = js.Dynamic.literal(send = js.Any.fromFunction1(send), sendBatch = js.Any.fromFunction1(sendBatch))
  
    __obj.asInstanceOf[Sender]
  }
}

