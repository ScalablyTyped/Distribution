package typings.kafkaNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsr extends js.Object {
  var isr: js.Array[Double]
  var leader: Double
  var partition: Double
  var replicas: js.Array[Double]
  var topic: String
}

object AnonIsr {
  @scala.inline
  def apply(
    isr: js.Array[Double],
    leader: Double,
    partition: Double,
    replicas: js.Array[Double],
    topic: String
  ): AnonIsr = {
    val __obj = js.Dynamic.literal(isr = isr.asInstanceOf[js.Any], leader = leader.asInstanceOf[js.Any], partition = partition.asInstanceOf[js.Any], replicas = replicas.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsr]
  }
}

