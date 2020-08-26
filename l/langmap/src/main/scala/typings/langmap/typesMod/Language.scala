package typings.langmap.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Language extends js.Object {
  var englishName: String = js.native
  var nativeName: String = js.native
}

object Language {
  @scala.inline
  def apply(englishName: String, nativeName: String): Language = {
    val __obj = js.Dynamic.literal(englishName = englishName.asInstanceOf[js.Any], nativeName = nativeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Language]
  }
  @scala.inline
  implicit class LanguageOps[Self <: Language] (val x: Self) extends AnyVal {
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
    def setEnglishName(value: String): Self = this.set("englishName", value.asInstanceOf[js.Any])
    @scala.inline
    def setNativeName(value: String): Self = this.set("nativeName", value.asInstanceOf[js.Any])
  }
  
}

