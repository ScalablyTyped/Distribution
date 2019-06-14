package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITopicConfig extends js.Object {
  var configEntries: js.UndefOr[js.Array[js.Object]] = js.undefined
  var numPartitions: js.UndefOr[scala.Double] = js.undefined
  var replicaAssignment: js.UndefOr[js.Array[js.Object]] = js.undefined
  var replicationFactor: js.UndefOr[scala.Double] = js.undefined
  var topic: java.lang.String
}

object ITopicConfig {
  @scala.inline
  def apply(
    topic: java.lang.String,
    configEntries: js.Array[js.Object] = null,
    numPartitions: scala.Int | scala.Double = null,
    replicaAssignment: js.Array[js.Object] = null,
    replicationFactor: scala.Int | scala.Double = null
  ): ITopicConfig = {
    val __obj = js.Dynamic.literal(topic = topic)
    if (configEntries != null) __obj.updateDynamic("configEntries")(configEntries)
    if (numPartitions != null) __obj.updateDynamic("numPartitions")(numPartitions.asInstanceOf[js.Any])
    if (replicaAssignment != null) __obj.updateDynamic("replicaAssignment")(replicaAssignment)
    if (replicationFactor != null) __obj.updateDynamic("replicationFactor")(replicationFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITopicConfig]
  }
}

