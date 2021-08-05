package typings.i18nAbide

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.i18nAbide.anon.Error
import typings.i18nAbide.anon.Lang
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("i18n-abide", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def abide(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("abide")().asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  inline def abide(options: AbideOptions): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("abide")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  inline def bestLanguage(languages: js.Array[Lang], supported_languages: js.Array[String], defaultLanguage: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("bestLanguage")(languages.asInstanceOf[js.Any], supported_languages.asInstanceOf[js.Any], defaultLanguage.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def format(fmt: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(fmt.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def format(fmt: String, obj: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(fmt.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(fmt: String, obj: js.Any, named: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(fmt.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], named.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(fmt: String, obj: Unit, named: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(fmt.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], named.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getLocales(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocales")().asInstanceOf[js.Array[String]]
  
  inline def languageFrom(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("languageFrom")().asInstanceOf[String]
  inline def languageFrom(locale: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("languageFrom")(locale.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def localeFrom(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("localeFrom")().asInstanceOf[String]
  inline def localeFrom(language: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("localeFrom")(language.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def normalizeLanguage(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeLanguage")().asInstanceOf[String]
  inline def normalizeLanguage(language: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeLanguage")(language.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def normalizeLocale(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeLocale")().asInstanceOf[String]
  inline def normalizeLocale(locale: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeLocale")(locale.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parseAcceptLanguage(): js.Array[Lang] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseAcceptLanguage")().asInstanceOf[js.Array[Lang]]
  inline def parseAcceptLanguage(header: String): js.Array[Lang] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseAcceptLanguage")(header.asInstanceOf[js.Any]).asInstanceOf[js.Array[Lang]]
  
  trait AbideOptions extends StObject {
    
    var debug_lang: js.UndefOr[String] = js.undefined
    
    var default_lang: js.UndefOr[String] = js.undefined
    
    var disable_locale_check: js.UndefOr[Boolean] = js.undefined
    
    var gettext_alias: js.UndefOr[String] = js.undefined
    
    var logger: js.UndefOr[Error] = js.undefined
    
    var supported_languages: js.UndefOr[js.Array[String]] = js.undefined
    
    var translation_directory: js.UndefOr[String] = js.undefined
  }
  object AbideOptions {
    
    inline def apply(): AbideOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AbideOptions]
    }
    
    extension [Self <: AbideOptions](x: Self) {
      
      inline def setDebug_lang(value: String): Self = StObject.set(x, "debug_lang", value.asInstanceOf[js.Any])
      
      inline def setDebug_langUndefined: Self = StObject.set(x, "debug_lang", js.undefined)
      
      inline def setDefault_lang(value: String): Self = StObject.set(x, "default_lang", value.asInstanceOf[js.Any])
      
      inline def setDefault_langUndefined: Self = StObject.set(x, "default_lang", js.undefined)
      
      inline def setDisable_locale_check(value: Boolean): Self = StObject.set(x, "disable_locale_check", value.asInstanceOf[js.Any])
      
      inline def setDisable_locale_checkUndefined: Self = StObject.set(x, "disable_locale_check", js.undefined)
      
      inline def setGettext_alias(value: String): Self = StObject.set(x, "gettext_alias", value.asInstanceOf[js.Any])
      
      inline def setGettext_aliasUndefined: Self = StObject.set(x, "gettext_alias", js.undefined)
      
      inline def setLogger(value: Error): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setSupported_languages(value: js.Array[String]): Self = StObject.set(x, "supported_languages", value.asInstanceOf[js.Any])
      
      inline def setSupported_languagesUndefined: Self = StObject.set(x, "supported_languages", js.undefined)
      
      inline def setSupported_languagesVarargs(value: String*): Self = StObject.set(x, "supported_languages", js.Array(value :_*))
      
      inline def setTranslation_directory(value: String): Self = StObject.set(x, "translation_directory", value.asInstanceOf[js.Any])
      
      inline def setTranslation_directoryUndefined: Self = StObject.set(x, "translation_directory", js.undefined)
    }
  }
}
