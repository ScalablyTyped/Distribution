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

