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
    addTo: js.Function2[js.Any, scala.Double, js.Any],
    between: js.Function2[Temporal, Temporal, scala.Double],
    duration: js.Function0[Duration],
    isDateBased: js.Function0[scala.Boolean],
    isDurationEstimated: js.Function0[scala.Boolean],
    isSupportedBy: js.Function1[Temporal, scala.Boolean],
    isTimeBased: js.Function0[scala.Boolean]
  ): TemporalUnit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addTo")(addTo)
    __obj.updateDynamic("between")(between)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("isDateBased")(isDateBased)
    __obj.updateDynamic("isDurationEstimated")(isDurationEstimated)
    __obj.updateDynamic("isSupportedBy")(isSupportedBy)
    __obj.updateDynamic("isTimeBased")(isTimeBased)
    __obj.asInstanceOf[TemporalUnit]
  }
}

