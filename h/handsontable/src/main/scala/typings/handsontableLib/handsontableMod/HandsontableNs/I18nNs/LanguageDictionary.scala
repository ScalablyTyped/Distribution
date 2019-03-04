package typings
package handsontableLib.handsontableMod.HandsontableNs.I18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageDictionary
  extends /* phraseKey */ org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]] {
  var languageCode: java.lang.String
}

object LanguageDictionary {
  @scala.inline
  def apply(
    languageCode: java.lang.String,
    StringDictionary: /* phraseKey */ org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]] = null
  ): LanguageDictionary = {
    val __obj = js.Dynamic.literal(languageCode = languageCode)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[LanguageDictionary]
  }
}

