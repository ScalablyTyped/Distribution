package typings.linguiCore

import typings.std.Date
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.NumberFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatsMod {
  
  @JSImport("@lingui/core/formats", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def date(language: String): js.Function1[/* value */ Date, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("date")(language.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ Date, String]]
  inline def date(language: String, format: DateTimeFormatOptions): js.Function1[/* value */ Date, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("date")(language.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* value */ Date, String]]
  
  inline def number(language: String): js.Function1[/* value */ Double, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("number")(language.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ Double, String]]
  inline def number(language: String, format: NumberFormatOptions): js.Function1[/* value */ Double, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(language.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* value */ Double, String]]
}
