package typings
package hlsDotJsLib.hlsDotJsMod.HlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait bufferFlushedData extends js.Object {
  var endOffset: scala.Double
  var startOffset: scala.Double
}

object bufferFlushedData {
  @scala.inline
  def apply(endOffset: scala.Double, startOffset: scala.Double): bufferFlushedData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endOffset")(endOffset)
    __obj.updateDynamic("startOffset")(startOffset)
    __obj.asInstanceOf[bufferFlushedData]
  }
}

