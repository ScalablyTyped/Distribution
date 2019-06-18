package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminSetOffsetsSeekEntry extends js.Object {
  var offset: java.lang.String
  var partition: scala.Double
}

object AdminSetOffsetsSeekEntry {
  @scala.inline
  def apply(offset: java.lang.String, partition: scala.Double): AdminSetOffsetsSeekEntry = {
    val __obj = js.Dynamic.literal(offset = offset, partition = partition)
  
    __obj.asInstanceOf[AdminSetOffsetsSeekEntry]
  }
}

