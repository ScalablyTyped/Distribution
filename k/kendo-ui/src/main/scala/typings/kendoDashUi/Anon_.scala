package typings.kendoDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ extends js.Object {
  var `/`: String
  var `:`: String
  var AM: js.Array[String]
  var PM: js.Array[String]
  var days: Anon_Names
  var firstDay: Double
  var months: Anon_NamesNamesAbbr
  var patterns: Anon_D
  var twoDigitYearMax: Double
}

object Anon_ {
  @scala.inline
  def apply(
    `/`: String,
    `:`: String,
    AM: js.Array[String],
    PM: js.Array[String],
    days: Anon_Names,
    firstDay: Double,
    months: Anon_NamesNamesAbbr,
    patterns: Anon_D,
    twoDigitYearMax: Double
  ): Anon_ = {
    val __obj = js.Dynamic.literal(AM = AM, PM = PM, days = days, firstDay = firstDay, months = months, patterns = patterns, twoDigitYearMax = twoDigitYearMax)
    __obj.updateDynamic("/")(`/`)
    __obj.updateDynamic(":")(`:`)
    __obj.asInstanceOf[Anon_]
  }
}

