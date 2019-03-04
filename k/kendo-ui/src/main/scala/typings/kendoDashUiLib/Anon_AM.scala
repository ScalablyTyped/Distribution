package typings
package kendoDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AM extends js.Object {
  var `/`: java.lang.String
  var `:`: java.lang.String
  var AM: js.Array[java.lang.String]
  var PM: js.Array[java.lang.String]
  var days: Anon_Names
  var firstDay: java.lang.String
  var months: Anon_NamesNamesAbbr
  var patterns: Anon_D
  var twoDigitYearMax: scala.Double
}

object Anon_AM {
  @scala.inline
  def apply(
    `/`: java.lang.String,
    `:`: java.lang.String,
    AM: js.Array[java.lang.String],
    PM: js.Array[java.lang.String],
    days: Anon_Names,
    firstDay: java.lang.String,
    months: Anon_NamesNamesAbbr,
    patterns: Anon_D,
    twoDigitYearMax: scala.Double
  ): Anon_AM = {
    val __obj = js.Dynamic.literal(AM = AM, PM = PM, days = days, firstDay = firstDay, months = months, patterns = patterns, twoDigitYearMax = twoDigitYearMax)
    __obj.updateDynamic("/")(`/`)
    __obj.updateDynamic(":")(`:`)
    __obj.asInstanceOf[Anon_AM]
  }
}

