package typings.kendoUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAM extends js.Object {
  var AM: js.Array[String]
  @JSName(":")
  var Colon: String
  var PM: js.Array[String]
  @JSName("/")
  var Slash: String
  var days: AnonNames
  var firstDay: String
  var months: AnonNamesAbbr
  var patterns: AnonD
  var twoDigitYearMax: Double
}

object AnonAM {
  @scala.inline
  def apply(
    AM: js.Array[String],
    Colon: String,
    PM: js.Array[String],
    Slash: String,
    days: AnonNames,
    firstDay: String,
    months: AnonNamesAbbr,
    patterns: AnonD,
    twoDigitYearMax: Double
  ): AnonAM = {
    val __obj = js.Dynamic.literal(AM = AM.asInstanceOf[js.Any], PM = PM.asInstanceOf[js.Any], days = days.asInstanceOf[js.Any], firstDay = firstDay.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any], twoDigitYearMax = twoDigitYearMax.asInstanceOf[js.Any])
    __obj.updateDynamic(":")(Colon.asInstanceOf[js.Any])
    __obj.updateDynamic("/")(Slash.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAM]
  }
}

