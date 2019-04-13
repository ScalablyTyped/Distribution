package typings
package hlsDotJsLib.hlsDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// interface bufferEosData {}
trait bufferFlushingData extends js.Object {
  var endOffset: scala.Double
  var startOffset: scala.Double
}

object bufferFlushingData {
  @scala.inline
  def apply(endOffset: scala.Double, startOffset: scala.Double): bufferFlushingData = {
    val __obj = js.Dynamic.literal(endOffset = endOffset, startOffset = startOffset)
  
    __obj.asInstanceOf[bufferFlushingData]
  }
}

