package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumerSeekOptions extends js.Object {
  var offset: scala.Double
  var partition: scala.Double
  var topic: java.lang.String
}

object ConsumerSeekOptions {
  @scala.inline
  def apply(offset: scala.Double, partition: scala.Double, topic: java.lang.String): ConsumerSeekOptions = {
    val __obj = js.Dynamic.literal(offset = offset, partition = partition, topic = topic)
  
    __obj.asInstanceOf[ConsumerSeekOptions]
  }
}

