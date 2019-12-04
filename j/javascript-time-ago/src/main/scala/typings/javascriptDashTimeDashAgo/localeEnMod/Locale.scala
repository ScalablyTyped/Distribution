package typings.javascriptDashTimeDashAgo.localeEnMod

import typings.javascriptDashTimeDashAgo.javascriptDashTimeDashAgoStrings.en
import typings.javascriptDashTimeDashAgo.javascriptDashTimeDashAgoStrings.few
import typings.javascriptDashTimeDashAgo.javascriptDashTimeDashAgoStrings.one
import typings.javascriptDashTimeDashAgo.javascriptDashTimeDashAgoStrings.other
import typings.javascriptDashTimeDashAgo.javascriptDashTimeDashAgoStrings.two
import typings.javascriptDashTimeDashAgo.localeMod.Duration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  var locale: en
  var long: Duration
  var `long-convenient`: Duration
  var `long-time`: Duration
  var narrow: Duration
  var short: Duration
  var `short-convenient`: Duration
  var `short-time`: Duration
  var tiny: Duration
  def quantify(n: Double): one | two | few | other
}

object Locale {
  @scala.inline
  def apply(
    locale: en,
    long: Duration,
    `long-convenient`: Duration,
    `long-time`: Duration,
    narrow: Duration,
    quantify: Double => one | two | few | other,
    short: Duration,
    `short-convenient`: Duration,
    `short-time`: Duration,
    tiny: Duration
  ): Locale = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], quantify = js.Any.fromFunction1(quantify), short = short.asInstanceOf[js.Any], tiny = tiny.asInstanceOf[js.Any])
    __obj.updateDynamic("long-convenient")(`long-convenient`.asInstanceOf[js.Any])
    __obj.updateDynamic("long-time")(`long-time`.asInstanceOf[js.Any])
    __obj.updateDynamic("short-convenient")(`short-convenient`.asInstanceOf[js.Any])
    __obj.updateDynamic("short-time")(`short-time`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
}

