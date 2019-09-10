package typings.kafkaDashNode.kafkaDashNodeMod

import typings.kafkaDashNode.Anon_Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicConfigData extends js.Object {
  var configEntry: js.UndefOr[js.Array[Anon_Name]] = js.undefined
  var partitions: js.UndefOr[Double] = js.undefined
  var replicationFactor: js.UndefOr[Double] = js.undefined
  var topic: String
}

object TopicConfigData {
  @scala.inline
  def apply(
    topic: String,
    configEntry: js.Array[Anon_Name] = null,
    partitions: Int | Double = null,
    replicationFactor: Int | Double = null
  ): TopicConfigData = {
    val __obj = js.Dynamic.literal(topic = topic)
    if (configEntry != null) __obj.updateDynamic("configEntry")(configEntry)
    if (partitions != null) __obj.updateDynamic("partitions")(partitions.asInstanceOf[js.Any])
    if (replicationFactor != null) __obj.updateDynamic("replicationFactor")(replicationFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicConfigData]
  }
}

