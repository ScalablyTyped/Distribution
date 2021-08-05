package typings.localizedStrings

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("localized-strings", JSImport.Default)
  @js.native
  val default: LocalizedStringsFactory = js.native
  
  type FormatObject[U /* <: Formatted */] = StringDictionary[U]
  
  type Formatted = Double | String
  
  type GetInterfaceLanguageCallback = js.Function0[String]
  
  type GlobalStrings[T] = StringDictionary[T]
  
  type LocalizedStrings[T] = LocalizedStringsMethods & T
  
  @js.native
  trait LocalizedStringsFactory
    extends StObject
       with Instantiable1[/* props */ GlobalStrings[js.Object], LocalizedStrings[js.Object]]
       with Instantiable2[
          /* props */ GlobalStrings[js.Object], 
          /* options */ Options, 
          LocalizedStrings[js.Object]
        ]
  
  @js.native
  trait LocalizedStringsMethods extends StObject {
    
    /**
      * Format the passed string replacing the numbered placeholders
      * i.e. I'd like some {0} and {1}, or just {0}
      * Use example:
      *   strings.formatString(strings.question, strings.bread, strings.butter)
      */
    def formatString[T /* <: Formatted */](str: String, values: (T | FormatObject[T])*): (js.Array[String | T]) | String = js.native
    
    /**
      * Return an array containing the available languages passed as props in the constructor
      */
    def getAvailableLanguages(): js.Array[String] = js.native
    
    /**
      * The current interface language (could differ from the language displayed)
      */
    def getInterfaceLanguage(): String = js.native
    
    /**
      *  The current language displayed (could differ from the interface language
      *  if it has been forced manually and a matching translation has been found)
      */
    def getLanguage(): String = js.native
    
    /**
      * Return a string with the passed key in a different language
      * @param key
      * @param language
      * @param omitWarning
      */
    def getString(key: String): String = js.native
    def getString(key: String, language: String): String = js.native
    def getString(key: String, language: String, omitWarning: Boolean): String = js.native
    def getString(key: String, language: Unit, omitWarning: Boolean): String = js.native
    
    /**
      * Replace the NamedLocalization object without reinstantiating the object
      * @param props
      */
    def setContent(props: js.Any): Unit = js.native
    
    /**
      * Can be used from ouside the class to force a particular language
      * indipendently from the interface one
      * @param language
      */
    def setLanguage(language: String): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var customLanguageInterface: js.UndefOr[GetInterfaceLanguageCallback] = js.undefined
    
    var logsEnabled: js.UndefOr[Boolean] = js.undefined
    
    var pseudo: js.UndefOr[Boolean] = js.undefined
    
    var pseudoMultipleLanguages: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCustomLanguageInterface(value: () => String): Self = StObject.set(x, "customLanguageInterface", js.Any.fromFunction0(value))
      
      inline def setCustomLanguageInterfaceUndefined: Self = StObject.set(x, "customLanguageInterface", js.undefined)
      
      inline def setLogsEnabled(value: Boolean): Self = StObject.set(x, "logsEnabled", value.asInstanceOf[js.Any])
      
      inline def setLogsEnabledUndefined: Self = StObject.set(x, "logsEnabled", js.undefined)
      
      inline def setPseudo(value: Boolean): Self = StObject.set(x, "pseudo", value.asInstanceOf[js.Any])
      
      inline def setPseudoMultipleLanguages(value: Boolean): Self = StObject.set(x, "pseudoMultipleLanguages", value.asInstanceOf[js.Any])
      
      inline def setPseudoMultipleLanguagesUndefined: Self = StObject.set(x, "pseudoMultipleLanguages", js.undefined)
      
      inline def setPseudoUndefined: Self = StObject.set(x, "pseudo", js.undefined)
    }
  }
  
  type _To = LocalizedStringsFactory
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: LocalizedStringsFactory = default
}
