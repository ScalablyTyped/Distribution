package typings
package jsDashJodaLib.jsDashJodaMod.JSJodaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChronoField extends js.Object {
  def baseUnit(): scala.Double
  def checkValidIntValue(value: scala.Double): scala.Double
  def checkValidValue(value: scala.Double): js.Any
  def displayName(): java.lang.String
  def equals(other: js.Any): scala.Boolean
  def getFrom(temporal: TemporalAccessor): scala.Double
  def isDateBased(): scala.Boolean
  def isTimeBased(): scala.Boolean
  def name(): java.lang.String
  def range(): ValueRange
  def rangeRefinedBy(temporal: TemporalAccessor): ValueRange
  def rangeUnit(): scala.Double
}

