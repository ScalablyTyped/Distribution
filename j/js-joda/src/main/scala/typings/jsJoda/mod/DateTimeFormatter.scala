package typings.jsJoda.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("js-joda", "DateTimeFormatter")
@js.native
/* private */ open class DateTimeFormatter () extends StObject {
  
  def chronology(): Any = js.native
  
  def decimalStyle(): Any = js.native
  
  def format(temporal: TemporalAccessor): String = js.native
  
  def locale(): Any = js.native
  
  def parse(text: String, `type`: TemporalQuery): TemporalAccessor = js.native
  
  def parse1(text: String): TemporalAccessor = js.native
  
  def parse2(text: Any, `type`: Any): Any = js.native
  
  def parseUnresolved(text: Any, position: Any): Any = js.native
  
  def withChronology(chrono: Any): Any = js.native
  
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
  inline def ISO_INSTANT_=(x: DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISO_INSTANT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "DateTimeFormatter.ISO_LOCAL_DATE")
  @js.native
  def ISO_LOCAL_DATE: DateTimeFormatter = js.native
  inline def ISO_LOCAL_DATE_=(x: DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISO_LOCAL_DATE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "DateTimeFormatter.ISO_LOCAL_DATE_TIME")
  @js.native
  def ISO_LOCAL_DATE_TIME: DateTimeFormatter = js.native
  inline def ISO_LOCAL_DATE_TIME_=(x: DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISO_LOCAL_DATE_TIME")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "DateTimeFormatter.ISO_LOCAL_TIME")
  @js.native
  def ISO_LOCAL_TIME: DateTimeFormatter = js.native
  inline def ISO_LOCAL_TIME_=(x: DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISO_LOCAL_TIME")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "DateTimeFormatter.ISO_OFFSET_DATE_TIME")
  @js.native
  def ISO_OFFSET_DATE_TIME: DateTimeFormatter = js.native
  inline def ISO_OFFSET_DATE_TIME_=(x: DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISO_OFFSET_DATE_TIME")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "DateTimeFormatter.ISO_ZONED_DATE_TIME")
  @js.native
  def ISO_ZONED_DATE_TIME: DateTimeFormatter = js.native
  inline def ISO_ZONED_DATE_TIME_=(x: DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISO_ZONED_DATE_TIME")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def ofPattern(pattern: String): DateTimeFormatter = ^.asInstanceOf[js.Dynamic].applyDynamic("ofPattern")(pattern.asInstanceOf[js.Any]).asInstanceOf[DateTimeFormatter]
  
  /* static member */
  inline def parsedExcessDays(): TemporalQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("parsedExcessDays")().asInstanceOf[TemporalQuery]
  
  /* static member */
  inline def parsedLeapSecond(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("parsedLeapSecond")().asInstanceOf[Boolean]
}
