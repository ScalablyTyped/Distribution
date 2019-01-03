package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "ZoneOffset")
@js.native
class ZoneOffset ()
  extends jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneOffset {
  /* CompleteClass */
  override def adjustInto(temporal: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Temporal): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Temporal = js.native
  /* CompleteClass */
  override def compareTo(other: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneOffset): scala.Double = js.native
  /* CompleteClass */
  override def equals(other: js.Any): scala.Boolean = js.native
  /* CompleteClass */
  override def get(field: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalField): scala.Double = js.native
  /* CompleteClass */
  override def getLong(field: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalField): scala.Double = js.native
  /* CompleteClass */
  override def id(): java.lang.String = js.native
  /* CompleteClass */
  override def normalized(): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneId = js.native
  /* CompleteClass */
  override def query(query: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalQuery): js.Any = js.native
  /* CompleteClass */
  override def rules(): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneRules = js.native
  /* CompleteClass */
  override def totalSeconds(): scala.Double = js.native
}

@JSImport("js-joda", "ZoneOffset")
@js.native
object ZoneOffset extends js.Object {
  var MAX: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneOffset = js.native
  var MAX_SECONDS: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneOffset = js.native
  var MIN: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneOffset = js.native
  var UTC: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneOffset = js.native
  def of(offsetId: java.lang.String): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneOffset = js.native
  def ofHours(hours: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneOffset = js.native
  def ofHoursMinutes(hours: scala.Double, minutes: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneOffset = js.native
  def ofHoursMinutesSeconds(hours: scala.Double, minutes: scala.Double, seconds: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneOffset = js.native
  def ofTotalMinutes(totalMinutes: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneOffset = js.native
  def ofTotalSeconds(totalSeconds: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneOffset = js.native
}

