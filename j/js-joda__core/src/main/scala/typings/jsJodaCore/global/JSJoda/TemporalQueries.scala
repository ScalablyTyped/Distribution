package typings.jsJodaCore.global.JSJoda

import typings.jsJodaCore.mod.Chronology
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TemporalQueries {
  
  @JSGlobal("JSJoda.TemporalQueries")
  @js.native
  val ^ : js.Any = js.native
  
  inline def chronology(): typings.jsJodaCore.mod.TemporalQuery[Chronology | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("chronology")().asInstanceOf[typings.jsJodaCore.mod.TemporalQuery[Chronology | Null]]
  
  inline def localDate(): typings.jsJodaCore.mod.TemporalQuery[typings.jsJodaCore.mod.LocalDate | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("localDate")().asInstanceOf[typings.jsJodaCore.mod.TemporalQuery[typings.jsJodaCore.mod.LocalDate | Null]]
  
  inline def localTime(): typings.jsJodaCore.mod.TemporalQuery[typings.jsJodaCore.mod.LocalTime | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("localTime")().asInstanceOf[typings.jsJodaCore.mod.TemporalQuery[typings.jsJodaCore.mod.LocalTime | Null]]
  
  inline def offset(): typings.jsJodaCore.mod.TemporalQuery[typings.jsJodaCore.mod.ZoneOffset | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("offset")().asInstanceOf[typings.jsJodaCore.mod.TemporalQuery[typings.jsJodaCore.mod.ZoneOffset | Null]]
  
  inline def precision(): typings.jsJodaCore.mod.TemporalQuery[typings.jsJodaCore.mod.TemporalUnit | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("precision")().asInstanceOf[typings.jsJodaCore.mod.TemporalQuery[typings.jsJodaCore.mod.TemporalUnit | Null]]
  
  inline def zone(): typings.jsJodaCore.mod.TemporalQuery[typings.jsJodaCore.mod.ZoneId | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("zone")().asInstanceOf[typings.jsJodaCore.mod.TemporalQuery[typings.jsJodaCore.mod.ZoneId | Null]]
  
  inline def zoneId(): typings.jsJodaCore.mod.TemporalQuery[typings.jsJodaCore.mod.ZoneId | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("zoneId")().asInstanceOf[typings.jsJodaCore.mod.TemporalQuery[typings.jsJodaCore.mod.ZoneId | Null]]
}
