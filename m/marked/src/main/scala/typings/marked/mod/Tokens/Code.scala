package typings.marked.mod.Tokens

import typings.marked.markedStrings.code
import typings.marked.markedStrings.indented
import typings.marked.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Code extends Token {
  
  var codeBlockStyle: js.UndefOr[indented] = js.native
  
  var lang: js.UndefOr[String] = js.native
  
  var raw: String = js.native
  
  var text: String = js.native
  
  var `type`: code = js.native
}
object Code {
  
  @scala.inline
  def apply(raw: String, text: String, `type`: code): Code = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
  
  @scala.inline
  implicit class CodeOps[Self <: Code] (val x: Self) extends AnyVal {
    
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
    def setRaw(value: String): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: code): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeBlockStyle(value: indented): Self = this.set("codeBlockStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeBlockStyle: Self = this.set("codeBlockStyle", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
  }
}
