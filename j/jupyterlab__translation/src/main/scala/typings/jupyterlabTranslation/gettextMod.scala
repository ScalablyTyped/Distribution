package typings.jupyterlabTranslation

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gettextMod {
  
  /**
    * Gettext class providing localization methods.
    */
  @JSImport("@jupyterlab/translation/lib/gettext", "Gettext")
  @js.native
  open class Gettext () extends StObject {
    def this(options: IOptions) = this()
    
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
    def __(msgid: String, args: Any*): String = js.native
    
    /* private */ var _contextDelimiter: Any = js.native
    
    /* private */ var _defaults: Any = js.native
    
    /* private */ var _dictionary: Any = js.native
    
    /* private */ var _domain: Any = js.native
    
    /* private */ var _locale: Any = js.native
    
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
    def _n(msgid: String, msgid_plural: String, n: Double, args: Any*): String = js.native
    
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
    def _np(msgctxt: String, msgid: String, msgid_plural: String, n: Double, args: Any*): String = js.native
    
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
    def _p(msgctxt: String, msgid: String, args: Any*): String = js.native
    
    /* private */ var _pluralForms: Any = js.native
    
    /* private */ var _pluralFuncs: Any = js.native
    
    /* private */ var _stringsPrefix: Any = js.native
    
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
    def dcnpgettext(domain: String, msgctxt: String, msgid: String, msgid_plural: String, n: Double, args: Any*): String = js.native
    
    /**
      * Split a locale into parent locales. "es-CO" -> ["es-CO", "es"]
      *
      * @param locale - The locale string.
      *
      * @return An array of locales.
      */
    /* private */ var expandLocale: Any = js.native
    
    /**
      * Get current context delimiter.
      *
      * @return The current delimiter.
      */
    def getContextDelimiter(): String = js.native
    
    /**
      * Get current domain.
      *
      * @return The current domain string.
      */
    def getDomain(): String = js.native
    
    /**
      * Get current locale.
      *
      * @return The current locale.
      */
    def getLocale(): String = js.native
    
    /**
      * Split a locale into parent locales. "es-CO" -> ["es-CO", "es"]
      *
      * @param pluralForm - Plural form string..
      * @return An function to compute plural forms.
      */
    /* private */ var getPluralFunc: Any = js.native
    
    /**
      * Get current strings prefix.
      *
      * @return The strings prefix.
      */
    def getStringsPrefix(): String = js.native
    
    /**
      * Translate a singular string with extra interpolation values.
      *
      * @param msgid - The singular string to translate.
      * @param args - Any additional values to use with interpolation.
      *
      * @return A translated string if found, or the original string.
      */
    def gettext(msgid: String, args: Any*): String = js.native
    
    /**
      * Load json translations strings (In Jed 2.x format).
      *
      * @param jsonData - The translation strings plus metadata.
      * @param domain - The translation domain, e.g. "jupyterlab".
      */
    def loadJSON(jsonData: IJsonData, domain: String): Unit = js.native
    
    /**
      * Translate a plural string with extra interpolation values.
      *
      * @param msgid - The singular string to translate.
      * @param args - Any additional values to use with interpolation.
      *
      * @return A translated string if found, or the original string.
      */
    def ngettext(msgid: String, msgid_plural: String, n: Double, args: Any*): String = js.native
    
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
    def npgettext(msgctxt: String, msgid: String, msgid_plural: String, n: Double, args: Any*): String = js.native
    
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
    def pgettext(msgctxt: String, msgid: String, args: Any*): String = js.native
    
    /**
      * Remove the context delimiter from string.
      *
      * @param str - Translation string.
      * @return A translation string without context.
      */
    /* private */ var removeContext: Any = js.native
    
    /**
      * Set current context delimiter.
      *
      * @param delimiter - The delimiter to set.
      */
    def setContextDelimiter(delimiter: String): Unit = js.native
    
    /**
      * Set current domain.
      *
      * @param domain - The domain to set.
      */
    def setDomain(domain: String): Unit = js.native
    
    /**
      * Set current locale.
      *
      * @param locale - The locale to set.
      */
    def setLocale(locale: String): Unit = js.native
    
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
    /* private */ var setMessages: Any = js.native
    
    /**
      * Set current strings prefix.
      *
      * @param prefix - The string prefix to set.
      */
    def setStringsPrefix(prefix: String): Unit = js.native
    
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
    /* private */ var t: Any = js.native
  }
  object Gettext {
    
    @JSImport("@jupyterlab/translation/lib/gettext", "Gettext")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * `sprintf` equivalent, takes a string and some arguments to make a
      * computed string.
      *
      * @param fmt - The string to interpolate.
      * @param args - The variables to use in interpolation.
      *
      * ### Examples
      * strfmt("%1 dogs are in %2", 7, "the kitchen"); => "7 dogs are in the kitchen"
      * strfmt("I like %1, bananas and %1", "apples"); => "I like apples, bananas and apples"
      */
    /* static member */
    inline def strfmt(fmt: String, args: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("strfmt")(scala.List(fmt.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
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
