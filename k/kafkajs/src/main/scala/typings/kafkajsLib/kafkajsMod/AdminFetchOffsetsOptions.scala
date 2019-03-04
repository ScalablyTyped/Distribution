package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminFetchOffsetsOptions extends js.Object {
  var groupId: java.lang.String
  var topic: java.lang.String
}

object AdminFetchOffsetsOptions {
  @scala.inline
  def apply(groupId: java.lang.String, topic: java.lang.String): AdminFetchOffsetsOptions = {
    val __obj = js.Dynamic.literal(groupId = groupId, topic = topic)
  
    __obj.asInstanceOf[AdminFetchOffsetsOptions]
  }
}

