package typings
package kafkajsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MessagePartition extends js.Object {
  var message: kafkajsLib.kafkajsMod.KafkaMessage
  var partition: scala.Double
  var topic: java.lang.String
}

object Anon_MessagePartition {
  @scala.inline
  def apply(message: kafkajsLib.kafkajsMod.KafkaMessage, partition: scala.Double, topic: java.lang.String): Anon_MessagePartition = {
    val __obj = js.Dynamic.literal(message = message, partition = partition, topic = topic)
  
    __obj.asInstanceOf[Anon_MessagePartition]
  }
}

