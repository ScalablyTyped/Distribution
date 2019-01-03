package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "ChronoZonedDateTime")
@js.native
abstract class ChronoZonedDateTime ()
  extends jsDashJodaLib.jsDashJodaMod.JSJodaNs.ChronoZonedDateTime {
  /* CompleteClass */
  override def compareTo(other: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ChronoZonedDateTime): scala.Double = js.native
  /* CompleteClass */
  override def equals(other: js.Any): scala.Boolean = js.native
  /* CompleteClass */
  override def format(formatter: jsDashJodaLib.jsDashJodaMod.JSJodaNs.DateTimeFormatter): java.lang.String = js.native
  /* CompleteClass */
  override def get(field: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalField): scala.Double = js.native
  /* CompleteClass */
  override def isAfter(other: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ChronoZonedDateTime): scala.Boolean = js.native
  /* CompleteClass */
  override def isBefore(other: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ChronoZonedDateTime): scala.Boolean = js.native
  /* CompleteClass */
  override def isEqual(other: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ChronoZonedDateTime): scala.Boolean = js.native
  /* CompleteClass */
  override def query(query: js.Any): js.Any = js.native
  /* CompleteClass */
  override def query(query: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalQuery): js.Any = js.native
  /* CompleteClass */
  override def range(field: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalField): jsDashJodaLib.jsDashJodaMod.JSJodaNs.ValueRange = js.native
  /* CompleteClass */
  override def toEpochSecond(): scala.Double = js.native
  /* CompleteClass */
  override def toInstant(): jsDashJodaLib.jsDashJodaMod.JSJodaNs.Instant = js.native
}

