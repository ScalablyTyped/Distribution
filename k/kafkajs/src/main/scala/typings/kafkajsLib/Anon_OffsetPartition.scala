package typings
package kafkajsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OffsetPartition extends js.Object {
  var offset: java.lang.String
  var partition: java.lang.String
}

object Anon_OffsetPartition {
  @scala.inline
  def apply(offset: java.lang.String, partition: java.lang.String): Anon_OffsetPartition = {
    val __obj = js.Dynamic.literal(offset = offset, partition = partition)
  
    __obj.asInstanceOf[Anon_OffsetPartition]
  }
}

