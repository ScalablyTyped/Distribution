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
    adjustInto: js.Function1[js.Any, js.Any],
    chronology: js.Function0[Chronology],
    get: js.Function1[TemporalField, scala.Double],
    query: js.Function1[TemporalQuery, js.Any],
    range: js.Function1[TemporalField, ValueRange],
    toEpochSecond: js.Function1[ZoneOffset, scala.Double],
    toInstant: js.Function1[ZoneOffset, Instant]
  ): ChronoLocalDateTime = {
    val __obj = js.Dynamic.literal(adjustInto = adjustInto, chronology = chronology, get = get, query = query, range = range, toEpochSecond = toEpochSecond, toInstant = toInstant)
  
    __obj.asInstanceOf[ChronoLocalDateTime]
  }
}

