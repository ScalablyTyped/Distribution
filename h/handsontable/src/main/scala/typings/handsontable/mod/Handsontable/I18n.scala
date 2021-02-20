package typings.handsontable.mod.Handsontable

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object I18n {
  
  @js.native
  trait Internationalization extends StObject {
    
    var dictionaryKeys: LanguageDictionary = js.native
    
    def getLanguageDictionary(languageCode: String): LanguageDictionary = js.native
    
    def getLanguagesDictionaries(): js.Array[LanguageDictionary] = js.native
    
    def getTranslatedPhrase(dictionaryKey: String): String | Null = js.native
    def getTranslatedPhrase(dictionaryKey: String, extraArguments: js.Any): String | Null = js.native
    
    def registerLanguageDictionary(languageCodeOrDictionary: String): LanguageDictionary = js.native
    def registerLanguageDictionary(languageCodeOrDictionary: String, dictionary: LanguageDictionary): LanguageDictionary = js.native
    def registerLanguageDictionary(languageCodeOrDictionary: LanguageDictionary): LanguageDictionary = js.native
    def registerLanguageDictionary(languageCodeOrDictionary: LanguageDictionary, dictionary: LanguageDictionary): LanguageDictionary = js.native
  }
  
  @js.native
  trait LanguageDictionary
    extends /* phraseKey */ StringDictionary[String | js.Array[String]] {
    
    var languageCode: String = js.native
  }
  object LanguageDictionary {
    
    @scala.inline
    def apply(languageCode: String): LanguageDictionary = {
      val __obj = js.Dynamic.literal(languageCode = languageCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[LanguageDictionary]
    }
    
    @scala.inline
    implicit class LanguageDictionaryMutableBuilder[Self <: LanguageDictionary] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    }
  }
}
