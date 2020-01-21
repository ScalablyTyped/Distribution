package typings.kafkaNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPartition extends js.Object {
  var partition: Double
  var replicas: js.Array[Double]
}

object AnonPartition {
  @scala.inline
  def apply(partition: Double, replicas: js.Array[Double]): AnonPartition = {
    val __obj = js.Dynamic.literal(partition = partition.asInstanceOf[js.Any], replicas = replicas.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPartition]
  }
}

