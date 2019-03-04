package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminTopicOffset extends js.Object {
  var offset: java.lang.String
  var partition: scala.Double
}

object AdminTopicOffset {
  @scala.inline
  def apply(offset: java.lang.String, partition: scala.Double): AdminTopicOffset = {
    val __obj = js.Dynamic.literal(offset = offset, partition = partition)
  
    __obj.asInstanceOf[AdminTopicOffset]
  }
}

