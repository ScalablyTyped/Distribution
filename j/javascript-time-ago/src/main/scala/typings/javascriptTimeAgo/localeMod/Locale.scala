package typings.javascriptTimeAgo.localeMod

import typings.javascriptTimeAgo.javascriptTimeAgoStrings.few
import typings.javascriptTimeAgo.javascriptTimeAgoStrings.one
import typings.javascriptTimeAgo.javascriptTimeAgoStrings.other
import typings.javascriptTimeAgo.javascriptTimeAgoStrings.two
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Locale extends js.Object {
  var locale: String = js.native
  var long: js.UndefOr[Duration] = js.native
  var `long-convenient`: js.UndefOr[Duration] = js.native
  var `long-time`: js.UndefOr[Duration] = js.native
  var narrow: js.UndefOr[Duration] = js.native
  var short: js.UndefOr[Duration] = js.native
  var `short-convenient`: js.UndefOr[Duration] = js.native
  var `short-time`: js.UndefOr[Duration] = js.native
  var tiny: js.UndefOr[Duration] = js.native
  def quantify(n: Double): one | two | few | other = js.native
}

object Locale {
  @scala.inline
  def apply(locale: String, quantify: Double => one | two | few | other): Locale = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], quantify = js.Any.fromFunction1(quantify))
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
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuantify(value: Double => one | two | few | other): Self = this.set("quantify", js.Any.fromFunction1(value))
    @scala.inline
    def setLong(value: Duration): Self = this.set("long", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLong: Self = this.set("long", js.undefined)
    @scala.inline
    def `setLong-convenient`(value: Duration): Self = this.set("long-convenient", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLong-convenient`: Self = this.set("long-convenient", js.undefined)
    @scala.inline
    def `setLong-time`(value: Duration): Self = this.set("long-time", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLong-time`: Self = this.set("long-time", js.undefined)
    @scala.inline
    def setNarrow(value: Duration): Self = this.set("narrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNarrow: Self = this.set("narrow", js.undefined)
    @scala.inline
    def setShort(value: Duration): Self = this.set("short", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShort: Self = this.set("short", js.undefined)
    @scala.inline
    def `setShort-convenient`(value: Duration): Self = this.set("short-convenient", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteShort-convenient`: Self = this.set("short-convenient", js.undefined)
    @scala.inline
    def `setShort-time`(value: Duration): Self = this.set("short-time", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteShort-time`: Self = this.set("short-time", js.undefined)
    @scala.inline
    def setTiny(value: Duration): Self = this.set("tiny", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTiny: Self = this.set("tiny", js.undefined)
  }
  
}

