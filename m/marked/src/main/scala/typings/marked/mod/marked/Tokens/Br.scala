package typings.marked.mod.marked.Tokens

import typings.marked.markedStrings.br
import typings.marked.mod.marked.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Br
  extends StObject
     with Token {
  
  var raw: String
  
  var `type`: br
}
object Br {
  
  inline def apply(raw: String): Br = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("br")
    __obj.asInstanceOf[Br]
  }
  
  extension [Self <: Br](x: Self) {
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setType(value: br): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
