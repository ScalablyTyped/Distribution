package typings
package kafkajsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Partitions extends js.Object {
  var partitions: js.Array[Anon_Offset]
  var topic: java.lang.String
}

object Anon_Partitions {
  @scala.inline
  def apply(partitions: js.Array[Anon_Offset], topic: java.lang.String): Anon_Partitions = {
    val __obj = js.Dynamic.literal(partitions = partitions, topic = topic)
  
    __obj.asInstanceOf[Anon_Partitions]
  }
}

