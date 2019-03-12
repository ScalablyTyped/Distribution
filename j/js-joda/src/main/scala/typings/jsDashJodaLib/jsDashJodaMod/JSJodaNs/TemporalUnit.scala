package typings
package jsDashJodaLib.jsDashJodaMod.JSJodaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemporalUnit extends js.Object {
  def addTo[T /* <: Temporal */](temporal: T, amount: scala.Double): T
  def between(temporal1: Temporal, temporal2: Temporal): scala.Double
  def duration(): Duration
  def isDateBased(): scala.Boolean
  def isDurationEstimated(): scala.Boolean
  def isSupportedBy(temporal: Temporal): scala.Boolean
  def isTimeBased(): scala.Boolean
}

object TemporalUnit {
  @scala.inline
  def apply(
    addTo: (js.Any, scala.Double) => js.Any,
    between: (Temporal, Temporal) => scala.Double,
    duration: () => Duration,
    isDateBased: () => scala.Boolean,
    isDurationEstimated: () => scala.Boolean,
    isSupportedBy: Temporal => scala.Boolean,
    isTimeBased: () => scala.Boolean
  ): TemporalUnit = {
    val __obj = js.Dynamic.literal(addTo = js.Any.fromFunction2(addTo), between = js.Any.fromFunction2(between), duration = js.Any.fromFunction0(duration), isDateBased = js.Any.fromFunction0(isDateBased), isDurationEstimated = js.Any.fromFunction0(isDurationEstimated), isSupportedBy = js.Any.fromFunction1(isSupportedBy), isTimeBased = js.Any.fromFunction0(isTimeBased))
  
    __obj.asInstanceOf[TemporalUnit]
  }
}

