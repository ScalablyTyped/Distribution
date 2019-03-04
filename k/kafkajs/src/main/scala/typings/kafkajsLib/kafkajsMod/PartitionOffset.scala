package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartitionOffset extends js.Object {
  var offset: java.lang.String
  var partition: java.lang.String
}

object PartitionOffset {
  @scala.inline
  def apply(offset: java.lang.String, partition: java.lang.String): PartitionOffset = {
    val __obj = js.Dynamic.literal(offset = offset, partition = partition)
  
    __obj.asInstanceOf[PartitionOffset]
  }
}

