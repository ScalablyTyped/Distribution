package typings.jsTokens.anon

import typings.jsTokens.jsTokensStrings.StringLiteral
import typings.jsTokens.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Closed
  extends StObject
     with Token {
  
  var closed: Boolean
  
  var `type`: StringLiteral
  
  var value: String
}
object Closed {
  
  inline def apply(closed: Boolean, value: String): Closed = {
    val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[Closed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Closed] (val x: Self) extends AnyVal {
    
    inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
    
    inline def setType(value: StringLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
