package typings.jsJoda.mod

import typings.jsJoda.anon.ToDate
import typings.jsJoda.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def convert(temporal: LocalDate): ToDate = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(temporal.asInstanceOf[js.Any]).asInstanceOf[ToDate]
inline def convert(temporal: LocalDateTime): ToDate = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(temporal.asInstanceOf[js.Any]).asInstanceOf[ToDate]
inline def convert(temporal: LocalDateTime, zone: ZoneId): ToDate = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(temporal.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[ToDate]
inline def convert(temporal: LocalDate, zone: ZoneId): ToDate = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(temporal.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[ToDate]
inline def convert(temporal: ZonedDateTime): ToDate = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(temporal.asInstanceOf[js.Any]).asInstanceOf[ToDate]
inline def convert(temporal: ZonedDateTime, zone: ZoneId): ToDate = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(temporal.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[ToDate]

inline def nativeJs(date: js.Date): TemporalAccessor = ^.asInstanceOf[js.Dynamic].applyDynamic("nativeJs")(date.asInstanceOf[js.Any]).asInstanceOf[TemporalAccessor]
inline def nativeJs(date: js.Date, zone: ZoneId): TemporalAccessor = (^.asInstanceOf[js.Dynamic].applyDynamic("nativeJs")(date.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[TemporalAccessor]
inline def nativeJs(date: Any): TemporalAccessor = ^.asInstanceOf[js.Dynamic].applyDynamic("nativeJs")(date.asInstanceOf[js.Any]).asInstanceOf[TemporalAccessor]
inline def nativeJs(date: Any, zone: ZoneId): TemporalAccessor = (^.asInstanceOf[js.Dynamic].applyDynamic("nativeJs")(date.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[TemporalAccessor]

inline def use(plugin: js.Function): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("use")(plugin.asInstanceOf[js.Any]).asInstanceOf[Any]

// TODO: js-joda doesn't have Chronology yet. Methods like `LocalDate.chronology()`
// actually return an `IsoChronology` so Chronology is an alias type of that class
// for now. Change this if Chronology is added.
type Chronology = IsoChronology
