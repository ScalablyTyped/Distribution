package typings.jsrsasign.jsrsasign.KJUR.asn1

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateParam extends js.Object {
  var date: Date = js.native
  var withMillis: js.UndefOr[Boolean] = js.native
}

object DateParam {
  @scala.inline
  def apply(date: Date): DateParam = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateParam]
  }
  @scala.inline
  implicit class DateParamOps[Self <: DateParam] (val x: Self) extends AnyVal {
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
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setWithMillis(value: Boolean): Self = this.set("withMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithMillis: Self = this.set("withMillis", js.undefined)
  }
  
}

