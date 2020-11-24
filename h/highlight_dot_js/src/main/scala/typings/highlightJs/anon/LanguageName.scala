package typings.highlightJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LanguageName extends js.Object {
  
  var languageName: String = js.native
}
object LanguageName {
  
  @scala.inline
  def apply(languageName: String): LanguageName = {
    val __obj = js.Dynamic.literal(languageName = languageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageName]
  }
  
  @scala.inline
  implicit class LanguageNameOps[Self <: LanguageName] (val x: Self) extends AnyVal {
    
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
    def setLanguageName(value: String): Self = this.set("languageName", value.asInstanceOf[js.Any])
  }
}
