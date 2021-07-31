package typings.marked.mod.Tokens

import typings.marked.markedStrings.codespan
import typings.marked.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Codespan
  extends StObject
     with Token {
  
  var raw: String
  
  var text: String
  
  var `type`: codespan
}
object Codespan {
  
  @scala.inline
  def apply(raw: String, text: String): Codespan = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("codespan")
    __obj.asInstanceOf[Codespan]
  }
  
  @scala.inline
  implicit class CodespanMutableBuilder[Self <: Codespan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: codespan): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
