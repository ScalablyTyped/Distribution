package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "Duration")
@js.native
class Duration protected ()
  extends jsDashJodaLib.jsDashJodaMod.JSJodaNs.Duration {
  /* CompleteClass */
  override def addTo[T /* <: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Temporal */](temporal: T): T = js.native
  /* CompleteClass */
  override def get(unit: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalUnit): scala.Double = js.native
  /* CompleteClass */
  override def subtractFrom[T /* <: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Temporal */](temporal: T): T = js.native
  /* CompleteClass */
  override def units(): js.Array[jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalUnit] = js.native
}

/* static members */
@JSImport("js-joda", "Duration")
@js.native
object Duration extends js.Object {
  var ZERO: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Duration = js.native
  def between(
    startInclusive: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Temporal,
    endExclusive: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Temporal
  ): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Duration = js.native
  def from(amount: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalAmount): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Duration = js.native
  def of(amount: scala.Double, unit: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalUnit): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Duration = js.native
  def ofDays(days: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Duration = js.native
  def ofHours(hours: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Duration = js.native
  def ofMillis(millis: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Duration = js.native
  def ofMinutes(minutes: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Duration = js.native
  def ofNanos(nanos: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Duration = js.native
  def ofSeconds(seconds: scala.Double): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Duration = js.native
  def parse(text: java.lang.String): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Duration = js.native
}

