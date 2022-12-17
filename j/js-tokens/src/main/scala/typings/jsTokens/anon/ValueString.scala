package typings.jsTokens.anon

import typings.jsTokens.jsTokensStrings.SingleLineComment
import typings.jsTokens.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueString
  extends StObject
     with Token {
  
  var `type`: SingleLineComment
  
  var value: String
}
object ValueString {
  
  inline def apply(value: String): ValueString = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SingleLineComment")
    __obj.asInstanceOf[ValueString]
  }
  
  extension [Self <: ValueString](x: Self) {
    
    inline def setType(value: SingleLineComment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
