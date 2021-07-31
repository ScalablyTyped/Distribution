package typings.linguiCore

import org.scalablytyped.runtime.StringDictionary
import typings.linguiCore.linguiCoreStrings.cardinal
import typings.linguiCore.linguiCoreStrings.ordinal
import typings.linguiCore.selectMod.PluralProps
import typings.linguiCore.selectMod.SelectProps
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object i18nMod {
  
  @JSImport("@lingui/core/i18n", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@lingui/core/i18n", "I18n")
  @js.native
  class I18n_ () extends StObject {
    
    @JSName("_")
    def _underscore(id: String): String = js.native
    @JSName("_")
    def _underscore(id: String, values: js.Object): String = js.native
    @JSName("_")
    def _underscore(id: String, values: js.Object, messageOptions: MessageOptions): String = js.native
    @JSName("_")
    def _underscore(id: String, values: Unit, messageOptions: MessageOptions): String = js.native
    @JSName("_")
    def _underscore(id: MessageDescriptor): String = js.native
    
    def activate(language: String): Unit = js.native
    
    var availableLanguages: js.Array[String] = js.native
    
    var language: String = js.native
    
    var languageData: LanguageData = js.native
    
    def load(catalogs: Catalogs): Unit = js.native
    
    var messages: Messages = js.native
    
    def plural(config: PluralProps): String = js.native
    def plural(id: String, config: PluralProps): String = js.native
    
    def pluralForm(n: Double): String = js.native
    @JSName("pluralForm")
    def pluralForm_cardinal(n: Double, pluralType: cardinal): String = js.native
    @JSName("pluralForm")
    def pluralForm_ordinal(n: Double, pluralType: ordinal): String = js.native
    
    def select(config: SelectProps): String = js.native
    def select(id: String, config: SelectProps): String = js.native
    
    def selectOrdinal(config: PluralProps): String = js.native
    def selectOrdinal(id: String, config: PluralProps): String = js.native
    
    def t(id: String): js.Function2[/* strings */ TemplateStringsArray, /* repeated */ js.Any, String] = js.native
    def t(strings: TemplateStringsArray, values: js.Any*): String = js.native
    
    def use(language: String): I18n_ = js.native
  }
  
  @JSImport("@lingui/core/i18n", "i18n")
  @js.native
  val i18n: I18n_ = js.native
  
  @scala.inline
  def setupI18n(): I18n_ = ^.asInstanceOf[js.Dynamic].applyDynamic("setupI18n")().asInstanceOf[I18n_]
  @scala.inline
  def setupI18n(params: setupI18nProps): I18n_ = ^.asInstanceOf[js.Dynamic].applyDynamic("setupI18n")(params.asInstanceOf[js.Any]).asInstanceOf[I18n_]
  
  trait Catalog extends StObject {
    
    var languageData: js.UndefOr[LanguageData] = js.undefined
    
    var messages: Messages
  }
  object Catalog {
    
    @scala.inline
    def apply(messages: Messages): Catalog = {
      val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any])
      __obj.asInstanceOf[Catalog]
    }
    
    @scala.inline
    implicit class CatalogMutableBuilder[Self <: Catalog] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLanguageData(value: LanguageData): Self = StObject.set(x, "languageData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageDataUndefined: Self = StObject.set(x, "languageData", js.undefined)
      
      @scala.inline
      def setMessages(value: Messages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    }
  }
  
  type Catalogs = StringDictionary[Catalog]
  
  trait LanguageData extends StObject {
    
    var plurals: js.UndefOr[
        js.Function2[/* n */ Double, /* pluralType */ js.UndefOr[cardinal | ordinal], String]
      ] = js.undefined
  }
  object LanguageData {
    
    @scala.inline
    def apply(): LanguageData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LanguageData]
    }
    
    @scala.inline
    implicit class LanguageDataMutableBuilder[Self <: LanguageData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlurals(value: (/* n */ Double, /* pluralType */ js.UndefOr[cardinal | ordinal]) => String): Self = StObject.set(x, "plurals", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPluralsUndefined: Self = StObject.set(x, "plurals", js.undefined)
    }
  }
  
  trait MessageDescriptor extends StObject {
    
    var defaults: js.UndefOr[String] = js.undefined
    
    var formats: js.UndefOr[js.Object] = js.undefined
    
    var id: String
    
    var values: js.UndefOr[js.Object] = js.undefined
  }
  object MessageDescriptor {
    
    @scala.inline
    def apply(id: String): MessageDescriptor = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageDescriptor]
    }
    
    @scala.inline
    implicit class MessageDescriptorMutableBuilder[Self <: MessageDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaults(value: String): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      @scala.inline
      def setFormats(value: js.Object): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: js.Object): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
  
  trait MessageOptions extends StObject {
    
    var defaults: js.UndefOr[String] = js.undefined
    
    var formats: js.UndefOr[js.Object] = js.undefined
  }
  object MessageOptions {
    
    @scala.inline
    def apply(): MessageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageOptions]
    }
    
    @scala.inline
    implicit class MessageOptionsMutableBuilder[Self <: MessageOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaults(value: String): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      @scala.inline
      def setFormats(value: js.Object): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
    }
  }
  
  type Messages = StringDictionary[
    String | (js.Function1[
      /* context */ js.Function3[
        /* name */ String, 
        /* type */ js.UndefOr[String], 
        /* format */ js.UndefOr[js.Any], 
        String
      ], 
      String | js.Array[String]
    ])
  ]
  
  trait setupI18nProps extends StObject {
    
    var catalogs: js.UndefOr[Catalogs] = js.undefined
    
    var development: js.UndefOr[js.Object] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var locales: js.UndefOr[js.Array[String]] = js.undefined
    
    var missing: js.UndefOr[String | (js.Function2[/* language */ String, /* id */ String, String])] = js.undefined
  }
  object setupI18nProps {
    
    @scala.inline
    def apply(): setupI18nProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[setupI18nProps]
    }
    
    @scala.inline
    implicit class setupI18nPropsMutableBuilder[Self <: setupI18nProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCatalogs(value: Catalogs): Self = StObject.set(x, "catalogs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCatalogsUndefined: Self = StObject.set(x, "catalogs", js.undefined)
      
      @scala.inline
      def setDevelopment(value: js.Object): Self = StObject.set(x, "development", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevelopmentUndefined: Self = StObject.set(x, "development", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setLocales(value: js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
      
      @scala.inline
      def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value :_*))
      
      @scala.inline
      def setMissing(value: String | (js.Function2[/* language */ String, /* id */ String, String])): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMissingFunction2(value: (/* language */ String, /* id */ String) => String): Self = StObject.set(x, "missing", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
    }
  }
}
