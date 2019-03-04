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
    val __obj = js.Dynamic.literal(addTo = addTo, between = between, compareTo = compareTo, duration = duration, isDateBased = isDateBased, isDurationEstimated = isDurationEstimated, isSupportedBy = isSupportedBy, isTimeBased = isTimeBased, toString = toString)
  
    __obj.asInstanceOf[ChronoUnit]
  }
}

