package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeekEntry extends js.Object {
  var offset: java.lang.String
  var partition: scala.Double
}

object SeekEntry {
  @scala.inline
  def apply(offset: java.lang.String, partition: scala.Double): SeekEntry = {
    val __obj = js.Dynamic.literal(offset = offset, partition = partition)
  
    __obj.asInstanceOf[SeekEntry]
  }
}

