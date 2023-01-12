package typings.jsTokens.anon

import typings.jsTokens.jsTokensStrings.TemplateTail
import typings.jsTokens.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClosedType
  extends StObject
     with Token {
  
  var closed: Boolean
  
  var `type`: TemplateTail
  
  var value: String
}
object ClosedType {
  
  inline def apply(closed: Boolean, value: String): ClosedType = {
    val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TemplateTail")
    __obj.asInstanceOf[ClosedType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClosedType] (val x: Self) extends AnyVal {
    
    inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
    
    inline def setType(value: TemplateTail): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
