package typings.kafkaNode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Partition extends js.Object {
  var partition: Double
  var replicas: js.Array[Double]
}

object Partition {
  @scala.inline
  def apply(partition: Double, replicas: js.Array[Double]): Partition = {
    val __obj = js.Dynamic.literal(partition = partition.asInstanceOf[js.Any], replicas = replicas.asInstanceOf[js.Any])
    __obj.asInstanceOf[Partition]
  }
}

