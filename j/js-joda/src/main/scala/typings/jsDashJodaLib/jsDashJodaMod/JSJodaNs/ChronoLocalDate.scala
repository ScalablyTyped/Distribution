package typings
package jsDashJodaLib.jsDashJodaMod.JSJodaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChronoLocalDate extends TemporalAccessor {
  def adjustInto(temporal: TemporalAdjuster): this.type = js.native
  def format(formatter: DateTimeFormatter): java.lang.String = js.native
  def isSupported(fieldOrUnit: TemporalField): scala.Boolean = js.native
  def isSupported(fieldOrUnit: TemporalUnit): scala.Boolean = js.native
}

