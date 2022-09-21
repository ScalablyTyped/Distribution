package typings.kendoUi.global.kendo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timezone {
  
  @JSGlobal("kendo.timezone")
  @js.native
  val ^ : js.Any = js.native
  
  inline def abbr(targetDate: js.Date, timezone: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("abbr")(targetDate.asInstanceOf[js.Any], timezone.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def apply(targetDate: js.Date, offset: String): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(targetDate.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def apply(targetDate: js.Date, offset: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(targetDate.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def convert(targetDate: js.Date, fromOffset: String, toOffset: String): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(targetDate.asInstanceOf[js.Any], fromOffset.asInstanceOf[js.Any], toOffset.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def convert(targetDate: js.Date, fromOffset: String, toOffset: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(targetDate.asInstanceOf[js.Any], fromOffset.asInstanceOf[js.Any], toOffset.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def convert(targetDate: js.Date, fromOffset: Double, toOffset: String): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(targetDate.asInstanceOf[js.Any], fromOffset.asInstanceOf[js.Any], toOffset.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def convert(targetDate: js.Date, fromOffset: Double, toOffset: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(targetDate.asInstanceOf[js.Any], fromOffset.asInstanceOf[js.Any], toOffset.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def offset(utcTime: js.Date, timezone: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("offset")(utcTime.asInstanceOf[js.Any], timezone.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def offset(utcTime: Double, timezone: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("offset")(utcTime.asInstanceOf[js.Any], timezone.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def remove(targetDate: js.Date, offset: String): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(targetDate.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  inline def remove(targetDate: js.Date, offset: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(targetDate.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
  inline def toLocalDate(targetDate: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("toLocalDate")(targetDate.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def toLocalDate(targetDate: Double): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("toLocalDate")(targetDate.asInstanceOf[js.Any]).asInstanceOf[js.Date]
}
