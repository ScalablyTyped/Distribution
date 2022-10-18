package typings.jsTokens.anon

import typings.jsTokens.jsTokensStrings.JSXString
import typings.jsTokens.mod.JSXToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Closed
  extends StObject
     with JSXToken {
  
  var closed: Boolean
  
  var `type`: JSXString
  
  var value: String
}
object Closed {
  
  inline def apply(closed: Boolean, value: String): Closed = {
    val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXString")
    __obj.asInstanceOf[Closed]
  }
  
  extension [Self <: Closed](x: Self) {
    
    inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
    
    inline def setType(value: JSXString): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
