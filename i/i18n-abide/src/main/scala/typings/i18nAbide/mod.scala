package typings.i18nAbide

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.i18nAbide.anon.Error
import typings.i18nAbide.anon.Lang
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("i18n-abide", "abide")
  @js.native
  def abide(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  @JSImport("i18n-abide", "abide")
  @js.native
  def abide(options: AbideOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  @JSImport("i18n-abide", "bestLanguage")
  @js.native
  def bestLanguage(languages: js.Array[Lang], supported_languages: js.Array[String], defaultLanguage: String): String = js.native
  
  @JSImport("i18n-abide", "format")
  @js.native
  def format(fmt: String): String = js.native
  @JSImport("i18n-abide", "format")
  @js.native
  def format(fmt: String, obj: js.UndefOr[scala.Nothing], named: Boolean): String = js.native
  @JSImport("i18n-abide", "format")
  @js.native
  def format(fmt: String, obj: js.Any): String = js.native
  @JSImport("i18n-abide", "format")
  @js.native
  def format(fmt: String, obj: js.Any, named: Boolean): String = js.native
  
  @JSImport("i18n-abide", "getLocales")
  @js.native
  def getLocales(): js.Array[String] = js.native
  
  @JSImport("i18n-abide", "languageFrom")
  @js.native
  def languageFrom(): String = js.native
  @JSImport("i18n-abide", "languageFrom")
  @js.native
  def languageFrom(locale: String): String = js.native
  
  @JSImport("i18n-abide", "localeFrom")
  @js.native
  def localeFrom(): String = js.native
  @JSImport("i18n-abide", "localeFrom")
  @js.native
  def localeFrom(language: String): String = js.native
  
  @JSImport("i18n-abide", "normalizeLanguage")
  @js.native
  def normalizeLanguage(): String = js.native
  @JSImport("i18n-abide", "normalizeLanguage")
  @js.native
  def normalizeLanguage(language: String): String = js.native
  
  @JSImport("i18n-abide", "normalizeLocale")
  @js.native
  def normalizeLocale(): String = js.native
  @JSImport("i18n-abide", "normalizeLocale")
  @js.native
  def normalizeLocale(locale: String): String = js.native
  
  @JSImport("i18n-abide", "parseAcceptLanguage")
  @js.native
  def parseAcceptLanguage(): js.Array[Lang] = js.native
  @JSImport("i18n-abide", "parseAcceptLanguage")
  @js.native
  def parseAcceptLanguage(header: String): js.Array[Lang] = js.native
  
  @js.native
  trait AbideOptions extends StObject {
    
    var debug_lang: js.UndefOr[String] = js.native
    
    var default_lang: js.UndefOr[String] = js.native
    
    var disable_locale_check: js.UndefOr[Boolean] = js.native
    
    var gettext_alias: js.UndefOr[String] = js.native
    
    var logger: js.UndefOr[Error] = js.native
    
    var supported_languages: js.UndefOr[js.Array[String]] = js.native
    
    var translation_directory: js.UndefOr[String] = js.native
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
