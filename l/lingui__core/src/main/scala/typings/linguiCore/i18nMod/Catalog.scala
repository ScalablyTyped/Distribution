package typings.linguiCore.i18nMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Catalog extends js.Object {
  
  var languageData: js.UndefOr[LanguageData] = js.native
  
  var messages: Messages = js.native
}
object Catalog {
  
  @scala.inline
  def apply(messages: Messages): Catalog = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Catalog]
  }
  
  @scala.inline
  implicit class CatalogOps[Self <: Catalog] (val x: Self) extends AnyVal {
    
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
    def setMessages(value: Messages): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageData(value: LanguageData): Self = this.set("languageData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageData: Self = this.set("languageData", js.undefined)
  }
}
