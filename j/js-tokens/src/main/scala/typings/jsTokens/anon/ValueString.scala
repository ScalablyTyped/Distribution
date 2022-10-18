package typings.jsTokens.anon

import typings.jsTokens.jsTokensStrings.JSXInvalid
import typings.jsTokens.mod.JSXToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueString
  extends StObject
     with JSXToken {
  
  var `type`: JSXInvalid
  
  var value: String
}
object ValueString {
  
  inline def apply(value: String): ValueString = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXInvalid")
    __obj.asInstanceOf[ValueString]
  }
  
  extension [Self <: ValueString](x: Self) {
    
    inline def setType(value: JSXInvalid): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
