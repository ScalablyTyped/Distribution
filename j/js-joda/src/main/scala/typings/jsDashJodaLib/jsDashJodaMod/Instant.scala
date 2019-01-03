package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "Instant")
@js.native
class Instant ()
  extends jsDashJodaLib.jsDashJodaMod.JSJodaNs.Instant {
  /* CompleteClass */
  override def get(field: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalField): scala.Double = js.native
  /* CompleteClass */
  override def query(query: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalQuery): js.Any = js.native
  /* CompleteClass */
  override def range(field: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalField): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ValueRange = js.native
}

@JSImport("js-joda", "Instant")
@js.native
object Instant extends js.Object {
  var EPOCH: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Instant = js.native
  var MAX: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Instant = js.native
  var MAX_SECONDS: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Instant = js.native
  var MIN: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Instant = js.native
  var MIN_SECONDS: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Instant = js.native
  def from(temporal: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalAccessor): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Instant = js.native
  def now(): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Instant = js.native
  def now(clock: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Clock): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Instant = js.native
  def ofEpochMilli(epochMilli: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Instant = js.native
  def ofEpochSecond(epochSecond: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Instant = js.native
  def ofEpochSecond(epochSecond: scala.Double, nanoAdjustment: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Instant = js.native
  def parse(text: java.lang.String): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Instant = js.native
}

