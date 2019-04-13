package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "DateTimeFormatter")
@js.native
class DateTimeFormatter protected () extends js.Object {
  def chronology(): js.Any = js.native
  def decimalStyle(): js.Any = js.native
  def format(temporal: TemporalAccessor): java.lang.String = js.native
  def locale(): js.Any = js.native
  def parse(text: java.lang.String, `type`: TemporalQuery): TemporalAccessor = js.native
  def parse1(text: java.lang.String): TemporalAccessor = js.native
  def parse2(text: js.Any, `type`: js.Any): js.Any = js.native
  def parseUnresolved(text: js.Any, position: js.Any): js.Any = js.native
  def withChronology(chrono: js.Any): js.Any = js.native
  def withLocale(locale: Locale): DateTimeFormatter = js.native
  def withResolverStyle(resolverStyle: ResolverStyle): DateTimeFormatter = js.native
}

/* static members */
@JSImport("js-joda", "DateTimeFormatter")
@js.native
object DateTimeFormatter extends js.Object {
  var ISO_INSTANT: jsDashJodaLib.jsDashJodaMod.DateTimeFormatter = js.native
  var ISO_LOCAL_DATE: jsDashJodaLib.jsDashJodaMod.DateTimeFormatter = js.native
  var ISO_LOCAL_DATE_TIME: jsDashJodaLib.jsDashJodaMod.DateTimeFormatter = js.native
  var ISO_LOCAL_TIME: jsDashJodaLib.jsDashJodaMod.DateTimeFormatter = js.native
  var ISO_OFFSET_DATE_TIME: jsDashJodaLib.jsDashJodaMod.DateTimeFormatter = js.native
  var ISO_ZONED_DATE_TIME: jsDashJodaLib.jsDashJodaMod.DateTimeFormatter = js.native
  def ofPattern(pattern: java.lang.String): jsDashJodaLib.jsDashJodaMod.DateTimeFormatter = js.native
  def parsedExcessDays(): jsDashJodaLib.jsDashJodaMod.TemporalQuery = js.native
  def parsedLeapSecond(): scala.Boolean = js.native
}

