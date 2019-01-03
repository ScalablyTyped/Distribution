package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "Year")
@js.native
class Year ()
  extends jsDashJodaLib.jsDashJodaMod.JSJodaNs.Year {
  /* CompleteClass */
  override def get(field: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalField): scala.Double = js.native
  /* CompleteClass */
  override def query(query: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalQuery): js.Any = js.native
  /* CompleteClass */
  override def range(field: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalField): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ValueRange = js.native
}

@JSImport("js-joda", "Year")
@js.native
object Year extends js.Object {
  var MAX_VALUE: scala.Double = js.native
  var MIN_VALUE: scala.Double = js.native
  def from(temporal: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalAccessor): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Year = js.native
  def isLeap(year: scala.Double): scala.Boolean = js.native
  def now(): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Year = js.native
  def now(zoneIdOrClock: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Clock): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Year = js.native
  def now(zoneIdOrClock: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneId): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Year = js.native
  def of(isoYear: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Year = js.native
  def parse(text: java.lang.String): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Year = js.native
  def parse(text: java.lang.String, formatter: jsDashJodaLib.jsDashJodaMod.JSJodaNs.DateTimeFormatter): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Year = js.native
}

