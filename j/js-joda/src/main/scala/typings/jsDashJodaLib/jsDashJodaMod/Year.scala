package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "Year")
@js.native
class Year protected () extends Temporal {
  def atMonth(monthOrNumber: Month): YearMonth = js.native
  def atMonth(monthOrNumber: scala.Double): YearMonth = js.native
  def minus(amountOrNumber: TemporalAmount): Year = js.native
  def minus(amountOrNumber: TemporalAmount, unit: TemporalUnit): Year = js.native
  def minus(amountOrNumber: scala.Double): Year = js.native
  def minus(amountOrNumber: scala.Double, unit: TemporalUnit): Year = js.native
  def plus(amountOrNumber: TemporalAmount): Year = js.native
  def plus(amountOrNumber: TemporalAmount, unit: TemporalUnit): Year = js.native
  def plus(amountOrNumber: scala.Double): Year = js.native
  def plus(amountOrNumber: scala.Double, unit: TemporalUnit): Year = js.native
  def value(): scala.Double = js.native
}

/* static members */
@JSImport("js-joda", "Year")
@js.native
object Year extends js.Object {
  var MAX_VALUE: scala.Double = js.native
  var MIN_VALUE: scala.Double = js.native
  def from(temporal: jsDashJodaLib.jsDashJodaMod.TemporalAccessor): jsDashJodaLib.jsDashJodaMod.Year = js.native
  def isLeap(year: scala.Double): scala.Boolean = js.native
  def now(): jsDashJodaLib.jsDashJodaMod.Year = js.native
  def now(zoneIdOrClock: jsDashJodaLib.jsDashJodaMod.Clock): jsDashJodaLib.jsDashJodaMod.Year = js.native
  def now(zoneIdOrClock: jsDashJodaLib.jsDashJodaMod.ZoneId): jsDashJodaLib.jsDashJodaMod.Year = js.native
  def of(isoYear: scala.Double): jsDashJodaLib.jsDashJodaMod.Year = js.native
  def parse(text: java.lang.String): jsDashJodaLib.jsDashJodaMod.Year = js.native
  def parse(text: java.lang.String, formatter: jsDashJodaLib.jsDashJodaMod.DateTimeFormatter): jsDashJodaLib.jsDashJodaMod.Year = js.native
}

