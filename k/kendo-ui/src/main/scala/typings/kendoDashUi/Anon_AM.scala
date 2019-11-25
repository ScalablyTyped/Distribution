package typings.kendoDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AM extends js.Object {
  var `/`: String
  var `:`: String
  var AM: js.Array[String]
  var PM: js.Array[String]
  var days: Anon_Names
  var firstDay: String
  var months: Anon_NamesNamesAbbr
  var patterns: Anon_D
  var twoDigitYearMax: Double
}

object Anon_AM {
  @scala.inline
  def apply(
    `/`: String,
    `:`: String,
    AM: js.Array[String],
    PM: js.Array[String],
    days: Anon_Names,
    firstDay: String,
    months: Anon_NamesNamesAbbr,
    patterns: Anon_D,
    twoDigitYearMax: Double
  ): Anon_AM = {
    val __obj = js.Dynamic.literal(AM = AM.asInstanceOf[js.Any], PM = PM.asInstanceOf[js.Any], days = days.asInstanceOf[js.Any], firstDay = firstDay.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any], twoDigitYearMax = twoDigitYearMax.asInstanceOf[js.Any])
    __obj.updateDynamic("/")(`/`.asInstanceOf[js.Any])
    __obj.updateDynamic(":")(`:`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AM]
  }
}

