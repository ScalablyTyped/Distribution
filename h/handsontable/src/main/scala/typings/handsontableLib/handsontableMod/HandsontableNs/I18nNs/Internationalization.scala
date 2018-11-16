package typings
package handsontableLib.handsontableMod.HandsontableNs.I18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Internationalization extends js.Object {
  var dictionaryKeys: LanguageDictionary = js.native
  def getLanguageDictionary(languageCode: java.lang.String): LanguageDictionary = js.native
  def getLanguagesDictionaries(): js.Array[LanguageDictionary] = js.native
  def getTranslatedPhrase(dictionaryKey: java.lang.String): java.lang.String | scala.Null = js.native
  def getTranslatedPhrase(dictionaryKey: java.lang.String, extraArguments: js.Any): java.lang.String | scala.Null = js.native
  def registerLanguageDictionary(languageCodeOrDictionary: LanguageDictionary): LanguageDictionary = js.native
  def registerLanguageDictionary(languageCodeOrDictionary: LanguageDictionary, dictionary: LanguageDictionary): LanguageDictionary = js.native
  def registerLanguageDictionary(languageCodeOrDictionary: java.lang.String): LanguageDictionary = js.native
  def registerLanguageDictionary(languageCodeOrDictionary: java.lang.String, dictionary: LanguageDictionary): LanguageDictionary = js.native
}

