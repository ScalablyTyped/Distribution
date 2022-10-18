package typings.jupyterlabTranslation

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGettextMod {
  
  /**
    * Gettext class providing localization methods.
    */
  trait Gettext extends StObject {
    
    /**
      * Shorthand for gettext.
      *
      * @param msgid - The singular string to translate.
      * @param args - Any additional values to use with interpolation.
      *
      * @return A translated string if found, or the original string.
      *
      * ### Notes
      * This is not a private method (starts with an underscore) it is just
      * a shorter and standard way to call these methods.
      */
    def __(msgid: String, args: Any*): String
    
    /* private */ var _contextDelimiter: Any
    
    /* private */ var _defaults: Any
    
    /* private */ var _dictionary: Any
    
    /* private */ var _domain: Any
    
    /* private */ var _locale: Any
    
    /**
      * Shorthand for ngettext.
      *
      * @param msgid - The singular string to translate.
      * @param msgid_plural - The plural string to translate.
      * @param n - The number for pluralization.
      * @param args - Any additional values to use with interpolation.
      *
      * @return A translated string if found, or the original string.
      *
      * ### Notes
      * This is not a private method (starts with an underscore) it is just
      * a shorter and standard way to call these methods.
      */
    def _n(msgid: String, msgid_plural: String, n: Double, args: Any*): String
    
    /**
      * Shorthand for npgettext.
      *
      * @param msgctxt - The message context.
      * @param msgid - The singular string to translate.
      * @param msgid_plural - The plural string to translate.
      * @param n - The number for pluralization.
      * @param args - Any additional values to use with interpolation.
      *
      * @return A translated string if found, or the original string.
      *
      * ### Notes
      * This is not a private method (starts with an underscore) it is just
      * a shorter and standard way to call these methods.
      */
    def _np(msgctxt: String, msgid: String, msgid_plural: String, n: Double, args: Any*): String
    
    /**
      * Shorthand for pgettext.
      *
      * @param msgctxt - The message context.
      * @param msgid - The singular string to translate.
      * @param args - Any additional values to use with interpolation.
      *
      * @return A translated string if found, or the original string.
      *
      * ### Notes
      * This is not a private method (starts with an underscore) it is just
      * a shorter and standard way to call these methods.
      */
    def _p(msgctxt: String, msgid: String, args: Any*): String
    
    /* private */ var _pluralForms: Any
    
    /* private */ var _pluralFuncs: Any
    
    /* private */ var _stringsPrefix: Any
    
    /**
      * Translate a singular string with extra interpolation values.
      *
      * @param domain - The translations domain.
      * @param msgctxt - The message context.
      * @param msgid - The singular string to translate.
      * @param msgid_plural - The plural string to translate.
      * @param n - The number for pluralization.
      * @param args - Any additional values to use with interpolation
      *
      * @return A translated string if found, or the original string.
      */
    def dcnpgettext(domain: String, msgctxt: String, msgid: String, msgid_plural: String, n: Double, args: Any*): String
    
    /**
      * Split a locale into parent locales. "es-CO" -> ["es-CO", "es"]
      *
      * @param locale - The locale string.
      *
      * @return An array of locales.
      */
    /* private */ var expandLocale: Any
    
    /**
      * Get current context delimiter.
      *
      * @return The current delimiter.
      */
    def getContextDelimiter(): String
    
    /**
      * Get current domain.
      *
      * @return The current domain string.
      */
    def getDomain(): String
    
    /**
      * Get current locale.
      *
      * @return The current locale.
      */
    def getLocale(): String
    
    /**
      * Split a locale into parent locales. "es-CO" -> ["es-CO", "es"]
      *
      * @param pluralForm - Plural form string..
      * @return An function to compute plural forms.
      */
    /* private */ var getPluralFunc: Any
    
    /**
      * Get current strings prefix.
      *
      * @return The strings prefix.
      */
    def getStringsPrefix(): String
    
    /**
      * Translate a singular string with extra interpolation values.
      *
      * @param msgid - The singular string to translate.
      * @param args - Any additional values to use with interpolation.
      *
      * @return A translated string if found, or the original string.
      */
    def gettext(msgid: String, args: Any*): String
    
    /**
      * Load json translations strings (In Jed 2.x format).
      *
      * @param jsonData - The translation strings plus metadata.
      * @param domain - The translation domain, e.g. "jupyterlab".
      */
    def loadJSON(jsonData: IJsonData, domain: String): Unit
    
    /**
      * Translate a plural string with extra interpolation values.
      *
      * @param msgid - The singular string to translate.
      * @param args - Any additional values to use with interpolation.
      *
      * @return A translated string if found, or the original string.
      */
    def ngettext(msgid: String, msgid_plural: String, n: Double, args: Any*): String
    
    /**
      * Translate a contextualized plural string with extra interpolation values.
      *
      * @param msgctxt - The message context.
      * @param msgid - The singular string to translate.
      * @param msgid_plural - The plural string to translate.
      * @param n - The number for pluralization.
      * @param args - Any additional values to use with interpolation
      *
      * @return A translated string if found, or the original string.
      */
    def npgettext(msgctxt: String, msgid: String, msgid_plural: String, n: Double, args: Any*): String
    
    /**
      * Translate a contextualized singular string with extra interpolation values.
      *
      * @param msgctxt - The message context.
      * @param msgid - The singular string to translate.
      * @param args - Any additional values to use with interpolation.
      *
      * @return A translated string if found, or the original string.
      *
      * ### Notes
      * This is not a private method (starts with an underscore) it is just
      * a shorter and standard way to call these methods.
      */
    def pgettext(msgctxt: String, msgid: String, args: Any*): String
    
    /**
      * Remove the context delimiter from string.
      *
      * @param str - Translation string.
      * @return A translation string without context.
      */
    /* private */ var removeContext: Any
    
    /**
      * Set current context delimiter.
      *
      * @param delimiter - The delimiter to set.
      */
    def setContextDelimiter(delimiter: String): Unit
    
    /**
      * Set current domain.
      *
      * @param domain - The domain to set.
      */
    def setDomain(domain: String): Unit
    
    /**
      * Set current locale.
      *
      * @param locale - The locale to set.
      */
    def setLocale(locale: String): Unit
    
    /**
      * Set messages after loading them.
      *
      * @param domain - The translation domain.
      * @param locale - The translation locale.
      * @param messages - List of translation strings.
      * @param pluralForms - Plural form string.
      *
      * ### Notes
      * Contains juicy parts of https://github.com/Orange-OpenSource/gettext.js/blob/master/lib.gettext.js
      */
    /* private */ var setMessages: Any
    
    /**
      * Set current strings prefix.
      *
      * @param prefix - The string prefix to set.
      */
    def setStringsPrefix(prefix: String): Unit
    
    /**
      * Proper translation function that handle plurals and directives.
      *
      * @param messages - List of translation strings.
      * @param n - The number for pluralization.
      * @param options - Translation options.
      * @param args - Any variables to interpolate.
      *
      * @return A translation string without context.
      *
      * ### Notes
      * Contains juicy parts of https://github.com/Orange-OpenSource/gettext.js/blob/master/lib.gettext.js
      */
    /* private */ var t: Any
  }
  object Gettext {
    
    inline def apply(
      __ : (String, /* repeated */ Any) => String,
      _contextDelimiter: Any,
      _defaults: Any,
      _dictionary: Any,
      _domain: Any,
      _locale: Any,
      _n: (String, String, Double, /* repeated */ Any) => String,
      _np: (String, String, String, Double, /* repeated */ Any) => String,
      _p: (String, String, /* repeated */ Any) => String,
      _pluralForms: Any,
      _pluralFuncs: Any,
      _stringsPrefix: Any,
      dcnpgettext: (String, String, String, String, Double, /* repeated */ Any) => String,
      expandLocale: Any,
      getContextDelimiter: () => String,
      getDomain: () => String,
      getLocale: () => String,
      getPluralFunc: Any,
      getStringsPrefix: () => String,
      gettext: (String, /* repeated */ Any) => String,
      loadJSON: (IJsonData, String) => Unit,
      ngettext: (String, String, Double, /* repeated */ Any) => String,
      npgettext: (String, String, String, Double, /* repeated */ Any) => String,
      pgettext: (String, String, /* repeated */ Any) => String,
      removeContext: Any,
      setContextDelimiter: String => Unit,
      setDomain: String => Unit,
      setLocale: String => Unit,
      setMessages: Any,
      setStringsPrefix: String => Unit,
      t: Any
    ): Gettext = {
      val __obj = js.Dynamic.literal(__ = js.Any.fromFunction2(__), _contextDelimiter = _contextDelimiter.asInstanceOf[js.Any], _defaults = _defaults.asInstanceOf[js.Any], _dictionary = _dictionary.asInstanceOf[js.Any], _domain = _domain.asInstanceOf[js.Any], _locale = _locale.asInstanceOf[js.Any], _n = js.Any.fromFunction4(_n), _np = js.Any.fromFunction5(_np), _p = js.Any.fromFunction3(_p), _pluralForms = _pluralForms.asInstanceOf[js.Any], _pluralFuncs = _pluralFuncs.asInstanceOf[js.Any], _stringsPrefix = _stringsPrefix.asInstanceOf[js.Any], dcnpgettext = js.Any.fromFunction6(dcnpgettext), expandLocale = expandLocale.asInstanceOf[js.Any], getContextDelimiter = js.Any.fromFunction0(getContextDelimiter), getDomain = js.Any.fromFunction0(getDomain), getLocale = js.Any.fromFunction0(getLocale), getPluralFunc = getPluralFunc.asInstanceOf[js.Any], getStringsPrefix = js.Any.fromFunction0(getStringsPrefix), gettext = js.Any.fromFunction2(gettext), loadJSON = js.Any.fromFunction2(loadJSON), ngettext = js.Any.fromFunction4(ngettext), npgettext = js.Any.fromFunction5(npgettext), pgettext = js.Any.fromFunction3(pgettext), removeContext = removeContext.asInstanceOf[js.Any], setContextDelimiter = js.Any.fromFunction1(setContextDelimiter), setDomain = js.Any.fromFunction1(setDomain), setLocale = js.Any.fromFunction1(setLocale), setMessages = setMessages.asInstanceOf[js.Any], setStringsPrefix = js.Any.fromFunction1(setStringsPrefix), t = t.asInstanceOf[js.Any])
      __obj.asInstanceOf[Gettext]
    }
    
    extension [Self <: Gettext](x: Self) {
      
      inline def setDcnpgettext(value: (String, String, String, String, Double, /* repeated */ Any) => String): Self = StObject.set(x, "dcnpgettext", js.Any.fromFunction6(value))
      
      inline def setExpandLocale(value: Any): Self = StObject.set(x, "expandLocale", value.asInstanceOf[js.Any])
      
      inline def setGetContextDelimiter(value: () => String): Self = StObject.set(x, "getContextDelimiter", js.Any.fromFunction0(value))
      
      inline def setGetDomain(value: () => String): Self = StObject.set(x, "getDomain", js.Any.fromFunction0(value))
      
      inline def setGetLocale(value: () => String): Self = StObject.set(x, "getLocale", js.Any.fromFunction0(value))
      
      inline def setGetPluralFunc(value: Any): Self = StObject.set(x, "getPluralFunc", value.asInstanceOf[js.Any])
      
      inline def setGetStringsPrefix(value: () => String): Self = StObject.set(x, "getStringsPrefix", js.Any.fromFunction0(value))
      
      inline def setGettext(value: (String, /* repeated */ Any) => String): Self = StObject.set(x, "gettext", js.Any.fromFunction2(value))
      
      inline def setLoadJSON(value: (IJsonData, String) => Unit): Self = StObject.set(x, "loadJSON", js.Any.fromFunction2(value))
      
      inline def setNgettext(value: (String, String, Double, /* repeated */ Any) => String): Self = StObject.set(x, "ngettext", js.Any.fromFunction4(value))
      
      inline def setNpgettext(value: (String, String, String, Double, /* repeated */ Any) => String): Self = StObject.set(x, "npgettext", js.Any.fromFunction5(value))
      
      inline def setPgettext(value: (String, String, /* repeated */ Any) => String): Self = StObject.set(x, "pgettext", js.Any.fromFunction3(value))
      
      inline def setRemoveContext(value: Any): Self = StObject.set(x, "removeContext", value.asInstanceOf[js.Any])
      
      inline def setSetContextDelimiter(value: String => Unit): Self = StObject.set(x, "setContextDelimiter", js.Any.fromFunction1(value))
      
      inline def setSetDomain(value: String => Unit): Self = StObject.set(x, "setDomain", js.Any.fromFunction1(value))
      
      inline def setSetLocale(value: String => Unit): Self = StObject.set(x, "setLocale", js.Any.fromFunction1(value))
      
      inline def setSetMessages(value: Any): Self = StObject.set(x, "setMessages", value.asInstanceOf[js.Any])
      
      inline def setSetStringsPrefix(value: String => Unit): Self = StObject.set(x, "setStringsPrefix", js.Any.fromFunction1(value))
      
      inline def setT(value: Any): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
      
      inline def set__(value: (String, /* repeated */ Any) => String): Self = StObject.set(x, "__", js.Any.fromFunction2(value))
      
      inline def set_contextDelimiter(value: Any): Self = StObject.set(x, "_contextDelimiter", value.asInstanceOf[js.Any])
      
      inline def set_defaults(value: Any): Self = StObject.set(x, "_defaults", value.asInstanceOf[js.Any])
      
      inline def set_dictionary(value: Any): Self = StObject.set(x, "_dictionary", value.asInstanceOf[js.Any])
      
      inline def set_domain(value: Any): Self = StObject.set(x, "_domain", value.asInstanceOf[js.Any])
      
      inline def set_locale(value: Any): Self = StObject.set(x, "_locale", value.asInstanceOf[js.Any])
      
      inline def set_n(value: (String, String, Double, /* repeated */ Any) => String): Self = StObject.set(x, "_n", js.Any.fromFunction4(value))
      
      inline def set_np(value: (String, String, String, Double, /* repeated */ Any) => String): Self = StObject.set(x, "_np", js.Any.fromFunction5(value))
      
      inline def set_p(value: (String, String, /* repeated */ Any) => String): Self = StObject.set(x, "_p", js.Any.fromFunction3(value))
      
      inline def set_pluralForms(value: Any): Self = StObject.set(x, "_pluralForms", value.asInstanceOf[js.Any])
      
      inline def set_pluralFuncs(value: Any): Self = StObject.set(x, "_pluralFuncs", value.asInstanceOf[js.Any])
      
      inline def set_stringsPrefix(value: Any): Self = StObject.set(x, "_stringsPrefix", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Translatable string messages incluing metadata.
    */
  trait IJsonData
    extends StObject
       with IJsonDataMessages {
    
    /**
      * Metadata of the language bundle.
      */
    @JSName("")
    var _empty: IJsonDataHeader
  }
  object IJsonData {
    
    inline def apply(_empty: IJsonDataHeader): IJsonData = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("")(_empty.asInstanceOf[js.Any])
      __obj.asInstanceOf[IJsonData]
    }
    
    extension [Self <: IJsonData](x: Self) {
      
      inline def set_empty(value: IJsonDataHeader): Self = StObject.set(x, "", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Metadata for a language pack.
    */
  trait IJsonDataHeader extends StObject {
    
    /**
      * The domain of the translation, usually the normalized package name.
      * Example: "jupyterlab", "jupyterlab_git"
      *
      * #### Note
      * Normalization replaces `-` by `_` in package name.
      */
    var domain: String
    
    /**
      * Language locale. Example: es_CO, es-CO.
      */
    var language: String
    
    /**
      * String describing the plural of the given language.
      * See: https://www.gnu.org/software/gettext/manual/html_node/Translating-plural-forms.html
      */
    var pluralForms: String
  }
  object IJsonDataHeader {
    
    inline def apply(domain: String, language: String, pluralForms: String): IJsonDataHeader = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], pluralForms = pluralForms.asInstanceOf[js.Any])
      __obj.asInstanceOf[IJsonDataHeader]
    }
    
    extension [Self <: IJsonDataHeader](x: Self) {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setPluralForms(value: String): Self = StObject.set(x, "pluralForms", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Translatable string messages.
    */
  type IJsonDataMessages = /**
    * Translation strings for a given msg_id.
    */
  StringDictionary[js.Array[String] | IJsonDataHeader]
  
  /**
    * Configurable options for the Gettext constructor.
    */
  trait IOptions extends StObject {
    
    /**
      * The delimiter to use when adding contextualized strings.
      */
    var contextDelimiter: js.UndefOr[String] = js.undefined
    
    /**
      * The domain of the translation, usually the normalized package name.
      * Example: "jupyterlab", "jupyterlab_git"
      *
      * #### Note
      * Normalization replaces `-` by `_` in package name.
      */
    var domain: js.UndefOr[String] = js.undefined
    
    /**
      * Language locale. Example: es_CO, es-CO.
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /**
      * Translation message strings.
      */
    var messages: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * String describing the plural of the given language.
      * See: https://www.gnu.org/software/gettext/manual/html_node/Translating-plural-forms.html
      */
    var pluralForms: js.UndefOr[String] = js.undefined
    
    /**
      * Plural form function.
      */
    var pluralFunc: js.UndefOr[PluralForm] = js.undefined
    
    /**
      * The string prefix to add to localized strings.
      */
    var stringsPrefix: js.UndefOr[String] = js.undefined
  }
  object IOptions {
    
    inline def apply(): IOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOptions]
    }
    
    extension [Self <: IOptions](x: Self) {
      
      inline def setContextDelimiter(value: String): Self = StObject.set(x, "contextDelimiter", value.asInstanceOf[js.Any])
      
      inline def setContextDelimiterUndefined: Self = StObject.set(x, "contextDelimiter", js.undefined)
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMessages(value: js.Array[String]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setMessagesVarargs(value: String*): Self = StObject.set(x, "messages", js.Array(value*))
      
      inline def setPluralForms(value: String): Self = StObject.set(x, "pluralForms", value.asInstanceOf[js.Any])
      
      inline def setPluralFormsUndefined: Self = StObject.set(x, "pluralForms", js.undefined)
      
      inline def setPluralFunc(value: /* n */ Double => Double): Self = StObject.set(x, "pluralFunc", js.Any.fromFunction1(value))
      
      inline def setPluralFuncUndefined: Self = StObject.set(x, "pluralFunc", js.undefined)
      
      inline def setStringsPrefix(value: String): Self = StObject.set(x, "stringsPrefix", value.asInstanceOf[js.Any])
      
      inline def setStringsPrefixUndefined: Self = StObject.set(x, "stringsPrefix", js.undefined)
    }
  }
  
  type PluralForm = js.Function1[/* n */ Double, Double]
}
