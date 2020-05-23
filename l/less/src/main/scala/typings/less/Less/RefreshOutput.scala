package typings.less.Less

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshOutput extends js.Object {
  var endTime: Date
  var sheets: Double
  var startTime: Date
  var totalMilliseconds: Double
}

object RefreshOutput {
  @scala.inline
  def apply(endTime: Date, sheets: Double, startTime: Date, totalMilliseconds: Double): RefreshOutput = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], sheets = sheets.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], totalMilliseconds = totalMilliseconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshOutput]
  }
}

