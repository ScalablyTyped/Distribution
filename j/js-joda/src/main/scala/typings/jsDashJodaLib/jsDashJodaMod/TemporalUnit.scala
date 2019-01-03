package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "TemporalUnit")
@js.native
class TemporalUnit ()
  extends jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalUnit {
  /* CompleteClass */
  override def addTo[T /* <: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Temporal */](temporal: T, amount: scala.Double): T = js.native
  /* CompleteClass */
  override def between(
    temporal1: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Temporal,
    temporal2: jsDashJodaLib.jsDashJodaMod.JSJodaNs.Temporal
  ): scala.Double = js.native
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

