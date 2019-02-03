package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "DateTimeFormatter")
@js.native
class DateTimeFormatter ()
  extends jsDashJodaLib.jsDashJodaMod.JSJodaNs.DateTimeFormatter {
  /* CompleteClass */
  override def chronology(): js.Any = js.native
  /* CompleteClass */
  override def decimalStyle(): js.Any = js.native
  /* CompleteClass */
  override def format(temporal: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalAccessor): java.lang.String = js.native
  /* CompleteClass */
  override def locale(): js.Any = js.native
  /* CompleteClass */
  override def parse(text: java.lang.String, `type`: jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalQuery): jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalAccessor = js.native
  /* CompleteClass */
  override def parse1(text: java.lang.String): jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalAccessor = js.native
  /* CompleteClass */
  override def parse2(text: js.Any, `type`: js.Any): js.Any = js.native
  /* CompleteClass */
  override def parseUnresolved(text: js.Any, position: js.Any): js.Any = js.native
  /* CompleteClass */
  override def withChronology(chrono: js.Any): js.Any = js.native
  /* CompleteClass */
  override def withLocale(): jsDashJodaLib.jsDashJodaMod.JSJodaNs.DateTimeFormatter = js.native
  /* CompleteClass */
  override def withResolverStyle(resolverStyle: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ResolverStyle): jsDashJodaLib.jsDashJodaMod.JSJodaNs.DateTimeFormatter = js.native
}

/* static members */
@JSImport("js-joda", "DateTimeFormatter")
@js.native
object DateTimeFormatter extends js.Object {
  var ISO_INSTANT: jsDashJodaLib.jsDashJodaMod.JSJodaNs.DateTimeFormatter = js.native
  var ISO_LOCAL_DATE: jsDashJodaLib.jsDashJodaMod.JSJodaNs.DateTimeFormatter = js.native
  var ISO_LOCAL_DATE_TIME: jsDashJodaLib.jsDashJodaMod.JSJodaNs.DateTimeFormatter = js.native
  var ISO_LOCAL_TIME: jsDashJodaLib.jsDashJodaMod.JSJodaNs.DateTimeFormatter = js.native
  var ISO_OFFSET_DATE_TIME: jsDashJodaLib.jsDashJodaMod.JSJodaNs.DateTimeFormatter = js.native
  var ISO_ZONED_DATE_TIME: jsDashJodaLib.jsDashJodaMod.JSJodaNs.DateTimeFormatter = js.native
  def ofPattern(pattern: java.lang.String): jsDashJodaLib.jsDashJodaMod.JSJodaNs.DateTimeFormatter = js.native
  def parsedExcessDays(): jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalQuery = js.native
  def parsedLeapSecond(): scala.Boolean = js.native
}

