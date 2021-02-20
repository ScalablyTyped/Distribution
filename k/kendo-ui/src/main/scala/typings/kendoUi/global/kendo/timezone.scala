package typings.kendoUi.global.kendo

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timezone {
  
  @JSGlobal("kendo.timezone.abbr")
  @js.native
  def abbr(targetDate: Date, timezone: String): String = js.native
  
  @JSGlobal("kendo.timezone.apply")
  @js.native
  def apply(targetDate: Date, offset: String): Date = js.native
  @JSGlobal("kendo.timezone.apply")
  @js.native
  def apply(targetDate: Date, offset: Double): Date = js.native
  
  @JSGlobal("kendo.timezone.convert")
  @js.native
  def convert(targetDate: Date, fromOffset: String, toOffset: String): Date = js.native
  @JSGlobal("kendo.timezone.convert")
  @js.native
  def convert(targetDate: Date, fromOffset: String, toOffset: Double): Date = js.native
  @JSGlobal("kendo.timezone.convert")
  @js.native
  def convert(targetDate: Date, fromOffset: Double, toOffset: String): Date = js.native
  @JSGlobal("kendo.timezone.convert")
  @js.native
  def convert(targetDate: Date, fromOffset: Double, toOffset: Double): Date = js.native
  
  @JSGlobal("kendo.timezone.offset")
  @js.native
  def offset(utcTime: Double, timezone: String): Double = js.native
  @JSGlobal("kendo.timezone.offset")
  @js.native
  def offset(utcTime: Date, timezone: String): Double = js.native
  
  @JSGlobal("kendo.timezone.remove")
  @js.native
  def remove(targetDate: Date, offset: String): Date = js.native
  @JSGlobal("kendo.timezone.remove")
  @js.native
  def remove(targetDate: Date, offset: Double): Date = js.native
  
  @JSGlobal("kendo.timezone.toLocalDate")
  @js.native
  def toLocalDate(targetDate: Double): Date = js.native
  @JSGlobal("kendo.timezone.toLocalDate")
  @js.native
  def toLocalDate(targetDate: Date): Date = js.native
}
