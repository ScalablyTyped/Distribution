package typings.marked.mod.Tokens

import typings.marked.markedStrings.paragraph
import typings.marked.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Paragraph
  extends StObject
     with Token {
  
  var pre: js.UndefOr[Boolean] = js.undefined
  
  var raw: String
  
  var text: String
  
  var `type`: paragraph
}
object Paragraph {
  
  inline def apply(raw: String, text: String): Paragraph = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("paragraph")
    __obj.asInstanceOf[Paragraph]
  }
  
  extension [Self <: Paragraph](x: Self) {
    
    inline def setPre(value: Boolean): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
    
    inline def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setType(value: paragraph): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
