package typings.handsontable

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object i18nRegistryMod {
  
  @JSImport("handsontable/i18n/registry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDefaultLanguageDictionary(): LanguageDictionary = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultLanguageDictionary")().asInstanceOf[LanguageDictionary]
  
  inline def getLanguageDictionary(languageCode: String): LanguageDictionary = ^.asInstanceOf[js.Dynamic].applyDynamic("getLanguageDictionary")(languageCode.asInstanceOf[js.Any]).asInstanceOf[LanguageDictionary]
  
  inline def getLanguagesDictionaries(): js.Array[LanguageDictionary] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLanguagesDictionaries")().asInstanceOf[js.Array[LanguageDictionary]]
  
  inline def getTranslatedPhrase(dictionaryKey: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTranslatedPhrase")(dictionaryKey.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getTranslatedPhrase(dictionaryKey: String, argumentsForFormatters: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTranslatedPhrase")(dictionaryKey.asInstanceOf[js.Any], argumentsForFormatters.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getValidLanguageCode(languageCode: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getValidLanguageCode")(languageCode.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hasLanguageDictionary(languageCode: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasLanguageDictionary")(languageCode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def registerLanguageDictionary(languageCodeOrDictionary: String): LanguageDictionary = ^.asInstanceOf[js.Dynamic].applyDynamic("registerLanguageDictionary")(languageCodeOrDictionary.asInstanceOf[js.Any]).asInstanceOf[LanguageDictionary]
  inline def registerLanguageDictionary(languageCodeOrDictionary: String, dictionary: LanguageDictionary): LanguageDictionary = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLanguageDictionary")(languageCodeOrDictionary.asInstanceOf[js.Any], dictionary.asInstanceOf[js.Any])).asInstanceOf[LanguageDictionary]
  inline def registerLanguageDictionary(languageCodeOrDictionary: LanguageDictionary): LanguageDictionary = ^.asInstanceOf[js.Dynamic].applyDynamic("registerLanguageDictionary")(languageCodeOrDictionary.asInstanceOf[js.Any]).asInstanceOf[LanguageDictionary]
  inline def registerLanguageDictionary(languageCodeOrDictionary: LanguageDictionary, dictionary: LanguageDictionary): LanguageDictionary = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLanguageDictionary")(languageCodeOrDictionary.asInstanceOf[js.Any], dictionary.asInstanceOf[js.Any])).asInstanceOf[LanguageDictionary]
  
  trait LanguageDictionary
    extends StObject
       with /* phraseKey */ StringDictionary[String | js.Array[String]] {
    
    var languageCode: String
  }
  object LanguageDictionary {
    
    inline def apply(languageCode: String): LanguageDictionary = {
      val __obj = js.Dynamic.literal(languageCode = languageCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[LanguageDictionary]
    }
    
    extension [Self <: LanguageDictionary](x: Self) {
      
      inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    }
  }
}
