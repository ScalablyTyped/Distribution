package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "TemporalUnit")
@js.native
abstract class TemporalUnit () extends js.Object {
  def addTo[T /* <: Temporal */](temporal: T, amount: scala.Double): T = js.native
  def between(temporal1: Temporal, temporal2: Temporal): scala.Double = js.native
  def duration(): Duration = js.native
  def isDateBased(): scala.Boolean = js.native
  def isDurationEstimated(): scala.Boolean = js.native
  def isSupportedBy(temporal: Temporal): scala.Boolean = js.native
  def isTimeBased(): scala.Boolean = js.native
}

