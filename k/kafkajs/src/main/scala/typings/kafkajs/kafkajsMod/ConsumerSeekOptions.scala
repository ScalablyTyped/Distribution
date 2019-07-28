package typings.kafkajs.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumerSeekOptions extends js.Object {
  var offset: Double
  var partition: Double
  var topic: String
}

object ConsumerSeekOptions {
  @scala.inline
  def apply(offset: Double, partition: Double, topic: String): ConsumerSeekOptions = {
    val __obj = js.Dynamic.literal(offset = offset, partition = partition, topic = topic)
  
    __obj.asInstanceOf[ConsumerSeekOptions]
  }
}

