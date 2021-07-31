package typings.jsJoda.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("js-joda", "DateTimeFormatter")
@js.native
class DateTimeFormatter protected () extends StObject {
  
  def chronology(): js.Any = js.native
  
  def decimalStyle(): js.Any = js.native
  
  def format(temporal: TemporalAccessor): String = js.native
  
  def locale(): js.Any = js.native
  
  def parse(text: String, `type`: TemporalQuery): TemporalAccessor = js.native
  
  def parse1(text: String): TemporalAccessor = js.native
  
  def parse2(text: js.Any, `type`: js.Any): js.Any = js.native
  
  def parseUnresolved(text: js.Any, position: js.Any): js.Any = js.native
  
  def withChronology(chrono: js.Any): js.Any = js.native
  
  def withLocale(locale: Locale): DateTimeFormatter = js.native
  
  def withResolverStyle(resolverStyle: ResolverStyle): DateTimeFormatter = js.native
}
object DateTimeFormatter {
  
  @JSImport("js-joda", "DateTimeFormatter")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("js-joda", "DateTimeFormatter.ISO_INSTANT")
  @js.native
  def ISO_INSTANT: DateTimeFormatter = js.native
  @scala.inline
  def ISO_INSTANT_=(x: DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISO_INSTANT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "DateTimeFormatter.ISO_LOCAL_DATE")
  @js.native
  def ISO_LOCAL_DATE: DateTimeFormatter = js.native
  @scala.inline
  def ISO_LOCAL_DATE_=(x: DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISO_LOCAL_DATE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "DateTimeFormatter.ISO_LOCAL_DATE_TIME")
  @js.native
  def ISO_LOCAL_DATE_TIME: DateTimeFormatter = js.native
  @scala.inline
  def ISO_LOCAL_DATE_TIME_=(x: DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISO_LOCAL_DATE_TIME")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "DateTimeFormatter.ISO_LOCAL_TIME")
  @js.native
  def ISO_LOCAL_TIME: DateTimeFormatter = js.native
  @scala.inline
  def ISO_LOCAL_TIME_=(x: DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISO_LOCAL_TIME")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "DateTimeFormatter.ISO_OFFSET_DATE_TIME")
  @js.native
  def ISO_OFFSET_DATE_TIME: DateTimeFormatter = js.native
  @scala.inline
  def ISO_OFFSET_DATE_TIME_=(x: DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISO_OFFSET_DATE_TIME")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "DateTimeFormatter.ISO_ZONED_DATE_TIME")
  @js.native
  def ISO_ZONED_DATE_TIME: DateTimeFormatter = js.native
  @scala.inline
  def ISO_ZONED_DATE_TIME_=(x: DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISO_ZONED_DATE_TIME")(x.asInstanceOf[js.Any])
  
  /* static member */
  @scala.inline
  def ofPattern(pattern: String): DateTimeFormatter = ^.asInstanceOf[js.Dynamic].applyDynamic("ofPattern")(pattern.asInstanceOf[js.Any]).asInstanceOf[DateTimeFormatter]
  
  /* static member */
  @scala.inline
  def parsedExcessDays(): TemporalQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("parsedExcessDays")().asInstanceOf[TemporalQuery]
  
  /* static member */
  @scala.inline
  def parsedLeapSecond(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("parsedLeapSecond")().asInstanceOf[Boolean]
}
