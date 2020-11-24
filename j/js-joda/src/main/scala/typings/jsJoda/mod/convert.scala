package typings.jsJoda.mod

import typings.jsJoda.anon.ToDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("js-joda", "convert")
@js.native
object convert extends js.Object {
  
  def apply(temporal: LocalDate): ToDate = js.native
  def apply(temporal: LocalDateTime): ToDate = js.native
  def apply(temporal: LocalDateTime, zone: ZoneId): ToDate = js.native
  def apply(temporal: LocalDate, zone: ZoneId): ToDate = js.native
  def apply(temporal: ZonedDateTime): ToDate = js.native
  def apply(temporal: ZonedDateTime, zone: ZoneId): ToDate = js.native
}
