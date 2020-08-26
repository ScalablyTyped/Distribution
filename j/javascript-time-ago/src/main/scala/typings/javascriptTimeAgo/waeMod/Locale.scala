package typings.javascriptTimeAgo.waeMod

import typings.javascriptTimeAgo.javascriptTimeAgoStrings.few
import typings.javascriptTimeAgo.javascriptTimeAgoStrings.one
import typings.javascriptTimeAgo.javascriptTimeAgoStrings.other
import typings.javascriptTimeAgo.javascriptTimeAgoStrings.two
import typings.javascriptTimeAgo.javascriptTimeAgoStrings.wae
import typings.javascriptTimeAgo.localeMod.Duration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Locale extends js.Object {
  var locale: wae = js.native
  var long: Duration = js.native
  var narrow: Duration = js.native
  var short: Duration = js.native
  def quantify(n: Double): one | two | few | other = js.native
}

object Locale {
  @scala.inline
  def apply(
    locale: wae,
    long: Duration,
    narrow: Duration,
    quantify: Double => one | two | few | other,
    short: Duration
  ): Locale = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], quantify = js.Any.fromFunction1(quantify), short = short.asInstanceOf[js.Any])
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
    def setLocale(value: wae): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def setLong(value: Duration): Self = this.set("long", value.asInstanceOf[js.Any])
    @scala.inline
    def setNarrow(value: Duration): Self = this.set("narrow", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuantify(value: Double => one | two | few | other): Self = this.set("quantify", js.Any.fromFunction1(value))
    @scala.inline
    def setShort(value: Duration): Self = this.set("short", value.asInstanceOf[js.Any])
  }
  
}

