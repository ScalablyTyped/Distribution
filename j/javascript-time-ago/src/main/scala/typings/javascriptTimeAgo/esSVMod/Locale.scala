package typings.javascriptTimeAgo.esSVMod

import typings.javascriptTimeAgo.javascriptTimeAgoStrings.`es-SV`
import typings.javascriptTimeAgo.javascriptTimeAgoStrings.few
import typings.javascriptTimeAgo.javascriptTimeAgoStrings.one
import typings.javascriptTimeAgo.javascriptTimeAgoStrings.other
import typings.javascriptTimeAgo.javascriptTimeAgoStrings.two
import typings.javascriptTimeAgo.localeMod.Duration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Locale extends js.Object {
  var locale: `es-SV` = js.native
  var long: Duration = js.native
  def quantify(n: Double): one | two | few | other = js.native
}

object Locale {
  @scala.inline
  def apply(locale: `es-SV`, long: Duration, quantify: Double => one | two | few | other): Locale = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], quantify = js.Any.fromFunction1(quantify))
    __obj.asInstanceOf[Locale]
  }
  @scala.inline
  implicit class LocaleOps[Self <: Locale] (val x: Self) extends AnyVal {
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
    def setLocale(value: `es-SV`): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def setLong(value: Duration): Self = this.set("long", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuantify(value: Double => one | two | few | other): Self = this.set("quantify", js.Any.fromFunction1(value))
  }
  
}

