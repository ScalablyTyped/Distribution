package typings
package intlDashRelativeformatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bestfit extends js.Object {
  /**
    * By default, the relative time is computed as "best fit",
    * which means that instead of "1 day ago", it will display "yesterday",
    * or "in 1 year" will be "next year", etc. But you can force to always
    * use the "numeric" alternative:
    */
  var style: js.UndefOr[
    (intlDashRelativeformatLib.intlDashRelativeformatLibStrings.`best fit`) | intlDashRelativeformatLib.intlDashRelativeformatLibStrings.numeric
  ] = js.undefined
  /**
    * By default, the relative time is computed to the best fit unit,
    * but you can explicitly call it to force units to be displayed in
    * "second", "second-short", "minute", "minute-short", "hour",
    * "hour-short", "day", "day-short", "month", "month-short",
    * "year" or "year-short":
    */
  var units: js.UndefOr[
    intlDashRelativeformatLib.intlDashRelativeformatLibStrings.second | intlDashRelativeformatLib.intlDashRelativeformatLibStrings.`second-short` | intlDashRelativeformatLib.intlDashRelativeformatLibStrings.minute | intlDashRelativeformatLib.intlDashRelativeformatLibStrings.`minute-short` | intlDashRelativeformatLib.intlDashRelativeformatLibStrings.hour | intlDashRelativeformatLib.intlDashRelativeformatLibStrings.`hour-short` | intlDashRelativeformatLib.intlDashRelativeformatLibStrings.day | intlDashRelativeformatLib.intlDashRelativeformatLibStrings.`day-short` | intlDashRelativeformatLib.intlDashRelativeformatLibStrings.month | intlDashRelativeformatLib.intlDashRelativeformatLibStrings.`month-short` | intlDashRelativeformatLib.intlDashRelativeformatLibStrings.year | intlDashRelativeformatLib.intlDashRelativeformatLibStrings.`year-short`
  ] = js.undefined
}

