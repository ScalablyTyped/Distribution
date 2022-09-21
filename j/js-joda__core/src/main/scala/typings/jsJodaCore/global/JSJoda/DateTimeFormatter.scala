package typings.jsJodaCore.global.JSJoda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("JSJoda.DateTimeFormatter")
@js.native
/* private */ open class DateTimeFormatter ()
  extends typings.jsJodaCore.mod.DateTimeFormatter
/* static members */
object DateTimeFormatter {
  
  @JSGlobal("JSJoda.DateTimeFormatter")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("JSJoda.DateTimeFormatter.ISO_INSTANT")
  @js.native
  def ISO_INSTANT: typings.jsJodaCore.mod.DateTimeFormatter = js.native
  inline def ISO_INSTANT_=(x: typings.jsJodaCore.mod.DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISO_INSTANT")(x.asInstanceOf[js.Any])
  
  @JSGlobal("JSJoda.DateTimeFormatter.ISO_LOCAL_DATE")
  @js.native
  def ISO_LOCAL_DATE: typings.jsJodaCore.mod.DateTimeFormatter = js.native
  inline def ISO_LOCAL_DATE_=(x: typings.jsJodaCore.mod.DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISO_LOCAL_DATE")(x.asInstanceOf[js.Any])
  
  @JSGlobal("JSJoda.DateTimeFormatter.ISO_LOCAL_DATE_TIME")
  @js.native
  def ISO_LOCAL_DATE_TIME: typings.jsJodaCore.mod.DateTimeFormatter = js.native
  inline def ISO_LOCAL_DATE_TIME_=(x: typings.jsJodaCore.mod.DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISO_LOCAL_DATE_TIME")(x.asInstanceOf[js.Any])
  
  @JSGlobal("JSJoda.DateTimeFormatter.ISO_LOCAL_TIME")
  @js.native
  def ISO_LOCAL_TIME: typings.jsJodaCore.mod.DateTimeFormatter = js.native
  inline def ISO_LOCAL_TIME_=(x: typings.jsJodaCore.mod.DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISO_LOCAL_TIME")(x.asInstanceOf[js.Any])
  
  @JSGlobal("JSJoda.DateTimeFormatter.ISO_OFFSET_DATE_TIME")
  @js.native
  def ISO_OFFSET_DATE_TIME: typings.jsJodaCore.mod.DateTimeFormatter = js.native
  inline def ISO_OFFSET_DATE_TIME_=(x: typings.jsJodaCore.mod.DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISO_OFFSET_DATE_TIME")(x.asInstanceOf[js.Any])
  
  @JSGlobal("JSJoda.DateTimeFormatter.ISO_OFFSET_TIME")
  @js.native
  def ISO_OFFSET_TIME: typings.jsJodaCore.mod.DateTimeFormatter = js.native
  inline def ISO_OFFSET_TIME_=(x: typings.jsJodaCore.mod.DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISO_OFFSET_TIME")(x.asInstanceOf[js.Any])
  
  @JSGlobal("JSJoda.DateTimeFormatter.ISO_ZONED_DATE_TIME")
  @js.native
  def ISO_ZONED_DATE_TIME: typings.jsJodaCore.mod.DateTimeFormatter = js.native
  inline def ISO_ZONED_DATE_TIME_=(x: typings.jsJodaCore.mod.DateTimeFormatter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISO_ZONED_DATE_TIME")(x.asInstanceOf[js.Any])
  
  inline def ofPattern(pattern: String): typings.jsJodaCore.mod.DateTimeFormatter = ^.asInstanceOf[js.Dynamic].applyDynamic("ofPattern")(pattern.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.DateTimeFormatter]
  
  inline def parsedExcessDays(): typings.jsJodaCore.mod.TemporalQuery[typings.jsJodaCore.mod.Period] = ^.asInstanceOf[js.Dynamic].applyDynamic("parsedExcessDays")().asInstanceOf[typings.jsJodaCore.mod.TemporalQuery[typings.jsJodaCore.mod.Period]]
  
  inline def parsedLeapSecond(): typings.jsJodaCore.mod.TemporalQuery[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("parsedLeapSecond")().asInstanceOf[typings.jsJodaCore.mod.TemporalQuery[Boolean]]
}
