package typings.kafkajs.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminTopicOffset extends js.Object {
  var offset: String
  var partition: Double
}

object AdminTopicOffset {
  @scala.inline
  def apply(offset: String, partition: Double): AdminTopicOffset = {
    val __obj = js.Dynamic.literal(offset = offset, partition = partition)
  
    __obj.asInstanceOf[AdminTopicOffset]
  }
}

