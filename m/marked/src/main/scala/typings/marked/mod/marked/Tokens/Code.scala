package typings.marked.mod.marked.Tokens

import typings.marked.markedStrings.code
import typings.marked.markedStrings.indented
import typings.marked.mod.marked.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Code
  extends StObject
     with Token {
  
  var codeBlockStyle: js.UndefOr[indented] = js.undefined
  
  var lang: js.UndefOr[String] = js.undefined
  
  var raw: String
  
  var text: String
  
  var `type`: code
}
object Code {
  
  inline def apply(raw: String, text: String): Code = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("code")
    __obj.asInstanceOf[Code]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
    
    inline def setCodeBlockStyle(value: indented): Self = StObject.set(x, "codeBlockStyle", value.asInstanceOf[js.Any])
    
    inline def setCodeBlockStyleUndefined: Self = StObject.set(x, "codeBlockStyle", js.undefined)
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setType(value: code): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
