package typings.hlsDotJs.hlsDotJsMod

import typings.hlsDotJs.Anon_Audio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait bufferAppendedData extends js.Object {
  var pending: Double
  var timeRanges: Anon_Audio
}

object bufferAppendedData {
  @scala.inline
  def apply(pending: Double, timeRanges: Anon_Audio): bufferAppendedData = {
    val __obj = js.Dynamic.literal(pending = pending, timeRanges = timeRanges)
  
    __obj.asInstanceOf[bufferAppendedData]
  }
}

