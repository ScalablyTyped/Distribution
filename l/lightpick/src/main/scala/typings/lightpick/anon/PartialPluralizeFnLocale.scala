package typings.lightpick.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<lightpick.lightpick.Options.Locale.PluralizeFnLocale> */
@js.native
trait PartialPluralizeFnLocale extends js.Object {
  var one: js.UndefOr[String] = js.native
  var other: js.UndefOr[String] = js.native
}

object PartialPluralizeFnLocale {
  @scala.inline
  def apply(): PartialPluralizeFnLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPluralizeFnLocale]
  }
  @scala.inline
  implicit class PartialPluralizeFnLocaleOps[Self <: PartialPluralizeFnLocale] (val x: Self) extends AnyVal {
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
    def setOne(value: String): Self = this.set("one", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOne: Self = this.set("one", js.undefined)
    @scala.inline
    def setOther(value: String): Self = this.set("other", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOther: Self = this.set("other", js.undefined)
  }
  
}

