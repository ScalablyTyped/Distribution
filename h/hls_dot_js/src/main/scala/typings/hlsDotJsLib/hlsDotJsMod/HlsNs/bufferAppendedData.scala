package typings
package hlsDotJsLib.hlsDotJsMod.HlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait bufferAppendedData extends js.Object {
  var pending: scala.Double
  var timeRanges: hlsDotJsLib.Anon_Audio
}

object bufferAppendedData {
  @scala.inline
  def apply(pending: scala.Double, timeRanges: hlsDotJsLib.Anon_Audio): bufferAppendedData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pending")(pending)
    __obj.updateDynamic("timeRanges")(timeRanges)
    __obj.asInstanceOf[bufferAppendedData]
  }
}

