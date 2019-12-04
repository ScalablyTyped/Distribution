package typings.javascriptDashTimeDashAgo.localeZhDashHansDashHKMod

import typings.javascriptDashTimeDashAgo.javascriptDashTimeDashAgoStrings.`zh-Hans-HK`
import typings.javascriptDashTimeDashAgo.javascriptDashTimeDashAgoStrings.few
import typings.javascriptDashTimeDashAgo.javascriptDashTimeDashAgoStrings.one
import typings.javascriptDashTimeDashAgo.javascriptDashTimeDashAgoStrings.other
import typings.javascriptDashTimeDashAgo.javascriptDashTimeDashAgoStrings.two
import typings.javascriptDashTimeDashAgo.localeMod.Duration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  var locale: `zh-Hans-HK`
  var long: Duration
  def quantify(n: Double): one | two | few | other
}

object Locale {
  @scala.inline
  def apply(locale: `zh-Hans-HK`, long: Duration, quantify: Double => one | two | few | other): Locale = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], quantify = js.Any.fromFunction1(quantify))
  
    __obj.asInstanceOf[Locale]
  }
}

