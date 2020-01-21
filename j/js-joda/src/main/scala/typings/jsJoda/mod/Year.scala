package typings.jsJoda.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "Year")
@js.native
class Year protected () extends TemporalAccessor {
  def atMonth(monthOrNumber: Double): YearMonth = js.native
  def atMonth(monthOrNumber: Month): YearMonth = js.native
  def minus(amountOrNumber: Double): Year = js.native
  def minus(amountOrNumber: Double, unit: TemporalUnit): Year = js.native
  def minus(amountOrNumber: TemporalAmount): Year = js.native
  def minus(amountOrNumber: TemporalAmount, unit: TemporalUnit): Year = js.native
  def plus(amountOrNumber: Double): Year = js.native
  def plus(amountOrNumber: Double, unit: TemporalUnit): Year = js.native
  def plus(amountOrNumber: TemporalAmount): Year = js.native
  def plus(amountOrNumber: TemporalAmount, unit: TemporalUnit): Year = js.native
  def value(): Double = js.native
}

/* static members */
@JSImport("js-joda", "Year")
@js.native
object Year extends js.Object {
  var MAX_VALUE: Double = js.native
  var MIN_VALUE: Double = js.native
  def from(temporal: TemporalAccessor): Year = js.native
  def isLeap(year: Double): Boolean = js.native
  def now(): Year = js.native
  def now(zoneIdOrClock: Clock): Year = js.native
  def now(zoneIdOrClock: ZoneId): Year = js.native
  def of(isoYear: Double): Year = js.native
  def parse(text: String): Year = js.native
  def parse(text: String, formatter: DateTimeFormatter): Year = js.native
}

