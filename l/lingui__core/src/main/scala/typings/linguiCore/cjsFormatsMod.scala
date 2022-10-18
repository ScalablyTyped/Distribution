package typings.linguiCore

import typings.linguiCore.cjsI18nMod.Locales
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.NumberFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsFormatsMod {
  
  @JSImport("@lingui/core/cjs/formats", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def date(locales: Locales): js.Function1[/* value */ String | js.Date, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("date")(locales.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ String | js.Date, String]]
  inline def date(locales: Locales, format: Unit, memoize: Boolean): js.Function1[/* value */ String | js.Date, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("date")(locales.asInstanceOf[js.Any], format.asInstanceOf[js.Any], memoize.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* value */ String | js.Date, String]]
  inline def date(locales: Locales, format: DateTimeFormatOptions): js.Function1[/* value */ String | js.Date, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("date")(locales.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* value */ String | js.Date, String]]
  inline def date(locales: Locales, format: DateTimeFormatOptions, memoize: Boolean): js.Function1[/* value */ String | js.Date, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("date")(locales.asInstanceOf[js.Any], format.asInstanceOf[js.Any], memoize.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* value */ String | js.Date, String]]
  
  inline def number(locales: Locales): js.Function1[/* value */ Double, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("number")(locales.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ Double, String]]
  inline def number(locales: Locales, format: Unit, memoize: Boolean): js.Function1[/* value */ Double, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(locales.asInstanceOf[js.Any], format.asInstanceOf[js.Any], memoize.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* value */ Double, String]]
  inline def number(locales: Locales, format: NumberFormatOptions): js.Function1[/* value */ Double, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(locales.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* value */ Double, String]]
  inline def number(locales: Locales, format: NumberFormatOptions, memoize: Boolean): js.Function1[/* value */ Double, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(locales.asInstanceOf[js.Any], format.asInstanceOf[js.Any], memoize.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* value */ Double, String]]
}
