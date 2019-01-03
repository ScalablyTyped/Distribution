package typings
package jsDashJodaLib.jsDashJodaMod.JSJodaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DayOfWeek extends TemporalAccessor {
  def adjustInto(temporal: TemporalAdjuster): this.type
  def equals(other: js.Any): scala.Boolean
  def getDisplayName(style: TextStyle, locale: Locale): java.lang.String
  def getLong(field: TemporalField): scala.Double
  def isSupported(field: TemporalField): scala.Boolean
  def minus(days: scala.Double): DayOfWeek
  def name(): java.lang.String
  def ordinal(): scala.Double
  def plus(days: scala.Double): DayOfWeek
  def value(): scala.Double
}

