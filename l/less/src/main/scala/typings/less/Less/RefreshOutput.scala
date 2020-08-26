package typings.less.Less

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefreshOutput extends js.Object {
  var endTime: Date = js.native
  var sheets: Double = js.native
  var startTime: Date = js.native
  var totalMilliseconds: Double = js.native
}

object RefreshOutput {
  @scala.inline
  def apply(endTime: Date, sheets: Double, startTime: Date, totalMilliseconds: Double): RefreshOutput = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], sheets = sheets.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], totalMilliseconds = totalMilliseconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshOutput]
  }
  @scala.inline
  implicit class RefreshOutputOps[Self <: RefreshOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEndTime(value: Date): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setSheets(value: Double): Self = this.set("sheets", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartTime(value: Date): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalMilliseconds(value: Double): Self = this.set("totalMilliseconds", value.asInstanceOf[js.Any])
  }
  
}

