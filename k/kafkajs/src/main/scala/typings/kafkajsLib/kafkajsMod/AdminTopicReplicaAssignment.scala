package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminTopicReplicaAssignment extends js.Object {
  var partition: scala.Double
  var replicas: js.Array[scala.Double]
}

object AdminTopicReplicaAssignment {
  @scala.inline
  def apply(partition: scala.Double, replicas: js.Array[scala.Double]): AdminTopicReplicaAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("partition")(partition)
    __obj.updateDynamic("replicas")(replicas)
    __obj.asInstanceOf[AdminTopicReplicaAssignment]
  }
}

