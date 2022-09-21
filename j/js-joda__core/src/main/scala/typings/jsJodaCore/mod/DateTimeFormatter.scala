package typings.jsJodaCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@js-joda/core", "DateTimeFormatter")
@js.native
/* private */ open class DateTimeFormatter () extends StObject {
  
  def chronology(): Chronology | Null = js.native
  
  def decimalStyle(): DecimalStyle = js.native
  
  def format(temporal: TemporalAccessor): String = js.native
  
  def parse(text: String): TemporalAccessor = js.native
  def parse[T](text: String, query: TemporalQuery[T]): T = js.native
  
  def parseUnresolved(text: String, position: ParsePosition): TemporalAccessor = js.native
  
  def withChronology(chrono: Chronology): DateTimeFormatter = js.native
  
  def withResolverStyle(resolverStyle: ResolverStyle): DateTimeFormatter = js.native
}
/* static members */
object DateTimeFormatter {
  
  @JSImport("@js-joda/core", "DateTimeFormatter")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@js-joda/core", "DateTimeFormatter.ISO_INSTANT")
  @js.native
  def ISO_INSTANT: DateTimeFormatter = js.native
  inline def ISO_INSTANT_=(x: DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISO_INSTANT")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "DateTimeFormatter.ISO_LOCAL_DATE")
  @js.native
  def ISO_LOCAL_DATE: DateTimeFormatter = js.native
  inline def ISO_LOCAL_DATE_=(x: DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISO_LOCAL_DATE")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "DateTimeFormatter.ISO_LOCAL_DATE_TIME")
  @js.native
  def ISO_LOCAL_DATE_TIME: DateTimeFormatter = js.native
  inline def ISO_LOCAL_DATE_TIME_=(x: DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISO_LOCAL_DATE_TIME")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "DateTimeFormatter.ISO_LOCAL_TIME")
  @js.native
  def ISO_LOCAL_TIME: DateTimeFormatter = js.native
  inline def ISO_LOCAL_TIME_=(x: DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISO_LOCAL_TIME")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "DateTimeFormatter.ISO_OFFSET_DATE_TIME")
  @js.native
  def ISO_OFFSET_DATE_TIME: DateTimeFormatter = js.native
  inline def ISO_OFFSET_DATE_TIME_=(x: DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISO_OFFSET_DATE_TIME")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "DateTimeFormatter.ISO_OFFSET_TIME")
  @js.native
  def ISO_OFFSET_TIME: DateTimeFormatter = js.native
  inline def ISO_OFFSET_TIME_=(x: DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISO_OFFSET_TIME")(x.asInstanceOf[js.Any])
  
  @JSImport("@js-joda/core", "DateTimeFormatter.ISO_ZONED_DATE_TIME")
  @js.native
  def ISO_ZONED_DATE_TIME: DateTimeFormatter = js.native
  inline def ISO_ZONED_DATE_TIME_=(x: DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISO_ZONED_DATE_TIME")(x.asInstanceOf[js.Any])
  
  inline def ofPattern(pattern: String): DateTimeFormatter = ^.asInstanceOf[js.Dynamic].applyDynamic("ofPattern")(pattern.asInstanceOf[js.Any]).asInstanceOf[DateTimeFormatter]
  
  inline def parsedExcessDays(): TemporalQuery[Period] = ^.asInstanceOf[js.Dynamic].applyDynamic("parsedExcessDays")().asInstanceOf[TemporalQuery[Period]]
  
  inline def parsedLeapSecond(): TemporalQuery[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("parsedLeapSecond")().asInstanceOf[TemporalQuery[Boolean]]
}
