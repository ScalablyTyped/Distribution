package typings.jsTokens.anon

import typings.jsTokens.jsTokensStrings.NumericLiteral
import typings.jsTokens.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4`
  extends StObject
     with Token {
  
  var `type`: NumericLiteral
  
  var value: String
}
object `4` {
  
  inline def apply(value: String): `4` = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumericLiteral")
    __obj.asInstanceOf[`4`]
  }
  
  extension [Self <: `4`](x: Self) {
    
    inline def setType(value: NumericLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
