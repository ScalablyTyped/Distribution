package typings.kendoDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ extends js.Object {
  var AM: js.Array[String]
  @JSName(":")
  var Colon: String
  var PM: js.Array[String]
  @JSName("/")
  var Slash: String
  var days: Anon_Names
  var firstDay: Double
  var months: Anon_NamesNamesAbbr
  var patterns: Anon_D
  var twoDigitYearMax: Double
}

object Anon_ {
  @scala.inline
  def apply(
    AM: js.Array[String],
    Colon: String,
    PM: js.Array[String],
    Slash: String,
    days: Anon_Names,
    firstDay: Double,
    months: Anon_NamesNamesAbbr,
    patterns: Anon_D,
    twoDigitYearMax: Double
  ): Anon_ = {
    val __obj = js.Dynamic.literal(AM = AM.asInstanceOf[js.Any], PM = PM.asInstanceOf[js.Any], days = days.asInstanceOf[js.Any], firstDay = firstDay.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any], twoDigitYearMax = twoDigitYearMax.asInstanceOf[js.Any])
    __obj.updateDynamic(":")(Colon.asInstanceOf[js.Any])
    __obj.updateDynamic("/")(Slash.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_]
  }
}

