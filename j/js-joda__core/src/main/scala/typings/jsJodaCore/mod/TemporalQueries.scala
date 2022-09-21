package typings.jsJodaCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TemporalQueries {
  
  @JSImport("@js-joda/core", "TemporalQueries")
  @js.native
  val ^ : js.Any = js.native
  
  inline def chronology(): TemporalQuery[Chronology | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("chronology")().asInstanceOf[TemporalQuery[Chronology | Null]]
  
  inline def localDate(): TemporalQuery[LocalDate | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("localDate")().asInstanceOf[TemporalQuery[LocalDate | Null]]
  
  inline def localTime(): TemporalQuery[LocalTime | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("localTime")().asInstanceOf[TemporalQuery[LocalTime | Null]]
  
  inline def offset(): TemporalQuery[ZoneOffset | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("offset")().asInstanceOf[TemporalQuery[ZoneOffset | Null]]
  
  inline def precision(): TemporalQuery[TemporalUnit | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("precision")().asInstanceOf[TemporalQuery[TemporalUnit | Null]]
  
  inline def zone(): TemporalQuery[ZoneId | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("zone")().asInstanceOf[TemporalQuery[ZoneId | Null]]
  
  inline def zoneId(): TemporalQuery[ZoneId | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("zoneId")().asInstanceOf[TemporalQuery[ZoneId | Null]]
}
