package typings.hlsDotJs.hlsDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// interface bufferEosData {}
trait bufferFlushingData extends js.Object {
  var endOffset: Double
  var startOffset: Double
}

object bufferFlushingData {
  @scala.inline
  def apply(endOffset: Double, startOffset: Double): bufferFlushingData = {
    val __obj = js.Dynamic.literal(endOffset = endOffset, startOffset = startOffset)
  
    __obj.asInstanceOf[bufferFlushingData]
  }
}

