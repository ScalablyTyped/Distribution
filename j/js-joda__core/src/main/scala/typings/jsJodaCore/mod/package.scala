package typings.jsJodaCore.mod

import typings.jsJodaCore.anon.ToDate
import typings.jsJodaCore.jsJodaCoreBooleans.`true`
import typings.jsJodaCore.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def convert(temporal: Instant): ToDate = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(temporal.asInstanceOf[js.Any]).asInstanceOf[ToDate]
inline def convert(temporal: Instant, zone: ZoneId): ToDate = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(temporal.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[ToDate]
inline def convert(temporal: LocalDate): ToDate = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(temporal.asInstanceOf[js.Any]).asInstanceOf[ToDate]
inline def convert(temporal: LocalDateTime): ToDate = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(temporal.asInstanceOf[js.Any]).asInstanceOf[ToDate]
inline def convert(temporal: LocalDateTime, zone: ZoneId): ToDate = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(temporal.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[ToDate]
inline def convert(temporal: LocalDate, zone: ZoneId): ToDate = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(temporal.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[ToDate]
inline def convert(temporal: ZonedDateTime): ToDate = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(temporal.asInstanceOf[js.Any]).asInstanceOf[ToDate]
inline def convert(temporal: ZonedDateTime, zone: ZoneId): ToDate = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(temporal.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[ToDate]

inline def esModule: `true` = ^.asInstanceOf[js.Dynamic].selectDynamic("__esModule").asInstanceOf[`true`]

inline def nativeJs(date: js.Date): TemporalAccessor = ^.asInstanceOf[js.Dynamic].applyDynamic("nativeJs")(date.asInstanceOf[js.Any]).asInstanceOf[TemporalAccessor]
inline def nativeJs(date: js.Date, zone: ZoneId): TemporalAccessor = (^.asInstanceOf[js.Dynamic].applyDynamic("nativeJs")(date.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[TemporalAccessor]
inline def nativeJs(date: Any): TemporalAccessor = ^.asInstanceOf[js.Dynamic].applyDynamic("nativeJs")(date.asInstanceOf[js.Any]).asInstanceOf[TemporalAccessor]
inline def nativeJs(date: Any, zone: ZoneId): TemporalAccessor = (^.asInstanceOf[js.Dynamic].applyDynamic("nativeJs")(date.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[TemporalAccessor]

inline def use(plugin: js.Function): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("use")(plugin.asInstanceOf[js.Any]).asInstanceOf[Any]

type Chronology = IsoChronology
