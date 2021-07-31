package typings.kendoUi.global.kendo

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timezone {
  
  @JSGlobal("kendo.timezone")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def abbr(targetDate: Date, timezone: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("abbr")(targetDate.asInstanceOf[js.Any], timezone.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def apply(targetDate: Date, offset: String): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(targetDate.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def apply(targetDate: Date, offset: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(targetDate.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def convert(targetDate: Date, fromOffset: String, toOffset: String): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(targetDate.asInstanceOf[js.Any], fromOffset.asInstanceOf[js.Any], toOffset.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def convert(targetDate: Date, fromOffset: String, toOffset: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(targetDate.asInstanceOf[js.Any], fromOffset.asInstanceOf[js.Any], toOffset.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def convert(targetDate: Date, fromOffset: Double, toOffset: String): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(targetDate.asInstanceOf[js.Any], fromOffset.asInstanceOf[js.Any], toOffset.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def convert(targetDate: Date, fromOffset: Double, toOffset: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(targetDate.asInstanceOf[js.Any], fromOffset.asInstanceOf[js.Any], toOffset.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def offset(utcTime: Double, timezone: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("offset")(utcTime.asInstanceOf[js.Any], timezone.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def offset(utcTime: Date, timezone: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("offset")(utcTime.asInstanceOf[js.Any], timezone.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def remove(targetDate: Date, offset: String): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(targetDate.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Date]
  @scala.inline
  def remove(targetDate: Date, offset: Double): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(targetDate.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  @scala.inline
  def toLocalDate(targetDate: Double): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("toLocalDate")(targetDate.asInstanceOf[js.Any]).asInstanceOf[Date]
  @scala.inline
  def toLocalDate(targetDate: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("toLocalDate")(targetDate.asInstanceOf[js.Any]).asInstanceOf[Date]
}
