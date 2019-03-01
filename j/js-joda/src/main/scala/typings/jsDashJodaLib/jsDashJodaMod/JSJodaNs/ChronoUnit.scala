package typings
package jsDashJodaLib.jsDashJodaMod.JSJodaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChronoUnit extends TemporalUnit {
  def compareTo(other: TemporalUnit): scala.Double
}

object ChronoUnit {
  @scala.inline
  def apply(
    addTo: js.Function2[js.Any, scala.Double, js.Any],
    between: js.Function2[Temporal, Temporal, scala.Double],
    compareTo: js.Function1[TemporalUnit, scala.Double],
    duration: js.Function0[Duration],
    isDateBased: js.Function0[scala.Boolean],
    isDurationEstimated: js.Function0[scala.Boolean],
    isSupportedBy: js.Function1[Temporal, scala.Boolean],
    isTimeBased: js.Function0[scala.Boolean],
    toString: js.Function0[java.lang.String]
  ): ChronoUnit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addTo")(addTo)
    __obj.updateDynamic("between")(between)
    __obj.updateDynamic("compareTo")(compareTo)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("isDateBased")(isDateBased)
    __obj.updateDynamic("isDurationEstimated")(isDurationEstimated)
    __obj.updateDynamic("isSupportedBy")(isSupportedBy)
    __obj.updateDynamic("isTimeBased")(isTimeBased)
    __obj.updateDynamic("toString")(toString)
    __obj.asInstanceOf[ChronoUnit]
  }
}

