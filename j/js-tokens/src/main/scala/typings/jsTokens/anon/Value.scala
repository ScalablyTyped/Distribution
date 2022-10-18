package typings.jsTokens.anon

import typings.jsTokens.jsTokensStrings.JSXIdentifier
import typings.jsTokens.mod.JSXToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value
  extends StObject
     with JSXToken {
  
  var `type`: JSXIdentifier
  
  var value: String
}
object Value {
  
  inline def apply(value: String): Value = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXIdentifier")
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setType(value: JSXIdentifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
