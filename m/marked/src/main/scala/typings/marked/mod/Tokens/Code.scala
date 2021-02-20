package typings.marked.mod.Tokens

import typings.marked.markedStrings.code
import typings.marked.markedStrings.indented
import typings.marked.mod.Token
import org.scalablytyped.runtime.StObject
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
  implicit class CodeMutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodeBlockStyle(value: indented): Self = StObject.set(x, "codeBlockStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeBlockStyleUndefined: Self = StObject.set(x, "codeBlockStyle", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    @scala.inline
    def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: code): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
