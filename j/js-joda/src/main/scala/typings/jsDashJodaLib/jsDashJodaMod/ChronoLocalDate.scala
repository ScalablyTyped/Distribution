package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "ChronoLocalDate")
@js.native
abstract class ChronoLocalDate () extends Temporal {
  def adjustInto(temporal: TemporalAdjuster): this.type = js.native
  def format(formatter: DateTimeFormatter): java.lang.String = js.native
  def isSupported(fieldOrUnit: TemporalField): scala.Boolean = js.native
  def isSupported(fieldOrUnit: TemporalUnit): scala.Boolean = js.native
}

