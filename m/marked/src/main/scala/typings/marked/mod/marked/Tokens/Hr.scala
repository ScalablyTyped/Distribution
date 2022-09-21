package typings.marked.mod.marked.Tokens

import typings.marked.markedStrings.hr
import typings.marked.mod.marked.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hr
  extends StObject
     with Token {
  
  var raw: String
  
  var `type`: hr
}
object Hr {
  
  inline def apply(raw: String): Hr = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("hr")
    __obj.asInstanceOf[Hr]
  }
  
  extension [Self <: Hr](x: Self) {
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setType(value: hr): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
