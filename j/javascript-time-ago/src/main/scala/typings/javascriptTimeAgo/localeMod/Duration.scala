package typings.javascriptTimeAgo.localeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Duration extends js.Object {
  var day: Tense
  var flavour: js.UndefOr[Formats] = js.undefined
  var hour: Tense
  var minute: Tense
  var month: Tense
  var quarter: Tense
  var second: Tense
  var week: Tense
  var year: Tense
}

object Duration {
  @scala.inline
  def apply(
    day: Tense,
    hour: Tense,
    minute: Tense,
    month: Tense,
    quarter: Tense,
    second: Tense,
    week: Tense,
    year: Tense,
    flavour: Formats = null
  ): Duration = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], quarter = quarter.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], week = week.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    if (flavour != null) __obj.updateDynamic("flavour")(flavour.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
}

