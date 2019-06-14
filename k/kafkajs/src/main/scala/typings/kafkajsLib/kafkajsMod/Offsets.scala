package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Offsets extends js.Object {
  var topics: js.Array[TopicOffsets]
}

object Offsets {
  @scala.inline
  def apply(topics: js.Array[TopicOffsets]): Offsets = {
    val __obj = js.Dynamic.literal(topics = topics)
  
    __obj.asInstanceOf[Offsets]
  }
}

