package typings
package jsDashJodaLib.jsDashJodaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def convert(temporal: LocalDate): jsDashJodaLib.Anon_ToDate = js.native
  def convert(temporal: LocalDateTime): jsDashJodaLib.Anon_ToDate = js.native
  def convert(temporal: LocalDateTime, zone: ZoneId): jsDashJodaLib.Anon_ToDate = js.native
  def convert(temporal: LocalDate, zone: ZoneId): jsDashJodaLib.Anon_ToDate = js.native
  def convert(temporal: ZonedDateTime): jsDashJodaLib.Anon_ToDate = js.native
  def convert(temporal: ZonedDateTime, zone: ZoneId): jsDashJodaLib.Anon_ToDate = js.native
  def nativeJs(date: js.Any): TemporalAccessor = js.native
  def nativeJs(date: js.Any, zone: ZoneId): TemporalAccessor = js.native
  def nativeJs(date: stdLib.Date): TemporalAccessor = js.native
  def nativeJs(date: stdLib.Date, zone: ZoneId): TemporalAccessor = js.native
  def use(plugin: js.Function): js.Any = js.native
}

