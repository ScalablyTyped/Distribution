package typings.javascriptDashTimeDashAgo.localeElMod

import typings.javascriptDashTimeDashAgo.javascriptDashTimeDashAgoStrings.el
import typings.javascriptDashTimeDashAgo.javascriptDashTimeDashAgoStrings.few
import typings.javascriptDashTimeDashAgo.javascriptDashTimeDashAgoStrings.one
import typings.javascriptDashTimeDashAgo.javascriptDashTimeDashAgoStrings.other
import typings.javascriptDashTimeDashAgo.javascriptDashTimeDashAgoStrings.two
import typings.javascriptDashTimeDashAgo.localeMod.Duration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  var locale: el
  var long: Duration
  var narrow: Duration
  var short: Duration
  var tiny: Duration
  def quantify(n: Double): one | two | few | other
}

object Locale {
  @scala.inline
  def apply(
    locale: el,
    long: Duration,
    narrow: Duration,
    quantify: Double => one | two | few | other,
    short: Duration,
    tiny: Duration
  ): Locale = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], quantify = js.Any.fromFunction1(quantify), short = short.asInstanceOf[js.Any], tiny = tiny.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Locale]
  }
}

