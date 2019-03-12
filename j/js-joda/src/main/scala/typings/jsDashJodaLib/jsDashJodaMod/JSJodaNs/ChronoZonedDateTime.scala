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
    compareTo: ChronoZonedDateTime => scala.Double,
    equals: js.Any => scala.Boolean,
    format: DateTimeFormatter => java.lang.String,
    get: TemporalField => scala.Double,
    isAfter: ChronoZonedDateTime => scala.Boolean,
    isBefore: ChronoZonedDateTime => scala.Boolean,
    isEqual: ChronoZonedDateTime => scala.Boolean,
    query: js.Any => js.Any,
    range: TemporalField => ValueRange,
    toEpochSecond: () => scala.Double,
    toInstant: () => Instant
  ): ChronoZonedDateTime = {
    val __obj = js.Dynamic.literal(compareTo = js.Any.fromFunction1(compareTo), equals = js.Any.fromFunction1(equals), format = js.Any.fromFunction1(format), get = js.Any.fromFunction1(get), isAfter = js.Any.fromFunction1(isAfter), isBefore = js.Any.fromFunction1(isBefore), isEqual = js.Any.fromFunction1(isEqual), query = js.Any.fromFunction1(query), range = js.Any.fromFunction1(range), toEpochSecond = js.Any.fromFunction0(toEpochSecond), toInstant = js.Any.fromFunction0(toInstant))
  
    __obj.asInstanceOf[ChronoZonedDateTime]
  }
}

