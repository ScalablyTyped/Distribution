package typings.jsJoda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  // TODO: js-joda doesn't have Chronology yet. Methods like `LocalDate.chronology()`
  // actually return an `IsoChronology` so Chronology is an alias type of that class
  // for now. Change this if Chronology is added.
  type Chronology = typings.jsJoda.mod.IsoChronology
  
  @scala.inline
  def convert(temporal: typings.jsJoda.mod.LocalDate): typings.jsJoda.anon.ToDate = typings.jsJoda.mod.^.asInstanceOf[js.Dynamic].applyDynamic("convert")(temporal.asInstanceOf[js.Any]).asInstanceOf[typings.jsJoda.anon.ToDate]
  @scala.inline
  def convert(temporal: typings.jsJoda.mod.LocalDateTime): typings.jsJoda.anon.ToDate = typings.jsJoda.mod.^.asInstanceOf[js.Dynamic].applyDynamic("convert")(temporal.asInstanceOf[js.Any]).asInstanceOf[typings.jsJoda.anon.ToDate]
  @scala.inline
  def convert(temporal: typings.jsJoda.mod.LocalDateTime, zone: typings.jsJoda.mod.ZoneId): typings.jsJoda.anon.ToDate = (typings.jsJoda.mod.^.asInstanceOf[js.Dynamic].applyDynamic("convert")(temporal.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[typings.jsJoda.anon.ToDate]
  @scala.inline
  def convert(temporal: typings.jsJoda.mod.LocalDate, zone: typings.jsJoda.mod.ZoneId): typings.jsJoda.anon.ToDate = (typings.jsJoda.mod.^.asInstanceOf[js.Dynamic].applyDynamic("convert")(temporal.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[typings.jsJoda.anon.ToDate]
  @scala.inline
  def convert(temporal: typings.jsJoda.mod.ZonedDateTime): typings.jsJoda.anon.ToDate = typings.jsJoda.mod.^.asInstanceOf[js.Dynamic].applyDynamic("convert")(temporal.asInstanceOf[js.Any]).asInstanceOf[typings.jsJoda.anon.ToDate]
  @scala.inline
  def convert(temporal: typings.jsJoda.mod.ZonedDateTime, zone: typings.jsJoda.mod.ZoneId): typings.jsJoda.anon.ToDate = (typings.jsJoda.mod.^.asInstanceOf[js.Dynamic].applyDynamic("convert")(temporal.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[typings.jsJoda.anon.ToDate]
  
  @scala.inline
  def nativeJs(date: js.Any): typings.jsJoda.mod.TemporalAccessor = typings.jsJoda.mod.^.asInstanceOf[js.Dynamic].applyDynamic("nativeJs")(date.asInstanceOf[js.Any]).asInstanceOf[typings.jsJoda.mod.TemporalAccessor]
  @scala.inline
  def nativeJs(date: js.Any, zone: typings.jsJoda.mod.ZoneId): typings.jsJoda.mod.TemporalAccessor = (typings.jsJoda.mod.^.asInstanceOf[js.Dynamic].applyDynamic("nativeJs")(date.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[typings.jsJoda.mod.TemporalAccessor]
  @scala.inline
  def nativeJs(date: typings.std.Date): typings.jsJoda.mod.TemporalAccessor = typings.jsJoda.mod.^.asInstanceOf[js.Dynamic].applyDynamic("nativeJs")(date.asInstanceOf[js.Any]).asInstanceOf[typings.jsJoda.mod.TemporalAccessor]
  @scala.inline
  def nativeJs(date: typings.std.Date, zone: typings.jsJoda.mod.ZoneId): typings.jsJoda.mod.TemporalAccessor = (typings.jsJoda.mod.^.asInstanceOf[js.Dynamic].applyDynamic("nativeJs")(date.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[typings.jsJoda.mod.TemporalAccessor]
  
  @scala.inline
  def use(plugin: js.Function): js.Any = typings.jsJoda.mod.^.asInstanceOf[js.Dynamic].applyDynamic("use")(plugin.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
