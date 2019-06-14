package typings
package kafkajsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OffsetPartitionTopic extends js.Object {
  var offset: java.lang.String
  var partition: scala.Double
  var topic: java.lang.String
}

object Anon_OffsetPartitionTopic {
  @scala.inline
  def apply(offset: java.lang.String, partition: scala.Double, topic: java.lang.String): Anon_OffsetPartitionTopic = {
    val __obj = js.Dynamic.literal(offset = offset, partition = partition, topic = topic)
  
    __obj.asInstanceOf[Anon_OffsetPartitionTopic]
  }
}

