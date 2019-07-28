package typings.kafkajs.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminSetOffsetsSeekEntry extends js.Object {
  var offset: String
  var partition: Double
}

object AdminSetOffsetsSeekEntry {
  @scala.inline
  def apply(offset: String, partition: Double): AdminSetOffsetsSeekEntry = {
    val __obj = js.Dynamic.literal(offset = offset, partition = partition)
  
    __obj.asInstanceOf[AdminSetOffsetsSeekEntry]
  }
}

