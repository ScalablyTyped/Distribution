package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DaySize extends js.Object {
  var daySize: js.UndefOr[String] = js.native
  var fontSize: js.UndefOr[String] = js.native
  var lineHeight: js.UndefOr[Double] = js.native
  var slideDuration: js.UndefOr[String] = js.native
}

object DaySize {
  @scala.inline
  def apply(): DaySize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DaySize]
  }
  @scala.inline
  implicit class DaySizeOps[Self <: DaySize] (val x: Self) extends AnyVal {
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
    def setDaySize(value: String): Self = this.set("daySize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDaySize: Self = this.set("daySize", js.undefined)
    @scala.inline
    def setFontSize(value: String): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setLineHeight(value: Double): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineHeight: Self = this.set("lineHeight", js.undefined)
    @scala.inline
    def setSlideDuration(value: String): Self = this.set("slideDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlideDuration: Self = this.set("slideDuration", js.undefined)
  }
  
}

