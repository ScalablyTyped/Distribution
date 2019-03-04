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

object ChronoZonedDateTime {
  @scala.inline
  def apply(
    compareTo: js.Function1[ChronoZonedDateTime, scala.Double],
    equals: js.Function1[js.Any, scala.Boolean],
    format: js.Function1[DateTimeFormatter, java.lang.String],
    get: js.Function1[TemporalField, scala.Double],
    isAfter: js.Function1[ChronoZonedDateTime, scala.Boolean],
    isBefore: js.Function1[ChronoZonedDateTime, scala.Boolean],
    isEqual: js.Function1[ChronoZonedDateTime, scala.Boolean],
    query: js.Function1[js.Any, js.Any],
    range: js.Function1[TemporalField, ValueRange],
    toEpochSecond: js.Function0[scala.Double],
    toInstant: js.Function0[Instant]
  ): ChronoZonedDateTime = {
    val __obj = js.Dynamic.literal(compareTo = compareTo, equals = equals, format = format, get = get, isAfter = isAfter, isBefore = isBefore, isEqual = isEqual, query = query, range = range, toEpochSecond = toEpochSecond, toInstant = toInstant)
  
    __obj.asInstanceOf[ChronoZonedDateTime]
  }
}

