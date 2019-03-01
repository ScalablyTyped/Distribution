package typings
package kendoDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `Anon_` extends js.Object {
  var `/`: java.lang.String
  var `:`: java.lang.String
  var AM: js.Array[java.lang.String]
  var PM: js.Array[java.lang.String]
  var days: Anon_Names
  var firstDay: scala.Double
  var months: Anon_NamesNamesAbbr
  var patterns: Anon_D
  var twoDigitYearMax: scala.Double
}

object `Anon_` {
  @scala.inline
  def apply(
    `/`: java.lang.String,
    `:`: java.lang.String,
    AM: js.Array[java.lang.String],
    PM: js.Array[java.lang.String],
    days: Anon_Names,
    firstDay: scala.Double,
    months: Anon_NamesNamesAbbr,
    patterns: Anon_D,
    twoDigitYearMax: scala.Double
  ): `Anon_` = {
    val __obj = js.Dynamic.literal(`/` = `/`, `:` = `:`)
    __obj.updateDynamic("AM")(AM)
    __obj.updateDynamic("PM")(PM)
    __obj.updateDynamic("days")(days)
    __obj.updateDynamic("firstDay")(firstDay)
    __obj.updateDynamic("months")(months)
    __obj.updateDynamic("patterns")(patterns)
    __obj.updateDynamic("twoDigitYearMax")(twoDigitYearMax)
    __obj.asInstanceOf[`Anon_`]
  }
}

