package typings.kafkajs.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminTopicReplicaAssignment extends js.Object {
  var partition: Double
  var replicas: js.Array[Double]
}

object AdminTopicReplicaAssignment {
  @scala.inline
  def apply(partition: Double, replicas: js.Array[Double]): AdminTopicReplicaAssignment = {
    val __obj = js.Dynamic.literal(partition = partition, replicas = replicas)
  
    __obj.asInstanceOf[AdminTopicReplicaAssignment]
  }
}

