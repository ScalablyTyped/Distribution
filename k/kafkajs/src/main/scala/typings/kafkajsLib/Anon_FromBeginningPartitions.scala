package typings
package kafkajsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FromBeginningPartitions extends js.Object {
  var fromBeginning: scala.Boolean
  var partitions: js.Array[Anon_Partition]
  var topic: java.lang.String
}

object Anon_FromBeginningPartitions {
  @scala.inline
  def apply(fromBeginning: scala.Boolean, partitions: js.Array[Anon_Partition], topic: java.lang.String): Anon_FromBeginningPartitions = {
    val __obj = js.Dynamic.literal(fromBeginning = fromBeginning, partitions = partitions, topic = topic)
  
    __obj.asInstanceOf[Anon_FromBeginningPartitions]
  }
}

