package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "ChronoLocalDateTime")
@js.native
abstract class ChronoLocalDateTime ()
  extends jsDashJodaLib.jsDashJodaMod.JSJodaNs.ChronoLocalDateTime {
  /* CompleteClass */
  override def adjustInto(temporal: js.Any): js.Any = js.native
  /* CompleteClass */
  override def chronology(): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Chronology = js.native
  /* CompleteClass */
  override def get(field: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalField): scala.Double = js.native
  /* CompleteClass */
  override def query(query: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalQuery): js.Any = js.native
  /* CompleteClass */
  override def range(field: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalField): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ValueRange = js.native
  /* CompleteClass */
  override def toEpochSecond(offset: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneOffset): scala.Double = js.native
  /* CompleteClass */
  override def toInstant(offset: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneOffset): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Instant = js.native
}

