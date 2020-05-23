package typings.hlsJs.mod

import typings.hlsJs.anon.Audio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait bufferAppendedData extends js.Object {
  var pending: Double
  var timeRanges: Audio
}

object bufferAppendedData {
  @scala.inline
  def apply(pending: Double, timeRanges: Audio): bufferAppendedData = {
    val __obj = js.Dynamic.literal(pending = pending.asInstanceOf[js.Any], timeRanges = timeRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[bufferAppendedData]
  }
}

