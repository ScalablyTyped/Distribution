package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicPartitions extends js.Object {
  var partitions: js.Array[scala.Double]
  var topic: java.lang.String
}

object TopicPartitions {
  @scala.inline
  def apply(partitions: js.Array[scala.Double], topic: java.lang.String): TopicPartitions = {
    val __obj = js.Dynamic.literal(partitions = partitions, topic = topic)
  
    __obj.asInstanceOf[TopicPartitions]
  }
}

