package typings.marked.mod.Tokens

import typings.marked.markedStrings.space
import typings.marked.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Space
  extends StObject
     with Token {
  
  var raw: String
  
  var `type`: space
}
object Space {
  
  inline def apply(raw: String): Space = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("space")
    __obj.asInstanceOf[Space]
  }
  
  extension [Self <: Space](x: Self) {
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setType(value: space): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
