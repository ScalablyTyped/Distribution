package typings.jsJoda.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "ChronoLocalDate")
@js.native
abstract class ChronoLocalDate () extends TemporalAccessor {
  def adjustInto(temporal: TemporalAdjuster): this.type = js.native
  def format(formatter: DateTimeFormatter): String = js.native
  def isSupported(fieldOrUnit: TemporalField): Boolean = js.native
  def isSupported(fieldOrUnit: TemporalUnit): Boolean = js.native
}

