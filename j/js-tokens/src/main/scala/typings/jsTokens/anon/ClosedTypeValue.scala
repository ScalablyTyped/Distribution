package typings.jsTokens.anon

import typings.jsTokens.jsTokensStrings.RegularExpressionLiteral
import typings.jsTokens.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClosedTypeValue
  extends StObject
     with Token {
  
  var closed: Boolean
  
  var `type`: RegularExpressionLiteral
  
  var value: String
}
object ClosedTypeValue {
  
  inline def apply(closed: Boolean, value: String): ClosedTypeValue = {
    val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RegularExpressionLiteral")
    __obj.asInstanceOf[ClosedTypeValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClosedTypeValue] (val x: Self) extends AnyVal {
    
    inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
    
    inline def setType(value: RegularExpressionLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
