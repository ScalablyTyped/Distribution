package typings.handsontable.mod.Handsontable.I18n

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class LanguageDictionaryOps[Self <: LanguageDictionary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
  }
  
}

