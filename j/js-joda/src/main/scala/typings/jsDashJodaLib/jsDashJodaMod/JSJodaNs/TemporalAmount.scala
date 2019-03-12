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
    addTo: js.Any => js.Any,
    get: TemporalUnit => scala.Double,
    subtractFrom: js.Any => js.Any,
    units: () => js.Array[TemporalUnit]
  ): TemporalAmount = {
    val __obj = js.Dynamic.literal(addTo = js.Any.fromFunction1(addTo), get = js.Any.fromFunction1(get), subtractFrom = js.Any.fromFunction1(subtractFrom), units = js.Any.fromFunction0(units))
  
    __obj.asInstanceOf[TemporalAmount]
  }
}

