package typings.jsDashJoda.jsDashJodaMod

import typings.jsDashJoda.Anon_ToDate
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def convert(temporal: LocalDate): Anon_ToDate = js.native
  def convert(temporal: LocalDateTime): Anon_ToDate = js.native
  def convert(temporal: LocalDateTime, zone: ZoneId): Anon_ToDate = js.native
  def convert(temporal: LocalDate, zone: ZoneId): Anon_ToDate = js.native
  def convert(temporal: ZonedDateTime): Anon_ToDate = js.native
  def convert(temporal: ZonedDateTime, zone: ZoneId): Anon_ToDate = js.native
  def nativeJs(date: js.Any): TemporalAccessor = js.native
  def nativeJs(date: js.Any, zone: ZoneId): TemporalAccessor = js.native
  def nativeJs(date: Date): TemporalAccessor = js.native
  def nativeJs(date: Date, zone: ZoneId): TemporalAccessor = js.native
  def use(plugin: js.Function): js.Any = js.native
}

