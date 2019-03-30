package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "ChronoUnit")
@js.native
class ChronoUnit protected ()
  extends jsDashJodaLib.jsDashJodaMod.JSJodaNs.ChronoUnit {
  /* CompleteClass */
  override def addTo[T /* <: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Temporal */](temporal: T, amount: scala.Double): T = js.native
  /* CompleteClass */
  override def between(
    temporal1: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Temporal,
    temporal2: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Temporal
  ): scala.Double = js.native
  /* CompleteClass */
  override def compareTo(other: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalUnit): scala.Double = js.native
  /* CompleteClass */
  override def duration(): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Duration = js.native
  /* CompleteClass */
  override def isDateBased(): scala.Boolean = js.native
  /* CompleteClass */
  override def isDurationEstimated(): scala.Boolean = js.native
  /* CompleteClass */
  override def isSupportedBy(temporal: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Temporal): scala.Boolean = js.native
  /* CompleteClass */
  override def isTimeBased(): scala.Boolean = js.native
}

/* static members */
@JSImport("js-joda", "ChronoUnit")
@js.native
object ChronoUnit extends js.Object {
  var CENTURIES: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ChronoUnit = js.native
  var DAYS: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ChronoUnit = js.native
  var DECADES: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ChronoUnit = js.native
  var ERAS: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ChronoUnit = js.native
  var FOREVER: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ChronoUnit = js.native
  var HALF_DAYS: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ChronoUnit = js.native
  var HOURS: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ChronoUnit = js.native
  var MICROS: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ChronoUnit = js.native
  var MILLENNIA: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ChronoUnit = js.native
  var MILLIS: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ChronoUnit = js.native
  var MINUTES: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ChronoUnit = js.native
  var MONTHS: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ChronoUnit = js.native
  var SECONDS: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ChronoUnit = js.native
  var WEEKS: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ChronoUnit = js.native
  var YEARS: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ChronoUnit = js.native
}

