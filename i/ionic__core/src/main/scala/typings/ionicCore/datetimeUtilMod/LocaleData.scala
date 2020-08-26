package typings.ionicCore.datetimeUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocaleData extends js.Object {
  var dayNames: js.UndefOr[js.Array[String]] = js.native
  var dayShortNames: js.UndefOr[js.Array[String]] = js.native
  var monthNames: js.UndefOr[js.Array[String]] = js.native
  var monthShortNames: js.UndefOr[js.Array[String]] = js.native
}

object LocaleData {
  @scala.inline
  def apply(): LocaleData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocaleData]
  }
  @scala.inline
  implicit class LocaleDataOps[Self <: LocaleData] (val x: Self) extends AnyVal {
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
    def setDayNamesVarargs(value: String*): Self = this.set("dayNames", js.Array(value :_*))
    @scala.inline
    def setDayNames(value: js.Array[String]): Self = this.set("dayNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayNames: Self = this.set("dayNames", js.undefined)
    @scala.inline
    def setDayShortNamesVarargs(value: String*): Self = this.set("dayShortNames", js.Array(value :_*))
    @scala.inline
    def setDayShortNames(value: js.Array[String]): Self = this.set("dayShortNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayShortNames: Self = this.set("dayShortNames", js.undefined)
    @scala.inline
    def setMonthNamesVarargs(value: String*): Self = this.set("monthNames", js.Array(value :_*))
    @scala.inline
    def setMonthNames(value: js.Array[String]): Self = this.set("monthNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonthNames: Self = this.set("monthNames", js.undefined)
    @scala.inline
    def setMonthShortNamesVarargs(value: String*): Self = this.set("monthShortNames", js.Array(value :_*))
    @scala.inline
    def setMonthShortNames(value: js.Array[String]): Self = this.set("monthShortNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonthShortNames: Self = this.set("monthShortNames", js.undefined)
  }
  
}

