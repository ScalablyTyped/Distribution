package typings.jsTokens.anon

import typings.jsTokens.jsTokensStrings.IdentifierName
import typings.jsTokens.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeValueString
  extends StObject
     with Token {
  
  var `type`: IdentifierName
  
  var value: String
}
object TypeValueString {
  
  inline def apply(value: String): TypeValueString = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IdentifierName")
    __obj.asInstanceOf[TypeValueString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeValueString] (val x: Self) extends AnyVal {
    
    inline def setType(value: IdentifierName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
