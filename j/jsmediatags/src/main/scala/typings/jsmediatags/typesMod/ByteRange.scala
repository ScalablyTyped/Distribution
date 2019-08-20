package typings.jsmediatags.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ByteRange extends js.Object {
   // negative offset is relative to the end of the file.
  var length: Double
  var offset: Double
}

object ByteRange {
  @scala.inline
  def apply(length: Double, offset: Double): ByteRange = {
    val __obj = js.Dynamic.literal(length = length, offset = offset)
  
    __obj.asInstanceOf[ByteRange]
  }
}

