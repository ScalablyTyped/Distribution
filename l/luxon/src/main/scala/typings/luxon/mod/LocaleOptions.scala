package typings.luxon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocaleOptions extends js.Object {
  var locale: js.UndefOr[String] = js.native
  var numberingSystem: js.UndefOr[NumberingSystem] = js.native
  var outputCalendar: js.UndefOr[CalendarSystem] = js.native
}

object LocaleOptions {
  @scala.inline
  def apply(): LocaleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocaleOptions]
  }
  @scala.inline
  implicit class LocaleOptionsOps[Self <: LocaleOptions] (val x: Self) extends AnyVal {
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
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setNumberingSystem(value: NumberingSystem): Self = this.set("numberingSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberingSystem: Self = this.set("numberingSystem", js.undefined)
    @scala.inline
    def setOutputCalendar(value: CalendarSystem): Self = this.set("outputCalendar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputCalendar: Self = this.set("outputCalendar", js.undefined)
  }
  
}

