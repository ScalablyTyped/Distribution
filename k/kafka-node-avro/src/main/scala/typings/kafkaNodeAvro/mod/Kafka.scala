package typings.kafkaNodeAvro.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Kafka extends js.Object {
  /** Publishes message to Kafka */
  def send(options: SendOptions): js.Promise[js.Object]
}

object Kafka {
  @scala.inline
  def apply(send: SendOptions => js.Promise[js.Object]): Kafka = {
    val __obj = js.Dynamic.literal(send = js.Any.fromFunction1(send))
  
    __obj.asInstanceOf[Kafka]
  }
}

