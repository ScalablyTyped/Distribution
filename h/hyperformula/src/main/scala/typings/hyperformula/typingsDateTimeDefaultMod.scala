package typings.hyperformula

import typings.hyperformula.typingsDateTimeHelperMod.DateTime
import typings.hyperformula.typingsMaybeMod.Maybe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsDateTimeDefaultMod {
  
  @JSImport("hyperformula/typings/DateTimeDefault", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultParseToDateTime(dateTimeString: String): Maybe[DateTime] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultParseToDateTime")(dateTimeString.asInstanceOf[js.Any]).asInstanceOf[Maybe[DateTime]]
  inline def defaultParseToDateTime(dateTimeString: String, dateFormat: String): Maybe[DateTime] = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultParseToDateTime")(dateTimeString.asInstanceOf[js.Any], dateFormat.asInstanceOf[js.Any])).asInstanceOf[Maybe[DateTime]]
  inline def defaultParseToDateTime(dateTimeString: String, dateFormat: String, timeFormat: String): Maybe[DateTime] = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultParseToDateTime")(dateTimeString.asInstanceOf[js.Any], dateFormat.asInstanceOf[js.Any], timeFormat.asInstanceOf[js.Any])).asInstanceOf[Maybe[DateTime]]
  inline def defaultParseToDateTime(dateTimeString: String, dateFormat: Unit, timeFormat: String): Maybe[DateTime] = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultParseToDateTime")(dateTimeString.asInstanceOf[js.Any], dateFormat.asInstanceOf[js.Any], timeFormat.asInstanceOf[js.Any])).asInstanceOf[Maybe[DateTime]]
  
  @JSImport("hyperformula/typings/DateTimeDefault", "secondsExtendedRegexp")
  @js.native
  val secondsExtendedRegexp: js.RegExp = js.native
}
