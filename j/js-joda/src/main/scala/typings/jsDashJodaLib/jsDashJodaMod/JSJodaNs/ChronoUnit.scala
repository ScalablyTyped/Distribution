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
    addTo: (js.Any, scala.Double) => js.Any,
    between: (Temporal, Temporal) => scala.Double,
    compareTo: TemporalUnit => scala.Double,
    duration: () => Duration,
    isDateBased: () => scala.Boolean,
    isDurationEstimated: () => scala.Boolean,
    isSupportedBy: Temporal => scala.Boolean,
    isTimeBased: () => scala.Boolean,
    toString: () => java.lang.String
  ): ChronoUnit = {
    val __obj = js.Dynamic.literal(addTo = js.Any.fromFunction2(addTo), between = js.Any.fromFunction2(between), compareTo = js.Any.fromFunction1(compareTo), duration = js.Any.fromFunction0(duration), isDateBased = js.Any.fromFunction0(isDateBased), isDurationEstimated = js.Any.fromFunction0(isDurationEstimated), isSupportedBy = js.Any.fromFunction1(isSupportedBy), isTimeBased = js.Any.fromFunction0(isTimeBased), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[ChronoUnit]
  }
}

