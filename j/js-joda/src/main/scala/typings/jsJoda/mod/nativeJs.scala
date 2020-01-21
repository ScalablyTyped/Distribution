package typings.jsJoda.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-joda", "nativeJs")
@js.native
object nativeJs extends js.Object {
  def apply(date: js.Any): TemporalAccessor = js.native
  def apply(date: js.Any, zone: ZoneId): TemporalAccessor = js.native
  def apply(date: Date): TemporalAccessor = js.native
  def apply(date: Date, zone: ZoneId): TemporalAccessor = js.native
}

