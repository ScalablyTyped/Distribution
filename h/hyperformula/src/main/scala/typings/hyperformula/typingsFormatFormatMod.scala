package typings.hyperformula

import typings.hyperformula.typingsConfigMod.Config
import typings.hyperformula.typingsDateTimeHelperMod.DateTimeHelper
import typings.hyperformula.typingsDateTimeHelperMod.SimpleDateTime
import typings.hyperformula.typingsDateTimeHelperMod.SimpleTime
import typings.hyperformula.typingsInterpreterInterpreterValueMod.RawScalarValue
import typings.hyperformula.typingsMaybeMod.Maybe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsFormatFormatMod {
  
  @JSImport("hyperformula/typings/format/format", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultStringifyDateTime(dateTime: SimpleDateTime, formatArg: String): Maybe[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultStringifyDateTime")(dateTime.asInstanceOf[js.Any], formatArg.asInstanceOf[js.Any])).asInstanceOf[Maybe[String]]
  
  inline def defaultStringifyDuration(time: SimpleTime, formatArg: String): Maybe[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultStringifyDuration")(time.asInstanceOf[js.Any], formatArg.asInstanceOf[js.Any])).asInstanceOf[Maybe[String]]
  
  inline def format(value: Double, formatArg: String, config: Config, dateHelper: DateTimeHelper): RawScalarValue = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(value.asInstanceOf[js.Any], formatArg.asInstanceOf[js.Any], config.asInstanceOf[js.Any], dateHelper.asInstanceOf[js.Any])).asInstanceOf[RawScalarValue]
  
  inline def padLeft(number: String, size: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("padLeft")(number.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def padLeft(number: Double, size: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("padLeft")(number.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def padRight(number: String, size: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("padRight")(number.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def padRight(number: Double, size: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("padRight")(number.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[String]
}
