package typings.javascriptDashTimeDashAgo.localeMod

import typings.javascriptDashTimeDashAgo.javascriptDashTimeDashAgoStrings.few
import typings.javascriptDashTimeDashAgo.javascriptDashTimeDashAgoStrings.one
import typings.javascriptDashTimeDashAgo.javascriptDashTimeDashAgoStrings.other
import typings.javascriptDashTimeDashAgo.javascriptDashTimeDashAgoStrings.two
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  var locale: String
  var long: js.UndefOr[Duration] = js.undefined
  var `long-convenient`: js.UndefOr[Duration] = js.undefined
  var `long-time`: js.UndefOr[Duration] = js.undefined
  var narrow: js.UndefOr[Duration] = js.undefined
  var short: js.UndefOr[Duration] = js.undefined
  var `short-convenient`: js.UndefOr[Duration] = js.undefined
  var `short-time`: js.UndefOr[Duration] = js.undefined
  var tiny: js.UndefOr[Duration] = js.undefined
  def quantify(n: Double): one | two | few | other
}

object Locale {
  @scala.inline
  def apply(
    locale: String,
    quantify: Double => one | two | few | other,
    long: Duration = null,
    `long-convenient`: Duration = null,
    `long-time`: Duration = null,
    narrow: Duration = null,
    short: Duration = null,
    `short-convenient`: Duration = null,
    `short-time`: Duration = null,
    tiny: Duration = null
  ): Locale = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], quantify = js.Any.fromFunction1(quantify))
    if (long != null) __obj.updateDynamic("long")(long.asInstanceOf[js.Any])
    if (`long-convenient` != null) __obj.updateDynamic("long-convenient")(`long-convenient`.asInstanceOf[js.Any])
    if (`long-time` != null) __obj.updateDynamic("long-time")(`long-time`.asInstanceOf[js.Any])
    if (narrow != null) __obj.updateDynamic("narrow")(narrow.asInstanceOf[js.Any])
    if (short != null) __obj.updateDynamic("short")(short.asInstanceOf[js.Any])
    if (`short-convenient` != null) __obj.updateDynamic("short-convenient")(`short-convenient`.asInstanceOf[js.Any])
    if (`short-time` != null) __obj.updateDynamic("short-time")(`short-time`.asInstanceOf[js.Any])
    if (tiny != null) __obj.updateDynamic("tiny")(tiny.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
}

