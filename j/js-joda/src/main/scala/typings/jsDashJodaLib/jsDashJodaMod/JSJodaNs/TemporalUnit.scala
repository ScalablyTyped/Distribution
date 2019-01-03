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

