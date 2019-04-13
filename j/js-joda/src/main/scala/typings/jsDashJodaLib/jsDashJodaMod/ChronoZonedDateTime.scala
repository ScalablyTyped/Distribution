package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "ChronoZonedDateTime")
@js.native
abstract class ChronoZonedDateTime () extends Temporal {
  def compareTo(other: ChronoZonedDateTime): scala.Double = js.native
  def equals(other: js.Any): scala.Boolean = js.native
  def format(formatter: DateTimeFormatter): java.lang.String = js.native
  def isAfter(other: ChronoZonedDateTime): scala.Boolean = js.native
  def isBefore(other: ChronoZonedDateTime): scala.Boolean = js.native
  def isEqual(other: ChronoZonedDateTime): scala.Boolean = js.native
  def query(query: js.Any): js.Any = js.native
  def toEpochSecond(): scala.Double = js.native
  def toInstant(): Instant = js.native
}

