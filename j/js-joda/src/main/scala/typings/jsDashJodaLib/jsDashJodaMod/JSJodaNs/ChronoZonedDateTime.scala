package typings
package jsDashJodaLib.jsDashJodaMod.JSJodaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChronoZonedDateTime extends TemporalAccessor {
  def compareTo(other: ChronoZonedDateTime): scala.Double
  def equals(other: js.Any): scala.Boolean
  def format(formatter: DateTimeFormatter): java.lang.String
  def isAfter(other: ChronoZonedDateTime): scala.Boolean
  def isBefore(other: ChronoZonedDateTime): scala.Boolean
  def isEqual(other: ChronoZonedDateTime): scala.Boolean
  def query(query: js.Any): js.Any
  def toEpochSecond(): scala.Double
  def toInstant(): Instant
}

