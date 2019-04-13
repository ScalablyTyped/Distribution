package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "ChronoLocalDateTime")
@js.native
abstract class ChronoLocalDateTime () extends Temporal {
  def adjustInto(temporal: js.Any): js.Any = js.native
  def chronology(): Chronology = js.native
  def toEpochSecond(offset: ZoneOffset): scala.Double = js.native
  def toInstant(offset: ZoneOffset): Instant = js.native
}

