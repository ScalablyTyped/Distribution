package typings.kendoUi.global.kendo

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.timezone")
@js.native
object timezone extends js.Object {
  
  def abbr(targetDate: Date, timezone: String): String = js.native
  
  @JSName("apply")
  def apply(targetDate: Date, offset: String): Date = js.native
  @JSName("apply")
  def apply(targetDate: Date, offset: Double): Date = js.native
  
  def convert(targetDate: Date, fromOffset: String, toOffset: String): Date = js.native
  def convert(targetDate: Date, fromOffset: String, toOffset: Double): Date = js.native
  def convert(targetDate: Date, fromOffset: Double, toOffset: String): Date = js.native
  def convert(targetDate: Date, fromOffset: Double, toOffset: Double): Date = js.native
  
  def offset(utcTime: Double, timezone: String): Double = js.native
  def offset(utcTime: Date, timezone: String): Double = js.native
  
  def remove(targetDate: Date, offset: String): Date = js.native
  def remove(targetDate: Date, offset: Double): Date = js.native
  
  def toLocalDate(targetDate: Double): Date = js.native
  def toLocalDate(targetDate: Date): Date = js.native
}
