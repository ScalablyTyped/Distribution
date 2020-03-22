package typings.javascriptTimeAgo.styleMod

import typings.javascriptTimeAgo.localeMod.Locale
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomFormatterOptions extends js.Object {
  var date: js.UndefOr[Date] = js.undefined
  var elapsed: Double
  var locale: Locale
  var now: Double
  var time: Double
}

object CustomFormatterOptions {
  @scala.inline
  def apply(elapsed: Double, locale: Locale, now: Double, time: Double, date: Date = null): CustomFormatterOptions = {
    val __obj = js.Dynamic.literal(elapsed = elapsed.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], now = now.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomFormatterOptions]
  }
}

