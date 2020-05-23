package typings.handsontable.mod.Handsontable.I18n

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageDictionary
  extends /* phraseKey */ StringDictionary[String | js.Array[String]] {
  var languageCode: String
}

object LanguageDictionary {
  @scala.inline
  def apply(languageCode: String, StringDictionary: /* p */ StringDictionary[String | js.Array[String]] = null): LanguageDictionary = {
    val __obj = js.Dynamic.literal(languageCode = languageCode.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[LanguageDictionary]
  }
}

