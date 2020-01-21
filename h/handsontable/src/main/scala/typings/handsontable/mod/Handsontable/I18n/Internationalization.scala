package typings.handsontable.mod.Handsontable.I18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Internationalization extends js.Object {
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

