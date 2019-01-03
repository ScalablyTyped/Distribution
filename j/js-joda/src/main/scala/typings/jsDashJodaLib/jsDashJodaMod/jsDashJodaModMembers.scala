package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", JSImport.Namespace)
@js.native
object jsDashJodaModMembers extends js.Object {
  def convert(temporal: jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDate): jsDashJodaLib.Anon_ToEpochMilli = js.native
  def convert(temporal: jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDateTime): jsDashJodaLib.Anon_ToEpochMilli = js.native
  def convert(
    temporal: jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDateTime,
    zone: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneId
  ): jsDashJodaLib.Anon_ToEpochMilli = js.native
  def convert(
    temporal: jsDashJodaLib.jsDashJodaMod.JSJodaNs.LocalDate,
    zone: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneId
  ): jsDashJodaLib.Anon_ToEpochMilli = js.native
  def convert(temporal: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZonedDateTime): jsDashJodaLib.Anon_ToEpochMilli = js.native
  def convert(
    temporal: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZonedDateTime,
    zone: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneId
  ): jsDashJodaLib.Anon_ToEpochMilli = js.native
  def nativeJs(date: js.Any): jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalAccessor = js.native
  def nativeJs(date: js.Any, zone: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneId): jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalAccessor = js.native
  def nativeJs(date: stdLib.Date): jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalAccessor = js.native
  def nativeJs(date: stdLib.Date, zone: jsDashJodaLib.jsDashJodaMod.JSJodaNs.ZoneId): jsDashJodaLib.jsDashJodaMod.JSJodaNs.TemporalAccessor = js.native
  def use(plugin: js.Function): js.Any = js.native
}

