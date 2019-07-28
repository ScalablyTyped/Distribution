package typings.hlsDotJs.hlsDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait bufferFlushedData extends js.Object {
  var endOffset: Double
  var startOffset: Double
}

object bufferFlushedData {
  @scala.inline
  def apply(endOffset: Double, startOffset: Double): bufferFlushedData = {
    val __obj = js.Dynamic.literal(endOffset = endOffset, startOffset = startOffset)
  
    __obj.asInstanceOf[bufferFlushedData]
  }
}

