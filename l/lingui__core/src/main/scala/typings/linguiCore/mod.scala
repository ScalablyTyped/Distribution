package typings.linguiCore

import typings.linguiCore.cjsI18nMod.I18n
import typings.linguiCore.cjsI18nMod.Locales
import typings.linguiCore.cjsI18nMod.setupI18nProps
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.NumberFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lingui/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@lingui/core", "I18n")
  @js.native
  open class I18n_ protected () extends I18n {
    def this(params: setupI18nProps) = this()
  }
  
  object formats {
    
    @JSImport("@lingui/core", "formats")
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
  
  @JSImport("@lingui/core", "i18n")
  @js.native
  val i18n: I18n = js.native
  
  inline def setupI18n(): I18n = ^.asInstanceOf[js.Dynamic].applyDynamic("setupI18n")().asInstanceOf[I18n]
  inline def setupI18n(params: setupI18nProps): I18n = ^.asInstanceOf[js.Dynamic].applyDynamic("setupI18n")(params.asInstanceOf[js.Any]).asInstanceOf[I18n]
}
