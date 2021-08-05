package typings.linguiCore

import typings.linguiCore.i18nMod.setupI18nProps
import typings.std.Date
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
  class I18n_ ()
    extends typings.linguiCore.i18nMod.I18n_
  
  inline def date(language: String): js.Function1[/* value */ Date, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("date")(language.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ Date, String]]
  inline def date(language: String, format: DateTimeFormatOptions): js.Function1[/* value */ Date, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("date")(language.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* value */ Date, String]]
  
  @JSImport("@lingui/core", "i18n")
  @js.native
  val i18n: typings.linguiCore.i18nMod.I18n_ = js.native
  
  inline def i18nMark(id: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("i18nMark")(id.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def number(language: String): js.Function1[/* value */ Double, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("number")(language.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ Double, String]]
  inline def number(language: String, format: NumberFormatOptions): js.Function1[/* value */ Double, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(language.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* value */ Double, String]]
  
  inline def setupI18n(): typings.linguiCore.i18nMod.I18n_ = ^.asInstanceOf[js.Dynamic].applyDynamic("setupI18n")().asInstanceOf[typings.linguiCore.i18nMod.I18n_]
  inline def setupI18n(params: setupI18nProps): typings.linguiCore.i18nMod.I18n_ = ^.asInstanceOf[js.Dynamic].applyDynamic("setupI18n")(params.asInstanceOf[js.Any]).asInstanceOf[typings.linguiCore.i18nMod.I18n_]
}
