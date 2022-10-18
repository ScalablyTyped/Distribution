package typings.jsTokens.anon

import typings.jsTokens.jsTokensStrings.JSXPunctuator
import typings.jsTokens.mod.JSXToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeValue
  extends StObject
     with JSXToken {
  
  var `type`: JSXPunctuator
  
  var value: String
}
object TypeValue {
  
  inline def apply(value: String): TypeValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXPunctuator")
    __obj.asInstanceOf[TypeValue]
  }
  
  extension [Self <: TypeValue](x: Self) {
    
    inline def setType(value: JSXPunctuator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
