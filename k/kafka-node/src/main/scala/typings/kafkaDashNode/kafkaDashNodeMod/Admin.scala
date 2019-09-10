package typings.kafkaDashNode.kafkaDashNodeMod

import typings.kafkaDashNode.Anon_IncludeSynonyms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kafka-node", "Admin")
@js.native
class Admin protected () extends js.Object {
  def this(kafkaClient: KafkaClient) = this()
  def createTopics(topics: js.Array[TopicConfigData], cb: js.Function2[/* error */ js.Any, /* data */ js.Any, _]): Unit = js.native
  def describeConfigs(payload: Anon_IncludeSynonyms, cb: js.Function2[/* error */ js.Any, /* data */ js.Any, _]): Unit = js.native
  def describeGroups(consumerGroups: js.Any, cb: js.Function2[/* error */ js.Any, /* data */ js.Any, _]): Unit = js.native
  def listGroups(cb: js.Function2[/* error */ js.Any, /* data */ js.Any, _]): Unit = js.native
  def listTopics(cb: js.Function2[/* error */ js.Any, /* data */ js.Any, _]): Unit = js.native
}

