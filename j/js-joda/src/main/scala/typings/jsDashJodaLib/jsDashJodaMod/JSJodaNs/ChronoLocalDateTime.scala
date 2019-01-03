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

