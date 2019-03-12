package typings
package jsDashJodaLib.jsDashJodaMod.JSJodaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChronoLocalDateTime extends TemporalAccessor {
  def adjustInto(temporal: js.Any): js.Any
  def chronology(): Chronology
  def toEpochSecond(offset: ZoneOffset): scala.Double
  def toInstant(offset: ZoneOffset): Instant
}

object ChronoLocalDateTime {
  @scala.inline
  def apply(
    adjustInto: js.Any => js.Any,
    chronology: () => Chronology,
    get: TemporalField => scala.Double,
    query: TemporalQuery => js.Any,
    range: TemporalField => ValueRange,
    toEpochSecond: ZoneOffset => scala.Double,
    toInstant: ZoneOffset => Instant
  ): ChronoLocalDateTime = {
    val __obj = js.Dynamic.literal(adjustInto = js.Any.fromFunction1(adjustInto), chronology = js.Any.fromFunction0(chronology), get = js.Any.fromFunction1(get), query = js.Any.fromFunction1(query), range = js.Any.fromFunction1(range), toEpochSecond = js.Any.fromFunction1(toEpochSecond), toInstant = js.Any.fromFunction1(toInstant))
  
    __obj.asInstanceOf[ChronoLocalDateTime]
  }
}

