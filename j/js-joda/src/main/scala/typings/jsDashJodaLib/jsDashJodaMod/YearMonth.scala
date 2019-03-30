package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "YearMonth")
@js.native
class YearMonth protected ()
  extends jsDashJodaLib.jsDashJodaMod.JSJodaNs.YearMonth {
  /* CompleteClass */
  override def get(field: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalField): scala.Double = js.native
  /* CompleteClass */
  override def query(query: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalQuery): js.Any = js.native
  /* CompleteClass */
  override def range(field: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalField): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ValueRange = js.native
}

/* static members */
@JSImport("js-joda", "YearMonth")
@js.native
object YearMonth extends js.Object {
  def from(temporal: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalAccessor): jsDashJodaLib.jsDashJodaMod.JSJodaNs.YearMonth = js.native
  def now(): jsDashJodaLib.jsDashJodaMod.JSJodaNs.YearMonth = js.native
  def now(zoneIdOrClock: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Clock): jsDashJodaLib.jsDashJodaMod.JSJodaNs.YearMonth = js.native
  def now(zoneIdOrClock: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneId): jsDashJodaLib.jsDashJodaMod.JSJodaNs.YearMonth = js.native
  def of(year: scala.Double, monthOrNumber: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Month): jsDashJodaLib.jsDashJodaMod.JSJodaNs.YearMonth = js.native
  def of(year: scala.Double, monthOrNumber: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.YearMonth = js.native
  def parse(text: java.lang.String): jsDashJodaLib.jsDashJodaMod.JSJodaNs.YearMonth = js.native
  def parse(text: java.lang.String, formatter: jsDashJodaLib.jsDashJodaMod.JSJodaNs.DateTimeFormatter): jsDashJodaLib.jsDashJodaMod.JSJodaNs.YearMonth = js.native
}

