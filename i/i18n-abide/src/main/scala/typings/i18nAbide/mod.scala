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
  
  @scala.inline
  def abide(): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("abide")().asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  @scala.inline
  def abide(options: AbideOptions): RequestHandler[ParamsDictionary, js.Any, js.Any, Query] = ^.asInstanceOf[js.Dynamic].applyDynamic("abide")(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]
  
  @scala.inline
  def bestLanguage(languages: js.Array[Lang], supported_languages: js.Array[String], defaultLanguage: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("bestLanguage")(languages.asInstanceOf[js.Any], supported_languages.asInstanceOf[js.Any], defaultLanguage.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def format(fmt: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(fmt.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def format(fmt: String, obj: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(fmt.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def format(fmt: String, obj: js.Any, named: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(fmt.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], named.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def format(fmt: String, obj: Unit, named: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(fmt.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], named.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getLocales(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocales")().asInstanceOf[js.Array[String]]
  
  @scala.inline
  def languageFrom(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("languageFrom")().asInstanceOf[String]
  @scala.inline
  def languageFrom(locale: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("languageFrom")(locale.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def localeFrom(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("localeFrom")().asInstanceOf[String]
  @scala.inline
  def localeFrom(language: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("localeFrom")(language.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def normalizeLanguage(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeLanguage")().asInstanceOf[String]
  @scala.inline
  def normalizeLanguage(language: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeLanguage")(language.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def normalizeLocale(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeLocale")().asInstanceOf[String]
  @scala.inline
  def normalizeLocale(locale: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeLocale")(locale.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def parseAcceptLanguage(): js.Array[Lang] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseAcceptLanguage")().asInstanceOf[js.Array[Lang]]
  @scala.inline
  def parseAcceptLanguage(header: String): js.Array[Lang] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseAcceptLanguage")(header.asInstanceOf[js.Any]).asInstanceOf[js.Array[Lang]]
  
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
    
    @scala.inline
    def apply(): AbideOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AbideOptions]
    }
    
    @scala.inline
    implicit class AbideOptionsMutableBuilder[Self <: AbideOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug_lang(value: String): Self = StObject.set(x, "debug_lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebug_langUndefined: Self = StObject.set(x, "debug_lang", js.undefined)
      
      @scala.inline
      def setDefault_lang(value: String): Self = StObject.set(x, "default_lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefault_langUndefined: Self = StObject.set(x, "default_lang", js.undefined)
      
      @scala.inline
      def setDisable_locale_check(value: Boolean): Self = StObject.set(x, "disable_locale_check", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisable_locale_checkUndefined: Self = StObject.set(x, "disable_locale_check", js.undefined)
      
      @scala.inline
      def setGettext_alias(value: String): Self = StObject.set(x, "gettext_alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGettext_aliasUndefined: Self = StObject.set(x, "gettext_alias", js.undefined)
      
      @scala.inline
      def setLogger(value: Error): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setSupported_languages(value: js.Array[String]): Self = StObject.set(x, "supported_languages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupported_languagesUndefined: Self = StObject.set(x, "supported_languages", js.undefined)
      
      @scala.inline
      def setSupported_languagesVarargs(value: String*): Self = StObject.set(x, "supported_languages", js.Array(value :_*))
      
      @scala.inline
      def setTranslation_directory(value: String): Self = StObject.set(x, "translation_directory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslation_directoryUndefined: Self = StObject.set(x, "translation_directory", js.undefined)
    }
  }
}
