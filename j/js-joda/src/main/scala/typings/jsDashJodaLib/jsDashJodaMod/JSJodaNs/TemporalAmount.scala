package typings
package jsDashJodaLib.jsDashJodaMod.JSJodaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemporalAmount extends js.Object {
  def addTo[T /* <: Temporal */](temporal: T): T
  def get(unit: TemporalUnit): scala.Double
  def subtractFrom[T /* <: Temporal */](temporal: T): T
  def units(): js.Array[TemporalUnit]
}

object TemporalAmount {
  @scala.inline
  def apply(
    addTo: js.Function1[js.Any, js.Any],
    get: js.Function1[TemporalUnit, scala.Double],
    subtractFrom: js.Function1[js.Any, js.Any],
    units: js.Function0[js.Array[TemporalUnit]]
  ): TemporalAmount = {
    val __obj = js.Dynamic.literal(addTo = addTo, get = get, subtractFrom = subtractFrom, units = units)
  
    __obj.asInstanceOf[TemporalAmount]
  }
}

