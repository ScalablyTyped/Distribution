package typings.kafkaDashNode.kafkaDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kafka-node", "Admin")
@js.native
class Admin protected () extends js.Object {
  def this(kafkaClient: KafkaClient) = this()
  def describeGroups(consumerGroups: js.Any, cb: js.Function2[/* error */ js.Any, /* data */ js.Any, _]): Unit = js.native
  def listGroups(cb: js.Function2[/* error */ js.Any, /* data */ js.Any, _]): Unit = js.native
}

