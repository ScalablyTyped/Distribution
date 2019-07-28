package typings.kafkaDashNode.kafkaDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kafka-node", "KafkaClient")
@js.native
class KafkaClient () extends Client {
  def this(options: KafkaClientOptions) = this()
  def connect(): Unit = js.native
  def describeGroups(consumerGroups: js.Any, cb: js.Function2[/* error */ js.Any, /* data */ js.Any, _]): Unit = js.native
  def getListGroups(cb: js.Function2[/* error */ js.Any, /* data */ js.Any, _]): Unit = js.native
}

